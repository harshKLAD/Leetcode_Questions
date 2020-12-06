class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }else{
            
            String num = String.valueOf(x);
            
            for(int i = 0; i < num.length()/2; i++){
                if(num.charAt(i) != num.charAt(num.length()-1-i)){
                    return false;
                }
            }
            return true;
        }
    }
}