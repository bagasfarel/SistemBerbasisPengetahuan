public class kuis1 {
    public static void main(String[] args) {
        boolean A = true; 
        boolean E = true;
        boolean B = false; 
        boolean C = false; 
        boolean D = false; 
        boolean F = false; 
        boolean G = false; 
        boolean H = false; 
        boolean I = false; 
        boolean J = false; 
        boolean K = false; 

        if (A && B) {
            C = true;
        }
        if (C) {
            D = true;      
        }
        if (A && E) {
            F = true; 
        }
        if (A) {
            G = true;
        }     
        if (F && G) {
            D = true;
        }
        if (G && E) {
            H = true;
        }
        if (C && H) {
            I = true; 
        }
        if (I && A) {
            J = true;
        }
        if (G) {
            J = true;  
        }   
        if (J) {
            K = true; 
        }

        System.out.println("Fakta baru F, G, H, D, J, K ");
        System.out.println("Nilai K adalah " + K);
    }
}
