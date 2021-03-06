package base.day13_正则表达式;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xiao儿
 * @date 2019/9/3 20:49
 * @Description RegexDemo
 */
public class RegexDemo {
    /**
     * 没有使用正则表达式来检查字符串是否由数字组成
     */
    @Test
    public void test1() {
        String s = "5201314";
        char[] chars = s.toCharArray();
        boolean flag = true;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("是由数字组成");
        } else {
            System.out.println("不是由数字组成");
        }
    }

    @Test
    public void test2() {
        // 创建一个匹配模式（模板）
        Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("aaaaab");
        boolean b = matcher.matches();
        System.out.println(b);
    }

    @Test
    public void test3() {
        String s = "5201314";
        boolean b = s.matches("[0-9]+");
        boolean b1 = s.matches("\\d+");
        System.out.println(b + "-" + b1);
    }
}
