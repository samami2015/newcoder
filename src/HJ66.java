import java.io.*;
import java.util.*;

public class HJ66 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> HMp = new HashMap<>();
        HMp.put("reset", "reset what");
        HMp.put("reset board", "board fault");
        HMp.put("board add", "where to add");
        HMp.put("board delete", "no board at all");
        HMp.put("reboot backplane", "impossible");
        HMp.put("backplane abort", "install first");
        String input = br.readLine();
        while (null != input) {
            if (HMp.containsKey(input)) {
                System.out.println(HMp.get(input));
            } else {
                System.out.println("unknown command");
            }
            input = br.readLine();
        }
    }
}