/**
 * @param {string[]} list1
 * @param {string[]} list2
 * @return {string[]}
 */
var findRestaurant = function(list1, list2) {
    const result = [];
    const map = new Map();
    let minSum = Infinity;
    for(let i=0;i<list1.length;i++){
        map.set(list1[i],i);
    }
    const freqMap = new Map();
    for(let i=0;i<list2.length;i++){
        if(map.has(list2[i])){
            freqMap.set(list2[i],map.get(list2[i])+i);
            if(minSum>(map.get(list2[i])+i)){
                minSum = map.get(list2[i])+i;
            }
        }
    }
    freqMap.forEach(function(value,key){
        if(value==minSum){
            result.push(key);
        }
    })
    return result;
};