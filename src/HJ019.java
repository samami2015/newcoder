import java.io.*;
import java.util.*;

public class HJ019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        while ((str = br.readLine()) != null) {
            String[] arr = str.split(" ");
            String str1 = arr[0];
            String str2 = arr[1];
            str1 = str1.substring(str1.lastIndexOf("\\") + 1);
            if (str1.length() > 16) str1 = str1.substring(str1.length() - 16);
            String str12 = str1 + " " + str2;
            map.put(str12, map.getOrDefault(str12, 0) + 1);
            int count = 0;
        }
        int count = 0;
        for (String key : map.keySet()) {
            count++;
            if (count > (map.size() - 8)) {
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}