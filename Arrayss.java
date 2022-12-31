import java.util.*;
import java.util.Arrays;
public class Arrayss {
    // public static void main(String[] args) {
    //     int arr[]=new int[20];
    //     // Scanner sc=new Scanner(System.in);
    //     // arr[0]=sc.nextInt();
    //     // arr[1]=sc.nextInt();
    //     // arr[2]=sc.nextInt();
    //     // System.out.println(arr[0]);
    //     // System.out.println(arr[1]);
    //     // System.out.println(arr[2]);
    //     System.out.println("the size is "+arr.length);
    // }


        //linear search
        // public static int linear_search(int arr[],int key){
        //     for(int i=0;i<arr.length;i++){
        //         if(arr[i]==key){
        //             return i;
        //         }
        //     }
        //     return -1;
        // }

        // public static void main(String args[]){
        //     int arr[]={4,5,2,7,6,8,9,1};
        //     int index=linear_search(arr, 8);
        //     if(index==-1){
        //         System.out.println("NHI HAI BHAI");
        //     }else{
        //         System.out.println("NUMBER FOUND AT INDEX "+index);
        //     }
        // }

        // largest and smallest number in an array

        // public static int largest_smallest(int arr[]){
        //     int largest,smallest;
        //     largest=smallest=arr[0];
        //     for( int i=1;i<arr.length;i++){
        //         if(arr[i]>largest){
        //             largest=arr[i];
        //         }else if(arr[i]<smallest){
        //             smallest=arr[i];
        //         }
        //     }
        //     System.out.println("the smallest number in the array is "+smallest);
        //     return largest;
        // }

        // public static void main(String args[]){
        //     int arr[]={3,7,6,4,3,8998,3,2};
        //         System.out.println("largest number in the array is  "+largest_smallest(arr)); 
        // }

            // binary search
        // public static int  binary_search(int arr[],int key){
        //     int start=0,end=arr.length-1,middle=1;
        //     while(start<=end){
        //          middle=(start+end)/2;
        //         if(arr[middle]>key){
        //             end=middle-1;
        //         }
        //         else if(arr[middle]==key){
        //             return middle;
        //         }
        //         else {
        //             start=middle+1;
        //         }
        //     }
        //     return -1;
        // }

        // static public void main(String args[]){
        //     int arr[]={1,2,3,4,5,6,7,8,9,10};
        //     System.out.println("NUMBER FOUND AT INDEX "+binary_search(arr, 8)); 
        // }

        // reverse an array

        // public static void reverse_array(int arr[]){
        //     int first=0,last=arr.length-1;
        //     while(first < last){
        //         arr[first]=arr[first]^arr[last];
        //         arr[last]=arr[first]^arr[last];
        //         arr[first]=arr[first]^arr[last];
        //         first++;
        //         last--;
        //     }
        // }

        // public static void main(String args[]){
        //     int arr[]={1,2,3,4,5};
        //     reverse_array(arr);
        //     for(int i=0;i<arr.length;i++){
        //         System.out.print(arr[i]+" ");
        //     }
        // }

        // pairs in array
        static public void pairs_arrays(int arr[]){
            int tp=0,current=1;
            for(int i=0;i<arr.length-1;i++){
                 current=arr[i];
                for(int j=i+1;j<arr.length;j++){
                    System.out.print("[" + current +"," + arr[j]+ "]" + " ");
                    tp++;
                }
                System.out.println();
            }
            //System.out.println("[" + current+ "," + "SINGLE ]");
            System.out.println("The Total Pairs are "+tp);
        }

                // print sub arrays 
                static public void  sub_arrays(int arr[]){
                    int ts=0;
                    for(int i=0;i<arr.length;i++){
                        int start=i;
                        for(int j=i;j<arr.length;j++){
                             int end=j;
                                for(int k=start;k<=end;k++){
                                    System.out.print(arr[k]+" ");
                                }
                                System.out.println();
                                ts++;
                        }
                        System.out.println();
                    }
                    System.out.println("THE TOTAL SUB-ARRAYS IN THE ARRAY ARE "+ts);
                }
                // MAXIMUM SUB-ARRAY_SUM
                static public void  sub_arrays_sum(int arr[]){
                    int currSum=0;
                    int maxsum=0;
                    int ts=0;
                    for(int i=0;i<arr.length;i++){
                        int start=i;
                        currSum=0;
                        for(int j=i;j<arr.length;j++){
                             int end=j;
                             currSum+=arr[j];
                             ts++;
                                // for(int k=start;k<=end;k++){

                                //     currSum+=arr[k];
                                // }
                                // System.out.println(currSum);
                                if(maxsum<currSum){
                                    maxsum=currSum;
                                }
                        }
                    }
                    System.out.println("THE MAXIMUM SUB-ARRAY SUM IS   "+maxsum);
                }
                // static public void  sub_arrays_sum(int arr[]){
                //     int currSum=0;
                //     int maxsum=0;
                //     for(int i=0;i<arr.length;i++){
                //         int start=i;
                //         for(int j=i;j<arr.length;j++){
                //              int end=j;
                //              currSum=0;
                //                 for(int k=start;k<=end;k++){

                //                     currSum+=arr[k];
                //                 }
                //                 // System.out.println(currSum);
                //                 if(maxsum<currSum){
                //                     maxsum=currSum;
                //                 }
                //         }
                //     }
                //     System.out.println("THE MAXIMUM SUB-ARRAY SUM IS   "+maxsum);
                // }

                //PREFIX SUB-ARRAYS SUM

                static public void  sub_arrays_sum_using_prefix(int arr[]){
                    int currSum=0;
                    int maxsum=0;
                    int prefix[]=new int[arr.length];
                    prefix[0]=arr[0];
                    for(int i=1;i<prefix.length;i++){
                        prefix[i]=prefix[i-1]+arr[i];
                    }
                    for(int i=0;i<arr.length;i++){
                        int start=i;
                        for(int j=i;j<arr.length;j++){
                             int end=j;
                             if(start==0){
                                currSum= prefix[end];
                             } else{
                               currSum= prefix[end] - prefix[start-1];
                             }
                                if(maxsum<currSum){
                                    maxsum=currSum;
                                }
                        }
                    }
                    System.out.println("THE MAXIMUM SUB-ARRAY SUM IS "+maxsum);
                }

                // KADANES SUB ARRAY SUM
            //     public static void KADANES(int arr[]){
            //         int cs=0,ms=Integer.MIN_VALUE;
            //     for(int i=0;i<arr.length;i++){
            //         cs+=arr[i];
            //     if(cs<0){
            //         cs=0;
            //     }
            //     ms=Math.max(cs, ms);
            // }
            //         System.out.println("THE TOTAL SUM OF THE SUB ARRAYS IS "+ms);
            //     }
                public static int KADANES(int arr[]){
                    int cs=0,ms=0, min;
                    for(int i=0;i<arr.length;i++){
                            cs+=arr[i];
                            if(cs<0){
                                cs=0;
                            }
                            ms=Math.max(cs, ms);
                        }
                        if(ms==0){
                        Arrays.sort(arr);
                         return arr[0];
                        }
                        return ms;
                    }
                    
                    
                

                public static int trapped_water(int height[]){
                    int n=height.length;
                    // left max bound
                    int leftmax[]=new int[n];
                    leftmax[0]=height[0];
                    for(int i=1;i<n;i++){
                        leftmax[i]=Math.max(height[i], leftmax[i-1]);
                    }
                    //right max bound 
                    int rightmax[]=new int[n];
                    rightmax[n-1]=height[n-1];
                    for(int i=n-2;i>=0;i--){
                        rightmax[i]=Math.max(height[i],rightmax[i+1]); 
                    }

                    //loop
                    int trapped_water=0;
                    for(int i=0;i<n;i++){
                        int water_level=Math.min(leftmax[i],rightmax[i]);
                        trapped_water+=water_level-height[i];
                    }
                    return trapped_water;
                }

                static public int buy_and_Sell_stocks(int prices[]){
                    int buying_price=Integer.MAX_VALUE;
                    int max_profit=0;

                    for(int i=0;i<prices.length;i++){
                        if(buying_price < prices[i]){
                            int profit=prices[i]-buying_price;
                            max_profit=Math.max(max_profit,profit);
                        }else{
                            buying_price=prices[i];
                        }
                    }
                    return max_profit;
                }

        static public void main(String args[]){
            // int arr[]={1,-2,6,-1,3};
            // int arr[]={1,2,3,4,5};
            // int arr[]={-8,1,2,-4,4};
            // int arr[]={-1,4,-5,9,-7};
            // int arr[]={-4,-1,-8,-2};
            int arr[]={-4,-1,-8,2};
            // int arr[]={1,2,3,4,5};
            // pairs_arrays(arr);
            //  sub_arrays(arr);
            sub_arrays_sum(arr);
            sub_arrays_sum_using_prefix(arr);
            // KADANES(arr);
           System.out.println("the sum is "+KADANES(arr));

            // int height[]={4,2,0,6,3,2,5};
            // int height[]={6,1,3,7,2,0,3};
            // int height[]={4,2,0,3,2,5};
            // System.out.println(trapped_water(height));

            // buy and sell stocks
            // int prices[]={7,1,5,3,6,4};
            // int prices[]={7,6,4,3,1};
            // System.out.println(buy_and_Sell_stocks(prices));
        }



}
