public class SortingMain14 {
    public static void main(String[] args) {
      int a[] = {20, 10, 2, 7, 12};
      int b[] = {30, 20, 2, 8, 14};
      int c[] = {40, 10, 4, 9, 3};
  
      Sorting14 dataUrut1 = new Sorting14(a, a.length);
      System.out.println("Data awal 1");
      dataUrut1.tampil();
      dataUrut1.bubbleSort();
      System.out.println("Data Yang Sudah Diurutkan Menggunakan BUBBLE SORT (ASC)");
      dataUrut1.tampil();
  
      System.out.println();
  
      Sorting14 dataUrut2 = new Sorting14(b, b.length);
      System.out.println("Data awal 2");
      dataUrut2.tampil();
      dataUrut2.selectionSort();
      System.out.println("Data Yang Sudah Diurutkan Menggunakan SELECTION SORT (ASC)");
      dataUrut2.tampil();
  
      System.out.println();
  
      Sorting14 dataUrut3 = new Sorting14(c, c.length);
      System.out.println("Data awal 3");
      dataUrut3.tampil();
      dataUrut3.insertionSort();
      System.out.println("Data Yang Sudah Diurutkan Menggunakan INSERTION SORT (ASC)");
      dataUrut3.tampil();
    }
  }