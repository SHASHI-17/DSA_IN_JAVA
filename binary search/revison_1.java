import java.util.Arrays;
import java.util.Scanner;

public class revison_1 {

        public static int binary_search(int arr[],int key){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(key > arr[mid]){
                low=mid+1;
            }
            else if(key < arr[mid]){
                high=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void pairs_in_array(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("["+arr[i]+" , "+arr[j]+"] ");
                tp++;
            }
            System.out.println();
        }
        System.out.print("The total pairs in the array "+tp);
    }

    public static void print_sub_array(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("The Total Subarray's are "+ts);
    }

    public static void max_sub_array_sum(int arr[]){
        int cs=0,ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=0;
            for(int j=i;j<arr.length;j++){
                cs+=arr[j];
                if(cs>ms){
                    ms=cs;
                }
            }
        }
        System.out.println("THE MAXIMUM SUB ARRAY SUM IS "+ms);
    }

    public static void prefix_sub_array_sum(int arr[]){
    int cs=0,ms=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }

        for(int i=0;i<prefix.length;i++){
            System.out.print(prefix[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
               int end=j;
               if(start==0){
                cs=prefix[end];
                System.out.print(cs+" ");
               }
               else{
                cs=prefix[end]-prefix[start-1];
                System.out.print(cs+" ");
               }
               if(cs>ms){
                ms=cs;
               }
            }
        }
        System.out.print("\nTHE MAXIMUM SUB ARRAY SUM IS "+ms);
    }

        public static int KADANES(int arr[]){
            int cs=0,ms=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                cs+=arr[i];
                if(cs<0){
                    cs=0;
                }
                if(cs>ms){
                    ms=cs;
                }
            }
            if(ms==0){
                Arrays.sort(arr);
                return arr[arr.length-1];
            }
            return ms;
        }

        //{4,2,0,6,3,2,5}
        public static int trapping_water(int height[]){
            int n=height.length;
            int leftmax[]=new int[height.length];
            leftmax[0]=height[0];
            for(int i=1;i<height.length;i++){
                leftmax[i]=Math.max(leftmax[i-1], height[i]);
            }

            int right_max[]=new int[height.length];
            right_max[n-1]=height[n-1];
            for(int i=n-2;i>=0;i--){
                right_max[i]=Math.max(height[i], right_max[i+1]);
            }

            int trapped_water=0;
            for(int i=0;i<height.length;i++){
                int water_level=Math.min(leftmax[i], right_max[i]);
                trapped_water+=(water_level-height[i])*2;
            }
            return trapped_water;
        }
        //{7,1,5,3,6,4}
        public static int buy_and_Sell_stocks(int prices[]){
            int buying_price=Integer.MAX_VALUE;
            int max_profit=0;
            for(int i=0;i<prices.length;i++){
                if(buying_price<prices[i]){
                    int profit=prices[i]-buying_price;
                    max_profit=Math.max(profit, max_profit);
                }
                else{
                    buying_price=prices[i];
                }
            }
            return max_profit;
        }

        public static int rotated_Search(int arr[],int k){
            int low=0,high=arr.length-1;
           //  if(arr[low]==k) return low;
           // else if(arr[high]==k) return high;
          //  else{
                //low++;high--;
                while(low<=high){
                    int mid=low+(high-low)/2;
    
                    if(arr[mid]==k) return mid;
    
                    else if(arr[low] < arr[mid]){
                        if(k < arr[mid] && k>=arr[low]){
                            high=mid-1;
                        }
                        else{
                            low=mid+1;
                        }
                    }
                    else if (arr[mid] > arr[high]){
                        if(k >arr[mid] && k<=arr[high]){
                            low=mid+1;
                        }
                        else{
                            high=mid-1;
                        }
                    }
                }
           // }
            return -1;
        }

        public static int find_occurances(int arr[],int k){
            int first=0,last=0;
            int low=0,high=arr.length-1;

            while(low <=high){
                int mid=low+(high-low)/2;

                if(k < arr[mid]){
                    high=mid-1;
                }
                else if(k > arr[mid]){
                    low=mid+1;
                }
                else{
                    first=mid;
                    high=mid-1;
                }
            }
            low=0;high=arr.length-1;
            while(low <=high){
                int mid=low+(high-low)/2;

                if(k < arr[mid]){
                    high=mid-1;
                }
                else if(k > arr[mid]){
                    low=mid+1;
                }
                else{
                    last=mid;
                    low=mid+1;
                }
            }
            int count=(last-first)+1;
            System.out.println("FROM "+first+" TO "+last);
            return count;
        }

        public static void print_2d(int arr[][]){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

        public static boolean twod_search(int arr[][],int k){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    if(arr[i][j]==k){
                        return true;
                    }
                }
            }
            return false;
        }

        public static void minimum_and_maximum(int arr[][]){
            int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                //    max= Math.max(arr[i][j], max);
                //    min= Math.min(arr[i][j], min);
                if(max < arr[i][j]){
                    max=arr[i][j];
                }
                if(min > arr[i][j]){
                    min=arr[i][j];
                }
                }
            }
            System.out.println("THE MINIMUM VALUE IS "+min);
            System.out.println("THE MAXIMUM VALUE IS "+max);
        }

        public static void print_sprial(int arr[][]){
            int start_row=0;
            int start_col=0;
            int end_row=arr.length-1;
            int end_col=arr[0].length-1;

            while(start_row<=end_row && start_col<=end_col){
             //top
            for(int i=start_col;i<=end_col;i++){
                System.out.print(arr[start_row][i]+" ");
            }
            //right
            for(int i=start_row+1;i<=end_row;i++){
                System.out.print(arr[i][end_col]+" ");
            }
            //bottom
            for(int i=end_col-1;i>=start_col;i--){
                // if(start_row==end_row)break;
                System.out.print(arr[end_row][i]+" ");
            }
            //left
            for(int i=end_row-1;i>=start_row+1;i--){
                // if(start_col==end_col)break;
                System.out.print(arr[i][start_col]+" ");
            }
            start_row++;
            start_col++;
            end_row--;
            end_col--;
        }
    }
   
        public static int diagonal_sum(int arr[][]){
            int sum=0;
            // for(int i=0;i<arr.length;i++){
            //     for(int j=0;j<arr[0].length;j++){
            //         if(i==j){
            //             sum+=arr[i][j];
            //         }
            //         else if((i+j)==arr.length-1){
            //             sum+=arr[i][j];
            //         }
            //     }
            // }
            for(int i=0;i<arr.length;i++){
                sum+=arr[i][i];
                if(i!=arr.length-i-1){
                    sum+=arr[i][arr.length-1-i];
                }
            }
            return sum;
        }

        public static boolean staircase_search(int arr[][],int k){
            int row=0,col=arr[0].length-1;
            while(row <arr.length && col>=0){
                if(arr[row][col]==k){
                    System.out.println("FOUND AT INDEX "+"["+row+","+col+"]");
                    return true;
                }
                else if(k < arr[row][col]){
                    col--;
                }
                else if(k>arr[row][col]){
                    row++;
                }
            }
            System.out.println("NOT FOUND");
            return false;
        }

        public static boolean binary_search_2d(int matrix[][],int k) {
            if(matrix.length==0 || matrix[0].length==0) return false;
            int n=matrix.length;
            int m=matrix[0].length;
            int low=0;
            int high=(n*m)-1;

            while(low<=high){
                int mid=low+(high-low)/2;

                if(matrix[mid/m][mid%m]==k){
                    System.out.println("FOUND AT INDEX "+"["+(mid/m)+","+(mid%m)+"]");
                    return true;
                }
                else if(k > matrix[mid/m][mid%m]){
                    low=mid+1;
                }
                else if(k < matrix[mid/m][mid%m]){
                    high=mid-1;
                }
            }
                return false;
        }

        public static int sum_of_2nd_row(int arr[][]){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[1][j];
            }
            return sum;
        }

        public static void transpose(int arr[][]){
            int transpose[][]=new int[arr[0].length][arr.length];
            for(int i=0;i<arr[0].length;i++){
                for(int j=0;j<arr.length;j++){
                    transpose[i][j]=arr[j][i];
                }
            }
            print_2d(arr);
            print_2d(transpose);
        }

        public static int minumum_in_rotated_sorted(int arr[]){
            int low=0,high=arr.length-1;
            while(low<high){
                int mid=low+(high-low)/2;
                if(arr[mid]>arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid;
                }
            }
            return arr[high];
        }
        
        public static void print_1d(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }

        public static void bublle_sort(int arr[]) {
            boolean swap=false;
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        swap=true;
                    }
                }
                if(swap==false){
                    break;
                }
            }
        }

        public static void selection_sort(int arr[]){
            for(int i=0;i<arr.length-1;i++){
                int min=i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[min] > arr[j]){
                        min=j;
                    }
                }
                if(min!=i){
                    arr[min]=arr[min]+arr[i];
                    arr[i]=arr[min]-arr[i];
                    arr[min]=arr[min]-arr[i];
                }
            }
        }

        public static void inseration_Sort(int arr[]){
            for(int i=1;i<arr.length;i++){
                int curr=arr[i];
                int prev=i-1;
                while(prev>=0 && arr[prev]>curr){
                    arr[prev+1]=arr[prev];
                    prev--;
                }
                arr[prev+1]=curr;
            }
        }

        public static void counting_sort(int arr[]){
            int largest=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                largest=Math.max(largest, arr[i]);
            }

            int count[]=new int[largest+1];

            for(int i=0;i<arr.length;i++){
                count[arr[i]]=count[arr[i]]+1;
            }

            int i=0,j=0;
            while(i<=largest){
                if(count[i]>0){
                    arr[j]=i;
                    count[i]=count[i]-1;
                    j++;
                }
                else{
                    i++;
                }
            }
        }

        public static void print_string(String str){
            for(int i=0;i<str.length();i++){
                System.out.print(str.charAt(i)+" ");
            }
            System.out.println();
        }

        public static boolean palindrome_string(String str){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) != str.charAt(str.length()-i-1)){
                    return false;
                }
            }
            return true;
        }

            // given a route of 4 directions,find the shortest path
        public static double shortest_path(String path){
            int x=0,y=0;
            for(int i=0;i<path.length();i++){
                int direction=path.charAt(i);
                if(direction=='W'){
                    x--;
                }
                else if(direction=='E'){
                    x++;
                }
                else if(direction=='N'){
                    y++;
                }
                else{
                    y--;
                }
            }
            x=x*x;y=y*y;
            return Math.sqrt(x+y);
        }

        public static String to_uppercase(String str) {
            StringBuilder sb=new StringBuilder("");
            sb.append(Character.toUpperCase(str.charAt(0)));

            for(int i=1;i<str.length();i++){
                if(str.charAt(i)==' ' && i<str.length()-1){
                    sb.append(str.charAt(i));
                    i++;
                    sb.append(Character.toUpperCase(str.charAt(i)));
                }
                else{
                    sb.append(str.charAt(i));
                }
            }
            return sb.toString();
        }

        public static StringBuilder compress(String str) {
            StringBuilder sb=new StringBuilder("");
            for(int i=0;i<str.length();i++){
                int count=1;
                sb.append(str.charAt(i));
                while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                    count++;
                    i++;
                }
                if(count>0){
                    sb.append(count);
                }
            }
            return sb;
        }

        public static void aNAgramString(String str1,String str2){
            str1=str1.toLowerCase();
            str2=str2.toLowerCase();

            if(str1.length()==str2.length()){
                char char_Array_1[]=str1.toCharArray();
                char char_Array_2[]=str2.toCharArray();

                Arrays.sort(char_Array_1);
                Arrays.sort(char_Array_2);

                boolean result=Arrays.equals(char_Array_1, char_Array_2);

                if(result){
                    System.out.println(str1+" and "+str2+" are anagrams of each other.");
                }else{
                    System.out.println(str1+" and "+str2+" are not anagrams of each other.");
                }
            }else{
                System.out.println(str1+" and "+str2+" are not anagrams of each other.");
            }
        }

        public static void main(String[] args) {

        // ARRAY

        // int arr[]={1,2,3,4,5};
            // int arr[]={-1,4,-5,9,-7};
        // int arr[]={1,-2,6,-1,3};
        // int arr[]={8,5,-1,4,-2,9};
        // int arr[]={-7,-2,-5,-3,-1};
        // int arr[]={-8,-2,-1,5,7,-2};
        // System.out.print(binary_search(arr, 8));
        // pairs_in_array(arr);
        // print_sub_array(arr);
        // max_sub_array_sum(arr);
        // prefix_sub_array_sum(arr);
        // System.out.print("THE MAXIMUM SUB ARRAY SUM IS "+KADANES(arr));

        //trapping rainwater
        // int height[]={4,2,0,6,3,2,5};
        // int height[]={6,1,3,7,2,0,3};
        // System.out.println("THE TOTAL RAIN TRAPPED IS "+trapping_water(height));

        // int prices[]={7,1,5,3,6,4};
        // System.out.print("THE MAXIMUM PROFIT IS "+buy_and_Sell_stocks(prices));

        int arr[]={4,5,6,7,8,1,2};
        System.out.print(rotated_Search(arr, 1));

        // int arr[]={1,2,3,5,5,5,5,5,5,6,7,8,9};
        // System.out.println("THE COUNT IS "+find_occurances(arr, 5));


        // 2D - ARRAY

        // int rows,columns;
        // Scanner sc=new Scanner(System.in);
        // System.out.print("enter the rows \n");
        // rows=sc.nextInt();
        // System.out.print("enter the columns \n");
        // columns=sc.nextInt();
        // int matrix[][]=new int[rows][columns];

        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         System.out.println("ENTER THE ELEMENT OF ROW "+i+" column "+j);
        //         matrix[i][j]=sc.nextInt();
        //     }
        // }
            
            // int arr[][]={ {1,2,3},
            //              {4,5,6},
            //              {7,8,9} };

            // int arr[][] ={{1,2,3,4},
            //               {5,6,7,8},
            //               {9,10,11,12},
            //               {13,14,15,16} }; 

            // int arr[][]={{1,3,5,7},
            //             {10,11,16,20},
            //             {23,30,34,50}};

            // int arr[][]={{10,20,30,40},
            //              {11,21,36,43},
            //              {25,29,39,50},
            //              {50,60,70,80}};

            // int arr[][]={{1,2,3},
            //             {4,5,6}};

            // System.out.print("SEARCH SUCCESFULL "+twod_search(arr, 7));
            // minimum_and_maximum(arr);
            // print_sprial(arr);
            // System.out.print("THE DIAGONAL SUM OF THE MATRIX IS "+ diagonal_sum(arr));
            // System.out.print(staircase_search(arr,11));
            // System.out.print(binary_search_2d(arr, 11));
            // System.out.print(sum_of_2nd_row(arr));
            // transpose(arr);
            // int arr[]={9,1,2,3,4,5,6,7,8};
            // System.out.print("THE MINIMUM ELEMENT IN THE SORTED ROTATED ARRAY IS "+minumum_in_rotated_sorted(arr));


            // SORTING
            // int arr[]={7,4,1,3,2,5};
        // int arr[]={4,2,5,0,1,3,1};
            // bublle_sort(arr);
            // selection_sort(arr);
            // inseration_Sort(arr);
            // counting_sort(arr);
            // print_1d(arr);

            // STRINGS 

            // String str="racecar";
            // System.out.print(palindrome_string(str));
            // String path="WNEENESENNN";
            // System.out.println(shortest_path(path));

            // String str="hello, shashi bhai ";
            // System.out.print(to_uppercase(str));

            // String str="aaabbbbcccdddee";
            // System.out.print(compress(str));

            // aNAgramString("earth","heart");

        // BIT MANIPULATION 
        
        }
}
