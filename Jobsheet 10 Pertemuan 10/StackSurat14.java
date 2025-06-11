import java.util.Scanner;

public class StackSurat14 {
    private Surat14[] stackSurat;
    private int top;
    private int maxSize;
    private Scanner input;
    
    public StackSurat14(int size) {
        maxSize = size;
        stackSurat = new Surat14[maxSize];
        top = -1;
        input = new Scanner(System.in);
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
    public void push(Surat14 surat) {
        if (isFull()) {
            System.out.println("Stack penuh, tidak bisa menambahkan surat lagi.");
            return;
        }
        stackSurat[++top] = surat;
        System.out.println("Surat berhasil ditambahkan!");
    }
    
    public Surat14 pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return null;
        }
        return stackSurat[top--];
    }
    
    public Surat14 peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return null;
        }
        return stackSurat[top];
    }
    
    public void terimaSurat() {
        if (isFull()) {
            System.out.println("Maaf, sistem sudah penuh. Tidak bisa menerima surat baru.");
            return;
        }
        
        System.out.println("\n=== TERIMA SURAT IZIN ===");
        System.out.print("ID Surat: ");
        String id = input.nextLine();
        
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();
        
        System.out.print("Kelas: ");
        String kelas = input.nextLine();
        
        char jenisIzin;
        do {
            System.out.print("Jenis Izin (S: Sakit, I: Izin Keperluan Lain): ");
            String jenis = input.nextLine();
            if (!jenis.isEmpty()) {
                jenisIzin = jenis.toUpperCase().charAt(0);
                if (jenisIzin == 'S' || jenisIzin == 'I') {
                    break;
                }
            }
            System.out.println("Input tidak valid! Masukkan S atau I.");
        } while (true);
        
        int durasi = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Durasi (hari): ");
                durasi = Integer.parseInt(input.nextLine());
                if (durasi > 0) {
                    validInput = true;
                } else {
                    System.out.println("Durasi harus lebih dari 0 hari.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Masukkan angka.");
            }
        }
        
        Surat14 suratBaru = new Surat14(id, nama, kelas, jenisIzin, durasi);
        push(suratBaru);
    }
    
    public void prosesSurat() {
        if (isEmpty()) {
            System.out.println("\nTidak ada surat yang perlu diproses.");
            return;
        }
        
        System.out.println("\n=== PROSES SURAT IZIN ===");
        System.out.println("Surat terakhir yang akan diproses:");
        Surat14 surat = peek();
        surat.displaySurat();
        
        System.out.print("Proses surat ini? (Y/N): ");
        String jawaban = input.nextLine();
        
        if (jawaban.equalsIgnoreCase("Y")) {
            pop();
            System.out.println("Surat telah diproses dan dihapus dari daftar.");
        } else {
            System.out.println("Pemrosesan surat dibatalkan.");
        }
    }
    
    public void lihatSuratTerakhir() {
        System.out.println("\n=== LIHAT SURAT IZIN TERAKHIR ===");
        if (isEmpty()) {
            System.out.println("Tidak ada surat dalam sistem.");
            return;
        }
        
        System.out.println("Surat izin terakhir:");
        Surat14 surat = peek();
        surat.displaySurat();
    }
    
    public void cariSurat() {
        if (isEmpty()) {
            System.out.println("\nTidak ada surat dalam sistem.");
            return;
        }
        
        System.out.println("\n=== CARI SURAT IZIN ===");
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();
        
        boolean found = false;
        System.out.println("\nHasil pencarian untuk nama: " + nama);
        
        for (int i = 0; i <= top; i++) {
            if (stackSurat[i].getNamaMahasiswa().toLowerCase().contains(nama.toLowerCase())) {
                stackSurat[i].displaySurat();
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("Tidak ditemukan surat dengan nama mahasiswa " + nama);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== SISTEM MANAJEMEN SURAT IZIN MAHASISWA ===");
        System.out.print("Masukkan kapasitas maksimal surat: ");
        int maxSize = Integer.parseInt(scanner.nextLine());
        
        StackSurat14 stackSurat = new StackSurat14(maxSize);
        int pilihan = 0;
        
        do {
            System.out.println("\n=== MENU SISTEM SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            
            try {
                pilihan = Integer.parseInt(scanner.nextLine());
                
                switch (pilihan) {
                    case 1:
                        stackSurat.terimaSurat();
                        break;
                    case 2:
                        stackSurat.prosesSurat();
                        break;
                    case 3:
                        stackSurat.lihatSuratTerakhir();
                        break;
                    case 4:
                        stackSurat.cariSurat();
                        break;
                    case 0:
                        System.out.println("Terima kasih telah menggunakan sistem.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Masukkan angka.");
                pilihan = -1;
            }
        } while (pilihan != 0);
        
        scanner.close();
    }
}