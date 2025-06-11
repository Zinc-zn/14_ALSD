public class mahasiswaMain14 {
    public static void main(String[] args) {
        mahasiswa14 mhs1 = new mahasiswa14();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa14 mhs2 = new mahasiswa14("Annisa Nabila","2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        mahasiswa14 mhs14 = new mahasiswa14("Ahmad Rizky", "2241720180", 3.85, "SI 2F");
        mhs14.tampilkanInformasi();
    }
}