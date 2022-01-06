class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] dest = new int[1001];
        for(int i = 0; i<trips.length; i++){
            dest[trips[i][1]] += trips[i][0];
            dest[trips[i][2]] -= trips[i][0];
        }
        int passenger = 0;
        for(int p : dest){
            passenger += p;
            if(passenger > capacity){
                return false;
            }
        }
        return true;
    }
}