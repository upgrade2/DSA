package Strings;

public class ReverseWordsInString151 {

    public static String reverseWords(String s) {
        // Convert string to char array for in-place modifications
        char[] str = s.toCharArray();

        // Step 1: Reverse entire string
        reverse(str, 0, str.length - 1);

        // Step 2: Reverse each word
        reverseWords(str);

        // Step 3: Clean up spaces and return the cleaned string
        return cleanSpaces(str);
    }

    private static void reverse(char[] str, int left, int right) {
        while (left < right) {
            char temp = str[left];
            str[left++] = str[right];
            str[right--] = temp;
        }
    }

    private static void reverseWords(char[] s) {
        int n = s.length;
        int start = 0;
        for (int end = 0; end < n; end++) {
            // Find the end of the current word
            if (s[end] == ' ') {
                reverse(s, start, end - 1);
                start = end + 1; // Move to the start of the next word
            }
        }
        // Reverse the last word
        reverse(s, start, n - 1);
    }

    private static String cleanSpaces(char[] str) {
        int n = str.length;
        int i = 0, j = 0;

        while (j < n) {
            // Skip spaces
            while (j < n && str[j] == ' ') j++;
            // Copy non-space characters
            while (j < n && str[j] != ' ') str[i++] = str[j++];
            // Skip spaces to reach the next word, add only one space if there's a next word
            while (j < n && str[j] == ' ') j++;
            if (j < n) str[i++] = ' ';
        }

        return new String(str, 0, i);
    }
    public static void main(String[] args) {
        String str ="the sky is blue";
    reverseWords(str);
    System.out.println("Result:"+str);
    }
}
