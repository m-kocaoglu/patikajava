import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,select;
        double sonuc;
        System.out.print("1. Sayiyi Giriniz : ");
        n1 = input.nextInt();
        System.out.print("2. Sayiyi Giriniz : ");
        n2 = input.nextInt();
        System.out.print("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\n");

        System.out.print("Islem Turunu Seciniz : ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.print("Sonuc : " + (n1+n2));
                break;
            case 2:
                System.out.print("Sonuc : " + (n1-n2));
                break;
            case 3:
                System.out.print("Sonuc : " + (n1*n2));
                break;
            case 4:
                switch(n2){
                    case 0:
                        System.out.print("Bir sayi 0 ile bolunemez !");
                        break;
                    default:
                        System.out.print("Sonuc : " + (n1/n2));
                }
                break;
            default:
                System.out.print("Yanlis secim yaptiniz. Lutfen tekrar deneyiniz.");


        }

    }
}
