import java.util.Date;
import java.util.Random;

class Main {
    public static void main(String[] args){
        Date start = new Date();
        int runder = 0;
        double tid;
        Date slutt;
        int antall = 100000;
        Random rnd = new Random();

        int[] d = new int[antall];
        for(int i = 0; i < antall; i++){
            d[i]= rnd.nextInt(100);
        }

        do {
            algoritme(d);
            slutt = new Date();
            ++runder;
        } while (slutt.getTime()-start.getTime() < 1000);
        tid = (double)
                (slutt.getTime()-start.getTime()) / runder;
        System.out.println("Millisekund pr. runde:" + tid);
    }


    public static void algoritme(int[] d){

        int k = 0;                                      //1
        int s = 0;                                      //1
        int sum = 0;                                    //1
        for(int i = 0; i < d.length; ++i){              //n
            for(int j = 1; j < d.length; ++j){          //n
                if((d[i]-d[j]) > sum && (i>j)){         //1
                    sum = d[i]-d[j];
                    k = j;
                    s = i;
                }
            }
        } System.out.println("Kjop dag:  " + (k+1) + ", selg dag: " + (s+1) + ", da tjener du " + sum);
    }
}

// n^2 + 4
// n^2
