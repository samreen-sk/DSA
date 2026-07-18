/**
 * @param {number[]} nums
 * @return {number}
 */
var findNumbers = function(nums) {
    let count=0;
    for(let i=0;i<nums.length;i++){
        if(checkEven(nums[i])){
            count++;
        }
    }
    return count;
};
function checkEven(n){
    let c = 0;
    while(n!=0){
        c=c+1;
        n=Math.floor(n/10);
    }
    if(c%2==0) return true;
    else return false;
}