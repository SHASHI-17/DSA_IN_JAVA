public class OOPS {
    public static void main(String[] args) {
        // Pen p1=new Pen();
        // p1.set_color("bilack");
        // System.out.println(p1.get_color());

        //CONSTRUCTORS

        // Student s2=new Student();
        // Student s1=new Student("Shashi");
        // System.out.print(s1.name);

        Student s1=new Student();
        s1.marks[0]=100;
        s1.marks[1]=110;
        s1.marks[2]=120;
        s1.name="Shashi";
        s1.roll=212;
        s1.password="ase";

        Student s2=new Student(s1);
        s1.marks[0]=120;
        for(int i=0;i<s2.marks.length;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Pen{
    private String color;
    private int tip;

    void set_color(String color){
        this.color=color;
    }
    void set_tip(int tip){
        this.tip=tip;
    }
    String get_color(){
        return this.color;
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];
    Student(){
        marks=new int[3];
        System.out.println("constructor is called");
    }
    Student(String name){
        marks=new int[3];
        this.name=name;
    }
    Student(int roll){
        marks=new int[3];
        this.roll=roll;
    }


    //  SHALLOW COPY CONSTRUCTOR
    // Student(Student s2){
    //     this.name=s2.name;
    //     this.password=s2.password;
    //     this.roll=s2.roll;
    //     marks=new int[3];
    //     this.marks=s2.marks; 
    // }

    // DEEP COPY CONSTRUCTOR
    Student(Student s1){
        this.name=s1.name;
        this.password=s1.password;
        this.roll=s1.roll;
        marks=new int[3];
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
}
