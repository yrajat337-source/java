import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> expectedClosings = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(': expectedClosings.push(')'); break;
                case '[': expectedClosings.push(']'); break;
                case '{': expectedClosings.push('}'); break;
                default:
                    if (expectedClosings.isEmpty() || expectedClosings.pop() != c) {
                        return false;
                    }
            }
        }

        return expectedClosings.isEmpty();
    }
}
