public class Static {
    public static void main(String[] args) {
    // stattic s1=new stattic();
    // s1.schoolname="abc";       
    // stattic s2=new stattic();
    // System.out.print(s2.schoolname);
        horse h=new horse();
    }   
}

class stattic{
    static String schoolname;

}

class animal{
    animal(){
        System.out.println("animal constructor called");
    }
}

class horse extends animal{
    horse(){
        super();
        System.out.println("horse constructor called");
    }
}
