package jobsheet5.Tugas;

public class Mahasiswa {
    String nama, nim;
    int thnMasuk, uts, uas;
    Mahasiswa(String nm, String nim, int thn, int uts, int uas){
        nama = nm;
        this.nim = nim;
        thnMasuk = thn;
        this.uts = uts;
        this.uas = uas;
    }
    public static Mahasiswa utsTertinggi(Mahasiswa[] arrayOfMhs, int awal, int akhir){
        if (awal == akhir) {
            return arrayOfMhs[awal];
          } else {
            int mid = (awal + akhir) / 2;
            Mahasiswa mhs1 = utsTertinggi(arrayOfMhs, awal, mid);
            Mahasiswa mhs2 = utsTertinggi(arrayOfMhs, mid + 1, akhir);
            if (mhs1.uts > mhs2.uts) {
              return mhs1;
            } else {
              return mhs2;
            }
          }
      
    }
    public static Mahasiswa utsTerendah(Mahasiswa[] arrayOfMhs, int awal, int akhir){
      if (awal == akhir) {
        return arrayOfMhs[awal];
      } else {
        int mid = (awal + akhir) / 2;
        Mahasiswa mhs1 = utsTerendah(arrayOfMhs, awal, mid);
        Mahasiswa mhs2 = utsTerendah(arrayOfMhs, mid + 1, akhir);
        if (mhs1.uts < mhs2.uts) {
          return mhs1;
        } else {
          return mhs2;
        }
      }
    }
    public static double rataNilaiUAS(Mahasiswa[] arrayOfMhs) {
        double rataan = 0;
        for (int i = 0; i < arrayOfMhs.length; i++) {
          rataan += arrayOfMhs[i].uas;
        }
        return rataan / arrayOfMhs.length;
      }
}
