import java.util.Scanner;

public class DosenDemo14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DataDosen14 list = new DataDosen14();

    Dosen14 d1 = new Dosen14("D1", "Agus", true, 31);
    Dosen14 d2 = new Dosen14("D2", "Aguss", true, 35);
    Dosen14 d3 = new Dosen14("D3", "Cici", false, 22);
    Dosen14 d4 = new Dosen14("D4", "Dedi", true, 45);
    Dosen14 d5 = new Dosen14("D5", "Eka", true, 32);
    Dosen14 d6 = new Dosen14("D6", "Feri", true, 32);
    Dosen14 d7 = new Dosen14("D7", "Gigi", false, 30);
    Dosen14 d8 = new Dosen14("D8", "Hana", false, 28);
    Dosen14 d9 = new Dosen14("D9", "Ika", false, 25);
    Dosen14 d10 = new Dosen14("D10", "Joni", true, 30);

    list.tambah(d1);
    list.tambah(d2);
    list.tambah(d3);
    list.tambah(d4);
    list.tambah(d5);
    list.tambah(d6);
    list.tambah(d7);
    list.tambah(d8);
    list.tambah(d9);
    list.tambah(d10);

    System.out.println("Data sebelum sorting:");
    list.tampil();

    System.out.println("Sorting ASC (termuda ke tertua):");
    list.sortingASC();
    list.tampil();

    System.out.println("Sorting DESC (tertua ke termuda):");
    list.sortingDESC();
    list.tampil();

    // tambahan week 7
    System.out.print("Masukkan Usia Yang Dicari : ");
    int usiaCari = sc.nextInt();
    list.sortingASC();
    int pos1 = list.pencarianDataBinary(usiaCari, 0, list.idx - 1);
    list.tampilDataSearch(pos1);
    list.cekDuplikatUsia(pos1);

    System.out.print("Masukkan Nama Yang Dicari : ");
    String namaCari = sc.next();
    int[] pos2 = list.pencarianDataSequential(namaCari);
    list.tampilDataSearch(pos2[0]);
    list.cekDuplikatNama(pos2[1], namaCari);
  }
}