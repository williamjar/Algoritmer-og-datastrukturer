public class Stack {

    int[] liste;
    int nummer;


    public Stack(int length){ 
        liste = new int[length];
    }

    public boolean erTom(){
        return nummer == 0;
    }

    public boolean erFull(){
        return nummer == liste.length;
    }

    public void push(int test){
        if (!erFull()) liste[nummer++] = test;
    }

    public int pop(){
        if (!erTom()) return liste[--nummer];
		else return 0;
    }
    
    public int sjekkStack(){
        if(!erTom()) return liste[nummer-1];
        else return 0;
    }
}