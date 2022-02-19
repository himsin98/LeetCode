class Solution {
    class Value {
        int min = 0;
        int max = 0;
        public Value(int num){
            this.max = num%2!=0? num*2: num;
            if(num%2 ==0){
               num = num >> ((Integer.numberOfTrailingZeros(num))); 
            }
            this.min = num;
        }
    }
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Value> minq = new PriorityQueue<Value>((a,b) -> a.min-b.min);
        int max = Integer.MIN_VALUE;
        
        for(int num : nums){
            Value val = new Value(num);
            minq.add(val);
            max = Math.max(max, val.min);
        }
        int diff = max - minq.peek().min;

        while(minq.peek().min != minq.peek().max){
            Value min = minq.peek();
            
            int newMin = min.max<=max?min.max:min.min*2; 
            
            if(newMin > max){
                max = newMin;
            } 
            
            min = minq.remove();
            min.min = newMin;
            minq.add(min);
            
            diff = Math.min(diff, max - minq.peek().min);
        }
        return diff;

    }
}