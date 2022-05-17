import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password,newPassword,secim;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici Adinizi Giriniz : ");
        userName = input.nextLine();
        System.out.print("Sifrenizi Giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.print("Basariyla giris yaptiniz.");
        }
        else {
            System.out.println("Yanlis sifre girdiniz. Sifrenizi sifirlamak ister misiniz? (E/H)");
            secim = input.nextLine();
            if (secim.equals("E")){
                System.out.print("Yeni sifrenizi giriniz :");
                newPassword = input.nextLine();
                if (newPassword.equals(password)){
                    System.out.print("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                } else if (newPassword.equals("java123")) {
                    System.out.print("Sifre olusturulamadi, lutfen baska sifre giriniz.");

                }
                else System.out.print("Sifre olusturuldu.");
            } else if (secim.equals("H")) {
                System.out.print("Anasayfaya yonlendiriliyorsunuz.");

            }

        }
    }
}
