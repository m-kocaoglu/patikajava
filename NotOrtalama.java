import java.util.Scanner;
class NotOrtalama {
    public static void main(String[] args) {

        int Mat,Fizik,Kimya,Turkce,Tarih,Muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        Mat = inp.nextInt();
        System.out.print("Fizik Notunuz : ");
        Fizik = inp.nextInt();
        System.out.print("Kimya Notunuz : ");
        Kimya = inp.nextInt();
        System.out.print("Turkce Notunuz : ");
        Turkce = inp.nextInt();
        System.out.print("Tarih Notunuz : ");
        Tarih = inp.nextInt();
        System.out.print("Muzik Notunuz : ");
        Muzik = inp.nextInt();

        int ortalama = (Mat+Fizik+Kimya+Turkce+Tarih+Muzik) / 6;
        System.out.println("Not Ortalamaniz : " + ortalama);

        String sonuc = ortalama > 60 ? "Sinifi Geçti" : "Sinifta Kaldi";
        System.out.print(sonuc);

    }
}
