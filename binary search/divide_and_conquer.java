import java.security.Key;
import java.security.PublicKey;

public class divide_and_conquer{

    public static void merge(int arr[],int si,int mid,int ei) {
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }

        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(i=si,k=0;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
    }

    public static void merge_sort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }

        int mid=(si+ei) >> 1;
        merge_sort(arr, si, mid);
        merge_sort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }

    public static void print_arr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei],temp;
        int i=si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        temp=arr[ei];
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void quicksort(int arr[] ,int si,int ei) {
        if(si>=ei) return;

        int index=partition(arr,si,ei);
        quicksort(arr, si, index-1);
        quicksort(arr, index+1, ei);

    }

    public static int rotated_search(int arr[],int low,int high,int k) {
        
            int mid=(low+high) >> 1;
            if(arr[mid] == k) return mid;

             if(arr[low] < arr[mid]){
                if(k>=arr[low] && k<arr[mid]){
                    return rotated_search(arr,low,mid-1,k);
                }else{
                    return rotated_search(arr,mid+1,high,k);
                }
             }else if(arr[mid]<arr[high]){
                if(k > arr[mid] && k<=arr[high]){
                    return rotated_search(arr,low,mid+1,k);
                }else{
                    return rotated_search(arr,mid-1,high,k);
                }
             }else{
                return -1;
             }
    }

    public static void all_occurances(int arr[],int k,int i) {
        if(i==arr.length) return;

        if(k==arr[i]) {
            System.out.print(i+" ");
        }
        all_occurances(arr, k, i+1);
    }

    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void printing_digit(int num) {
        if(num==0) return;
        int rem=num%10;
        printing_digit(num/10);
        System.out.print(digits[rem]+" ");
    }

    public static int length(String str) {
        if(str.length()==0) return 0;

        return length(str.substring(1))+1;
    }


    public static void tower_of_hanoi(String src,String helper,String dest,int n) {
        if(n==1) {
           System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        tower_of_hanoi(src,dest,helper,n-1);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        tower_of_hanoi(helper,src,dest,n-1);
    }

    public static boolean comparing(String str1,String str2) {
        if(str1.compareTo(str2)<0){
            return true;
        }
        return false;
    }

    public static String[] merge_string(String arr1[],String arr2[]) {
        int m=arr1.length;
        int n=arr2.length;
        String arr3[]=new String[m+n];

        int index=0;

        int i=0,j=0;

        while(i<m && j<n){
            if(comparing( arr1[i], arr2[j])){
                arr3[index++]=arr1[i++];
         }
         else{
            arr3[index++]=arr2[j++];
         }
        }
        
        while(i<m){
            arr3[index++]=arr1[i++];
        }
        while(j<n){
            arr3[index++]=arr2[j++];
        }
        return arr3;
    }

    public static String[] merge_sort_String(String arr[],int low,int high) {
        if(low==high){
            String A[]={arr[low]};
            return A;
        }

        int mid=(low+high) >> 1;

        String arr1[]=merge_sort_String(arr, low, mid);
        String arr2[]=merge_sort_String(arr, mid+1, high);

        String arr3[]=merge_string(arr1,arr2);
        return arr3;
    }

    public static int majority_element(int arr[]) {
        int count=0,candidate=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                candidate=arr[i];
                count=1;
            }
            else{
                if(candidate==arr[i]){
                    count++;
                }
                else{
                    count--;
                }
            }
        }
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==candidate){
                count++;
            }
        }
        if(count > arr.length/2){
            return candidate;
        }
        return -1;
    }


    // public static int merge_ssort(int arr[],int low,int mid,int high) {
    //     int count=0;
    //     int n1=mid-low+1;
    //     int n2=high-mid;

    //     int a[]=new int [n1];
    //     int b[]=new int [n2];

    //     for(int i=0;i<n1;i++){
    //         a[i]=arr[low+i];
    //     }

    //     for(int i=0;i<n2;i++){
    //         b[i]=arr[mid+i+1];
    //     }

    //     int i=0,j=0,k=low;

    //     while(i<n1 && j<n2){
    //         if(a[i] <= b[j]){
    //             arr[k++]=a[i++];
    //         }else{
    //             arr[k++]=b[j++];
    //             count+=n1-i;
    //         }
    //     }

    //     while(i<n1){
    //         arr[k++]=a[i++];
    //     }
    //     while(j<n2){
    //         arr[k++]=b[j++];
    //     }

    //     return count;
    // }


    public static int merge_ssort(int arr[],int low,int mid,int high) {
        int count=0;
        int i=low;
        int j=mid;
        int k=0;
        int temp[]=new int [high-low+1];

        while(i<=mid-1 && j<=high){
            if(arr[i] <= arr[j]){
            temp[k++]=arr[i++];
            }else{
                count+=(mid-i);
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid-1){
            temp[k++]=arr[i++];
        }
        while(j<=high){
            temp[k++]=arr[j++];
        }

        for(i=low,k=0;i<=high;i++,k++){
            arr[i]=temp[k];
        }

        return count;
    }

    public static  int get_inversions(int arr[],int low,int high) {
        int count=0;
        if(low<high){
        int mid=(low+high) >> 1;
      count+= get_inversions(arr,low,mid);
       count+= get_inversions(arr,mid+1,high);
        count+=merge_ssort(arr,low,mid+1,high);
        }
        return count;
    }

    public static void quicksort_1(int arr[],int low,int high){
        int i,j,pivot,temp;

        if(low<high){
            pivot=low;
            i=low;
            j=high;

            while(i<j){
                while(arr[i] <=arr[pivot] && i<high){
                    i++;
                    while(arr[j] > arr[pivot]){
                        j--;
                    }
                    if(i<j){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            temp=arr[pivot];
            arr[pivot]=arr[j];
            arr[j]=temp;

            quicksort(arr, low, j-1);
            quicksort(arr, j+1, high);
        }

    }
    public static void main(String[] args) {
        // int arr[]={4,5,1,3,2,7,6,-9};
        // int arr[]={3,4,5,6,0,1,2};
        // int arr[]={3,2,1,2,1,2,12,2};// printing all the indices

        // print_arr(arr);
        // merge_sort(arr, 0, arr.length-1);
        // quicksort(arr, 0, arr.length-1);
        // print_arr(arr);

        // System.out.println(rotated_search(arr, 0, arr.length-1, 9));

        // all_occurances(arr, 2, 0); //1

        // printing_digit(1937); // 2

        // System.out.println(length("shashi")); // 3

        // count of the sub strings

        // tower of hanoi
        // tower_of_hanoi("A", "B", "C", 3);

        // String arr[]={"sun","earth","mars","mercury"};
        // String [] a=merge_sort_String(arr, 0, arr.length-1);
        // for(int i=0;i<a.length;i++){
        //     System.out.print(a[i]+" ");
        // }

            // int arr[]={2,2,1,1,1,2,2};// majority element
            // System.out.println("THE MAJORITY ELEMENT IN THE ARRAY IS "+majority_element(arr));

            // int arr[]={3,5,6,9,1,2,7,8};
            // int arr[]={2,4,1,3,5};
            // int arr[]={4,3,1,2};
            int arr[]={4,1,2,3};
            System.out.println(get_inversions(arr,0,arr.length-1));
    }
}