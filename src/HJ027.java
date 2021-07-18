import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: zl
 * @描述:
 * @Date: Create in 21:37 2020/8/16
 * @Modified By:
 */
public class HJ027 {
    /**
     * 输入描述:
     * 先输入字典中单词的个数，再输入n个单词作为字典单词。
     * 输入一个单词，查找其在字典中兄弟单词的个数
     * 再输入数字n
     * <p>
     * 输出描述:
     * 根据输入，输出查找到的兄弟单词的个数
     * <p>
     * 示例1
     * 输入
     * 3 abc bca cab abc 1
     * 473 bb daccb caddd bddc c baa adb ad abbcb cdaa abab a abcc ddcbd cadcc cdacd aaa a b acccd bbb dacc cc acbdd bcbb ba bacaa adda acd aaad d ab acac bc dabab abcd aacba aba daa bb ad cddab a bbaa aacad cdac acbcc cada bacd adcad cdadc bcbcc aa b acd cbaac ddcd ccb dac a dac adbcb bcda dda a ab ca dd d abd a dbb ccabd bdddd abd adc aaa baccb ccdcd a da c cadc dcdbd d aa bb a cac c ad adb ca cdcc cadd dddca d cba cb caab caa dd cd bca abc cdaa cdb bad dad bda d ddbc dab baaa adaac b a dbccd bd b bdad cdacd baa ac ddcad d bb acc aa cd cbdbb bbbcb a cc aacc c aadc dbcd a bca dd abbb ccdcd ccd ab d a a dadcd dbd bcaa c cda b ddab caaaa cdcdb b acbc ccaa dabca dcd b ba dbcc da bdbcc ab abaca bb cddc caca da dadba accdd bdac dbcd bcbbd ab bd ccb ddaa aa b b d bddd cabac aaba ab ccdb db abbd ada bdadb c abba dd cdb bca cccda badba abaa ac aabad db ccbad bddd ada dba acba b bc dd bbbbd cc cbdd cd abcaa bb ddaca acadb bbbb bddcc bdada aaa bcbda c aaa aadd cdddc adb cdbab c cbca bb aacab acdb bbdab b acbda cbdcd bda bacdc db d adcbd bccc c aaa cdd bdcd bac a aaab ddbb cd ccdbb addcc cdc c ca baadc addba dbdbd dba bbdda bcb c cdad aacac dcada cb aaad a cccab caca aad bbb dd b babbb cba bdaca db bacd bc bcbda cdda bcccd bdcda bdbcd adb cbcb a c bacba abbb adab adab b b d bca badbc baa cdb b abc aabb b d c cdab cacda d cdcda adcdc bcc bbccd b adb caba cbaaa aadb dcc add bcac bacbd bb a b c cabaa c caad c aa bcc ccab ddc dadca cdcba aaba dabbd dcb a bddb bb a c c cbc ccd dd a cabbb b caadb cb dca cbb ddaa bcadc dab a bbda cd bc ccad bbd ab c acddd cdd dbbbb daaab abbb cabc add ca caa bbbb dcab daaaa baca dcd ccacb ba bddaa acac dbcc bcc cbbcc b abba daa dbab bcca ba aa d dcdc d dcaa cbcda bd b ccbcb baa dcacd d c cbda baba d abb c cbdc da dbbb cd aabc dadc b a ddb c ddd ccdc ccd cba dbaac dcccd ddbac dbbdd bad bcdd cb dac dccd d a acdd d c cb b bcbb c a aca bcba d d bbdbc d c dabad ccca dc adb ddb dcdd dba ad ddaba c ac ddac bbbd cd a dacbb 1
     * 输出
     * 2
     * bca
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        while ((input = br.readLine()) != null) {
            String[] arr = input.trim().split(" ");
            Integer n = Integer.parseInt(arr[0]);
            /*if (n > 1000) {
                break;
            }*/
            String target = arr[arr.length - 2];
            Integer num = Integer.parseInt(arr[arr.length - 1]); //要展示的数据量
            String[] dic = new String[n];
            //将字典项放入数组
            for (int i = 1; i <= n; i++) {
                dic[i - 1] = arr[i];
            }
            int count = 0;
            List<String> list = new ArrayList<>();
            for (int i = 0; i < dic.length; i++) {
                if ((dic[i].length() != target.length()) || (dic[i].equals(target))) {
                    continue;
                }
                char[] chars = dic[i].toCharArray();
                char[] targetArr = target.toCharArray();
                int tmp = 0;
                for (int j = 0; j < chars.length; j++) {
                    for (int k = 0; k < targetArr.length; k++) {
                        if (chars[j] == targetArr[k]) {
                            targetArr[k] = '0';
                            tmp++;
                            break;
                        }
                    }
                }
                if (tmp == targetArr.length) { //都删除完毕证明，字符匹配
                    count++;
                    list.add(dic[i]);
                }
            }
            System.out.println(count);
            Collections.sort(list);
            if (list.size() >= num) {
                System.out.println(list.get(num - 1));
            }
        }
    }
}
