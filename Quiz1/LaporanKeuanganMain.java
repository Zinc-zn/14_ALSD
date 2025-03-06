public class LaporanKeuanganMain {

    public static void main(String[] args) {
        LaporanKeuangan[] perusahaan = new LaporanKeuangan[3];

        perusahaan[0] = new LaporanKeuangan("PT Rizal", 50000, 20000);
        perusahaan[1] = new LaporanKeuangan("PT Risal", 200000, 175000);
        perusahaan[2] = new LaporanKeuangan("PT Rijal", 500000, 250000);

        System.out.println("Data Keuangan");
        System.out.println("================================");
        for (LaporanKeuangan lk: perusahaan) {
            lk.printData();
            System.out.println("-----------------------------");
        }

        double totalKeuntungan = 0;
        int hitung = 0;

        for (LaporanKeuangan lk : perusahaan) {
            if (lk.pendaptanBulanan>100000) {
                totalKeuntungan += lk.hitungKeuntungan();
                hitung++;
            }
        }

        double rataKeuntungan = (hitung>0)? totalKeuntungan/hitung:0;
        System.out.println("Rata rata keuntungan dengan pendapatan bulanan diatas 100000 : "+rataKeuntungan);
        double totalSemuaKeuntungan=0;
        for(LaporanKeuangan lk : perusahaan){
            totalSemuaKeuntungan += lk.hitungKeuntungan();
        }

        double persentaseKeuntungan = (totalSemuaKeuntungan>0)?(totalKeuntungan/totalSemuaKeuntungan)*100:0;
        System.out.println("Presentase keuntungan dengan pendapatan bulanan diatas 100000 : " + persentaseKeuntungan +"");
    }
}