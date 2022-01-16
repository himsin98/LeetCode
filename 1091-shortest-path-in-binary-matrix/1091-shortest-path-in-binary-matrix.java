class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        LinkedList<Pair<Integer, Integer>> queue = new LinkedList();
        int n = grid.length;
        int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1,0}, {1, 1}};
        Pair<Integer, Integer> start = new Pair(0, 0); //you can also use array here, I use pair for simplicity
        queue.offerLast(start);
        int distance = 1;
        while(!queue.isEmpty()){
            int currentLayerCnt = queue.size(); // the currentLayerCnt is important 'cause we use it as the signal for the removal of all elements at the current layer
            for(int k=0; k<currentLayerCnt; k++){
                Pair<Integer, Integer> node = queue.pollFirst();
                int i = node.getKey();
                int j = node.getValue();
                if(i==n-1 && j == n-1){
                    return distance;
                }
                if(grid[i][j]==0){
                    grid[i][j] = 1;
                    for(int[] direction: directions){
                        int x = i+ direction[0];
                        int y = j + direction[1];
                        if(x>=0 && x<n && y>=0 && y<n && grid[x][y]==0){
                            queue.offerLast(new Pair(x, y));
                        }
                    }
                }
            }
            distance++;
        }
        return -1;
    }
}