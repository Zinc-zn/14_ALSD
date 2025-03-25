package jobsheet5;

public class Faktorial {
    int faktorialBF(int n){
        int fakto = 1;
        while (n != 0) {
            fakto = fakto * (n--);
        }
        return fakto;
    }
    int faktorialDC(int n){
        if (n==1) {
            return 1;
        }else{
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}
