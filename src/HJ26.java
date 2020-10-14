import java.io.*;

public class HJ26 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            char[] arr = str.toCharArray();
            StringBuilder builder = new StringBuilder();
            // 英文字母从 A 到 Z 排列，不区分大小写：26 个
            for (int i = 0; i < 26; i++) {
                char c = (char) ('A' + i);
                // 遍历字符串
                for (int j = 0, length = str.length(); j < length; j++) {
                    // 不区分大小写
                    if (c == arr[j] || c == arr[j] - 'a' + 'A') {
                        builder.append(arr[j]);
                    }
                }
            }
            // 非英文字母的其它字符保持原来的位置
            for (int i = 0, length = str.length(); i < length; i++) {
                if (!((arr[i] >= 'A' && arr[i] <= 'Z') || (arr[i] >= 'a' && arr[i] <= 'z'))) {
                    builder.insert(i, arr[i]);
                }
            }
            System.out.println(builder.toString());
        }
    }
}
