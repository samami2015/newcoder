import java.io.*;

public class HJ75 {
    public static void main(String[] arfs) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = bf.readLine()) != null) {
            String str1 = line + "q";
            String str2 = bf.readLine() + "w";
            char[] c1 = str1.toCharArray();
            char[] c2 = str2.toCharArray();
            //System.out.println(str1+" "+str2);
            System.out.println(Chazhao(c1, c2));
        }
    }

    public static int Chazhao(char[] c1, char[] c2) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < c1.length; i++) {
            int temp1 = i;
            //System.out.println(c1[i]);
            count = 0;
            for (int j = 0; j < c2.length; j++) {
                count = 0;
                int temp2 = j;
                temp1 = i;
                //System.out.println(c2[j]);
                while (c1[temp1] == c2[temp2]) {
                    //System.out.println(c1[temp1] + " "+ c2[temp2]);
                    count++;
//                  if(temp1 == c1.length || temp2 == c2.length) {
//                      break;
//                  }
                    temp1++;
                    temp2++;
                }
                if (count > max) {
                    max = count;
                }
            }
        }
        return max;
    }
}
