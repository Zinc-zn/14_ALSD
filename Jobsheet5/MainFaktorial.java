package jobsheet5;
import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("Nilai faktorial " + nilai + " Menggunakan BF : " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " Menggunakan DC : " + fk.faktorialDC(nilai));
        sc.close();
    }
}
