import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class HJ54 {
    // 中缀转后缀
    //具体转换方式:
    // 1.从左到右进行遍历
    // 2.运算数,直接输出.
    // 3.左括号,直接压入堆栈,(括号是最高优先级,无需比较)(入栈后优先级降到最低,确保其他符号正常入栈)
    // 4.右括号,(意味着括号已结束)不断弹出栈顶运算符并输出直到遇到左括号(弹出但不输出)
    // 5.运算符,将该运算符与栈顶运算符进行比较,
    // 如果优先级高于栈顶运算符则压入堆栈(该部分运算还不能进行),
    // 如果优先级低于等于栈顶运算符则将栈顶运算符弹出并输出,然后比较新的栈顶运算符.
    // (低于弹出意味着前面部分可以运算,先输出的一定是高优先级运算符,等于弹出是因为同等优先级,从左到右运算)
    // 直到优先级大于栈顶运算符或者栈空,再将该运算符入栈.
    // 6.如果对象处理完毕,则按顺序弹出并输出栈中所有运算符.
    // 测试用 3-10+(0+(10+5+3)-10)
    // 5-3+9*6*(6-10-2)
    // -4*(8+100-98)+3
    // 3*(-4*3+13)/(2-1)
    // 2+(4*5+1)*8+7*4+10-9+3+1*9-(6-0*4*4)
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = reader.readLine()) != null) {
            List<String> list = new ArrayList<>();
            Stack<Character> stack = new Stack();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (isNum(c)) {
                    int start = i;
                    if (i == s.length() - 1) {
                        i++;
                    } else {
                        while (isNum(s.charAt(++i))) {
                        }
                    }
                    list.add(s.substring(start, i));
                    i--;
                } else if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else if (c == ')' || c == ']' || c == '}') {
                    //  一直出栈直到遇到左括号
                    while (stack.peek() != '(' && stack.peek() != '[' && stack.peek() != '{') {
                        list.add(String.valueOf(stack.pop()));
                    }
                    stack.pop();
                } else if (c == '-') {
                    if ((i != 0 && (isNum(s.charAt(i - 1)) && isNum(s.charAt(i + 1)))) || (s.charAt(i - 1) == ')' || s.charAt(i - 1) == ']' || s.charAt(i - 1) == '}') || (s.charAt(i + 1) == '(' || s.charAt(i + 1) == '[') || s.charAt(i + 1) == '{') {
                        // 减号
                        while (!greaterThan(c, stack)) {
                            list.add(String.valueOf(stack.pop()));
                        }
                        stack.push(c);
                    } else {
                        // 负号
                        int start = i;
                        while (isNum(s.charAt(++i))) {
                        }
                        list.add(s.substring(start, i));
                        i--;
                    }
                } else if (c == '+') {
                    while (!greaterThan(c, stack)) {
                        list.add(String.valueOf(stack.pop()));
                    }
                    stack.push(c);
                } else if (c == '*' || c == '/') {
                    while (!greaterThan(c, stack)) {
                        list.add(String.valueOf(stack.pop()));
                    }
                    stack.push(c);
                }
            }
            while (!stack.isEmpty()) {
                list.add(String.valueOf(stack.pop()));
            }
            System.out.println(calculate(list));
        }
    }

    public static boolean isNum(char c) {
        return c >= '0' && c <= '9';
    }

    // 比较运算符与栈顶运算符的优先级
    public static boolean greaterThan(char c, Stack<Character> stack) {
        if (stack.isEmpty()) {
            return true;
        } else {
            char c1 = stack.peek();
            if (c == '*' || c == '/') {
                return !(c1 == '*' || c1 == '/');
            } else {
                return c1 == '(' || c1 == '{' || c1 == '[';
            }
        }
    }

    public static int calculate(List<String> list) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            int n1;
            int n2;
            switch (s) {
                case "*":
                    n1 = stack.pop();
                    n2 = stack.pop();
                    stack.push(n1 * n2);
                    break;
                case "/":
                    n1 = stack.pop();
                    n2 = stack.pop();
                    stack.push(n2 / n1);
                    break;
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    n1 = stack.pop();
                    n2 = stack.pop();
                    stack.push(n2 - n1);
                    break;
                default:
                    stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}