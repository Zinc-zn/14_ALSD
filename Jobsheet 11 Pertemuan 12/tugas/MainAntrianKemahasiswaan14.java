import java.util.Scanner;

public class MainAntrianKemahasiswaan14 {
    private static Scanner scanner = new Scanner(System.in);
    private static QueueMahasiswa14 antrian = new QueueMahasiswa14();
    
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("    SISTEM ANTRIAN UNIT KEMAHASISWAAN");
        System.out.println("=================================================");
        
        int pilihan;
        
        do {
            tampilkanMenu();
            System.out.print("Pilih menu (0-9): ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1:
                    mendaftarAntrian();
                    break;
                case 2:
                    panggilMahasiswa();
                    break;
                case 3:
                    tampilkanAntrianTerdepan();
                    break;
                case 4:
                    tampilkanAntrianTerakhir();
                    break;
                case 5:
                    tampilkanSemuaAntrian();
                    break;
                case 6:
                    tampilkanJumlahAntrian();
                    break;
                case 7:
                    cariMahasiswaInAntrian();
                    break;
                case 8:
                    cekStatusAntrian();
                    break;
                case 9:
                    kosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem antrian!");
                    System.out.println("Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu yang tersedia.");
            }
            
            if (pilihan != 0) {
                System.out.println("\nTekan Enter untuk melanjutkan...");
                scanner.nextLine();
            }
            
        } while (pilihan != 0);
        
        scanner.close();
    }
    
    private static void tampilkanMenu() {
        System.out.println("\n=== MENU LAYANAN UNIT KEMAHASISWAAN ===");
        System.out.println("1. Daftar Antrian");
        System.out.println("2. Panggil Mahasiswa (Layani)");
        System.out.println("3. Lihat Antrian Terdepan");
        System.out.println("4. Lihat Antrian Terakhir");
        System.out.println("5. Tampilkan Semua Antrian");
        System.out.println("6. Jumlah Mahasiswa Mengantri");
        System.out.println("7. Cari Mahasiswa dalam Antrian");
        System.out.println("8. Cek Status Antrian");
        System.out.println("9. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.println("========================================");
    }
    
    private static void mendaftarAntrian() {
        System.out.println("\n=== PENDAFTARAN ANTRIAN ===");
        
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Kelas: ");
        String kelas = scanner.nextLine();
        
        System.out.print("Masukkan IPK: ");
        double ipk = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("\nJenis Layanan yang tersedia:");
        System.out.println("1. Surat Keterangan Mahasiswa Aktif");
        System.out.println("2. Legalisir Ijazah/Transkrip");
        System.out.println("3. Surat Keterangan Lulus");
        System.out.println("4. Konsultasi Akademik");
        System.out.println("5. Pengajuan Beasiswa");
        System.out.println("6. Lainnya");
        
        System.out.print("Pilih jenis layanan (1-6): ");
        int pilihanLayanan = scanner.nextInt();
        scanner.nextLine();
        
        String jenisLayanan;
        switch (pilihanLayanan) {
            case 1:
                jenisLayanan = "Surat Keterangan Mahasiswa Aktif";
                break;
            case 2:
                jenisLayanan = "Legalisir Ijazah/Transkrip";
                break;
            case 3:
                jenisLayanan = "Surat Keterangan Lulus";
                break;
            case 4:
                jenisLayanan = "Konsultasi Akademik";
                break;
            case 5:
                jenisLayanan = "Pengajuan Beasiswa";
                break;
            case 6:
                System.out.print("Masukkan jenis layanan: ");
                jenisLayanan = scanner.nextLine();
                break;
            default:
                jenisLayanan = "Layanan Umum";
        }
        
        antrian.tambahAntrian(nim, nama, kelas, ipk, jenisLayanan);
    }
    
    private static void panggilMahasiswa() {
        System.out.println("\n=== PEMANGGILAN MAHASISWA ===");
        Mahasiswa14 mahasiswa = antrian.dequeue();
        
        if (mahasiswa != null) {
            System.out.println("\nDetail mahasiswa yang sedang dilayani:");
            mahasiswa.tampilkanInfo();
        }
    }
    
    private static void tampilkanAntrianTerdepan() {
        antrian.tampilkanAntrianTerdepan();
    }
    
    private static void tampilkanAntrianTerakhir() {
        antrian.tampilkanAntrianTerakhir();
    }
    
    private static void tampilkanSemuaAntrian() {
        antrian.tampilkanSemuaAntrian();
    }
    
    private static void tampilkanJumlahAntrian() {
        System.out.println("\n=== INFORMASI ANTRIAN ===");
        antrian.tampilkanJumlahAntrian();
    }
    
    private static void cariMahasiswaInAntrian() {
        System.out.println("\n=== PENCARIAN MAHASISWA ===");
        System.out.print("Masukkan NIM mahasiswa yang dicari: ");
        String nim = scanner.nextLine();
        
        antrian.cariMahasiswa(nim);
    }
    
    private static void cekStatusAntrian() {
        System.out.println("\n=== STATUS ANTRIAN ===");
        
        if (antrian.isEmpty()) {
            System.out.println("Status: Antrian KOSONG");
        } else {
            System.out.println("Status: Antrian TIDAK KOSONG");
        }
        
        if (antrian.isFull()) {
            System.out.println("Kapasitas: Antrian PENUH");
        } else {
            System.out.println("Kapasitas: Masih bisa menerima antrian");
        }
        
        antrian.tampilkanJumlahAntrian();
    }
    
    private static void kosongkanAntrian() {
        System.out.println("\n=== KONFIRMASI PENGOSONGAN ANTRIAN ===");
        System.out.print("Apakah Anda yakin ingin mengosongkan semua antrian? (y/n): ");
        String konfirmasi = scanner.nextLine();
        
        if (konfirmasi.equalsIgnoreCase("y") || konfirmasi.equalsIgnoreCase("yes")) {
            antrian.clear();
        } else {
            System.out.println("Pengosongan antrian dibatalkan.");
        }
    }
}