package Default; // cambiar 
		
public class IdentificadorMutantes {
    public static void main(String[] args) {
        String[] dna = {"GTTACG","TAATAA","TCGACC","TTCGAG","AGCCGG","ACTACA"};

        boolean resultado =isMutante(dna);
        System.out.println(resultado);
        
    }
    
    public static boolean isMutante(String[] dna) {
        
        int secuenciasIguales = 0; 		//contador
                
    //Secuencias iguales en horizontal
        for(int i=0; i <= 5; i++) {
            for(int j = 0; j < 3; j++) {
                 if(dna[i].charAt(j) == dna[i].charAt(j+1) &&
                     dna[i].charAt(j+1) == dna[i].charAt(j+2) && 
                     dna[i].charAt(j+2) == dna[i].charAt(j+3) )
                 {
                     secuenciasIguales++;
                 }
            }
        }
        
    //Secuencias iguales en Vertical
        for(int i=0; i <= 5; i++) {
            for(int j = 0; j < 3; j++) {
                 if (dna[j].charAt(i) == dna[j+1].charAt(i) &&
                     dna[j+1].charAt(i) == dna[j+2].charAt(i) && 
                     dna[j+2].charAt(i) == dna[j+3].charAt(i) )
                 {
                     secuenciasIguales++;
                 }
            }
        }			

        //Secuencias iguales en diagonal
        for(int i=0; i < 3; i++) {	
            if (dna[i].charAt(i)==dna[i+1].charAt(i+1) &&
                dna[i+1].charAt(i+1)==dna[i+2].charAt(i+2) &&
                dna[i+2].charAt(i+2)==dna[i+3].charAt(i+3))		
                {
                    secuenciasIguales++;
                }	
            }

        for(int i=1; i < 2 ; i++) {	
            if (dna[i].charAt(i+1)==dna[i+1].charAt(i+2) &&
                 dna[i+1].charAt(i+2)==dna[i+2].charAt(i+3) &&
                dna[i+2].charAt(i+3)==dna[i+3].charAt(i+4))
                {
                    secuenciasIguales++;
                }
            }	
            
        for(int i=0; i < 2 ; i++) {	
            if (dna[i+1].charAt(i)==dna[i+2].charAt(i+1) &&
                dna[i+2].charAt(i+1)==dna[i+3].charAt(i+2) &&
                dna[i+3].charAt(i+2)==dna[i+4].charAt(i+3))
                {
                    secuenciasIguales++;
                }
            }		
        
        for(int i=0; i < 3; i++) {	
            for(int j = 5; j > 2; j--) {
            if (dna[i].charAt(j)==dna[i+1].charAt(j-1) &&
                dna[i+1].charAt(j-1)==dna[i+2].charAt(j-2) &&
                dna[i+2].charAt(j-2)==dna[i+3].charAt(j-3))
                {
                    secuenciasIguales++;
                }
            }
        }

        return secuenciasIguales >= 2;
    }
}