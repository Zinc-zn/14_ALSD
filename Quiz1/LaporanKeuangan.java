public class LaporanKeuangan {
    public String namaPerusahaan;
    public double pendaptanBulanan;
    public double biayaOperasional;

    public LaporanKeuangan(String namaPerushaan, double pendapatanBulanan, double biayaOperasional) {
        this.namaPerusahaan = namaPerushaan;
        this.pendaptanBulanan = pendapatanBulanan;
        this.biayaOperasional = biayaOperasional;
    }

    public double hitungKeuntungan() {
        return pendaptanBulanan - biayaOperasional;
    }

    public void printData(){
        System.out.println("Nama Perusahaan     : "+ namaPerusahaan);
        System.out.println("Pendapatan Bulanan  : "+ pendaptanBulanan);
        System.out.println("Biaya Operasi       : "+ biayaOperasional);
        System.out.println("Keuntungan          : "+ hitungKeuntungan());
    }
}

