import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HJ67 {
    public static int[] a;
    public static int[] b;

    public static void init() {
        a = new int[4];
        b = new int[4];
    }

    public static boolean dfs(int x) {
        boolean ed = true;
        for (int i = 0; i < 4; ++i) {
            if (b[i] == 0) {
                ed = false;
                break;
            }
        }
        if (ed) {
            if (x == 24) return true;
            else return false;
        }
        for (int i = 0; i < 4; ++i) {
            if (b[i] == 0) {
                b[i] = 1;
                if (dfs(x + a[i])) return true;
                if (dfs(x - a[i])) return true;
                if (dfs(x * a[i])) return true;
                if ((x % a[i] == 0) && (dfs(x / a[i]))) return true;
                b[i] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        init();
        while ((str = bf.readLine()) != null && !"".equals(str)) {
            String[] nums = str.split(" ");
            for (int i = 0; i < 4; ++i) {
                a[i] = Integer.parseInt(nums[i]);
                b[i] = 0;
            }
            boolean flag = false;
            for (int i = 0; i < 4; ++i) {
                b[i] = 1;
                flag = dfs(a[i]);
                b[i] = 0;
                if (flag) break;
            }
            if (flag) System.out.println("true");
            else System.out.println("false");
        }
    }
}