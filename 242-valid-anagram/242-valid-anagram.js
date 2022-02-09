/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s1, s2) {
    if(s1.length !== s2.length)
        return false;
    let fc1 = {};
    let fc2 = {};
    for(let i=0; i<s1.length; i++){
      fc1[s1[i]] = (fc1[s1[i]] || 0) + 1;
      fc2[s2[i]] = (fc2[s2[i]] || 0) + 1;
    }
    for(let key in fc1){
      if(fc1[key] !== fc2[key])
        return false;
    }
    return true;
};