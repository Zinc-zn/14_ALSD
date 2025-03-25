package jobsheet5.Tugas;
public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa[] mhs = {
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
          };
        System.out.println("Nilai UTS tertinggi ");
        System.out.println(" - Nama : " +  Mahasiswa.utsTertinggi(mhs, 0, mhs.length - 1).nama);
        System.out.println(" - Nilai UTS : " +  Mahasiswa.utsTertinggi(mhs, 0, mhs.length - 1).uts);
        System.out.println("---------------------");
        System.out.println("Nilai UTS terendah ");
        System.out.println(" - Nama : " +  Mahasiswa.utsTerendah(mhs, 0, mhs.length - 1).nama);
        System.out.println(" - Nilai UTS : " +  Mahasiswa.utsTerendah(mhs, 0, mhs.length - 1).uts);
        System.out.println("---------------------");
        System.out.printf("%-21s %.2f\n","Rata - rata nilai UAS : ", Mahasiswa.rataNilaiUAS(mhs));
        System.out.println("---------------------");
    }
}
