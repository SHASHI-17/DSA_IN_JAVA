public class uu {
    public static void main(String[] args) {
        calculator calc=new calculator();
        System.out.println(calc.sum(2, 3));
        System.out.println(calc.sum(2, 3,4));
        System.out.println(calc.sum(2.2f, 3.3f));
    }
}
class calculator{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    double sum(float a,float b){
        return a+b;
    }
}