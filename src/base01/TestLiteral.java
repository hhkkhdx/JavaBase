package base01;

/**
 * @BelongsProject: JavaSE
 * @BelongsPackage: base01
 * @Author: xuan
 * @CreateTime: 2022-07-10  05:23
 * @Description: 字母量
 * @Version: 1.0
 */
public class TestLiteral {
    public static void main(String[] args) {
        // 1. 整数
        System.out.println(666);

        // 2. 小数
        System.out.println(99.5);

        // 3. 字符: 必须用单引号引起来，且有且只有一个字符
        System.out.println('b');
        System.out.println('a');
        System.out.println(' '); // 空字符
//        System.out.println(''); // 这种写法错误
        // 特殊字符:  \n 换行， \t 代表一个tab
        System.out.println("11\n2");
        System.out.println("11\t2");

        // 4. 字符串: 必须用双引号引起来，里面内容随意
        System.out.println("hello");

        // 5. 布尔值
        System.out.println(true);
        System.out.println(false);
    }
}
