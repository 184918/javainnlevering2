package no.hvl.dat100.matriser;

public class Matriser {
	
	public static void main(String[]args) {
		
		//skrivUt(tabell);
		//System.out.print(tilStreng(tabell));
		
		/*int[][] nyMatrise = skaler(8,tabell);
		skrivUt(nyMatrise);*/
		
		System.out.print(erLik(a,b));
	}
	
	public static int[][] a = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	
	public static int[][] b = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	
	public static int[][] tabell = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	

	// a) I denne oppgaven skriver vi ut en matrise
	public static void skrivUt(int[][] matrise) {
		
		for(int i = 0; i<matrise.length; i++) {
			
			for(int j = 0; j<matrise[i].length; j++) {
				System.out.print(matrise[i][j]+" ");
			}
		}
		
		System.out.println();
	}

	// b)I denne oppgaven skal jeg konverte fra int til streng
	public static String tilStreng(int[][] matrise) {

	    String resultatet = "";

	    for (int i = 0; i <matrise.length; i++) {
	       
	    	for(int j = 0; j< matrise[i].length; j++) {
	    		resultatet += matrise[i][j]; 
	    	}
	    	
	
	        if (i < matrise.length - 1) {
	            resultatet += " ";
	        }
	    }

	    
	    resultatet += "\n";

	    return resultatet;  
	}

	// c) I denne oppgaven tar vi å et tall og multipliserer det tallet med hvert nummer i matrisen vår
	public static int[][] skaler(int tall, int[][] matrise) {
		
		
	    int[][] newMatrise = new int[matrise.length][matrise[0].length];

	    for (int i = 0; i < matrise.length; i++) {
	        
	    	for (int j = 0; j < matrise[i].length; j++) {
	            
	            newMatrise[i][j] = matrise[i][j] * tall;
	        }
	    }

	    return newMatrise;
	
	}

	// d)I denne oppgaven skal vi avgjøre om to matriser er helt like eller ei ved å først sjekke lengde, så innhold
	public static boolean erLik(int[][] a, int[][] b) {
	
	    if (a.length != b.length) {
	        return false;  
	    }
	    
	    for (int i = 0; i < a.length; i++) {
	        if (a[i].length != b[i].length) {
	            return false;  
	        }
	        
	        for (int j = 0; j < a[i].length; j++) {
	            if (a[i][j] != b[i][j]) {
	                return false;  
	            }
	        }
	        
	    }
	    
	   
	    return true;
	}
		
		
	
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		
	
	}
}
