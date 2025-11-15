//  Write a program to print the matrix in wave form.

class chw_213 {
    public static void main(String[] args) {
        int[][] a = { {1,2,3},{4,5,6},{7,8,9} };
        for(int j=0;j<3;j++){
            if(j%2==0){
                for(int i=0;i<3;i++){
                    System.out.print(a[i][j] + " ");
                }
            } else {
                for(int i=2;i>=0;i--){
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
}
