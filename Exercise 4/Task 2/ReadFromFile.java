import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.lang.Character;



public class ReadFromFile {
    Stack stack;
    public ReadFromFile(int stacksize){
       stack = new Stack(stacksize);
    }



    public void readfile(String filnavn) throws IOException{
        File fil = new File(filnavn);
        BufferedReader leser = new BufferedReader(new FileReader(fil));

        String st;

        while((st = leser.readLine()) != null){
           
            for(int i = 0; i < st.length(); i++){
                char c = st.charAt(i);
                                
                if(c == '('){
                    stack.push(c);
                }
                if(c == '[') {
                    stack.push(c);
                }
                if(c == '{') {
                    stack.push(c);
                }

                if(c == ')'){
                    int pop = stack.pop();
                    if(pop == '('){
                        System.out.print("()");
                    } else {
                        System.out.print("error");
                        break;
                    }
                }

                if(c == ']'){
                    int pop = stack.pop();
                    if(pop == '['){
                        System.out.print("[]");
                    } else {
                        System.out.print("error");
                        break;
                    }

                }

                if(c == '}'){
                    int pop = stack.pop();
                    if(pop == '{'){
                        System.out.print("{}");
                    } else {
                        System.out.print("error");
                        break;
                    }

                }
                }

            }

        }

    

    public void scan(String filnavn) throws IOException{
        
        readfile(filnavn);

    }
    
    


}