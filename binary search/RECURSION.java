public class RECURSION{

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
         return n*factorial(n-1);
    }
    public static int sum_of_natural(int n){
        // if(n==1){
        //     return 1;
        // }
        //  return n+sum_of_natural(n-1);
        if(n==1) return 1;
        int snm1=sum_of_natural(n-1);
        int sum=n+snm1;
        return sum;
    }

    public static int fibonacci_series(int x){
        if(x==0 || x==1){
            return 1;
        }
        int fbm1=fibonacci_series(x-1);
        int fbm2=fibonacci_series(x-2);
        int sn=fbm1+fbm2;
        return sn;
    }

    public static void decresing_order(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        decresing_order(n-1);
    }
    public static void incresing_order(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        incresing_order(n-1);
        System.out.print(n+" ");
    }

    public static boolean is_sorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return is_sorted(arr, i+1);
    }

    public static int first_occurance(int arr[],int key,int i) {
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first_occurance(arr, key, i+1);
    }
    public static int last_occurance(int arr[],int key,int i) {
        if(arr.length==i){
            return -1;
        }
        int isfound=last_occurance(arr, key, i+1);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound; 
    }

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }

    public static int oppo_power(int x,int n) {
        if(n==0){
            return 1;
        }
        int halfsqr=oppo_power(x,n/2);
        int halfsqr2=halfsqr*halfsqr;

        if(n%2!=0){
            halfsqr=x*halfsqr2;
        }

        return halfsqr;

    }

    public static int tiling_problem(int n){
        if(n==0 || n==1){
            return 1;
        }
        // int vertical=tiling_problem(n-1);
        // int horizontal=tiling_problem(n-2);
        // return vertical+horizontal;
        return tiling_problem(n-1) + tiling_problem(n-2);
    }

    public static void removeDupliacates(String str,int index,StringBuilder sb,boolean map[]){
        if(index ==str.length()){
            System.out.println(sb);
            return;
        }
        char currchar=str.charAt(index);
        if(map[currchar-'a']==true){
            removeDupliacates(str, index+1, sb, map);
        }else{
            map[currchar-'a']=true;
            removeDupliacates(str, index+1, sb.append(currchar), map);
        }
    }

    public static int friends_pairing(int n){
        if(n==1 || n==2){
            return n;
        }
        int single=friends_pairing(n-1);
        int pair=(n-1) * friends_pairing(n-2);
        return single+pair;
    }

    public static void print_bin_str(int n,int last_place,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        print_bin_str(n-1, 0, str+"0");
        if(last_place==0){
            print_bin_str(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        // System.out.print(factorial(5));
        // decresing_order(10);
        // incresing_order(10);
        // System.out.print(sum_of_natural(5));
        // System.out.print(fibonacci_series(26));
        // int arr[]={1,2,3,4,5};
        // System.out.print(is_sorted(arr, 0));
        // int arr[]={1,2,5,6,8,5};
        // System.out.print(first_occurance(arr, 5, 0));
        // System.out.print(last_occurance(arr, 5, 0));
        // System.out.print(power(2, 10));
        // System.out.print(oppo_power(2, 10));
        // System.out.print(tiling_problem(4));

        String str="shashi";
        // StringBuilder sb=new StringBuilder("");
        // boolean map[]=new boolean[26];
        // removeDupliacates(str, 0,sb, map);
        removeDupliacates(str, 0, new StringBuilder(""),new boolean[26] );

        // System.out.print(friends_pairing(3));
        // print_bin_str(3, 0, "");
    }
}