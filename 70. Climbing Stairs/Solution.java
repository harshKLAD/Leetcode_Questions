class Solution {
    
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    
    public int climbStairs(int n) {
        
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n<0){
            return 0;
        }else if(n<3){
            return n;
        }else{
            int x = climbStairs(n-2) + climbStairs(n-1);
            map.put(n,x);
            return x;
        }
    }
}