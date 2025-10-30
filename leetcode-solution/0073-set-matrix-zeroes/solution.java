class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix[0].length;
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for(int i =0; i< matrix.length; i++){
            for(int j = 0; j<row; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }  
        }
        for(int i: rows){
            for(int j = 0; j<row; j++){
                matrix[i][j] = 0;
            }
        }
        for(int j: cols){
            for(int i  = 0; i<matrix.length; i++){
                matrix[i][j] = 0;
            }
        }
    }
}
