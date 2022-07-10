package base01;

/**
 * @BelongsProject: JavaSE
 * @BelongsPackage: base01
 * @Author: xuan
 * @CreateTime: 2022-07-10  14:45
 * @Description: 数据类型
 * @Version: 1.0
 */
public class TestVariable {
    public static void main(String[] args) {
        // 1.byte: 占一个字节 -128 ~ 127
        byte number = 98;
        System.out.println(number);
//        byte number2 = 128; // 报错

        // 2.short短整型 占2个字节
        short money = 30000;
//        short money2 = 32768; // 报错

        // 3.int整型 默认的数据类型 占4个字节 默认使用
        int it = 120000;

        // 4.long长整型 占8个字节
        long lg = 133234124;
        // 注意: 随便写一个整数字面量默认是int类型 它虽然没有超过long的范围 但超过了int范围
//        long lg2 = 13333312134; // 报错
        long lg3 = 13333312134L;

        // 5.浮点型 float-4字节  double-8字节
        // 注意: 随便写一个小数字面量 默认是double类型 如果需要float 需要在后面加上f
//        float f1 = 98.5; // 报错
        float f1 = 98.5f;
        double d1 = 99.99;
        double d2 = 99.99d;

        // 6.字符类型 char
        char ch = 'a';
        char ch2 = '中';
//        char ch3 = '中国'; // 报错

        // 7.布尔类型 boolean
        boolean rs = true;
        boolean rs2 = false;

        // 8.引用数据类型
        String name = "zhangsan";
    }
}
