import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;

/**
 * 传入一个int型数组，返回该数组能否分成两组，使得两组中各元素加起来的和相等，
 * 并且，所有5的倍数必须在其中一个组中，所有3的倍数在另一个组中（不包括5的倍数）
 *
 * @author chronos
 */
public class HJ93 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = read.readLine()) != null) {
            int n = Integer.parseInt(input);
            int[] array = new int[n];
            String[] strs = read.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(strs[i]);
            }
            System.out.println(solution(array));
        }
    }

    public static boolean solution(int[] array) {
        if (array.length < 2)
            return false;
        int sum = 0, sum3 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] % 3 == 0 && array[i] != 0)
                sum3 += array[i];
            else if (array[i] % 5 == 0 && array[i] != 0)
                continue;
            else
                list.add(array[i]);
        }
        if (sum % 2 != 0)
            return false;
        int num1 = sum / 2 - sum3;   //第一个数组差的数
        return dfs(list, num1, 0);
//		int len = list.size();
//		int[] remainder = new int[len];
//		for(int i = 0; i < len; i++) {
//			remainder[i] = list.get(i);
//		}
//		Arrays.sort(remainder);
        //在剩下的数字中找到和为num1的，如果没有返回false
    }

    private static boolean dfs(List<Integer> bag, int target, int i) {
        if (i == bag.size())
            return target == 0;
        // dfs搜索，对每个元素，选择或者放弃
        return dfs(bag, target, i + 1) || dfs(bag, target - bag.get(i), i + 1);
    }
}