/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    var sumArr = [];
    var sum = 0;
    
    
for(let i = 0;i<nums.length;i++){
		sum = sum + nums[i];
    	sumArr[i] = sum;
    }
    return sumArr;
};