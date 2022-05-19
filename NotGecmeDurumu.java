import java.util.Scanner;
public class NotGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik, fizik, turkce, kimya, muzik,avg;

        System.out.print("Matematik Notunuz :");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = input.nextInt();

        System.out.print("Turkce Notunuz :");
        turkce= input.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = input.nextInt();

        System.out.print("Muzik Notunuz :");
        muzik = input.nextInt();

        int toplam = 0,dersSayisi = 0;

        if (matematik >= 0 && matematik <= 100){
            toplam += matematik;
            dersSayisi ++;
        }
        if (fizik >= 0 && fizik <= 100){
            toplam += fizik;
            dersSayisi ++;
        }
        if (turkce >= 0 && turkce <= 100){
            toplam += turkce;
            dersSayisi ++;
        }
        if (kimya >= 0 && kimya <= 100){
            toplam += kimya;
            dersSayisi ++;
        }
        if (muzik >= 0 && muzik <= 100){
            toplam += muzik;
            dersSayisi ++;
        }
        avg = toplam / dersSayisi;

        if (avg >= 55){
            System.out.println("Sinifi Gectiniz.");
        } else if (avg < 55){
            System.out.println("Sinifi Gecemediniz.");
        } System.out.print("Ortalamaniz " + avg);

        }

    }
