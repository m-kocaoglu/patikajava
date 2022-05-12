import java.util.Scanner;
public class KdvTutari {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double tutar, kdvDahil, kdvTutari ;
        System.out.print("Tutari Giriniz : ");
        tutar = inp.nextDouble();

        if (tutar >= 0 && tutar <= 1000){
            kdvDahil = tutar + (tutar * 0.18);
            kdvTutari = (tutar * 0.18);
            System.out.println("KDV Dahil Tutar : " + kdvDahil + " TL");
            System.out.print("KDV Tutari : " + kdvTutari + " TL");
        } else if (tutar > 1000) {
            kdvDahil = tutar + (tutar * 0.08);
            kdvTutari = (tutar * 0.08);
            System.out.println("KDV Dahil Tutar : " + kdvDahil + " TL");
            System.out.print("KDV Tutari : " + kdvTutari + " TL");

        }else
            System.out.print("Tutari yanlis girdiniz.");
    }

        }