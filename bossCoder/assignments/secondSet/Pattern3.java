package bossCoder.assignments.secondSet;

import java.util.ArrayList;
import java.util.List;

public class Pattern3 {
    public static List<String> pattern(int n){
        List<String> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s ="";
            for (int j=0;j<=i;j++){
                char c = (char)(j+97);
                String temp = ""+c;
                s=s.concat(temp);
            }
            result.add(s.toString());
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pattern(3));
    }
}
