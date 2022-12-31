import java.util.Arrays;

public class string_practice {

    // 1. a e i o u counting the vowels occurred in a string in lowercase

    public static int vowel(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' ||str.charAt(i) =='e'||str.charAt(i)=='i'||str.charAt(i) =='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }

        public static void anagram(String str1,String str2) {
            str1=str1.toLowerCase();
            str2=str2.toLowerCase();

            if(str1.length()==str2.length()){
                char str1chararray[]=str1.toCharArray();
                char str2chararray[]=str2.toCharArray();

                Arrays.sort(str1chararray);
                Arrays.sort(str2chararray);

                boolean result=Arrays.equals(str1chararray, str2chararray);
                if(result){
                    System.out.println(str1+" and "+str2+" are anagrams of each other.");
                }else{
                    System.out.println(str1+" and "+str2+" are not anagrams of each other.");
                }
            } else{
                System.out.println(str1+" and "+str2+" are not anagrams of each other.");
            }
        }

    public static void main(String[] args) {
        // String str="niraj";
        // System.out.println("the count is "+vowel(str));

            String str1="heart";
            String str2="earth";

            anagram(str1, str2);

    }   
}
