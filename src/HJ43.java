import java.io.*;

public class HJ43 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null) {
            String[] strs = str.split(" ");
            int m = Integer.parseInt(strs[0]);
            int n = Integer.parseInt(strs[1]);
            int[][] nums = new int[m][n];
            for (int i = 0; i < m; i++) {
                String strr = br.readLine();
                String[] b = strr.split(" ");
                for (int j = 0; j < n; j++) {
                    nums[i][j] = Integer.parseInt(b[j]);
                }
            }
            String[] res = {""};
            peocess(nums, 0, 0, "(0,0)\n", res);
            if (res[0].length() == 0)
                System.out.println("(0,0)");
            else System.out.println(res[0].substring(0, res[0].length() - 1));
        }
    }

    public static void peocess(int[][] arr, int x, int y, String path, String[] res) {
        if ((x == arr.length - 1) && (y == arr[x].length - 1)) {
            if (arr[x][y] == 0)
                res[0] = path;
            return;
        }
        if (x > arr.length - 1 || y > arr[x].length - 1)
            return;

        if (x + 1 < arr.length && arr[x + 1][y] == 0)
            peocess(arr, x + 1, y, path + "(" + (x + 1) + "," + y + ")\n", res);
        if (y + 1 < arr[x].length && arr[x][y + 1] == 0)
            peocess(arr, x, y + 1, path + "(" + x + "," + (y + 1) + ")\n", res);
    }
}