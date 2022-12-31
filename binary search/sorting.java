import java.util.Arrays;
import java.util.Collections;
public class sorting{

    public static void bubble_sort(int arr[]){
        int n=arr.length;int count=0;
        for(int i=0;i<n-1;i++){
            boolean swap=false;
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
        System.out.println(count);
}

public static void selection_sort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[min]; 
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
}

public static void inseration_Sort(int arr[]) {
    for(int i=1;i<arr.length;i++){
        int curr=arr[i];
        int prev=i-1;
        while(prev>=0 && arr[prev] > curr){
            arr[prev+1]=arr[prev];
            prev--;
        }
        arr[prev+1]=curr;
    }
}

public static void counting_sort(int arr[]){
        int largest=Integer.MIN_VALUE,i=0,j=0;
            for( i=0;i<arr.length;i++){
                largest=Math.max(largest, arr[i]);
            }

            int count[]=new int[largest+1];

            for( i=0;i<arr.length;i++){
                count[arr[i]]=count[arr[i]]+1;
            }

            i=0;
            while(i<=largest){
                    if(count[i]>0){
                    arr[j]=i;
                    count[i]=count[i]-1;
                    j++;
                }else{
                    i++;
                }
            }
}

public static void print_Arr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
        // int arr[]={4,2,5,1,3};
        int arr[]={4,2,5,0,1,3,1};
        // bubble_sort(arr);
        // selection_sort(arr);
        // inseration_Sort(arr);
        // Arrays.sort(arr,Collections.reverseOrder());
        counting_sort(arr);
        print_Arr(arr);
    }
}
