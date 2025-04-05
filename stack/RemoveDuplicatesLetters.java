package stack;

import java.util.Stack;

public class RemoveDuplicatesLetters {

    public static String removeDuplicateLetters(String s) {

        char[] c = s.toCharArray();
        boolean[] seen =new boolean[26];
        int[] freq =new int[26];
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<c.length;i++){
          freq[c[i]-'a']++;
        }

        for(int i=0;i<s.length();i++){
            if(seen[c[i]-'a']){
                freq[c[i]-'a']--;
                continue;
            }

            while (!stack.empty()&& stack.peek()>c[i] && freq[stack.peek()-'a']>0){
                seen[stack.peek()-'a']=false;
                stack.pop();
            }

            stack.push(c[i]);
            seen[c[i]-'a'] = true;
            freq[c[i]-'a']--;
        }
        StringBuilder sb = new StringBuilder();
        int i=0;
        while( i <stack.size()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String s=  "leetcode"; //"bcabc";
        System.out.println(removeDuplicateLetters(s));
    }

}
