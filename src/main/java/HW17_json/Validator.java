package HW17_json;

import java.util.ArrayDeque;
import java.util.Deque;

public class Validator {
    static boolean areParenthesesBalanced(String string) {
        Deque<Character> test = new ArrayDeque<>();

        for (int i = 0; i < string.length(); i++) {
            char x = string.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                test.push(x);
                continue;
            }
            if (test.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = test.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = test.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = test.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (test.isEmpty());
    }
}
