class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        //String word_1 = String.join("", word1);
        //String word_2 = String.join("", word2);
        
//         for(String ele : word1){
//             word_1 = word_1 + ele;
//         }
        
        //System.out.println(word_1);
        
//         for(String ele : word2){
//             word_2 = word_2 + ele;
//         }
        
       // System.out.println(word_2);
        
//         if(word_1 == word_2){
//             return true;
//         }else{
//             return false;
//         }
        
        if(String.join("", word1) == String.join("", word2)){
            return true;
        }else{
            return false;
        }
    }
}