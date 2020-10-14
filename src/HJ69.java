import java.io.*;

public class HJ69 {
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