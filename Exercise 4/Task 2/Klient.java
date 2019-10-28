import java.io.IOException;

public class Klient {
    public static void main(String[] args){
        
        ReadFromFile rff = new ReadFromFile(100);

        try{
            rff.scan("text.txt");
        } catch(IOException e){
            
        }
        
    }

}