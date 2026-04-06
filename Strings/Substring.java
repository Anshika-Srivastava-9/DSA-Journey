package Strings;
public class Substring {
  public static String printSubstring( String str,int SI,int EI){
    String subString="";
    for(int i=SI;i<EI;i++){
       subString+=str.charAt(i); 
    }
    return subString;
  } 
public static void main(String[] args) {
    String str="HelloWorld";
    System.out.println(printSubstring(str, 0, 5));
    System.out.println(str.substring(0,6)); // Using inbuilt function
}
}
