/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(arr) {
  let i = 0; 
  let j = 0;
  let count = 1;
  while(j < arr.length){
      if(arr[i]===arr[j]){
          j++;
      }else{
          arr[++i]=arr[j++];
          count++
      }
  }
  return count;
};