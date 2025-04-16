public class Sorting14 {

    int data[];
    int jumData;
  
    public Sorting14(int Data[], int jmlData) {
      this.jumData = jmlData;
      this.data = new int[jmlData];
      for (int i = 0; i < jmlData; i++) {
        this.data[i] = Data[i];
      }
    }
  
    public void bubbleSort() {
      int temp = 0;
      for (int i = 0; i < jumData; i++) {
        for (int j = 1; j < jumData - i; j++) {
          if (data[j - 1] > data[j]) {
            temp = data[j];
            data[j] = data[j - 1];
            data[j - 1] = temp;
          }
        }
      }
    }
  
    public void selectionSort() {
      for (int i = 0; i < jumData; i++) {
        int min = i;
        for (int j = i + 1; j < jumData; j++) {
          if (data[j] < data[min]) {
            min = j;
          }
        }
        int temp = data[i];
        data[i] = data[min];
        data[min] = temp;
      }
    }
  
    public void insertionSort() {
      for (int i = 1; i < data.length; i++) {
        int temp = data[i];
        int j = i - 1;
        while (j >= 0 && data[j] > temp) {
          data[j + 1] = data[j];
          j--;
        }
        data[j + 1] = temp;
      }
    }
  
    public void tampil() {
      for (int i = 0; i < jumData; i++) {
        System.out.print(data[i] + " ");
      }
      System.out.println();
    }
  }