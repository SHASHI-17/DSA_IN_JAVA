public class merge {

    public static void merge_sort(int arr[],int si,int ei){
        if(si >= ei){
            return ;
        }
        int mid=(si+ei)>>1; 
        merge_sort(arr,si,mid); // left part
        merge_sort(arr,mid+1,ei); //right part
        
        merge(arr, si, mid, ei);
    }

   public static  void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
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

    public static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int arr[]= {4,1,5,3,2};
        merge_sort(arr, 0, arr.length-1);
        print(arr, arr.length);
    }
}
