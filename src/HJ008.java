import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/**
 * 【合并表记录】
 * 描述
 * 数据表记录包含表索引和数值（int范围的正整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 * <p>
 * 输入描述：
 * 先输入键值对的个数
 * 然后输入成对的index和value值，以空格隔开
 * <p>
 * 输出描述：
 * 输出合并后的键值对（多行）
 * <p>
 * 示例1
 * 输入：
 * 4
 * 0 1
 * 0 2
 * 1 2
 * 3 4
 * 输出：
 * 0 3
 * 1 2
 * 3 4
 */
public class HJ008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            Map<Integer, Integer> map = new TreeMap<>();
            int sum = 0;
            while (n > 0) {
                String[] nums = br.readLine().split(" ");
                if (!map.containsKey(Integer.parseInt(nums[0]))) {
                    map.put(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]));
                } else {
                    sum = map.get(Integer.parseInt(nums[0]));
                    map.put(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]) + sum);
                }
                n--;
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}