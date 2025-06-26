public class phone_no{
    public static char letterToDigit(char ch) {
        ch = Character.toUpperCase(ch);
        if (ch >= 'A' && ch <= 'C') return '2';
        if (ch >= 'D' && ch <= 'F') return '3';
        if (ch >= 'G' && ch <= 'I') return '4';
        if (ch >= 'J' && ch <= 'L') return '5';
        if (ch >= 'M' && ch <= 'O') return '6';
        if (ch >= 'P' && ch <= 'S') return '7';
        if (ch >= 'T' && ch <= 'V') return '8';
        if (ch >= 'W' && ch <= 'Z') return '9';
        return ch; 
    }
    public static String decodePhoneNumber(String input) {
        StringBuilder digits = new StringBuilder();
        for (char ch : input.toCharArray()){
            digits.append(letterToDigit(ch));
        }
        if (digits.length() == 10){
            return "(" + digits.substring(0, 3) + ") " +
                   digits.substring(3, 6) + "-" +
                   digits.substring(6);
        }
        return digits.toString();
    }
    public static void main(String[] args) {
        String input = "800888TEST";
        String result = decodePhoneNumber(input);
        System.out.println(result);
    }
}