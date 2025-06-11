import java.util.Scanner;

public class MahasiswaDemo14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan Jumlah Mahasiswa : ");
    int jumMhs = sc.nextInt();
    MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14(jumMhs);

    // Mahasiswa14[] dataMahasiswa = {
    //  new Mahasiswa14("111", "adi", "2", 3.6),
    //  new Mahasiswa14("222", "tio", "2", 3.8),
    //  new Mahasiswa14("333", "ila", "2", 3.0),
    //  new Mahasiswa14("444", "lia", "2", 3.5),
    //  new Mahasiswa14("555", "fia", "2", 3.3)
    // };
    // Mahasiswa14[] dataMahasiswa = {
    //  new Mahasiswa14("333", "ila", "2", 3.0),
    //  new Mahasiswa14("555", "fia", "2", 3.2),
    //  new Mahasiswa14("444", "lia", "2", 3.4),
    //  new Mahasiswa14("111", "adi", "2", 3.6),
    //  new Mahasiswa14("222", "tio", "2", 3.7)
    // };

    // for (int i = 0; i < jumMhs; i++) {
    //  list.tambah(dataMahasiswa[i]);
    // }

    for (int i = 0; i < jumMhs; i++) {
      System.out.println("Masukkan Data Mahasiswa Ke-" + (i + 1));
      System.out.print("NIM : ");
      String nim = sc.next();
      System.out.print("Nama : ");
      String nama = sc.next();
      System.out.print("Kelas : ");
      String kelas = sc.next();
      System.out.print("IPK : ");
      double ipk = sc.nextDouble();
      System.out.println("---------------------");
      list.tambah(new Mahasiswa14(nim, nama, kelas, ipk));
    }

    // sequential searching
    // list.tampil();
    // System.out.println("---------------------");
    // System.out.println("Pencarian Data");
    // System.out.println("---------------------");
    //
    // System.out.print("Masukkan IPK yang dicari : ");
    // double cari = sc.nextDouble();
    //
    // System.out.println("Menggunakan sequential searching");
    // int pos = list.sequentialSearching(cari);
    // list.tampilPosisi(cari, pos);
    // list.tampilDataSearch(cari, pos);

    // binary search

    list.tampil();
    System.out.println("---------------------");
    System.out.println("Pencarian Data");
    System.out.println("---------------------");

    System.out.print("Masukkan IPK yang dicari : ");
    double cari = sc.nextDouble();

    System.out.println("Menggunakan binary search");
    int pos = list.findBinarySearch(cari, 0, jumMhs - 1);
    list.tampilPosisi(cari, pos);
    list.tampilDataSearch(cari, pos);
  }
}