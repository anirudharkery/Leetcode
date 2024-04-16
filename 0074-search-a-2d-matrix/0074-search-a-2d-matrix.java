// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
        
//         if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        
//         int row = matrix[0].length;
//         int col = matrix[0].length;
//         int start =0;
//         int end=row;
       
//         while(start < end)
//         {
//             int mid = start + (end-start)/2;
            
//             if(matrix[mid][col-1] < target)
//             {
//                 start = mid+1;
//             }
//             else
//             {
//                 end = mid;
//             }
            
//         }
//           if(start == row)
//             return false;
        
//         if(matrix[start][col-1] == target)
//             return true;
        
//          int r = start;
        
//         start =0;
//         end = col;
//             while(start < end)
//             {
//                 int mid = start + (end-start)/2;

//                 if(matrix[r][mid] < target)
//                 {
//                     start = mid+1;
//                 }
//                 else
//                     end = mid;
//             }
        
//         return (start != col && matrix[r][start] == target) ;
        
                
//     }
// }
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int rows = matrix.length, cols = matrix[0].length;

        // binary search #1: looking for the right row to search for the value
        int start = 0, end = rows;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (matrix[mid][cols - 1] < target) start = mid + 1;
            else end = mid;
        }

        if (start == rows) return false;
        if (matrix[start][cols - 1] == target) return true;

        int r = start;

        // binary search #2: looking for the target in that row
        start = 0;
        end = cols;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (matrix[r][mid] < target) start = mid + 1;
            else end = mid;
        }
        return start != cols && matrix[r][start] == target;
    }
}