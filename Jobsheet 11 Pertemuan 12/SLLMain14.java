import java.util.Scanner;

public class SLLMain14 {

    public static void main(String[] args) {
        // SingleLinkedList14 sll = new SingleLinkedList14();

        // Mahasiswa14 mhs1 = new Mahasiswa14("22212202", "Cintia", "3C", 3.5);
        // Mahasiswa14 mhs2 = new Mahasiswa14("23212201", "Bimon", "2B", 3.8);

        // sll.addFirst(mhs1);
        // sll.addLast(mhs2);

        // System.out.println("data index 1 : ");
        // sll.getData(1);
        
        // System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        // System.out.println();
        
        // sll.print();
        
        // sll.removeFirst();
        // sll.print();

        Scanner scanner = new Scanner(System.in);
        SingleLinkedList14 sll = new SingleLinkedList14();
        
        int pilihan;
        
        do {
            System.out.println("\n=== MENU LINKED LIST ===");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Tampilkan semua data");
            System.out.println("4. Cari data berdasarkan nama");
            System.out.println("5. Hapus data pertama");
            System.out.println("6. Hapus data terakhir");
            System.out.println("7. Hapus data berdasarkan nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Tambah Data di Awal ---");
                    Mahasiswa14 mhsFirst = inputMahasiswa(scanner);
                    sll.addFirst(mhsFirst);
                    System.out.println("Data berhasil ditambahkan di awal!");
                    break;
                    
                case 2:
                    System.out.println("\n--- Tambah Data di Akhir ---");
                    Mahasiswa14 mhsLast = inputMahasiswa(scanner);
                    sll.addLast(mhsLast);
                    System.out.println("Data berhasil ditambahkan di akhir!");
                    break;
                    
                case 3:
                    System.out.println("\n--- Tampilkan Semua Data ---");
                    sll.print();
                    break;
                    
                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String namaCari = scanner.nextLine();
                    int index = sll.indexOf(namaCari);
                    if (index != -1) {
                        System.out.println("Data mahasiswa atas nama " + namaCari + 
                                         " berada pada index: " + index);
                        System.out.println("Data pada index " + index + ":");
                        sll.getData(index);
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;
                    
                case 5:
                    System.out.println("\n--- Hapus Data Pertama ---");
                    sll.removeFirst();
                    System.out.println("Data pertama berhasil dihapus!");
                    break;
                    
                case 6:
                    System.out.println("\n--- Hapus Data Terakhir ---");
                    sll.removeLast();
                    System.out.println("Data terakhir berhasil dihapus!");
                    break;
                    
                case 7:
                    System.out.print("Masukkan nama yang akan dihapus: ");
                    String namaHapus = scanner.nextLine();
                    sll.remove(namaHapus);
                    System.out.println("Data berhasil dihapus!");
                    break;
                    
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        
        scanner.close();
    }
    
    public static Mahasiswa14 inputMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Kelas: ");
        String kelas = scanner.nextLine();
        
        System.out.print("Masukkan IPK: ");
        double ipk = scanner.nextDouble();
        scanner.nextLine();
        
        return new Mahasiswa14(nim, nama, kelas, ipk);
    }
}