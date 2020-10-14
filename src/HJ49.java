import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ49 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=br.readLine())!=null){
            int n=Integer.parseInt(str);
            StringBuilder output=new StringBuilder();
            for(int i=0;i<n;i++){
                output.append("ABCD");
            }
            System.out.println(output.toString());
        }
    }
}