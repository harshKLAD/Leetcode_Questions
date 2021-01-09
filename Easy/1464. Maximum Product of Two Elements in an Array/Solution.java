class Solution {
    public int maxProduct(int[] nums) { 
//         Arrays.sort(nums);    
//         return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        
        int A = nums[1];
        int B = nums[0];
        
        for(int i = 2; i < nums.length; i++){
            
            //A = Math.max(A, nums[i]);
            if(A <= nums[i]){
                B = Math.max(A, B);
                A = nums[i];
                continue;
            }
            
            B = Math.max(nums[i], B);
                
            // if(B < nums[i-1] && B < A){
            //     B = nums[i-1];
            // }
        }
        
        System.out.println(A + " " + B);
        return (A-1)*(B-1);
    }
}