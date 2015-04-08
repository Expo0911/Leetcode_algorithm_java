import java.util.Hashtable;
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        Hashtable<Integer, Integer> map = new Hashtable<Integer, Integer>();
        for(int i=0; i<numbers.length; i++){
            if(map.containsKey(target-numbers[i])){
                res[0] = map.get(target-numbers[i]);
                res[1] = i+1;
            }
            else map.put(numbers[i], i+1);
        }
        return res;
    }

    public static void main(String args[]){
        int[] test = {2, 7, 11, 15};
        int target = 9;
        TwoSum ts = new TwoSum();
        int[] ans = ts.twoSum(test, target);
        System.out.print(ans[0] + ", " + ans[1]);
    }
}