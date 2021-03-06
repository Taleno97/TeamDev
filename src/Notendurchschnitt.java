import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Notendurchschnitt {
    public static void main(String[] args) {
        boolean notenartFalsch = true;
        boolean notenFalsch = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib eine 0 fuer Abitur Noten (0-15) oder eine 1 fuer Berufsschulnoten eine (1-6) ");
        int notenart = 2;

        while (notenartFalsch) {
            try {
                notenart = scanner.nextInt();
                notenartFalsch = false;
            } catch (Exception exception) {
                System.err.println("Bitte gib nur Zahlen ein.");
                scanner.next();
            }
        }

        int zahl1 = -1;
        int zahl2 = -1;
        int zahl3 = -1;
        int zahl4 = -1;

        System.out.println(
                "Gib bitte nun deine vier Noten ein, jeweils mit einem Leerzeichen getrennt oder nacheinander.");
        while (notenFalsch) {
            try {
                switch (notenart) {
                    case 0:
                        while ((zahl1 > 15 || zahl1 < 0) || (zahl2 > 15 || zahl2 < 0) || (zahl3 > 15 || zahl3 < 0)
                                || (zahl4 > 15 || zahl4 < 0)) {
                            System.out.println("Bitte gib nur Zahlen von 0-15 ein");
                            zahl1 = scanner.nextInt();
                            zahl2 = scanner.nextInt();
                            zahl3 = scanner.nextInt();
                            zahl4 = scanner.nextInt();
                        }
                        notenFalsch = false;
                        break;
                    case 1:
                        while ((zahl1 > 6 || zahl1 < 1) || (zahl2 > 6 || zahl2 < 1) || (zahl3 > 6 || zahl3 < 1)
                                || (zahl4 > 6 || zahl4 < 1)) {
                            System.out.println("Bitte gib nur Zahlen von 1-6 ein");
                            zahl1 = scanner.nextInt();
                            zahl2 = scanner.nextInt();
                            zahl3 = scanner.nextInt();
                            zahl4 = scanner.nextInt();
                        }
                        notenFalsch = false;
                        break;
                    default:
                        System.err.println("Not implemented yet.");
                        break;
                }
            } catch (Exception exception) {
                System.err.println("Bitte gib nur vier Zahlen ein.");
                scanner.next();
                continue;
            }

        }

        double ergebnis = (Double.valueOf(zahl1) + Double.valueOf(zahl2) + Double.valueOf(zahl3)
                + Double.valueOf(zahl4)) / 4;

        System.out.println("Dein Notendurchschnitt ist " + ergebnis);

    }
}