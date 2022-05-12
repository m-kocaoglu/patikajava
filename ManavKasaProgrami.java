import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,e,d,m,p,akg=2.14,ekg=3.67,dkg=1.11,mkg=0.95,pkg=5.0,toplam;

        System.out.print("Armut Kac Kilo ? :");
        a = input.nextDouble();
        System.out.print("Elma Kac Kilo ? :");
        e = input.nextDouble();
        System.out.print("Domates Kac Kilo ? :");
        d = input.nextDouble();
        System.out.print("Muz Kac Kilo ? :");
        m = input.nextDouble();
        System.out.print("Patlican Kac Kilo ? :");
        p = input.nextDouble();
        toplam = a*akg + e*ekg + d*dkg + m*mkg + p*pkg;
        System.out.print("Toplam tutar : " + toplam + " TL");
    }
}
