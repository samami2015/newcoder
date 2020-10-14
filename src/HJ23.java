import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class HJ23 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        //HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        while (null != (str = reader.readLine())) {
            char[] array = str.toCharArray();
            for (int i = 0; i < array.length; i++) {
                map.put(array[i], map.getOrDefault(array[i], 0) + 1);
            }
            int min = Integer.MAX_VALUE;
            for (Character key : map.keySet()) {
                if (min > map.get(key)) {
                    min = map.get(key);//最小的次数
                }
            }
            StringBuilder res = new StringBuilder();
            for (Character c : array) {
                if (min != map.get(c)) {
                    res.append(c);
                }
            }
            System.out.println(res.toString());
            res.delete(0, res.length() - 1);
            map.clear();
        }
    }
}
