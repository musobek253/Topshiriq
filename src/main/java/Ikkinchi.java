import java.util.ArrayList;

public class Ikkinchi {

    static boolean isTub(int n){

        if(n==1||n==0)return
                false;

        // tub son o'ziga va birga bo'lingan  sonlar tub son deyiladi
        for(int i=2; i<n; i++){
            if(n%i==0)return
                    false;
        }
        return true;
    }

    public static void main(String[] args) {
        Long summ = 1L;
        int N = 5;
        int count = 0;
        ArrayList<Integer> zero = new ArrayList<>();
            for(int i=1; i<=N; i++){
                if(isTub(i)) {
                    zero.add(i);
                }
            }

        for (int i = 0; i < zero.size(); i++) {
            summ = summ * zero.get(i);
            if (summ % 2 == 0 && summ %5 == 0)
                count++;

        }
        System.out.println(count);
        }
    }
