package no.hvl.dat100.tabeller;

public class Tabeller {
	
	public static void main(String[]args) {
		
		//int[]tilfeldigTabell = {1,2,3,4,5,6,7,8,9};
		int[]tilfeldigTabell = {1,2,3,4,5,6,7,8,9};
		int[]tilfeldigTabell2 = {10,11,12,13,14,15,16,17,18};
		
		
		
		
		//skrivUt(tilfeldigTabell);
		//System.out.println(tilStreng(tilfeldigTabell)); 
		//System.out.println(summer(tilfeldigTabell));
		//System.out.println(finnesTall(tilfeldigTabell,4));
		//System.out.println("Posisjon: " + posisjonTall(tilfeldigTabell, 4));
		//reverser(tilfeldigTabell);
		//System.out.println(erSortert(tilfeldigTabell));
		 int[] sammensattTabell = settSammen(tilfeldigTabell, tilfeldigTabell2);
	     skrivUt(sammensattTabell);
		
	
		
		
	}
	
 
	// a)I denne oppgaven finner vi en metode som skriver ut en tabell
	public static void skrivUt(int[] tabell) {
		
		
		for (int i = 0; i < tabell.length; i++) {
	        System.out.print(tabell[i] + " ");
	    }
	    System.out.println();

	}

	// b)i denne oppgaven Konvertes tabellen våres int verdier til string
	public static String tilStreng(int[] tabell) {
	   
	    String konvertertTilStringTabell = "[";

	    for (int i = 0; i < tabell.length; i++) {
	    	konvertertTilStringTabell += tabell[i]; 

	       
	        if (i < tabell.length - 1) {
	        	konvertertTilStringTabell += ",";
	        }
	    }

	    
	    konvertertTilStringTabell += "]";

	    return konvertertTilStringTabell;  
	}



	// c)I denne oppgaven summeres alle verdiene i tabellen sammen
	public static int summer(int[] tabell) {
		int sum = 0;
		for(int i = 0; i<tabell.length; i++) {
		
			sum +=tabell[i];
			
				
		}
		
		return sum;
		
	}

	// d)I denne oppgaven skal vi sjekke om en tabell inneholder tallet tall
	public static boolean finnesTall(int[] tabell, int tall) {
	
		boolean inneholderTall = false; 
		 
		for(int i = 0; i<tabell.length; i++) {
			
			if (tabell[i] == tall) {
	            inneholderTall = true;
	            break; 
	        }
		}
		return inneholderTall;

	}

	// e)I denne oppgaven finner vi posisjonen til et spesifikt tall i tabellen vår
	public static int posisjonTall(int[] tabell, int tall) {
		
		for (int i = 0; i < tabell.length; i++) {
        
            if (tabell[i] == tall) {
                return i;
            }
        }
      
        return -1;


	}

	// f)I denne oppgaven skriver vi ut tabellen vår bare i omvendt rekkefølge
	public static int[] reverser(int[] tabell) {

        for(int i=tabell.length-1;i>=0;i--) {
        	System.out.print(tabell[i] + " ");
		}
        
        return tabell; 
		
	}

	// g)I denne oppgaven skal vi se om tabellen vår er sortert i stigende rekkefølge
	public static boolean erSortert(int[] tabell) {

		 for (int i = 0; i < tabell.length - 1; i++) {
		        if (tabell[i] > tabell[i + 1]) {
		            return false; 
		        }
		    }
		    
		    return true;
	}

	// h)I denne oppgaven tar vi å setter sammen to tabeller til en tabell
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		  	int lengde1 = tabell1.length;
		    int lengde2 = tabell2.length;

		  
		    int[] sammenlagtTabell = new int[lengde1 + lengde2];

		    
		    for (int i = 0; i < lengde1; i++) {
		    	sammenlagtTabell[i] = tabell1[i];
		    }

		
		    for (int i = 0; i < lengde2; i++) {
		    	sammenlagtTabell[lengde1 + i] = tabell2[i];
		    }

		    return sammenlagtTabell; 

		

	}
}
