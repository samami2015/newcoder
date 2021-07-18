import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null) {
            String[] strs = str.split(" ");
            int year = Integer.parseInt(strs[0]);
            int month = Integer.parseInt(strs[1]);
            int day = Integer.parseInt(strs[2]);
            int result = day;
            for (int i = 1; i < month; i++) {
                result += getMonthDays(year, i);
            }
            System.out.println(result);
        }
    }

    public static int getMonthDays(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        if (month == 2) {
            return year % 4 == 0 ? 29 : 28;
        }
        return 30;
    }
}