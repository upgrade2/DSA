package Strings;

public class Reverse_151 {
    public static String reverse(String s){
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.print(reverse(str));
    }
}
