import java.io.*;
import java.util.*;

/**
 * 【密码强度等级】
 * 描述
 * 密码按如下规则进行计分，并根据不同的得分为密码进行安全等级划分。
 * 一、密码长度:
 * 5 分: 小于等于4 个字符
 * 10 分: 5 到7 字符
 * 25 分: 大于等于8 个字符
 * 二、字母:
 * 0 分: 没有字母
 * 10 分: 全都是小（大）写字母
 * 20 分: 大小写混合字母
 * 三、数字:
 * 0 分: 没有数字
 * 10 分: 1 个数字
 * 20 分: 大于1 个数字
 * 四、符号:
 * 0 分: 没有符号
 * 10 分: 1 个符号
 * 25 分: 大于1 个符号
 * 五、奖励:
 * 2 分: 字母和数字
 * 3 分: 字母、数字和符号
 * 5 分: 大小写字母、数字和符号
 * 最后的评分标准:
 * >= 90: 非常安全
 * >= 80: 安全（Secure）
 * >= 70: 非常强
 * >= 60: 强（Strong）
 * >= 50: 一般（Average）
 * >= 25: 弱（Weak）
 * >= 0:  非常弱
 * 对应输出为：
 * VERY_SECURE
 * SECURE,
 * VERY_STRONG,
 * STRONG,
 * AVERAGE,
 * WEAK,
 * VERY_WEAK,
 * 请根据输入的密码字符串，进行安全评定。
 * 注：
 * 字母：a-z, A-Z
 * 数字：-9
 * 符号包含如下： (ASCII码表可以在UltraEdit的菜单view->ASCII Table查看)
 * !"#$%&'()*+,-./     (ASCII码：x21~0x2F)
 * :;<=>?@             (ASCII<=><=><=><=><=>码：x3A~0x40)
 * [\]^_`              (ASCII码：x5B~0x60)
 * {|}~                (ASCII码：x7B~0x7E)
 * 输入描述：
 * 本题含有多组输入样例。
 * 每组样例输入一个string的密码
 * 输出描述：
 * 每组样例输出密码等级
 * 示例1
 * 输入：
 * 38$@NoNoNo
 * 123
 * 输出：
 * VERY_SECURE
 * WEAK
 * 说明：
 * 第一组样例密码强度为95分。
 * 第二组样例密码强度为25分。
 */
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