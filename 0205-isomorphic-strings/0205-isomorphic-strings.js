/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    const map1 = new Map();
    const map2 = new Map();

    for(let i=0;i<s.length;i++){
        if(map1.has(s.charAt(i))){
            if(!(t.charAt(i)==map1.get(s.charAt(i)))){
                return false;
            }
        }
        else{
            if(map2.has(t.charAt(i))){
                return false;
            }
            map1.set(s.charAt(i),t.charAt(i));
            map2.set(t.charAt(i),s.charAt(i));
        }
    }
    return true;
};