public class bit_manipulation {

    //oddOREven
    public static void oddOREven(int n){
        if((n&1)==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }

    public static int getithbit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setithbit(int n,int i){ // zero ko 1 banana
        int bitmask=1<<i;
        return n | bitmask;
    }

    public static int clearithbit(int n,int i){ // 1 ko zero banana
        int bitmask=~(1<<i);
        return n & bitmask;
    }

        public static int updateithbit(int n,int i,int new_bit){
            // if(new_bit==0){
            //     return clearithbit(n, i);
            // }
            // else{
            //     return setithbit(n, i);
            // }
            n=clearithbit(n, i);
            int bitmask=new_bit<<i;
            return n | bitmask;
        }

        public static int clear_bits(int n,int i){
            // int bitmask=~0<<i;
            // return n & bitmask;
            int bitmask=~0<<i;
            return n & bitmask; 
        }

        public static int  clearbits_in_range(int n,int j,int i) {
            int a=((~0)<<(j+1));
            int b=(2*i)-1;
            // int b=(1<<(i-1));
            int bitmask=a|b;
            return n & bitmask;
        }

        public static boolean is_power_two(int n){
            return ((n & (n-1))==0);
        }

        public static int count_set_bits(int n){
            int count=0;
            while(n>0){
                if((n & 1) !=0){
                    count++;
                }
                n=n>>1;
            }
            return count;
        }

        public static int  fast_exponentiation(int a,int n){
            int ans=1;
            while(n>0){
                if((n & 1) != 0){
                    ans=ans*a;
                }
                a=a*a;
                n=n>>1;
            }
            return ans;
        }

    public static void main(String[] args) {
        // System.out.println(5&6);
        // System.out.println(5|6);
        // System.out.println(5^6);
        // System.out.println(~5);
        // System.out.println(5<<2);
        // System.out.println(6>>2);

        // oddOREven(5);
        // System.out.println(getithbit(10, 3));
        // System.out.println(setithbit(10, 2));
        // System.out.println(clearithbit(10, 1));
        // System.out.println(updateithbit(15, 1,0));
        // System.out.println(clear_bits(15, 2));
        // System.out.println(clearbits_in_range(10,4,2));
        // System.out.println(is_power_two(4));
        // System.out.println(count_set_bits(15));
        // System.out.println(fast_exponentiation(3, 5));
        // System.out.print(5 ^ (~1<<1));

        for(char ch='a';ch<='z';ch++){
            System.out.print((char)(ch | 32)+" ");
        }
    }
}
