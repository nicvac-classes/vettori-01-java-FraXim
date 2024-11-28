//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[]){
        Scanner in = new Scanner ( System.in);
        int i;
        String [] v = new String[5];
        String [] w = new String[5];
        int [] x = new int[10];
        int [] y = new int[10];
        v[0] = "Francesco";
        v[1] = "Ariana Grande";
        v[2] = "Eminem";
        v[3] = "Ice spice";
        v[4] = "Snoobe Dog";
        for (i = 0; i<= 4; i++){
            System.out.println("Inserisci "+(i+1)+"° nome");
            w[i] = in.nextLine(); 
        }
        for (i = 0; i <= 9; i++){
            x[i]=i+1;
        }
        for (i = 0; i <= 9; i++){
            y[i]= i+2;
        }
        for(i = 0; i <= 3; i++){
            System.out.println(v[i]);
        }
        for (i = 0; i <= 4; i++){
            System.out.println(v[i]);
        }
        for (i = 0; i<= 4; i++){
            System.out.println(w[i]);
        }
        for (i = 0; i <= 9; i++){
            System.out.println(x[i]);
        }
        for (i = 0; i <= 9; i++){
            System.out.println(y[i]);
        }
        for(i = 0; i<= 9; i+=2){
            System.out.println(x[i]);
        }
        for(i = 1; i<=9 ; i+=2){
            System.out.println(x[i]);
        }
        for(i = 1; i<=9 ; i+=2){
            if(x[i]% 2 == 0){
                System.out.println(x[i]);
            }
        }
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md