package strings;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        //Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
        // determine if the input string is valid.
        //
        //An input string is valid if:
        //
        //    Open brackets must be closed by the same type of brackets.
        //    Open brackets must be closed in the correct order.
        //    Every close bracket has a corresponding open bracket of the same type.
        Stack<Character> stack = new Stack<>();

        try {
            for (int i = 0; i < s.length(); i++) {
                var current_char = s.charAt(i);

                if (current_char == '(') {
                    stack.add(current_char);
                }
                if (current_char == ')') {
                    var previous_char = stack.pop();
                    if (previous_char != '(') return false;
                }

                if (current_char == '{') {
                    stack.add(current_char);
                }
                if (current_char == '}') {
                    var previousChar = stack.pop();
                    if (previousChar != '{') return false;
                }

                if (current_char == '[') {
                    stack.add(current_char);
                }
                if (current_char == ']') {
                    var pop = stack.pop();
                    if (pop != '[') return false;
                }
            }
        } catch (java.util.EmptyStackException emptyStackException) {
            return false;
        }
        return stack.isEmpty();
    }
}
