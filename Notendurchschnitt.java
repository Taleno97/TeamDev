import java.util.Scanner;


public class Notenrechner {
    public static void main(String[] args){
        boolean zahlenrichtig = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib eine 0 fÃ¼r Abitur Noten (0-15) oder eine 1 fÃ¼r Berufsschulnoten eine (1-6) ");
        int notenart = scanner.nextInt();
        int zahl1 = -1;
        int zahl2 = -1;
        int zahl3 = -1;
        int zahl4 = -1;
        
        while(notenart > 1 || notenart < 0){
                System.out.println("Gib bitte nur Zahlen zwischen 0-1 ein.");
                notenart = scanner.nextInt();
        }
        System.out.println("Gib bitte nun deine Noten ein, jeweils mit einem Leerzeichen getrennt oder nacheinander.");
        if(notenart == 0){
            while((zahl1 > 15 || zahl1 < 0) || (zahl2 > 15 || zahl2 < 0) || (zahl3 > 15 || zahl3 < 0) || (zahl4 > 15 || zahl4 < 0)){
                zahl1 = scanner.nextInt();
                zahl2 = scanner.nextInt();
                zahl3 = scanner.nextInt();
                zahl4 = scanner.nextInt();
                if((zahl1 > 15 || zahl1 < 0) || (zahl2 > 15 || zahl2 < 0) || (zahl3 > 15 || zahl3 < 0) || (zahl4 > 15 || zahl4 < 0)){
                    System.out.println("Bitte gib nur Zahlen von 0-15 ein");
                }
            }
        }
        else if(notenart == 1){
            while((zahl1 > 6 || zahl1 < 1) || (zahl2 > 6 || zahl2 < 1) || (zahl3 > 6 || zahl3 < 1) || (zahl4 > 6 || zahl4 < 1)){
                zahl1 = scanner.nextInt();
                zahl2 = scanner.nextInt();
                zahl3 = scanner.nextInt();
                zahl4 = scanner.nextInt();
                if((zahl1 > 6 || zahl1 < 1) || (zahl2 > 6 || zahl2 < 1) || (zahl3 > 6 || zahl3 < 1) || (zahl4 > 6 || zahl4 < 1)){
                    System.out.println("Bitte gib nur Zahlen von 1-6 ein");
                }
            }
        }

        double ergebnis = (Double.valueOf(zahl1) + Double.valueOf(zahl2) + Double.valueOf(zahl3) + Double.valueOf(zahl4)) / 4;

        System.out.println("Dein Notendurchschnitt ist " + ergebnis);

        

    }
}
