import java.util.*;
public class array_practice {

	// 1. dupliacte
    public static boolean duplicate(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

	// 2. sorted rotated binary search
	public static	int  rotated_Search(int[] arr,int k){
		int low=0,high=arr.length-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(arr[mid] == k) return mid;

			if(arr[low] < arr[mid]){
				if(k >= arr[low] && k < arr[mid] ){
					high=mid-1;
				}else{
					low=mid+1;
				}
			} 
			else if(arr[high] > arr[mid]){
				if( k >arr[mid]  && k<=arr[high] ){
					low=mid+1;
				}else{
					high=mid-1;
				}
			}
		}
		return -1;
	}

	// 3. trapping rainwater
	//height = 5
	public static int trapping_rainwater(int height[]){
		int n=height.length;
		int left_max[]=new int [n];
		left_max[0]=height[0];
		for(int i=1;i<n;i++){
			left_max[i]=Math.max(height[i],left_max[i-1]);
		}

		int right_max[]=new int[n];
		right_max[n-1]=height[n-1];
		for(int i=n-2;i>=0;i--){
			right_max[i]=Math.max(height[i],right_max[i+1]);
		}

		int trapped_water=0;
		for(int i=0;i<n;i++){
			int water_level=Math.min(left_max[i], right_max[i]);
			trapped_water+=water_level-height[i];
		}
		return trapped_water;
	}


	//4.buy and sell stocks
	public static int buy_Sell_stocks(int prices[]){
		int buying_price=Integer.MAX_VALUE;
		int max_profit=0;
		for(int i=0;i<prices.length;i++){
			if(buying_price < prices[i]){
				int profit=prices[i]-buying_price;
				max_profit=Math.max(profit, max_profit);
			}
			else{
				buying_price=prices[i];
			}
		}
		return max_profit;
	}

    public static void main(String[] args) {
        // System.out.println("enter the size of the array");
        // Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
        // int arr[]=new int[size];
        // for(int i=0;i<size;i++){
        //     System.out.println("Enter the Elements "+(i+1));
        //     arr[i]=sc.nextInt();
        //  }
        // int arr[]={4,5,6,7,8,1,2};
        // System.out.println(rotated_Search(arr,2));

		// int height[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
		// System.out.println("the trapped water is "+trapping_rainwater(height));

		// int prices[]={1,5,3,2,1};
		// System.out.println(buy_Sell_stocks(prices));
    }
}
