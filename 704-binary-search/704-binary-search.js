/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(arr, a) {
    let low = 0, high = arr.length-1;
  while(low <= high){
      let mid = low + Math.floor((high - low)/2);
      if(arr[mid] === a)
        return mid;
        if(arr[mid] < a){
            low = mid+1;
        }else if(arr[mid] > a){
            high = mid-1;
        }
  }
  return -1;
};