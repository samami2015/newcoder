import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ047 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            int total = Integer.parseInt(line.split(" ")[0]);
            if (total > 0) {
                StringBuffer sb = new StringBuffer();
                String thisline = bufferedReader.readLine();
                String[] elements = thisline.split(" ");
                int num = Integer.parseInt(elements[0]);
                int value = Integer.parseInt(elements[1]);

                int preNum = num;
                int preValue = value;
                sb.append(thisline).append("\n");
                for (int i = 1; i < total; i++) {
                    thisline = bufferedReader.readLine();
                    elements = thisline.split(" ");
                    num = Integer.parseInt(elements[0]);
                    value = Integer.parseInt(elements[1]);
                    if (num == preNum) {
                        continue;
                    }
                    for (int j = preNum + 1; j < num; j++) {
                        sb.append(j).append(" ").append(preValue + (value - preValue) / (num - preNum) * (j - preNum)).append("\n");
                    }
                    preNum = num;
                    preValue = value;
                    sb.append(thisline).append("\r\n");
                }
                System.out.print(sb.toString());
            }
        }
    }
}