import java.io.*;

public class HJ94 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int candidate = Integer.parseInt(str);
            String[] name = br.readLine().split(" ");
            int voter = Integer.parseInt(br.readLine());
            String[] vote = br.readLine().split(" ");
            int invalid = 0;
            int[] number = new int[candidate];
            for (int i = 0; i < name.length; i++) {
                for (int j = 0; j < vote.length; j++) {
                    if (name[i].equals(vote[j])) {
                        number[i]++;
                    }
                }
                voter -= number[i];
            }
            invalid = voter;
            for (int i = 0; i < name.length; i++) {
                System.out.println(name[i] + " : " + number[i]);
            }
            System.out.println("Invalid : " + invalid);
        }
    }
}