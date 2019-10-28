//Bruk en sirkulær liste til å løse Joesephus problem:
//Romerne var i ferd med å fange 40 soldater samt Josephus. Soldatene ville heller begå selvmord enn å overgi seg. 
//De besluttet at alle skulle stille seg i en sirkel og så skulle hver tredje person drepres inntil det ikke var flere igjen. 
//Han regnet raskt ut hvor han måtte stå for å være den siste som begikk selvmord(dermed slippe det).


public class Algoritme { 

   
    public static void main(String[] args){
        Sirkelliste liste = new Sirkelliste();
		int n = 41;
		int interval = 3;
		for (int i = 1; i < n+1; i++){
			liste.leggTil(i);
        }
        
		liste.regnUt(interval);

        

    }

}