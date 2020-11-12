import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> out = new ArrayList<Boolean>();
        
        for(int i = 0; i < candies.length; i++){
            if (candies[i]>max){
                max = candies[i];
            }
        }
        
        for(int j = 0; j < candies.length; j++){
            if(candies[j] + extraCandies >= max){
                out.add(true);
            }else{
                out.add(false);
            }
        }
        return out;
        }
	
}
