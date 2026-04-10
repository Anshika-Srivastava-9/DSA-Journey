package BitManipulation;

public class UpdateiThBit {
    public static int UpdateIthBit(int n,int i,int newBit){
        if(newBit==0){
            return ClearIthBit(n,i);
        }
        else{
            return SetIthBit(n,i);
        }
    }
    public static int ClearIthBit(int n,int i){
        int bitmark=~(1<<i);
        return n&bitmark;
    }
    public static int SetIthBit(int n,int i){
        int bitmark=1<<i;
        return n|bitmark;
    }
    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10, 2, 1));
    }
}
