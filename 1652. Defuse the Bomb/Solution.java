class Solution {
    public int[] decrypt(int[] code, int k) {
        
        int[] out = new int[code.length];
        
        if(k == 0){
            Arrays.fill(out, 0);
        }else{
            int[] newCode = new int[code.length*2];
        
            System.arraycopy(code, 0, newCode, 0, code.length);
            System.arraycopy(code, 0, newCode, code.length, code.length);
            
            if(k > 0){
                for(int i = 0;i < code.length; i++){
                    for(int j = i+1;j < i+k+1; j++){
                        out[i] = out[i] + newCode[j];
                    }
                }
            }else{
                for(int i = 0;i < code.length; i++){
                    for(int j = i+code.length+k; j < i+code.length ;j++){
                        out[i] = out[i] + newCode[j];
                    }
                }
            }
        }
        return out;
    }
}