public class TWO_D_ARRAYS_PRACTICE {

    //1.counting number of 7s
    public static void seven(int matrix[][]) {
        int count7=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    count7++;
                }
            }
        }
        System.out.println("THE COUNT OF SEVENS "+count7);
    }

    //2.sum of the second row
    static void sum_of_2nd_row(int [][]matrix){
        int sum=0;
        for(int j=0;j<matrix[0].length;j++){
            sum+=matrix[1][j];
        }
        System.out.println(sum);
    }

    // 3. transpose the array
    public static void transpose(int [][]matrix){
        int transpose[][]=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        print(transpose);     
    }

    public static void print(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int matrix[][]={{4,7,8}, {7,2,7}};
        // seven(matrix);
        // sum_of_2nd_row(matrix);
        print(matrix);
        transpose(matrix);
    }
}
