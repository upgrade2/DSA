package arrays;

import java.util.ArrayList;
import java.util.List;

public class EncodingDecoding {
    public String encode(List<String> strs) {
    StringBuilder stringBuilder = new StringBuilder();
    for(String str:strs){
        stringBuilder.append(str.length()).append("#").append(str);
    }
    return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i=j+1;
            result.add(str.substring(i,i+ length));
            i+=length;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] str ={"Hello","World"};
        EncodingDecoding obj=new EncodingDecoding();
        String encodedString=obj.encode(List.of(str));
        System.out.println("Encoded String : "+encodedString);
        List<String> result=obj.decode(encodedString);
        System.out.println("Result {}"+result.equals(List.of(str)));
    }
}
