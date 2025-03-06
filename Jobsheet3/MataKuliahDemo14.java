import java.util.Scanner;
public class MataKuliahDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        String input = sc.nextLine();
        int jumlahMataKuliah = Integer.parseInt(input);
        
        MataKuliah14[] arrayOfMataKuliah14 = new MataKuliah14[jumlahMataKuliah];
        
        String kode, nama, dummy;
        int sks, jumlahJam;
        
        for(int i=0; i<jumlahMataKuliah; i++){
            arrayOfMataKuliah14[i] = new MataKuliah14("", "", 0, 0);
            
            System.out.println("Masukkan Data MataKuliah ke-"+ (i+1));
            System.out.print("KODE          : ");
            kode = sc.nextLine();
            System.out.print("NAMA          : ");
            nama = sc.nextLine();
            System.out.print("SKS           : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("JUMLAH JAM    : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------");
            
            arrayOfMataKuliah14[i].tambahData(kode, nama, sks, jumlahJam);
        }
        
        System.out.println("\nMENAMPILKAN DATA MATA KULIAH");
        System.out.println("=============================");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("DATA MATAKULIAH KE-"+ (i+1));
            arrayOfMataKuliah14[i].cetakInfo();
        }
    }
}