public class DosenDemo14 {
    public static void main(String[] args) {
      DataDosen14 list = new DataDosen14();
  
      Dosen14 d1 = new Dosen14("D1", "Agus", true, 31);
      Dosen14 d2 = new Dosen14("D2", "Budi", true, 35);
      Dosen14 d3 = new Dosen14("D3", "Cici", false, 22);
      Dosen14 d4 = new Dosen14("D4", "Dedi", true, 45);
      Dosen14 d5 = new Dosen14("D5", "Eka", true, 32);
      Dosen14 d6 = new Dosen14("D6", "Feri", true, 38);
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
    }
  }