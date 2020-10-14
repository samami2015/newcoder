import java.io.*;

public class HJ76 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            int num = Integer.parseInt(str);
            System.out.println(getSequeOddNum(num));
        }
    }

    public static String getSequeOddNum(int m) {
        int[] nums = new int[m];
        nums[0] = m * m - m + 1;
        if (m == 1) {
            return String.valueOf(nums[0]);
        } else {
            for (int i = 1; i < m; i++) {
                nums[i] = nums[i - 1] + 2;
            }
            StringBuffer sb = new StringBuffer();
            sb.append(nums[0]);
            for (int i = 1; i < m; i++) {
                sb.append("+");
                sb.append(nums[i]);
            }
            return sb.toString();
        }
    }
}