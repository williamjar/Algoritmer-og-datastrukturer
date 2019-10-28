#include <iostream>
#include <math.h>
#include <Windows.h> 
#include <cstdio>
#include <ctime>
#include <chrono>
using namespace std;
typedef std::chrono::high_resolution_clock Clock;


double PCFreq = 0.0;
__int64 CounterStart = 0;
void StartCounter()
{
    LARGE_INTEGER li;
    if(!QueryPerformanceFrequency(&li))
    cout << "QueryPerformanceFrequency failed!\n";

    PCFreq = double(li.QuadPart)/1000.0;

    QueryPerformanceCounter(&li);
    CounterStart = li.QuadPart;
}
double GetCounter()
{
    LARGE_INTEGER li;
    QueryPerformanceCounter(&li);
    return double(li.QuadPart-CounterStart)/PCFreq;
}

double aOpp(double x, int n) { 
if(n != 0.0){
   return(x*aOpp(x,n-1.0));
} else return 1.0;     
}

double bOpp(double x, int n){ // logn
   if(n > 0){
       if((n%2)==0){
        int newEx = n/2;
        return bOpp(x*x,newEx);
        }
      else {
        int newEx = (n-1)/2;
        return x * bOpp(x*x,newEx);
      }
   }else {
        return 1.0;
   }
}


int main() {

   double x = 1.0001;
   int n = 13131;
   double p = 0;


   StartCounter();
    for(int i = 1; i < 1000; i++){
         p = pow(x,n); //min func
   }
    cout << GetCounter()/1000 <<" ms / pow\n";


   StartCounter();
    for(int i = 1; i < 1000; i++){
         p = aOpp(x,n); //min func
   }
    cout << GetCounter()/1000 <<" ms / aOpp\n";

    

    StartCounter();
    for(int i = 1; i < 1000; i++){
         p = bOpp(x,n); //min func
   }
    cout << GetCounter()/1000 <<" ms / bOpp\n";
    
      printf("svaret er %f\n", p);
      
   return 0;
}






