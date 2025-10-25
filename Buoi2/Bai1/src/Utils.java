
public class Utils {
    public static int sum(int[] a){
        int sum = 0;
        for(int x : a){
            sum += x;
        }
        return sum;
    }

    public static int isMax(int[] a){
        int ma = (int) -1e9;
        for(int x : a){
            if(x > ma) ma = x;
        }

        return ma;
    }

    public static int isMin(int[] a){
        int mi = (int) 1e9;
        for(int x : a){
            if(x < mi) mi = x;
        }

        return mi;
    }

    public static void sapXep(int[] a){
        for(int i = 0; i < a.length - 1;i++){
            for(int j = i + 1; j < a.length;j++){
                if(a[i] > a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }

        return n > 1;
    }

    public static int soNguyenToMax(int[] a){
        int maxNguyenTo = -1;
        for(int x : a){
            if(isPrime(x) && x > maxNguyenTo) maxNguyenTo = x;
        }

        return maxNguyenTo;
    }

    public static void inMang(int[] a) {
        for (int x : a){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
