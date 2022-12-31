public class ABSTRACTION {
    public static void main(String[] args) {
        // horse horse=new horse();
        // horse.walk();
        // horse.eat();
        // chicken chick=new chicken();
        // chick.walk();
        // horse.change_color();
        // System.out.print(horse.color);
        mustang my_sher=new mustang();
    }
}

abstract class animal{
    String color;
    animal(){
        System.out.println("animal constructor called"); 
    }
    void eat(){
        System.out.println("eats anything");
    }
    abstract void walk();
}

class horse extends animal{
    horse(){
        System.out.println("horse constructor called");
    }
    void change_color(){
        color="bilaack";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class mustang extends horse{
    mustang(){
        System.out.println("mustang constructor called");
    }
}

class chicken extends animal{
    void change_color(){
        color="yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}