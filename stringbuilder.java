public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sc=new StringBuilder("mrunal");
        System.out.print(sc.charAt(0));
        sc.setCharAt(0, 'k');
        System.out.println(sc.substring(0,3));
        String firstname = "mrunal";
        String lastname = "pawar";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
    }
}
