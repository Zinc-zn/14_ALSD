public class fungsi {
    // Menyimpan harga setiap jenis bunga sebagai variabel tetap (constant)
    // Menggunakan 'final' agar nilai tidak bisa diubah
    static final int HARGA_AGLONEMA = 75000;  // Harga bunga Aglonema per unit
    static final int HARGA_KELADI = 50000;    // Harga bunga Keladi per unit
    static final int HARGA_ALOCASIA = 60000;  // Harga bunga Alocasia per unit
    static final int HARGA_MAWAR = 10000;     // Harga bunga Mawar per unit
    
    // Fungsi untuk menghitung pendapatan setiap cabang
    public static void hitungPendapatan(int[][] stok) {
        // Melakukan perhitungan untuk setiap cabang
        for (int i = 0; i < stok.length; i++) {
            // Mengambil data stok untuk setiap jenis bunga
            int stokAglonema = stok[i][0];
            int stokKeladi = stok[i][1];
            int stokAlocasia = stok[i][2];
            int stokMawar = stok[i][3];
            
            // Menghitung pendapatan per jenis bunga
            int pendapatanAglonema = stokAglonema * HARGA_AGLONEMA;
            int pendapatanKeladi = stokKeladi * HARGA_KELADI;
            int pendapatanAlocasia = stokAlocasia * HARGA_ALOCASIA;
            int pendapatanMawar = stokMawar * HARGA_MAWAR;
            
            // Menghitung total pendapatan cabang
            int totalPendapatan = pendapatanAglonema + pendapatanKeladi + 
                                pendapatanAlocasia + pendapatanMawar;
            
            // Menampilkan hasil perhitungan
            System.out.println("Pendapatan RoyalGarden " + (i+1) + ":");
            System.out.println("--------------------------------");
            System.out.println("Aglonema : " + pendapatanAglonema);
            System.out.println("Keladi   : " + pendapatanKeladi);
            System.out.println("Alocasia : " + pendapatanAlocasia);
            System.out.println("Mawar    : " + pendapatanMawar);
            System.out.println("Total    : " + totalPendapatan);
            System.out.println();
        }
    }
    
    // Fungsi untuk menghitung total stok setiap jenis bunga
    public static void hitungTotalStok(int[][] stok) {
        // Membuat variabel untuk menyimpan total setiap jenis bunga
        int totalAglonema = 0;
        int totalKeladi = 0;
        int totalAlocasia = 0;
        int totalMawar = 0;
        
        // Menghitung total untuk setiap jenis bunga dari semua cabang
        for (int i = 0; i < stok.length; i++) {
            totalAglonema += stok[i][0];
            totalKeladi += stok[i][1];
            totalAlocasia += stok[i][2];
            totalMawar += stok[i][3];
        }
        
        // Menampilkan hasil perhitungan total stok
        System.out.println("Total Stok Seluruh Cabang:");
        System.out.println("--------------------------------");
        System.out.println("Total Aglonema : " + totalAglonema);
        System.out.println("Total Keladi   : " + totalKeladi);
        System.out.println("Total Alocasia : " + totalAlocasia);
        System.out.println("Total Mawar    : " + totalMawar);
        System.out.println();
    }
    
    // Fungsi untuk mengupdate stok setelah pengurangan bunga mati
    public static void updateStokBungaMati(int[][] stok) {
        // Jumlah pengurangan untuk setiap jenis bunga
        int kurangAglonema = 1;
        int kurangKeladi = 2;
        int kurangAlocasia = 0;
        int kurangMawar = 5;
        
        // Melakukan pengurangan stok untuk setiap cabang
        for (int i = 0; i < stok.length; i++) {
            // Mengurangi stok dengan jumlah bunga yang mati
            stok[i][0] -= kurangAglonema;
            stok[i][1] -= kurangKeladi;
            stok[i][2] -= kurangAlocasia;
            stok[i][3] -= kurangMawar;
            
            // Menampilkan stok setelah pengurangan
            System.out.println("Stok RoyalGarden " + (i+1) + " setelah pengurangan:");
            System.out.println("--------------------------------");
            System.out.println("Aglonema : " + stok[i][0]);
            System.out.println("Keladi   : " + stok[i][1]);
            System.out.println("Alocasia : " + stok[i][2]);
            System.out.println("Mawar    : " + stok[i][3]);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // Membuat array 2 dimensi untuk menyimpan data stok bunga
        // Format: [cabang][jenis bunga]
        // Jenis bunga: 0=Aglonema, 1=Keladi, 2=Alocasia, 3=Mawar
        int[][] stokBunga = {
            {10, 5, 15, 7},  // Stok RoyalGarden 1
            {6, 11, 9, 12},  // Stok RoyalGarden 2
            {2, 10, 10, 5},  // Stok RoyalGarden 3
            {5, 7, 12, 9}    // Stok RoyalGarden 4
        };
        
        // Menjalankan fungsi-fungsi yang telah dibuat
        System.out.println("=== PENDAPATAN JIKA SEMUA BUNGA TERJUAL ===");
        System.out.println();
        hitungPendapatan(stokBunga);
        
        System.out.println("=== TOTAL STOK BUNGA ===");
        System.out.println();
        hitungTotalStok(stokBunga);
        
        System.out.println("=== STOK SETELAH PENGURANGAN BUNGA MATI ===");
        System.out.println();
        updateStokBungaMati(stokBunga);
    }
}