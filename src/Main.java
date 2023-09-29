import java.util.Scanner;

public class Main {
    public static final int ROZMIAR_TABLICY = 50;

    public static void main(String[] args) {

        System.out.println("Metoda szukania liczby z wartownikiem");

        System.out.println("Podaj liczbę do wyszukania");
        Scanner scanner = new Scanner(System.in);
        int szukanaLiczba = scanner.nextInt();

        int[] tablicaLiczbowa = new int[ROZMIAR_TABLICY];

        for (int i = 0; i < tablicaLiczbowa.length; i++) {
            tablicaLiczbowa[i] = (int) (Math.random() * 100);
            System.out.print(tablicaLiczbowa[i] + ", ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        int szukanie = szukanieWartownika(szukanaLiczba, tablicaLiczbowa);
        if(szukanie==ROZMIAR_TABLICY){
            System.out.println("Szukanej liczby " + szukanaLiczba + " nie ma w zbiorze");
        }
        else{
            System.out.println("Szukana liczba " + szukanaLiczba + " jest w zbiorze");
        }
        System.out.println(szukanie);
    }

    public static int szukanieWartownika(int szukanaLiczba, int[] tablicaLiczbowa) {
    int[] tablicaLiczbowaSzukanych = new int[ROZMIAR_TABLICY+1];
    for(int k = 0; k<ROZMIAR_TABLICY; k++){
        tablicaLiczbowaSzukanych[k] = tablicaLiczbowa[k];
    }
    tablicaLiczbowaSzukanych[ROZMIAR_TABLICY] = szukanaLiczba;
    int numerIndex = 0;
    for(int l = 0; l<=ROZMIAR_TABLICY; l++){
        if(tablicaLiczbowaSzukanych[l]==szukanaLiczba){
            numerIndex = l;
            break;
        }
    }
    return numerIndex;
    }
}



