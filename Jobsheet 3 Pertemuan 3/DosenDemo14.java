import java.util.Scanner;

public class DosenDemo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = scanner.nextInt();
        scanner.nextLine();
        
        Dosen14[] daftarDosen = new Dosen14[jumlahDosen];
        
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan data dosen ke-" + (i + 1) + ":");
            
            System.out.print("Kode Dosen: ");
            String kode = scanner.nextLine();
            
            System.out.print("Nama Dosen: ");
            String nama = scanner.nextLine();
            
            Boolean jenisKelamin;
            while (true) {
                System.out.print("Jenis Kelamin (pria/wanita): ");
                String jenisKelaminInput = scanner.nextLine().toLowerCase();
                
                if (jenisKelaminInput.equals("pria")) {
                    jenisKelamin = true;
                    break;
                } else if (jenisKelaminInput.equals("wanita")) {
                    jenisKelamin = false;
                    break;
                } else {
                    System.out.println("Input tidak valid. Silakan masukkan 'pria' atau 'wanita'.");
                }
            }
            
            System.out.print("Usia Dosen: ");
            int usia = scanner.nextInt();
            scanner.nextLine();
            
            daftarDosen[i] = new Dosen14(kode, nama, jenisKelamin, usia);
        }
        
        DataDosen14 dataDosen = new DataDosen14();
        
        int pilihan;
        do {
            System.out.println("\n=== MENU ANALISIS DATA DOSEN ===");
            System.out.println("1. Tampilkan Data Semua Dosen");
            System.out.println("2. Jumlah Dosen Per Jenis Kelamin");
            System.out.println("3. Rata-rata Usia Dosen Per Jenis Kelamin");
            System.out.println("4. Info Dosen Paling Tua");
            System.out.println("5. Info Dosen Paling Muda");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1:
                    dataDosen.dataSemuaDosen(daftarDosen);
                    break;
                case 2:
                    dataDosen.jumlahDosenPerJenisKelamin(daftarDosen);
                    break;
                case 3:
                    dataDosen.rerataUsiaDosenPerJenisKelamin(daftarDosen);
                    break;
                case 4:
                    dataDosen.infoDosenPalingTua(daftarDosen);
                    break;
                case 5:
                    dataDosen.infoDosenPalingMuda(daftarDosen);
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 0);
    }
}