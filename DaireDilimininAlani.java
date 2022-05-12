import java.util.Scanner;
public class DaireDilimininAlani {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double alan,pi=3.14;
        int a,r;

        System.out.print("Dairenin yaricapini giriniz : ");
        r = inp.nextInt();
        System.out.print("Dairenin diliminin acisini giriniz : ");
        a = inp.nextInt();
        alan = (pi*(r*r)*a)/360;
        System.out.print("Daire Diliminin Alani : " + alan);

    }
}
