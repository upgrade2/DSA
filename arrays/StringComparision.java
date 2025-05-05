package arrays;

import java.sql.SQLOutput;

public class StringComparision {
    public static int compress(char[] chars) {
        int i=1,count=1;
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);

        while(i<chars.length)
        {
            if(chars[i-1]==chars[i]){
                count++;
            }
            else {
                if(count>1)sb.append(count);
                sb.append(chars[i]);
                count=1;
            }
            i++;
        }
        if(count>1)
        sb.append(count);

        for(int j=0;j<sb.length();j++){
            chars[j]=sb.charAt(j);
        }
        return sb.length();
    }

    public static void main(String[] args) {
        char[] chars ={'a','a','b','b','c','c','c'};
        char[] chars1 ={'c'};

        System.out.println("Result:"+compress(chars1));
    }

}
