package base01;

/**
 * @BelongsProject: JavaSE
 * @BelongsPackage: base01
 * @Author: xuan
 * @CreateTime: 2022-07-10  20:12
 * @Description: 自动类型转换
 * @Version: 1.0
 */
public class TestType {
    public static void main(String[] args) {
        // 1. 类型范围小的变量 可以直接赋值给类型范围大的变量
        byte a = 20;
        System.out.println(a);
        int b = a;  // 发生了自动类型转换
        System.out.println(b);

        int age = 23;
        double age2 = age;
        System.out.println(age);
        System.out.println(age2);

        char ch = 'a';
        int code = ch;
        System.out.println(code);  // 97

        // 2. 表达式中的自动类型转换
        byte num1 = 10;
        int num2 = 20;
        double num3 = 1.0;
//        int rs= num1 + num2 + num3; // 报错
        double rs2 = num1 + num2 + num3;

//        int num4 = num1 + num3 - 2.3;   // 报错
        double num4 = num1 + num3 - 2.3;

        // 面试题 问: 用什么类型结束 i + j的和
        byte i = 10;
        byte j = 20;
//        byte result = res1 + res2;    // 报错: 会转换为int计算
        int result = i + j;

        // 强制类型转换
        int n1 = 20;
        byte n2 = (byte) n1;
        System.out.println(n2); // 20

        /*
        * 输出-36:
        *   1. 1500的二级制数为: 101 1101 1100 -->  原码
        *   2. 1500存储在计算机的数为:  010 0010 0100  -->  补码
        *   3. n4存储在计算机的值: 0010 0100  -->  补码
        *   4. 输出n4: 1101 1100  -->  原码 1为符号位 即-36
        * */
        int n3 = 1500;
        byte n4 = (byte) n3;
        System.out.println(n4); // -36
    }
}
