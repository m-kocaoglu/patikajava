import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double mesafe, tutar;
        System.out.print("Gidilen Mesafeyi Giriniz (KM) : ");
        mesafe = inp.nextDouble();
        tutar = (mesafe * 2.2) + 10;
        if (tutar < 20) tutar = 20;
        System.out.print("Tutar = " + tutar + " TL");

    }
}
