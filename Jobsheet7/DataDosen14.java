public class DataDosen14 {
    public Dosen14 dataDosen[] = new Dosen14[10];
    int idx = 0;
  
    public void tambah(Dosen14 d) {
      if (idx < dataDosen.length) {
        dataDosen[idx] = d;
        idx++;
      } else {
        System.out.println("Data sudah penuh");
      }
    }
  
    public void tampil() {
      for (Dosen14 d : dataDosen) {
        d.tampil();
      }
      System.out.println("-----------------");
    }
  
    public void sortingASC() {
      for (int i = 0; i < idx - 1; i++) {
        for (int j = 0; j < idx - i - 1; j++) {
          if (dataDosen[j].umur > dataDosen[j + 1].umur) {
            Dosen14 temp = dataDosen[j];
            dataDosen[j] = dataDosen[j + 1];
            dataDosen[j + 1] = temp;
          }
        }
      }
    }
  
    public void sortingDESC() {
      for (int i = 0; i < idx - 1; i++) {
        int idxMin = i;
        for (int j = i + 1; j < idx; j++) {
          if (dataDosen[j].umur > dataDosen[idxMin].umur) {
            idxMin = j;
          }
        }
        Dosen14 temp = dataDosen[i];
        dataDosen[i] = dataDosen[idxMin];
        dataDosen[idxMin] = temp;
      }
    }
  
    public void insertionSort() {
      for (int i = 1; i < idx; i++) {
        Dosen14 temp = dataDosen[i];
        int j = i;
        while (j > 0 && dataDosen[j - 1].umur > temp.umur) {
          dataDosen[j] = dataDosen[j - 1];
          j--;
        }
        dataDosen[j] = temp;
      }
    }
  
    // Tambahan week 7
    public int[] pencarianDataSequential(String nama) {
      int pos = -1;
      int jumlah = 0;
      for (int i = 0; i < idx; i++) {
        if (dataDosen[i].nama.equals(nama)) {
          jumlah++;
          pos = i;
        }
      }
      int ret[] = new int[2];
      ret[0] = pos;
      ret[1] = jumlah;
      return ret;
    }
  
    public int pencarianDataBinary(int usia, int left, int right) {
      int mid;
      if (right >= left) {
        mid = (left + right) / 2;
        if (usia == dataDosen[mid].umur) {
          return mid;
        } else if (dataDosen[mid].umur > usia) {
          return pencarianDataBinary(usia, left, mid - 1);
        } else {
          return pencarianDataBinary(usia, mid + 1, right);
        }
      } else {
        return -1;
      }
    }
  
    public void tampilDataSearch(int pos) {
      if (pos != -1) {
        System.out.println("=== Data Ditemukan ===");
        dataDosen[pos].tampil();
      } else {
        System.out.println("===========================");
        System.out.println("Data dosen tidak ditemukan");
        System.out.println("===========================");
      }
    }
  
    public void cekDuplikatUsia(int pos) {
      if (pos == -1) {
        return;
      }
      int umurSekarang = dataDosen[pos].umur;
      boolean duplikat = false;
  
      if (pos > 0 && dataDosen[pos - 1] != null) {
        if (dataDosen[pos - 1].umur == umurSekarang) {
          duplikat = true;
        }
      }
  
      if (pos < idx - 1 && dataDosen[pos + 1] != null) {
        if (dataDosen[pos + 1].umur == umurSekarang) {
          duplikat = true;
        }
      }
  
      if (duplikat) {
        System.out.println("=============================================");
        System.out.println("!!! Data dengan usia " + umurSekarang + " ada duplikat");
        System.out.println("=============================================");
      }
    }
  
    public void cekDuplikatNama(int found, String nama) {
      if (found > 1) {
        System.out.println("=============================================");
        System.out.println("!!! Data dengan nama " + nama + " ada duplikat");
        System.out.println("=============================================");
      }
    }
  }