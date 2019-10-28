
class Soldat {
	
    int data;
    Soldat neste;
    Soldat forrige;
   
   /**
    * Constructor without parameters
    */
   public Soldat() {
       data = 0;
       neste = null;
       forrige = null;
   }
   
   public Soldat(int data){
       this.data = data;
   }
   
   /**
    * Constructor for circular single linked list
    * 
    * @param e
    * @param n
    */
   public Soldat(int e, Soldat n){
       this.data = e;
       this.neste = n;
   }
   
   /**
    * Constructor for circular double linked list
    * 
    * @param e
    * @param n
    * @param p
    */
   
   public Soldat(int e, Soldat n, Soldat p) {
       data = e;
       neste = n;
       forrige = p;
   }
   
   public int getdata() {
       return data;
   }
   
   public Soldat getnesteSoldat() {
       return neste;
   }
   
   public Soldat getforrigeSoldat() {
       return forrige;
   }
   
   public void setdata(int e) {
       data = e;
   }
   
   public void setnesteSoldat(Soldat n) {
       neste = n;
   }
   
   public void setforrigeSoldat(Soldat p) {
       forrige = p;
   }
}





/* 
public class Soldat {
    
    int data;
    Soldat neste;
    Soldat forrige;
    
    public Soldat(){
        this.data = 0;
        neste = null;
        forrige = null;
    }

    public Soldat(int data){
        this.data = data;
    }

    
}
*/


