package stack;

import java.util.Stack;

public class RemoveDuplicatesLetters {

    public static String removeDuplicateLetters(String s) {
        int[] lastOccurrence = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }

        boolean[] inArray = new boolean[26];
        char[] result = new char[s.length()]; // Simulate stack with char array
        int stackPointer = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (inArray[current - 'a']) continue;

            while (stackPointer > 0 && result[stackPointer - 1] > current && lastOccurrence[result[stackPointer - 1] - 'a'] > i) {
                inArray[result[--stackPointer] - 'a'] = false;
            }

            result[stackPointer++] = current;
            inArray[current - 'a'] = true;
        }

        return new String(result, 0, stackPointer);
    }
    public static void main(String[] args) {
        String s="bcabc";
        System.out.println(removeDuplicateLetters(s));
    }

}
