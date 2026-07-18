/**
 * @param {number[]} nums
 * @return {number}
 */
var findGCD = function(nums) {
    let n1=nums[0],n2=nums[0];
    for(let i=0;i<nums.length;i++){
        if(n1>nums[i]){
            n1=nums[i];
        }
        if(n2<nums[i]){
            n2=nums[i]
        }
    }
    return checkGCD(n1,n2);
};
function checkGCD(num1,num2){
    while(num2!=0){
        let remainder = num1%num2;
        num1=num2;
        num2=remainder;
    }
    return num1;
}