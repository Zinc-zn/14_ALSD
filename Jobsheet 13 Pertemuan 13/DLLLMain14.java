import java.util.Scanner;

public class DLLLMain14 {
    public static void main(String[] args) {
        DoubleLinkedList14 list = new DoubleLinkedList14();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do { 
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Tambah setelah NIM tertentu");
            System.out.println("4. Tambah pada indeks tertentu");
            System.out.println("5. Hapus di awal");
            System.out.println("6. Hapus di akhir");
            System.out.println("7. Hapus setelah NIM tertentu");
            System.out.println("8. Hapus pada indeks tertentu");
            System.out.println("9. Tampilkan data");
            System.out.println("10. Cari Mahasiswa berdasarkan NIM");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data pada indeks tertentu");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa14 mhs1 = inputMahasiswa(scan);
                    list.addFirst(mhs1);
                    break;
                case 2:
                    Mahasiswa14 mhs2 = inputMahasiswa(scan);
                    list.addLast(mhs2);
                    break;
                case 3:
                    System.out.print("Masukkan NIM setelah mana data akan disisipkan: ");
                    String nimKey = scan.nextLine();
                    Mahasiswa14 mhs3 = inputMahasiswa(scan);
                    list.insertAfter(nimKey, mhs3);
                    break;
                case 4:
                    System.out.print("Masukkan indeks untuk menambah data: ");
                    int indexAdd = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa14 mhs4 = inputMahasiswa(scan);
                    list.add(indexAdd, mhs4);
                    break;
                case 5:
                    list.removeFirst();
                    break;
                case 6:
                    list.removeLast();
                    break;
                case 7:
                    System.out.print("Masukkan NIM setelah mana data akan dihapus: ");
                    String nimRemove = scan.nextLine();
                    list.removeAfter(nimRemove);
                    break;
                case 8:
                    System.out.print("Masukkan indeks untuk menghapus data: ");
                    int indexRemove = scan.nextInt();
                    scan.nextLine();
                    list.remove(indexRemove);
                    break;
                case 9:
                    list.print();
                    break;
                case 10:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node14 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;
                case 11:
                    Mahasiswa14 first = list.getFirst();
                    if (first != null) {
                        System.out.println("Data pertama:");
                        first.tampil();
                    }
                    break;
                case 12:
                    Mahasiswa14 last = list.getLast();
                    if (last != null) {
                        System.out.println("Data terakhir:");
                        last.tampil();
                    }
                    break;
                case 13:
                    System.out.print("Masukkan indeks yang ingin ditampilkan: ");
                    int indexGet = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa14 dataAtIndex = list.getIndex(indexGet);
                    if (dataAtIndex != null) {
                        System.out.println("Data pada indeks " + indexGet + ":");
                        dataAtIndex.tampil();
                    }
                    break;
                case 14:
                    System.out.println("Jumlah data dalam list: " + list.size());
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 0);
        
        scan.close();
    }
    
    public static Mahasiswa14 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        
        return new Mahasiswa14(nim, nama, kelas, ipk);
    }
}