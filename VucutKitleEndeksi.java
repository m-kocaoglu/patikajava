import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy, kilo,indeks;
        System.out.print("Boyunuzu giriniz (m): ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu giriniz (kg) : ");
        kilo = input.nextDouble();
        indeks = kilo / (boy*boy);
        System.out.print("Vucut Kitle Indeksiniz : " + indeks);

    }
}
