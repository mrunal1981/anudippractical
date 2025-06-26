class singleton {
    private static singleton instance; 
    int str;

    private singleton() {
        str = 0;
    }

    static singleton getsingletone() { 
        if (instance == null) {
            instance = new singleton();
        }
        return instance;
    }
}

public class Innersingleton {
    public static void main(String[] args) {
        singleton sc = singleton.getsingletone(); 
        System.out.println(sc.str); 
    }
}