import java.util.ArrayDeque;
import java.util.Deque;
 
public class hw5       {
 
    public boolean isValid(String s) {
 
        if (isEmptyString(s)) {
            return true;
        }
 
        if (isOddLength(s)) {
            return false;
        }
 
        int length = s.length();
 
        Deque<Character> stack = new ArrayDeque<>(length);
 
        for (int i = 0; i < length; i++) {
 
            if (isOpenBracket(s.charAt(i))) {
                stack.addFirst(s.charAt(i));
            } else if (stack.isEmpty()) {
                return false;
            } else {
                boolean isMatchingClosingBrace = isValidClosingBracket(stack, s.charAt(i));
                if (!isMatchingClosingBrace) {
                    return false;
                }
            }
        }
 
        return stack.isEmpty();
    }
 
    private boolean isValidClosingBracket(Deque<Character> stack, char c) {
        return switch (c) {
            case ')' -> (stack.removeFirst() != '(') ? Boolean.FALSE : Boolean.TRUE;
            case ']' -> (stack.removeFirst() != '[') ? Boolean.FALSE : Boolean.TRUE;
            case '}' -> (stack.removeFirst() != '{') ? Boolean.FALSE : Boolean.TRUE;
            default -> throw new IllegalStateException("Unexpected value: " + c);
        };
    }
 
 
    private static boolean isOpenBracket(char c) {
        return (c == '(' || c == '[' || c == '{');
    }
 
 
    private static boolean isEmptyString(String input) {
        return (null == input || input.trim().equals(""));
    }
 
    private static boolean isOddLength(String input) {
        return input.length() % 2 != 0;
    }
}