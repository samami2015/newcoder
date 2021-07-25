import java.io.*;

/**
 * 【矩阵乘法】
 * 描述
 * 如果A是个x行y列的矩阵，B是个y行z列的矩阵，把A和B相乘，其结果将是另一个x行z列的矩阵C。这个矩阵的每个元素是由下面的公式决定的
 *
 * 矩阵的大小不超过100*100
 * 输入描述：
 * 输入包含多组数据，每组数据包含：
 * 第一行包含一个正整数x，代表第一个矩阵的行数
 * 第二行包含一个正整数y，代表第一个矩阵的列数和第二个矩阵的行数
 * 第三行包含一个正整数z，代表第二个矩阵的列数
 * 之后x行，每行y个整数，代表第一个矩阵的值
 * 之后y行，每行z个整数，代表第二个矩阵的值
 *
 * 输出描述：
 * 对于每组输入数据，输出x行，每行z个整数，代表两个矩阵相乘的结果
 * 示例1
 * 输入：
 * 2
 * 3
 * 2
 * 1 2 3
 * 3 2 1
 * 1 2
 * 2 1
 * 3 3
 * 输出：
 * 14 13
 * 10 11
 * 说明：
 * 1 2 3
 * 3 2 1
 * 乘以
 * 1 2
 * 2 1
 * 3 3
 * 等于
 * 14 13
 * 10 11
 *
 * 示例2
 * 输入：
 * 2
 * 2
 * 2
 * 1 1
 * 1 1
 *
 * 1 1
 * 1 1
 *
 * 16
 * 8
 * 7
 * 17 19 16 19 14 1 14 9
 * 7 2 7 9 16 14 16 12
 * 13 3 3 17 5 9 8 16
 * 1 14 16 10 13 13 14 1
 * 13 13 15 4 7 2 6 16
 * 16 15 5 5 15 13 1 11
 * 11 5 0 16 14 7 7 15
 * 0 16 4 7 16 6 0 15
 * 2 14 11 2 17 17 5 12
 * 8 13 11 10 1 17 10 8
 * 15 16 17 15 7 8 13 14
 * 5 19 11 3 11 14 5 4
 * 9 16 13 11 15 18 0 3
 * 15 3 19 9 5 14 12 3
 * 9 8 7 11 18 19 14 18
 * 12 19 9 1 0 18 17 10
 *
 * 5 18 16 19 6 12 5
 * 1 17 1 5 9 16 3
 * 14 16 4 0 19 3 6
 * 11 9 15 18 11 17 13
 * 5 5 19 3 16 1 12
 * 12 13 19 1 10 5 18
 * 19 18 6 18 19 12 3
 * 15 11 6 5 10 17 19
 * 输出：
 * 2 2
 * 2 2
 *
 * 1020 1490 1063 1100 1376 1219 884
 * 966 1035 1015 715 1112 772 920
 * 822 948 888 816 831 920 863
 * 855 1099 828 578 1160 717 724
 * 745 1076 644 595 930 838 688
 * 635 1051 970 600 880 811 846
 * 748 879 952 772 864 872 878
 * 526 722 645 335 763 688 748
 * 764 996 868 362 1026 681 897
 * 836 1125 785 637 940 849 775
 * 1082 1476 996 968 1301 1183 953
 * 609 987 717 401 894 657 662
 * 700 1083 1022 527 1016 746 875
 * 909 1162 905 722 1055 708 720
 * 1126 1296 1240 824 1304 1031 1196
 * 905 1342 766 715 1028 956 749
 */
public class HJ069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            if (str.equals("")) continue;
            int x = Integer.parseInt(str);
            int y = Integer.parseInt(br.readLine());
            int z = Integer.parseInt(br.readLine());
            int[][] matrix1 = new int[x][y];
            int[][] matrix2 = new int[y][z];
            for (int i = 0; i < x; i++) {
                String[] params = br.readLine().split(" ");
                for (int j = 0; j < y; j++) {
                    matrix1[i][j] = Integer.parseInt(params[j]);
                }
            }
            for (int i = 0; i < y; i++) {
                String[] params = br.readLine().split(" ");
                for (int j = 0; j < z; j++) {
                    matrix2[i][j] = Integer.parseInt(params[j]);
                }
            }
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < z; j++) {
                    int temp = 0;
                    for (int k = 0; k < y; k++) temp += matrix1[i][k] * matrix2[k][j];
                    ans.append(temp).append(" ");
                }
                ans.deleteCharAt(ans.length() - 1).append("\n");
            }
            System.out.print(ans.toString());
        }
    }
}