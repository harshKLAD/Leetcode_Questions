class Solution {
    public int subtractProductAndSum(int n) {
        String A = Integer.toString(n);
        
        int prod = Integer.parseInt(A.substring(0,1));
        int sum = Integer.parseInt(A.substring(0,1));
        
        for(int i = 1;i<A.length(); i++){
            prod = prod*Integer.parseInt(A.substring(i,i+1));
            //System.out.println(prod);
            sum = sum+Integer.parseInt(A.substring(i,i+1));
            //System.out.println(sum);
        }
        
        return prod-sum;
    }
}