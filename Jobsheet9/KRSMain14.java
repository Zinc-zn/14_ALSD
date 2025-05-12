import java.util.Scanner;

public class KRSMain14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AntrianKRS14 antrianKRS = new AntrianKRS14();
        int pilihan;

        do {
            System.out.println("\n===== SISTEM ANTRIAN KRS =====");
            System.out.println("1. Cek Antrian Kosong");
            System.out.println("2. Cek Antrian Penuh");
            System.out.println("3. Kosongkan Antrian");
            System.out.println("4. Tambah Antrian");
            System.out.println("5. Panggil Antrian untuk Proses KRS");
            System.out.println("6. Tampilkan Semua Antrian");
            System.out.println("7. Tampilkan 2 Antrian Terdepan");
            System.out.println("8. Tampilkan Antrian Paling Akhir");
            System.out.println("9. Cetak Jumlah Antrian");
            System.out.println("10. Cetak Jumlah yang Sudah Melakukan Proses KRS");
            System.out.println("11. Cetak Jumlah yang Belum Melakukan Proses KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            
            pilihan = input.nextInt();
            input.nextLine();
            
            switch (pilihan) {
                case 1:
                    if (antrianKRS.cekAntrianKosong()) {
                        System.out.println("Antrian kosong!");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;
                    
                case 2:
                    if (antrianKRS.cekAntrianPenuh()) {
                        System.out.println("Antrian penuh!");
                    } else {
                        System.out.println("Antrian tidak penuh.");
                    }
                    break;
                    
                case 3:
                    antrianKRS.mengosongkanAntrian();
                    break;
                    
                case 4:
                    System.out.println("\n=== TAMBAH MAHASISWA KE ANTRIAN ===");
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Jurusan: ");
                    String jurusan = input.nextLine();
                    System.out.print("Masukkan Semester: ");
                    int semester = input.nextInt();
                    input.nextLine();
                    
                    MahasiswaKRS14 mhs = new MahasiswaKRS14(nim, nama, jurusan, semester);
                    antrianKRS.tambahAntrian(mhs);
                    break;
                    
                case 5:
                    antrianKRS.panggilAntrian();
                    break;
                    
                case 6:
                    antrianKRS.tampilkanSemuaAntrian();
                    break;
                    
                case 7:
                    antrianKRS.tampilkanAntrianTerdepan();
                    break;
                    
                case 8:
                    antrianKRS.tampilkanAntrianTerakhir();
                    break;
                    
                case 9:
                    antrianKRS.cetakJumlahAntrian();
                    break;
                    
                case 10:
                    antrianKRS.cetakJumlahProses();
                    break;
                    
                case 11:
                    antrianKRS.cetakJumlahBelumProses();
                    break;
                    
                case 0:
                    System.out.println("Terima kasih telah menggunakan Sistem Antrian KRS!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
            
        } while (pilihan != 0);
        
        input.close();
    }
}