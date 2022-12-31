import java.util.Scanner;

public class TWO_D_ARRAYS {

    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(key == matrix[i][j]){
                    System.out.println("key found at index "+"("+(i+1)+","+(j+1)+")");
                    return true;
                }
            }
        }
        System.out.println("sorry");
        return false;
    }
    public static void minimum_maximum(int matrix[][]){
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                //  min=Math.min(min, matrix[i][j]);
                //  max=Math.max(max, matrix[i][j]);
                if(min >matrix[i][j]){
                    min=matrix[i][j];
                }
                if(max <matrix[i][j]){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("THE MINIMUM VALUE IS "+min);
        System.out.println("THE MAXIMUM VALUE IS "+max);
    }

    public static void print_2d(int matrix[][]){
        int m=matrix.length,n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print( matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void print_spiral(int matrix[][]){
        int start_row=0;
        int start_col=0;
        int end_row=matrix.length-1;
        int end_col=matrix[0].length-1;

            while(start_row<=end_row && start_col<=end_col){

                // top
                for(int j=start_col;j<=end_col;j++){
                    System.out.print(matrix[start_row][j]+" ");
                }
                //right
                for(int i=start_row+1;i<=end_row;i++){
                    System.out.print(matrix[i][end_col]+" ");
                }
                //bottom
                for(int j=end_col-1;j>=start_col;j--){
                    if(start_row==end_row) break;
                    System.out.print(matrix[end_row][j]+" ");
                }
                //left
                for(int i=end_row-1;i>=start_row+1;i--){
                    if(start_col==end_col) break;

                    System.out.print(matrix[i][start_col]+" ");
                }

                start_row++;
                start_col++;
                end_row--;
                end_col--;
           }
    }

    public static int diagonal_sum(int matrix[][]){
        int sum=0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         //primary diagonal
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         else if((i+j) == matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i != matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }

    public static boolean staircase_search(int matrix[][],int key) {
        int row=0,col=matrix[0].length-1;
        
        while(row < matrix.length && col>=0){

            if(matrix[row][col]==key){
                System.out.println("key found at index ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col] ){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found !");
        return false;
    }
    // public static boolean staircase_search(int matrix[][],int key) {
    //     int row=matrix.length-1,col=0;

    //     while(row<=matrix.length && col>=0){

    //         if(matrix[row][col]==key){
    //             System.out.println("key found at index ("+row+","+col+")");
    //             return true;
    //         }
    //         else if(key < matrix[row][col] ){
    //             row--;
    //         }
    //         else{
    //             col++; 
    //         }
    //     }
    //     System.out.println("key not found !");
    //     return false;
    // }

    public static void main(String[] args) {
      //  int matrix[][]=new int[3][3];
        // int m=3,n=3;
      //  int m=matrix.length,n=matrix[0].length;
      //  Scanner sc=new Scanner(System.in);
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.println("enter the elemnts for row "+(i+1)+" and column "+(j+1));
        //         matrix[i][j]=sc.nextInt();
        //     }
        // }
        // int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        // search(matrix, 8);
        // minimum_maximum(matrix);


        // SPIRAL MATRIX

        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16},
                    };

        // int matrix[][]={{1,2,3},
        //                 {4,5,6},
        //                 {7,8,9} };

            print_spiral(matrix);
            // System.out.println(diagonal_sum(matrix));

        // staircase_search(matrix, 15);
    }
}
