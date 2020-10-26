package org.zhouhy.regularexpression;

import org.junit.Assert;
import org.junit.Test;


/**
 * .	Any character (may or may not match line terminators), 任意字符
 * X?	X, once or not at all       零个或一个
 * X*	X, zero or more times       零个或多个
 * X+	X, one or more times        一个或多个
 * X{n}	X, exactly n times          x出现n次
 * X{n,}	X, at least n times     x出现至少n次
 * X{n,m}	X, at least n but not more than m times 出现n~m次
 *
 */
public class RegularExpressionTest {

    /**
     * (0-9)表示匹配"0-9"本身，它就是一个字符串和String reg1 = "0-9"; 没有区别
     * */
    @Test
    public void test1(){
        String reg1 = "(0-9)";
        String str1 = "0-9";
        Assert.assertTrue(str1.matches(reg1));
    }

    /**
     * [0-9] 表示0到9之间的数字 默认的个数是1个
     * [0-9]+ 表示0到9之间的数字一个或多个
     * */
    @Test
    public void test2(){
        String reg2 = "[0-9]";
        String str2 = "3";
        Assert.assertTrue(str2.matches(reg2));
    }

    /**
     * windows 后面要跟至少一个字符(.{1,}), 这些字符必须是95,98,NT,2000里面任意选一个
     * */
    @Test
    public void test3(){
        String reg3 = "windows(?=95|98|NT|2000).{1,}";
        String str3 = "windows2000";
        //Assert.assertTrue(str3.matches(reg3));
        System.out.println(str3.matches(reg3));
    }

    @Test
    public void test4(){
        String reg4 = "sin(?=M\\.).{2}";
        String str4 = "sinM.";
        System.out.println(str4.matches(reg4));
    }


    /**
     * re 后面要跟至少一个字符(.{1,}), 这些字符必须是gular,所以这里是false
     * */
    @Test
    public void test5(){
        String reg5 = "re(?=gular).{1,}";
        String str5 = "reg"; //false
        System.out.println(str5.matches(reg5));
    }

    /**
     * ^$ 这个不用说了，正则的定界符和匹配字符串的开始(^)和结束($)
     * .{6,}，这个也好懂，那个点儿（.）代表任意的字符，只要至少有6位就OK
     * .*\d 必须有一个数字, .*[a-zA-Z] 必须要有一个字母
     * (?=.*\d)的意思是，有一个东西，它的后面必须匹配.*\d
     * 同理 (?=.*[a-zA-Z]) 有一个东西，它的后面必须要匹配 .*[a-zA-Z]
     * (?=.*\d)(?=.*[a-zA-Z]).{6,} 有一个东西，它后面既要匹配.*[a-zA-Z] 也要匹配.*\d 而且长度不小于6位
     * */
    @Test
    public void test6(){
        String reg6 = "^(?=.*\\d)(?=.*[a-zA-Z]).{6,}$";
        String str6 = "1a1bcD";
        System.out.println(str6.matches(reg6));
    }

    /**
     * 后面必须要加.{1,} 否则不行
     * */
    @Test
    public void test7(){
        String reg7 = "ab(?=[A-Z]).{1,}";
        String str7 = "abZW863";
        System.out.println(str7.matches(reg7));
    }
}
