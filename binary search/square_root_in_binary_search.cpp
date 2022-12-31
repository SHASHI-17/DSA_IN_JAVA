#include<bits/stdc++.h>
using namespace std;
//     float decimal_value(int k,int precision,int tempsol){
//         float ans=tempsol;
//         float factor=1;
//         for(int i=0;i<precision;i++){
//             factor=factor/10;
//             for(float j=ans ; j*j < k ; j=j+factor){
//                 ans=j;
//             }
//         }
//         return ans;
//     }
// int main(){
//     cout<<decimal_value(37,3,6);
//     return 0;
// }

double median(vector<int> a, vector<int> b)
{
    int n= a.size();
    int m=b.size();
    
    if(n > m ) return median(b,a);
    
    int low=0,high=n;
    while(low <= high){
        int cut1=(low+high)/2;
        int cut2=(n+m+1) /2 - cut1;
        
        int left1,left2,right1,right2;
        // left1
        if(cut1==0)
            left1=INT_MIN;
        else
            left1=a[cut1-1];
        //left 2
        if(cut2==0)
            left2=INT_MIN;
        else
            left2=b[cut2-1];
        
        //right1
        if(cut1==n)
            right1=INT_MAX;
        else
            right1=a[cut1];
        
        // right 2
        if(cut2==n)
            right2==INT_MAX;
        else
            right2=b[cut2];
        
        //
        if(left1<=right2 && left2<=right1){
            if((n+m)%2==0){
                return ((double)(max(left1,left2)+min(right1,right2))/2.0);
            }
            else{
                return ((double) max(left1,left2));
            }
        }
            else if(left1>right2){
                high=cut1-1;
            }
            else{
                low=cut1+1;
            }
    }
    return 0.0;
}

    double MedianOfArrays(vector<int> & A,vector<int> & B)
    {
     int n=A.size(),m=B.size();
    if (n > m)
        return MedianOfArrays(B, A); // Swapping to make A smaller

    int start = 0;
    int end = n;
    int realmidinmergedarray = (n + m + 1) / 2;

    while (start <= end) {
        int mid = (start + end) / 2;
        int leftAsize = mid;
        int leftBsize = realmidinmergedarray - mid;
        int leftA = (leftAsize > 0) ? A[leftAsize - 1]: INT_MIN; // checking overflow of indices
        int leftB = (leftBsize > 0) ? B[leftBsize - 1] : INT_MIN;
        int rightA= (leftAsize < n) ? A[leftAsize] : INT_MAX;
        int rightB= (leftBsize < m) ? B[leftBsize] : INT_MAX;

        // if correct partition is done
        if (leftA <= rightB and leftB <= rightA) {
            if ((m + n) % 2 == 0)
                return (max(leftA, leftB) + min(rightA, rightB))/ 2.0;

            return max(leftA, leftB);
        }
        else if (leftA > rightB) {
            end = mid - 1;
        }
        else
            start = mid + 1;
    }
    return 0.0;
    }


double khudse(vector<int> arr1,vector<int> arr2){
    int n=arr1.size();
    int m=arr2.size();

    if(n > m)  return khudse(arr2,arr1);

    int low=0,high=n;

    while(low<=high) {
        
        int cut1=(low+high)/2;
        int cut2=(n+m+1) /2 -cut1;

        int left1,left2,right1,right2;

        left1=cut1>0 ? arr1[cut1-1] : INT_MIN;
        left2=cut2>0 ? arr2[cut2-1] : INT_MIN;
        right1=cut1<n ? arr1[cut1] : INT_MAX;
        right2 =cut2<m ? arr2[cut2] : INT_MAX;

        if(left1 <= right2 && left2<= right1){
            if((n+m) % 2==0){
                return (double(max(left1,left2)+min(right1,right2)/2.0));
            }
            else{
                return (double(max(left1,left2)));
            }
        }
        else if(left1 >  right2){
            high=cut1-1;
        }
        else{
            low=cut1+1;
        }
    }
    return 0.0;
}


    long int kthElement(int arr1[], int arr2[], int m, int n , int k)
    {
        if(m > n) return kthElement(arr2,arr1,m,n,k);
        
        int low= max(0,k-m) , high=min(k,n);
        
        while(low<=high){

            int cut1=(low+high) >> 1;
            int cut2=k-cut1;
            
           int left1=cut1==0? INT_MIN :arr1[cut1-1];
           int left2=cut2==0? INT_MIN :arr2[cut2-1];
            
           int right1=cut1== n ? INT_MAX: arr1[cut1];
           int right2=cut2== m ? INT_MAX: arr2[cut2];
            
            if(left1 <= right2  &&  left2 <= right1 ){
                return max(left1,left2);
            }
            else if(left1 > right2){
                high=cut1-1;
            }
            else{
                low=cut1+1;
            }
        }
        return 1;
    }

    bool is_possible(int arr[],int mid,int n,int m){
        int page_sum=0,students=1;

        for(int i=0;i<n;i++){
            if(page_sum+arr[i] <=  mid){
                page_sum+=arr[i];
            }
            else{
                students++;
                if(arr[i] > mid || students > m){
                    return false;
                }
                page_sum=0;
                page_sum+=arr[i];
            }
        }
        return true;
    }
// n= no. of books,m= for number students


    int book_allocation(int arr[],int n,int m){

        if( m > n)  return -1;
        int low=arr[0],high,ans;

        for(int i=0;i<n;i++){
            high+=arr[i];
        }

        while(low<=high){
            int mid=(low+high) >> 1;

            if(is_possible(arr,mid,n,m)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }


bool is_possiblee(int arr[],int mid,int n,int cows){
    
    int co_ordinate=arr[0],count=1;

    for(int i=1;i<n;i++){
        if(arr[i] - co_ordinate >= mid){
            count++;
            co_ordinate+=arr[i];
        }
    }
        if(count>=cows){
            return true;
        }
    return false;
}

    int aggressive_cows(int arr[],int n,int cows){
        int low=arr[0],high=arr[n-1]-arr[0];
        while(low<=high) {
            int mid=(low+high) >> 1;

            if(is_possiblee(arr,mid,n,cows)){
                    low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }


    void merge(int arr[],int si,int mid,int ei){
        int temp[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
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
        int n=sizeof(temp)/sizeof(int);
        for(i=si,k=0;k<n;i++,k++){
            arr[i]=temp[k];
        }
    }

    void merge_sort(int arr[],int si,int ei){
        if(si >= ei){
            return ;
        }
        int mid=(si+ei)>>1; 
        merge_sort(arr,si,mid); // left part
        merge_sort(arr,mid+1,ei); //right part
        
        merge(arr,si,mid,ei);
    }



    void print(int arr[],int n){
        for(int i=0;i<n;i++){
            cout<<arr[i]<<" ";
        }
        cout<<endl;
    }

int main(){
    // int m,n;
    // cout<<"enter the size of the 1st vector \n";
    // cin>>m;
    // vector<int> array1(m);
    // for(int i=0;i<m;i++){
    //     cin>>array1[i];
    // }
    // cout<<"enter the size of the 2nd vector \n";
    // cin>>n;
    // vector<int> array2(n);
    //  for(int i=0;i<n;i++){
    //     cin>>array2[i];
    // }
    // int arr1[] = {100, 112, 256, 349, 770};
    // int arr2[] = {72, 86, 113, 119, 265, 445, 892};
    // int k = 7;
    // int arr1[] = {2, 3, 6, 7, 9};
    // int arr2[] = {1, 4, 8, 10};      
    // int m=sizeof(arr1)/sizeof(int);
    // int n=sizeof(arr2)/sizeof(int);
    // cout<<"THE MEDIAN OF THE TWO SORTED ARRAYS IS "<<median(array1,array2)<<endl;
    // cout<<"THE MEDIAN OF THE TWO SORTED ARRAYS IS "<<MedianOfArrays(array1,array2)<<endl;
    // cout<<"THE MEDIAN OF THE TWO SORTED ARRAYS IS "<<khudse(array1,array2)<<endl;

    // cout<<"THE KTH ELEMENT PRESENT AT INDEX IS "<<kthElement(arr1,arr2,m,n,k);
     
    //  int arr[]={12 ,34, 67, 90};
    //  int n=sizeof(arr)/sizeof(int);
    //  int m=5;
    // cout<<"THE MINIMUM BOOK ALLOCATED TO A STUDENT IS "<<book_allocation(arr,n,m);

    // int arr[]={1,2,8,4,9};
    // int n=sizeof(arr)/sizeof(int);
    // int cows=3;
    // sort(arr,arr+n);
    // cout<<"THE LARGEST MINIMUM DISTANCE FROM THE STALL IS "<<aggressive_cows(arr,n,cows);

    int arr[]={4,1,5,3,2};
    int n=sizeof(arr)/sizeof(int);
    merge_sort(arr,0,n-1);
    print(arr,n);
    return 0;
}