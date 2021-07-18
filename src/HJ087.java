import java.io.*;
import java.util.*;

public class HJ087 {
    public static void main(String[] args) throws IOException {
        BufferedReader bread = new BufferedReader(new InputStreamReader(System.in));
        String kywd;
        while ((kywd = bread.readLine()) != null) {
            System.out.println(getScore(kywd));
        }
    }

    public static String getScore(String kywd) {
        char[] kychars = kywd.toCharArray();
        int numNum = 0;
        int sinNum = 0;
        int upNum = 0;
        int lowNum = 0;
        int score = 0;
        for (int i = 0; i < kychars.length; i++) {
            if (kychars[i] > 0x2F && kychars[i] < 0x3A) {
                numNum++;
            } else if (kychars[i] > 0x40 && kychars[i] < 0x5B) {
                upNum++;
            } else if (kychars[i] > 0x60 && kychars[i] < 0x7B) {
                lowNum++;
            } else if ((kychars[i] > 0x20 && kychars[i] < 0x30) || (kychars[i] > 0x39 && kychars[i] < 0x41) || (kychars[i] > 0x5A && kychars[i] < 0x61) || (kychars[i] > 0x7A && kychars[i] < 0x7F)) {
                sinNum++;
            }
        }
        /*判断长度*/
        if (kychars.length < 5) {
            score += 5;
        } else if (kychars.length > 4 && kychars.length < 8) {
            score += 10;
        } else if (kychars.length > 7) {
            score += 25;
        }
        /*判断字母*/
        if (upNum == 0 && lowNum == 0) {
        }
        if (upNum > 0) {
            score += 10;
        }
        if (lowNum > 0) {
            score += 10;
        }
        /*判断数字*/
        if (numNum == 0) {
        }
        if (numNum > 0) {
            score += 10;
        }
        if (numNum > 1) {
            score += 10;
        }
        /*判断符号*/
        if (sinNum == 0) {
        }
        if (sinNum > 0) {
            score += 10;
        }
        if (sinNum > 1) {
            score += 15;
        }
        /*奖励*/
        if ((upNum > 0 || lowNum > 0) && (numNum > 0)) {
            score += 2;
            if (sinNum > 0) {
                score += 1;
                if (upNum > 0 && lowNum > 0) {
                    score += 2;
                }
            }
        }
        /*评价结果*/
        if (score >= 90) {
            return "VERY_SECURE";
        }
        if (score >= 80) {
            return "SECURE";
        }
        if (score >= 70) {
            return "VERY_STRONG";
        }
        if (score >= 60) {
            return "STRONG";
        }
        if (score >= 50) {
            return "AVERAGE";
        }
        if (score >= 25) {
            return "WEAK";
        }
        return "VERY_WEAK";
    }
}