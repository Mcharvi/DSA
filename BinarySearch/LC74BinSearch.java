
public class LC74BinSearch {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top =0;
        int bottom = rows-1;
        while(top<=bottom){
            int mid1 = (top+bottom)/2;
            if(target>matrix[mid1][cols-1]){
                top = mid1+1;
            } else if (target<matrix[mid1][0]){
                bottom = mid1-1;
            } else{
                break;
            }
        }
        if(!(top<=bottom)){
            return false;
        }
        int mid2 = (top+bottom)/2;
        int l=0; 
        int r = cols-1;
        while(l<=r){
            int m = (l+r)/2;
            if(target>matrix[mid2][m]){
                l = m+1;
            }else if (target<matrix[mid2][m]){
                r = m-1;
            }else{
            return true;
        }    
}

return false;
}
}