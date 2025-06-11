import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NIM: ");
        long nim = input.nextLong();
        
        int n = (int)(nim % 100);
        
        if (n < 10) {
            n += 10;
        }
        

        System.out.println("Nilai N: "+n);
        System.out.print("Output: ");
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}