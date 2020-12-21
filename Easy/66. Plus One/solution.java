class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]+1 <10){
            digits[digits.length-1]++;
            return digits;
        }
        else{
            int i = 1;
            while(digits[digits.length-i] + 1 > 9 && i < digits.length){
                digits[digits.length-i] = 0;
                i++;
            }
            
            digits[digits.length-i]++;
            
            for(int e : digits){
                System.out.print(e + " ");
            }
            
            if(digits[0] == 10){
                int[] out = new int[digits.length + 1];
                System.arraycopy(digits, 0, out , 1, digits.length);
                out[1] = 0;
                out[0] = 1;
                return out;
            }

        }
    return digits;
    }
}