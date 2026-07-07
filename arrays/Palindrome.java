package arrays;

public class Palindrome {
    public Boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        if(s.length()==0)return false;
        s=s.toLowerCase();
        char[] chars = s.toCharArray();
        int i=0,j=s.length()-1;

        while(i<j){
            if(chars[i]==chars[j]){
            i++;
            j--;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "Was it a car or a cat I saw?";
        System.out.println(new Palindrome().isPalindrome(input));
    }
}
