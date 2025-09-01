class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
         for(int row = triangle.size() - 2; row >= 0; row--){
            for(int col = 0; col < triangle.get(row).size(); col++){
                int down = triangle.get(row + 1).get(col);
                int downRight = triangle.get(row + 1).get(col + 1);
                int updated = triangle.get(row).get(col) + Math.min(down, downRight);
                triangle.get(row).set(col, updated);
            }
        }
        return triangle.get(0).get(0);
    }
}