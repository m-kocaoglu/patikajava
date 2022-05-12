import java.util.Scanner;
public class UcgenAlani {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a,b,c,u,alan;
        System.out.print("1. kenari giriniz : ");
        a = inp.nextDouble();
        System.out.print("2. kenari giriniz : ");
        b = inp.nextDouble();
        System.out.print("3. kenari giriniz : ");
        c = inp.nextDouble();
        u = (a+b+c) / 2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Ucgenin Alani = " + alan);
    }
}
