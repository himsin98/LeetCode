class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int min = Integer.MAX_VALUE;
        int clockwise = 0;
        int anticlockwise = 0;
        int i = start;
        while(i!=destination){
            clockwise += distance[i];
            i++;
            if(i==distance.length){
                i = i%distance.length;
            }
        }
        i = destination;
        while(i!=start){
            anticlockwise += distance[i];
            i++;
            if(i==distance.length){
                i = i%distance.length;
            }
        }
        return clockwise<anticlockwise?clockwise:anticlockwise;
        
    }
}