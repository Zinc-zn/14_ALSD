public class MahasiswaBerprestasi14 {

    public Mahasiswa14 listMhs[];
  
    public MahasiswaBerprestasi14(int lengthArr) {
      listMhs = new Mahasiswa14[lengthArr];
    }
  
    public int idx = 0;
  
    public void tambah(Mahasiswa14 mhs) {
      listMhs[idx] = mhs;
      idx++;
    }
  
    public void tampil() {
      for (int i = 0; i < idx; i++) {
        listMhs[i].tampilInformasi();
      }
    }
  
    public int sequentialSearching(double cari) {
      int posisi = -1;
      for (int j = 0; j < listMhs.length; j++) {
        if (listMhs[j].ipk == cari) {
          posisi = j;
          break;
        }
      }
      return posisi;
    }
  
    public void tampilPosisi(double x, int pos) {
      if (pos != -1) {
        System.out.println("Data mahasiswa dengan IPK " + x + " ditemukan pada index ke-" + pos);
      } else {
        System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
      }
    }
  
    public void tampilDataSearch(double x, int pos) {
      if (pos != -1) {
        System.out.println("NIM\t : " + listMhs[pos].nim);
        System.out.println("Nama\t : " + listMhs[pos].nama);
        System.out.println("Kelas\t : " + listMhs[pos].kelas);
        System.out.println("IPK\t : " + listMhs[pos].ipk);
      } else {
        System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
      }
    }
  
    public int findBinarySearch(double cari, int left, int right) {
      int mid;
      if (right >= left) {
        mid = (left + right) / 2;
        if (cari == listMhs[mid].ipk) {
          return mid;
        } else if (listMhs[mid].ipk < cari) {
          return findBinarySearch(cari, left, mid - 1);
        } else {
          return findBinarySearch(cari, mid + 1, right);
        }
      } else {
        return -1;
      }
    }
  
    // ini sebelum diubah
    // public int findBinarySearch(double cari, int left, int right) {
    //  int mid;
    //
    //  if (right >= left) {
    //    mid = (left + right) / 2;
    //    if (cari == listMhs[mid].ipk) {
    //      return mid;
    //    } else if (listMhs[mid].ipk > cari) {
    //      return findBinarySearch(cari, left, mid - 1);
    //    } else {
    //      return findBinarySearch(cari, mid + 1, right);
    //    }
    //  } else {
    //    return -1;
    //  }
    // }
  }