/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    const res=nums;
    for(let i=1;i<nums.length;i++){
        res[i]=res[i]+res[i-1];
    }
    return res;
};