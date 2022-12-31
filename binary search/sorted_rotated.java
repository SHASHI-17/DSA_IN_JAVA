public class sorted_rotated {

    public static int search(int arr[],int k){
        int low=0,high=arr.length-1;
        if(arr[high]==k) return high;
        else if(arr[low]==k) return low;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k) return mid;

            if(arr[low] < arr[mid]){
                if(k < arr[mid] && k>= arr[low]){
                     high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }else if(arr[high] > arr[mid]){
                 if(k > arr[mid] && k<=arr[high]){
                    low=mid+1;
                 }
                 else{
                    high=mid-1;
                 }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int arr[]={7,8,9,10,1,2,3,5,6};
        int arr[]={1,2,3,4,5,6,7,8,10};
        System.out.println(search(arr, 6));
    }
}
