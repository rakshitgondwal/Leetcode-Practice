public class Search2dMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 1;
        System.out.println(search(matrix,target));
    }
    public static boolean search(int [][] matrix, int target){
        int s = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int e = (row*col)-1;

        while(s<=e){

            int mid = s+(e-s)/2;
            int curr = matrix[mid/col][mid%col];
            if (curr == target){
                return true;
            }
            if (curr < target){
                s = mid+1;
            }else e=mid-1;
        } return false;
    }
}
