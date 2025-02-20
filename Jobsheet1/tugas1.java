import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {

        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[] kota = {
            "BANTEN",      
            "JAKARTA",     
            "BANDUNG",     
            "CIREBON",     
            "BOGOR",       
            "PEKALONGAN",  
            "SEMARANG",    
            "SURABAYA",    
            "MALANG",      
            "TEGAL"        
        };

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Masukkan kode plat nomor (atau 'keluar' untuk keluar): ");
            String input = scanner.nextLine().toUpperCase();
            

            if (input.equals("KELUAR")) {
                break;
            }
            
            if (input.length() != 1) {
                System.out.println("Error: Masukkan satu huruf kode plat nomor!");
                continue;
            }
            
            char cariKode = input.charAt(0);
            boolean cari = false;
            
            for (int i = 0; i < kode.length; i++) {
                if (kode[i] == cariKode) {
                    System.out.println("Kota: " + kota[i]);
                    cari = true;
                    break;
                }
            }
            
            if (!cari) {
                System.out.println("Kode plat nomor tidak ditemukan!");
            }
        }
        
        scanner.close();
        System.out.println("Program selesai!");
    }
}