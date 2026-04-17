package OOPs;

public class Interface {
    public static void main(String[] args) {
     queen q=new queen();
     q.moves();   
    }
}
interface Chessplay{
void moves();
}
class queen implements Chessplay{
    public void moves(){
        System.out.println("up,down,left ,right ,diagonal (in all 4 direction)");
    }
}

class Rook implements Chessplay{
public void moves(){
        System.out.println("up,down,left ,right ");
    }
}

class King implements Chessplay{
public void moves(){
        System.out.println("up,down,left ,right, diagonal (by 1 step)");
    }
}