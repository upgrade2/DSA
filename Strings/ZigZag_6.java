package Strings;

public class ZigZag_6 {
    public static String convert(String s, int numRows) {
        if(numRows==1) return s;
        char[] c = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for(int r=0;r<numRows;r++){
            int increment = 2*(numRows-1);
            for(int i=r;i<s.length();i=i+increment){
                result.append(c[i]);
                if(r>0 && r<numRows-1&& i+increment-2*r<s.length()){
                    result.append(c[i+increment-2*r]);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s="PAYPALISHIRING";

        System.out.print("Result: "+convert(s,3));
    }
}
