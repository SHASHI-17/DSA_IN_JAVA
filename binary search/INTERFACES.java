public class INTERFACES {
    public static void main(String[] args) {
        // queen q=new queen();
        // q.moves();
        bear bhai=new bear();
        // bhai.animal();
    }
}

interface Chessplayer{
    void moves();
}

class queen implements Chessplayer{
    public void moves(){
        System.out.println("top,down,righ,left and diagonal");
    }
}
class rook implements Chessplayer{
    public void moves(){
        System.out.println("top,down,righ,left");
    }
}
class KIng implements Chessplayer{
    public void moves(){
        System.out.println("top,down,righ,left and diagonal(by one step)");
    }
}

interface herbivore{
    void plant();
}
interface carnivore{
    void animal();
}

class bear implements herbivore,carnivore{
    public void plant(){
        System.out.print("eats plants");
    }
    public void animal(){
        System.out.print("eats animals");
    }
    bear(){
        System.out.print("comstructor called");
    }
}