import java.util.ArrayList;

public class Strings {
    public static void main(String[] args) {
        String s= "Anshika";
        change(s);
        System.out.println(s);

        String[] arr={"Alfee","Anushka","Vidhi","Angel"};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

        ArrayList<String> al=new ArrayList<>();
        al.add("Neha");
        al.add("Arpita");
        al.add("Pragyanjali");
        System.out.println(al);

        change2(al);
        System.out.println(al);

    }
    private static void change2(ArrayList<String>al){
        al.add("Aditi");

    }

    private static void change(String s){
        s="Neha";
    }
}
