import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 【扑克牌大小】
 * 描述
 * 扑克牌游戏大家应该都比较熟悉了，一副牌由54张组成，含3~A、2各4张，小王1张，大王1张。牌面从小到大用如下字符和字符串表示（其中，小写joker表示小王，
 * 大写JOKER表示大王）：3 4 5 6 7 8 9 10 J Q K A 2 joker JOKER
 * 输入两手牌，两手牌之间用"-"连接，每手牌的每张牌以空格分隔，"-"两边没有空格，如：4 4 4 4-joker JOKER。
 * 请比较两手牌大小，输出较大的牌，如果不存在比较关系则输出ERROR。
 * 基本规则：
 * （1）输入每手牌可能是个子、对子、顺子（连续5张）、三个、炸弹（四个）和对王中的一种，不存在其他情况，由输入保证两手牌都是合法的，顺子已经从小到大排列；
 * （2）除了炸弹和对王可以和所有牌比较之外，其他类型的牌只能跟相同类型的存在比较关系（如，对子跟对子比较，三个跟三个比较），不考虑拆牌情况（如：将对子拆分成个子）；
 * （3）大小规则跟大家平时了解的常见规则相同，个子、对子、三个比较牌面大小；顺子比较最小牌大小；炸弹大于前面所有的牌，炸弹之间比较牌面大小；对王是最大的牌；
 * （4）输入的两手牌不会出现相等的情况。
 * 输入描述：
 * 输入两手牌，两手牌之间用"-"连接，每手牌的每张牌以空格分隔，"-"两边没有空格，如 4 4 4 4-joker JOKER。
 * 输出描述：
 * 输出两手牌中较大的那手，不含连接符，扑克牌顺序不变，仍以空格隔开；如果不存在比较关系则输出ERROR。
 * 示例1
 * 输入：
 * 4 4 4 4-joker JOKER
 * 输出：
 * joker JOKER
 */
public class HJ088 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = bf.readLine()) != null) {
            //if (bf.readLine() == "") continue;
            String[] ss = str.split("-");
            if (ss[0].equals("joker JOKER") || ss[1].equals("joker JOKER")) {
                System.out.println("joker JOKER");
                continue;
            }
            String[] str0 = ss[0].split(" ");
            String[] str1 = ss[1].split(" ");
            str0 = findString(str0);
            str1 = findString(str1);
            int len0 = str0.length;
            int len1 = str1.length;
            if (len0 == 4 || len1 == 4) {
                if (len0 == 4 && len1 == 4) {
                    int temp = Integer.parseInt(str0[0]) - Integer.parseInt(str1[0]);
                    if (temp >= 0) {
                        System.out.println(ss[0]);
                        continue;
                    }
                } else if (len0 == 4) {
                    System.out.println(ss[0]);
                    continue;
                } else {
                    System.out.println(ss[1]);
                    continue;
                }
            }
            if (len0 != len1) {
                System.out.println("ERROR");
                continue;
            }
            int temp = Integer.parseInt(str0[0]) - Integer.parseInt(str1[0]);
            if (temp >= 0) {
                System.out.println(ss[0]);
                continue;
            } else {
                System.out.println(ss[1]);
                continue;
            }
        }
    }

    private static String[] findString(String[] str) {
        for (int i = 0; i < str.length; i++) {
            switch (str[i]) {
                case "J":
                    str[i] = "11";
                    break;
                case "Q":
                    str[i] = "12";
                    break;
                case "K":
                    str[i] = "13";
                    break;
                case "A":
                    str[i] = "14";
                    break;
                case "2":
                    str[i] = "15";
                    break;
            }
        }
        return str;
    }
}
