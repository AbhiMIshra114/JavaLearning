package practise;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(isValid(s));
    }
    static boolean isValid(String s) {
        if (s.length()%2 != 0)
            return false;
        for(int i = 0; i <= s.length()-2;){
            if ((s.charAt(i)=='(' && s.charAt(i+1)==')') || (s.charAt(i)=='[' && s.charAt(i+1)==']') || (s.charAt(i)=='{' && s.charAt(i+1)=='}'))
                i+=2;
            else
                return false;
        }
        return true;
    }
}
