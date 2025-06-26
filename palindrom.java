public class palindrom {
public static void main(String[] args) {
    String str ="madam";
    String reversed ="";
    for(int i=str.length()-1;i>=0;i--)
    {
        reversed =reversed+str.charAt(i);
    }
    if(str.equals(reversed)){
        System.out.println(str+" is palindrom");
    }
    else{
        System.out.println(str+" is not a palindrom");
    }
  }
}