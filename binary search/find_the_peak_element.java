public class find_the_peak_element {

    public static int peak_of_the_mountain(int arr[]){
        int low=0,high=arr.length-1;
        int mid=low+(high-low)/2;
        while(low<high){
            if(arr[mid] < arr[mid+1]){
                low=mid+1;
            }
            else{
                high=mid;
            }
            mid=low+(high-low)/2;
        }
        return arr[mid];
    }

    public static int pivot(int arr[]){
        int low=0,high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid] > arr[high]){  
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return high;
    }

    public static int search_in_sorted_roatted(int arr[],int k){
        int low=0,high=arr.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==k) return mid;

            if( arr[low] < arr[mid] ) {
                if( k >=arr[low] && k<arr[mid]) {
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if( arr[high] > arr[mid] ) {
                if(k > arr[mid] && k <= arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }

public static int count_of_rotataions(int arr[]){
    int low=0,high=arr.length-1;
    int n=arr.length;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]<=arr[(mid+n-1)%n] && arr[mid]<=arr[(mid+1)%n]){
           // System.out.println("THE TOTAL COUNT OF THE SORTED ROTATED ARRAY IS "+(n-mid));
           // System.out.println("THE INDEX OF THE PIVOT IS "+mid);
           return arr[mid];
        }
         if(arr[mid]>=arr[low]){
            low=mid+1;
        }
        else if(arr[mid] <=arr[high]){
            high=mid-1;
        }
    }
    return -1;
}

static public int simple_binary(int arr[],int target,int low,int high){
    int mid=low+(high-low)/2;
    while(low<=high){
        if(arr[mid]==target){
            return mid;
        }
        else if(target > arr[mid]){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
        mid=low+(high-low)/2;
    }
    return -1;
}
static public int desc_simple_binary(int arr[],int target,int low,int high){
    int mid=low+(high-low)/2;
    while(low<=high){
        if(arr[mid]==target){
            return mid;
        }
        else if(target < arr[mid]){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
        mid=low+(high-low)/2;
    }
    return -1;
}

public static int search_in_sorted_roatted_using_pivot(int arr[],int low,int high,int target){
    int pivot=pivot(arr);
    if(target <= arr[pivot-1] && target >= arr[low]){
        return simple_binary(arr, target, low, pivot-1);
    }
    else{
        return simple_binary(arr, target,pivot,(high-1));
    }
}

public static int nearly_sorted(int arr[],int k){

    int low=0,high=arr.length-1;
    int mid=low+(high-low)/2;

    while(low<=high){

        if(arr[mid]==k){
            return mid;
        }    
        else if((mid-1) >= low && arr[mid-1]== k){
            return mid-1;
        }
        else if((mid+1) <= high && arr[mid+1]== k){
            return mid+1;
        }
        if(k >= arr[mid+2]){
                low=mid+2;
            }
            else if(k<=arr[mid-2]){
                high=mid-2;
            }
        mid=low+(high-low)/2;
}
    return -1;
}

    public static int floor(int arr[],int k){
        int res=0,low=0,high=arr.length-1;
        int mid=low+(high-low)/2;

        while(low<=high){

            if(k==arr[mid]) return arr[mid];

            else if(k > arr[mid]){
                res=arr[mid];
                low=mid+1;
            } 
            else{
                high=mid-1;
            }

            mid=low+(high-low)/2;
        }

        return res;
    }
    public static int ceil(int arr[],int k){
        int res=0,low=0,high=arr.length-1;
        int mid=low+(high-low)/2;
        
        while(low<=high){
            if(arr[mid]==k){
                return arr[mid];
            }
            else if(k < arr[mid]){
                res=arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            mid=low+(high-low)/2;
        }
        return res;
    }

    public static char next_alphabet(char arr[],char k){
        char res='$';
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                low=mid+1;
            }
            else if(k < arr[mid]){
                res=arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }

    public static int infinte_array(int arr[],int k){
        int low=0,high=1;
        while(k > arr[high]){
            low=high;
            high=high*2;
        }
        int res=simple_binary(arr, k, low, high);
        return res;
    }

    public static int first_occurance(int arr[],int k,int low,int high){
         low=0;high=arr.length-1;int first=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(k < arr[mid]) {
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
        return first;
    }

    public static int first_bi_in_infinite(int arr[],int k){
        int low=0,high=1;
        while(k > arr[high]){
            low=high;
            high=high*2;
        }
        int res=first_occurance(arr, k, low, high);
        return res;
    }
    public static int minimum_difference(int arr[],int k){
        int low=0,high=arr.length-1,min=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(k > arr[mid]){
                low=mid+1;
            }
            else if(k < arr[mid]){
                high=mid-1;
            }
            else{
                return arr[mid];
            }
        }
        if(arr[low] < arr[high]){
            min=k-arr[low];
        }else{
            min=k-arr[high];
        }
        return min;
    }

    public static int  peak_element(int arr[]){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid > 0   && mid < arr.length-1){
                if(arr[mid] > arr[mid+1] && arr[mid] >arr[mid-1] ){
                    return mid;
                }
                else if(arr[mid]<arr[mid+1]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            else if(mid==0){
                if(arr[mid] > arr[mid+1]){
                    return arr[mid];
                }
                else{
                    return arr[mid+1];
                }
            }
            else if(mid==arr.length-1){
                if(arr[mid]>arr[mid-1]){
                    return arr[mid];
                }
                else{
                    return arr[mid-1];
                }
            }
        }
        return -1;
    }
    public static int  bitonic(int arr[]) {
        int res=peak_element(arr);
        return res;
    }

    public static int bitonic_search(int arr[],int low,int high,int target){
        int index=peak_element(arr);
        int res=simple_binary(arr, target, low, index);
        if(res==-1){
            res=desc_simple_binary(arr, target, index+1, high);
        }
        return res;
    }

    public static int sqaure_root(int low,int high,int k){
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int square=mid*mid;
            if(square==k){
                return mid;
            }
            if(square > k){
                high=mid-1;
            }
            else{
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }

    
    public static float decimal_value(int k,int precision,int tempsol){
        float ans=tempsol;
        float factor=1;
        for(int i=0;i<precision;i++){
            factor=factor/10;
            for(float j=ans ; j*j < k ; j=j+factor){
                ans=j;
            }
        }
        return ans;
    }

public static boolean ispossible(int arr[],int n,int m,int mid){
    int pagesum=0;
    int page_count=1;

    for(int i=0;i<n;i++){
        if(pagesum + arr[i] <= mid){
            pagesum+=arr[i];
        }
        else{
            page_count++;
            if(page_count > m || arr[i] > mid){ 
                return false;
            }
            pagesum=0;
            pagesum=arr[i];
        }
    }
    return true;
}
    public static int minimum_book_allocation(int arr[],int m,int n){
        int low=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int high=sum;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(ispossible(arr,n,m,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }


    public static int single_element_in_an_sorted_array(int arr[]){
        int low=0,high=arr.length-2;
        while(low<=high){
            int mid=(low+high)>>1;
            if(arr[mid]==arr[mid^1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return arr[low];
    }
    public static double median_of_two_sorted_arrays(int arr1[],int arr2[]){
        if(arr2.length < arr1.length) return median_of_two_sorted_arrays(arr2, arr1);
        int n1=arr1.length;
        int n2=arr2.length;

        int low=0,high=n1;
        double ans=1.0;
        while(low<=high){
            int cut1=low+high/2;
            int cut2=((n1+n2)/2+1)-cut1;

            int left1= cut1==0 ? Integer.MIN_VALUE : arr1[cut1-1];
            int left2= cut2==0 ? Integer.MIN_VALUE : arr2[cut2-1];

            int right1=cut1==n1 ? Integer.MAX_VALUE: arr1[cut1];
            int right2=cut2==n2 ? Integer.MAX_VALUE: arr2[cut2];

            if(left1 <= right2 && left2 <=right1){
                if(left1 > right2){
                    high=cut1-1;
                }
                else{
                    low=cut1+1;
                }
                if((n1%n2==0)){
                    return  (Integer.max(left1, left2)+Integer.min(right1, right2))/2.0;
                }else{
                    return Integer.max(left1, left2);
                }
            }
        }
        return 0.0;
    }
    public static void main(String[] args) {
        // int arr[]={4,5,6,7,8,9,1,2,3};
        // int arr[]={0,1,2,3,4,5,6,7,8,9};
        // int arr[]={0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        // int arr[]={2,3,4,5,6,7,8,1};
        // int arr[]={11,12,15,18,2,5,6,8};
        // int arr[]={5,10,30,20,40};
        // int arr[]={1,2,3,4,5,8,9};
        // char arr[]={'a','b','g','k'};
        // int arr[]={1,3,8,10,15};
        // int arr[]={5,10,18,12,67,1};
        // int arr[]={5,10,20,15};
        // int arr[]={1,3,8,12,4,2};
        // int arr[]={5,4,3,2,1};
        // System.out.println(peak_of_the_mountain(arr));
        // System.out.println(pivot(arr));
        // System.out.println(search_in_sorted_roatted(arr, 2));
        // System.out.println(count_of_rotataions(arr));
        // count_of_rotataions(arr);
        // int n=arr.length;
// System.out.println("THE INDEX OF ELEMENT IS "+search_in_sorted_roatted_using_pivot(arr, 0,n,6 ));
        // System.out.println(nearly_sorted(arr,40));
        // System.out.println(floor(arr, 7));
        // System.out.println(ceil(arr, 7));
        // System.out.println(next_alphabet(arr, 'g'));
        // System.out.println(infinte_array(arr, 8));
        // System.out.println(first_bi_in_infinite(arr, 1));
        // System.out.println(minimum_difference(arr, 12));
        // System.out.println(peak_element(arr));
        // System.out.println(bitonic(arr));
        // System.out.println(bitonic_search(arr, 0, (arr.length-1), 1));
        // System.out.println(desc_simple_binary(arr, 1, 0, arr.length-1));

        // System.out.println(sqaure_root( 0, 37, 37));
        // System.out.println(decimal_value(37, 3, 6));

        // int arr[]={10,20,25,40}; // book allocation
        // int arr[]={5,5,5,5}; // painter,s partition
                                // aggressive cows
        // System.out.println(book_allocation(arr, 2, arr.length));

        //single element in an sorted array
        // int arr[]={1,1,2,2,3,3,4,4,5,5,6};
        // System.out.println(single_element_in_an_sorted_array(arr));
        int arr1[]={1,5,8,10,18,20};
        int arr2[]={2,3,6,7};
        System.out.println(median_of_two_sorted_arrays(arr1, arr2));
    }   
}
