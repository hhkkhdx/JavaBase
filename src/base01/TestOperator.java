package base01;

/**
 * @BelongsProject: JavaSE
 * @BelongsPackage: base01
 * @Author: xuan
 * @CreateTime: 2022-07-10  20:54
 * @Description: 基本的算术运算符使用
 * @Version: 1.0
 */
public class TestOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);  // 3.33333, 表达式的最终结果由最高类型决定
        System.out.println(a % b);

        System.out.println(3 / 2);  // 1
        System.out.println(3 * 1.0 / 2);    // 1.5
        System.out.println(3 / 2 * 1.0);    // 1.0 自左向右
    }
}
