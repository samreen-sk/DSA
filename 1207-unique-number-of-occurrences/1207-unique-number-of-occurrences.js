/**
 * @param {number[]} arr
 * @return {boolean}
 */
var uniqueOccurrences = function(arr) {
    const map = new Map();
    for(let i=0;i<arr.length;i++){
        if(map.has(arr[i])){
            map.set(arr[i],map.get(arr[i])+1);
        }
        else{
            map.set(arr[i],1);
        }
    }
    const vals = map.values();
    const set = new Set();
    for(const v of vals){
        if(set.has(v)){
            return false;
        }
        else{
            set.add(v);
        }
    }
    return true;
};