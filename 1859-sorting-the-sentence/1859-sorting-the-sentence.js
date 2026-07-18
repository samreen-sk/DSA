/**
 * @param {string} s
 * @return {string}
 */
var sortSentence = function(s) {
    const arr = s.split(" ");
    const res = [];
    for(let i=0;i<arr.length;i++){
        let idx = Number(arr[i].at(-1));
        let str = arr[i].slice(0,arr[i].length-1);
        res[idx-1] = str;
    }
    return res.join(" ");
};