public class DataDosen14 {
    
    public void dataSemuaDosen(Dosen14[] arrayOfDosen) {
        System.out.println("\n=== DATA SEMUA DOSEN ===");
        for (Dosen14 dosen : arrayOfDosen) {
            System.out.println("Kode: " + dosen.kode);
            System.out.println("Nama: " + dosen.nama);
            System.out.println("Jenis Kelamin: " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia: " + dosen.usia);
            System.out.println();
        }
    }
    
    public void jumlahDosenPerJenisKelamin(Dosen14[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        
        for (Dosen14 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        
        System.out.println("\n=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        System.out.println("Jumlah Dosen Pria: " + jumlahPria + " orang");
        System.out.println("Jumlah Dosen Wanita: " + jumlahWanita + " orang");
        System.out.println("Total Dosen: " + arrayOfDosen.length + " orang");
    }
    
    public void rerataUsiaDosenPerJenisKelamin(Dosen14[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;
        
        for (Dosen14 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }
        
        System.out.println("\n=== RATA-RATA USIA DOSEN PER JENIS KELAMIN ===");
        
        if (jumlahPria > 0) {
            double rerataUsiaPria = (double) totalUsiaPria / jumlahPria;
            System.out.printf("Rata-rata Usia Dosen Pria: %.2f tahun\n", rerataUsiaPria);
        } else {
            System.out.println("Tidak ada data Dosen Pria");
        }
        
        if (jumlahWanita > 0) {
            double rerataUsiaWanita = (double) totalUsiaWanita / jumlahWanita;
            System.out.printf("Rata-rata Usia Dosen Wanita: %.2f tahun\n", rerataUsiaWanita);
        } else {
            System.out.println("Tidak ada data Dosen Wanita");
        }
    }
    
    public void infoDosenPalingTua(Dosen14[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("\n=== INFO DOSEN PALING TUA ===");
            System.out.println("Tidak ada data dosen");
            return;
        }
        
        Dosen14 dosenTertua = arrayOfDosen[0];
        
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > dosenTertua.usia) {
                dosenTertua = arrayOfDosen[i];
            }
        }
        
        System.out.println("\n=== INFO DOSEN PALING TUA ===");
        System.out.println("Kode: " + dosenTertua.kode);
        System.out.println("Nama: " + dosenTertua.nama);
        System.out.println("Jenis Kelamin: " + (dosenTertua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia: " + dosenTertua.usia + " tahun");
    }
    
    public void infoDosenPalingMuda(Dosen14[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("\n=== INFO DOSEN PALING MUDA ===");
            System.out.println("Tidak ada data dosen");
            return;
        }
        
        Dosen14 dosenTermuda = arrayOfDosen[0];
        
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < dosenTermuda.usia) {
                dosenTermuda = arrayOfDosen[i];
            }
        }
        
        System.out.println("\n=== INFO DOSEN PALING MUDA ===");
        System.out.println("Kode: " + dosenTermuda.kode);
        System.out.println("Nama: " + dosenTermuda.nama);
        System.out.println("Jenis Kelamin: " + (dosenTermuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia: " + dosenTermuda.usia + " tahun");
    }
}