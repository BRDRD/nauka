import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        double x = scan.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double y = scan.nextDouble();

        printMenu();

        System.out.println("Wybierz działanie:");
        int odp = scan.nextInt();

        menuWyboru(odp, x, y);

    }


    public static double dodawanie(double x, double y){
        double wynik = x+y;
        return wynik;
    }
    public static double odejmowanie(double x, double y){
        double wynik = x-y;
        return wynik;
    }
    public static double mnozenie(double x, double y){
        double wynik = x*y;
        return wynik;
    }
    public static double dzielenie(double x, double y){
        double wynik = x / y;
        return wynik;
    }
    public static void menuWyboru(int odp, double x, double y){
        double wynik = 0;
        switch(odp){
            case 1:
                wynik=dodawanie(x, y);
                break;
            case 2:
                wynik=odejmowanie(x, y);
                break;
            case 3:
                wynik=mnozenie(x, y);
                break;
            case 4:
                wynik=dzielenie(x, y);
                break;
            default:
                System.out.println("Wybór spoza MENU!");
        }
        System.out.println(wynik);
    }

    public static void printMenu(){
        System.out.println("----------MENU---------");
        System.out.println("| 1. Dodawanie        |");
        System.out.println("| 2. Odejmowanie      |");
        System.out.println("| 3. Mnożenie         |");
        System.out.println("| 4. Dzielenie        |");
        System.out.println("-----------------------");
    }
}
