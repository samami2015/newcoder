import java.io.*;
import java.lang.String;

public class HJ044 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            if (str.equals("")) continue;
            int[][] sudoku = new int[9][9];
            String[] params = str.split(" ");
            for (int j = 0; j < 9; j++) {
                sudoku[0][j] = Integer.parseInt(params[j]);
            }
            for (int i = 1; i < 9; i++) {
                params = br.readLine().split(" ");
                for (int j = 0; j < 9; j++) {
                    sudoku[i][j] = Integer.parseInt(params[j]);
                }
            }
            dfs(sudoku);
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                ans.append(sudoku[i][0]);
                for (int j = 1; j < 9; j++)
                    ans.append(" ").append(sudoku[i][j]);
                ans.append("\n");
            }
            System.out.print(ans.toString());
        }
    }

    public static boolean dfs(int[][] sudoku) {
        // 寻找第一个0数字，若无，返回true
        int i = 0, j = 0;
        search:
        for (; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) break search;
            }
        }
        if (i < 9 && j < 9) {
            boolean[] have = new boolean[10];
            for (int k = 0; k < 9; k++) {
                have[sudoku[i][k]] = true;
                have[sudoku[k][j]] = true;
            }
            int r = (i / 3) * 3, c = (j / 3) * 3;
            for (int k = r; k < r + 3; k++) {
                for (int l = c; l < c + 3; l++)
                    have[sudoku[k][l]] = true;
            }
            for (int k = 1; k <= 9; k++) {
                if (have[k]) continue;
                sudoku[i][j] = k;
                if (dfs(sudoku)) return true;
                sudoku[i][j] = 0;
            }
            return false;
        } else return true;
    }
}