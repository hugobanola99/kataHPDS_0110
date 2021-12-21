import java.util.ArrayList;

public class SquaredDivisors {

    ArrayList<Integer> list = new ArrayList<Integer>();
    int[] res;

    public int[] searchSquaredDivisor(int initialNumber, int finalNumber){

        int sum= 0;
        for(int i = initialNumber; i <= finalNumber; i++){
            sum = DivisorSum(i);
            if(isPerfectSquare(sum)){
                list.add(i);
            }
        }
        listToArray();
        return res;
    }

    public boolean isPerfectSquare(int n){

        double value = Math.sqrt(n);
        if(value == Math.round(value)){
            return true;
        }else{
            return false;
        }
    }

    public int DivisorSum(int n){

        int sum = 0;
        for(int j = 1; j <= n; j++){
            if(n % j == 0){
                sum += Math.pow(j,2);
            }
        }
        return sum;

    }

    public void listToArray(){

        res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
    }


}
