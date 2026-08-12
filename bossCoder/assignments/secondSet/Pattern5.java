package bossCoder.assignments.secondSet;

import java.util.ArrayList;
import java.util.List;

public class Pattern5 {
    /*===========
    ****
    *__*
    *__*
    ==============
    * */


    static List<String> solve(int n){
    List<String> result = new ArrayList<>();
    for(int i=0;i<n;i++){
        String s="";
        for(int j=0;j<n;j++){
            if(i==0||i==n-1){
                s=s.concat("*");
                continue;
            }
            if(j==0 || j==n-1) s=s.concat("*");
            else s= s.concat("_");
        }
        result.add(s);
    }

    return result;
    }
    public static void main(String[] args) {
        System.out.println(solve(4));
    }
}
