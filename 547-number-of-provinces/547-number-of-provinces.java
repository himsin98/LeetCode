class Solution {
    public int findCircleNum(int[][] isConnected) {
     int row = isConnected.length, col = isConnected[0].length, num = 0;
        int[] visited = new int[row];
        Arrays.fill(visited,0);
        // tranverse the array
        for(int i = 0; i < row; i++){
            if(visited[i] == 0){
                num++;
                DFS(isConnected, visited, i);
            }      
        }
        return num;
    }
    
    // DFS function
    private void DFS(int[][] isConnected, int[] visited, int i){
        visited[i] = 1;
        for(int j = 0; j < isConnected.length; j++){
            if(visited[j] == 0 && isConnected[i][j] == 1){
                visited[j] = 1;
                DFS(isConnected, visited, j);
            }
        }
    }
}