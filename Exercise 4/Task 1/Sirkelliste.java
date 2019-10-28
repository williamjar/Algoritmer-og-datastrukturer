public class Sirkelliste { 
    public Soldat hode;
    public int str;


    public boolean isEmpty(){
		return hode == null;
    }

    public void leggTil(int data){
        Soldat temp = new Soldat(data);
        
        if(hode==null){
            hode = temp;
        } else {  
            Soldat tp = hode;
            while (tp.neste != hode) tp = tp.neste;
            tp.neste = temp;
        }  
        temp.neste = hode;
        str++;
    }

    public void fjern(Soldat fjernSoldat){
        Soldat aktuell = hode;
        Soldat forrige = hode;
        int data = fjernSoldat.data;

        while(aktuell.data != data){
            if (aktuell.neste == hode){
                break;
            }
            forrige = aktuell;
            aktuell = aktuell.neste;
        }
        forrige.neste = aktuell.neste;
        hode = forrige.neste;
        str--;

    }

    public void fjernForste(Soldat fjernSoldat){
        Soldat aktuell = hode;
        Soldat forrige = hode;
        int data = fjernSoldat.data - 1;

        while (aktuell.data != data){
            if (aktuell.neste == hode){
                break;
            }
            forrige = aktuell;
            aktuell = aktuell.neste;
        }
        forrige.neste = aktuell.neste;
        str--;
    }

    public void vis(){
        
        Soldat temp = hode;
        
		if (str == 0) isEmpty();
		for (int i = 0; i < str-1; i++){
			System.out.print(temp.data+" - ");
			temp = temp.neste;
		}
		System.out.print(temp.data);
	}


    public void regnUt(int interval){
		Soldat  aktuell = hode;
		Soldat  temp = null;
		boolean del = true;
		System.out.println("Opprinnelig liste:");
		vis();
		//System.out.println("\n");
        
        while(str >= 2){
			for (int i = 0; i < interval; i++){
				temp = aktuell;
				aktuell = aktuell.neste;
			}
			if (del == true) fjernForste(aktuell);
			else fjern(aktuell);
			aktuell = temp;
			System.out.println("\n");
			vis();
			del = false;
        }
    }
}