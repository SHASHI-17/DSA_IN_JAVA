public class find_occurances {

    static public void find_occurancess(int arr[],int k){
            int low=0,high=arr.length-1;
            int first=-1,last=-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if( k > arr[mid] ){
                    low=mid+1;
                }
                else if( k < arr[mid] ){
                    high=mid-1;
                }
                else{
                    first=mid;
                    high=mid-1;
                }
            }
            low=0;high=arr.length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if( k > arr[mid] ){
                    low=mid+1;
                }
                else if( k < arr[mid] ){
                    high=mid-1;
                }
                else{
                    last=mid;
                    low=mid+1;
                }
            }
            System.out.println(first+" "+last);
            int count=(last-first)+1;
            System.out.println("number of occurances is "+count);
    }

    // public static void occurance(int arr[],int k){
    //     int low=0,high=arr.length-1,first=-1,last=-1;
    //     while(low<=high){
    //         int mid=low+(high-low)/2;
    //         if( k > arr[mid] ){
    //             low=mid+1;
    //         }
    //         else if( k < arr[mid] ){
    //             high=mid-1;
    //         }else{
    //             if( true ){
    //                 first=mid;
    //                 high=mid-1;
    //             }
    //              if(true){
    //                 low=0;high=arr.length-1;
    //                 last=mid;
    //                 low=mid+1;
    //             }
    //         }
    //     }
    //     System.out.println(first+","+last);
    // }
    public static void main(String[] args) {
        // int arr[]={1,2,5,5,5,5,5,5,3,4};
        // int arr[]={1,2,3,5,5,5,5,5,6,7,8};
        int arr[]={1,2,3,4,4,4};
        // int arr[]={1,2,3,4,5,6,6,6,6};
        find_occurancess(arr, 4);
        // occurance(arr, 5);
    }
}
