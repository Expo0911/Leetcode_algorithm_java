public class HammingWeight {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while(n!=0){
            res += n&1;
            n = n>>>1;
        }
        return res;
    }
    public static void main(String[] args){
    	System.out.println(new HammingWeight().hammingWeight(1));
    	System.out.println(new HammingWeight().hammingWeight(7));
    	System.out.println(new HammingWeight().hammingWeight(-2147483648));
    }

}