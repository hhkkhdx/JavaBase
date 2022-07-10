#### Day1

-----

1. 第一个Java程序 step
```java
/*
 * step1: 编辑代码
 * step2: 编译
 *        javac HelloWorld.java
 * step3: 运行
 *         java HelloWorld
 * */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```
2. JDK的组成
```java
/*
 * 1.JVM: Java虚拟机，真正运行Java程序的地方
 * 2.核心类库: Java自己写好的程序，给程序员自己的程序调用的
 * 3.JRE: Java的运行环境，包括JVM、核心类库
 * 4.JDK: Java开发工具包，包括以上3部分
 * 
 * */
```
3. Java基础语法
    1. 变量
        - 必须先声明后使用
        - 变量声明后，不能存储其它类型的数据
        - 变量的有效范围是从定义开始到`}`结束，且在同一个范围内部不能定义两个同名变量
        - 定义时可以没有初始值，但是使用时**必须要有初始值**
    2. 数据类型
        - 基本数据类型
        - 引用数据类型
    3. 关键字 标识符
        - 不能用来作为类名或者变量名
        - 标识符: 由数字、字母、下划线和美元符等组成，不能以数字开头
    
    4. 类型转换
        1. 自动类型转换
            - 类型范围小的变量，可以直接赋值给类型大的变量
            - 表达式中的自动类型转换：由表达式中的最高类型决定，byte、short、char是直接转换成int运算的
                ```java
                // 面试题 问: 用什么类型结束 i + j的和
                byte i = 10;
                byte j = 20;
                //        byte result = res1 + res2;    // 报错: 会转换为int计算
                int result = i + j;
                ```
        2. 强制类型转换
            - 大范围的变量赋值给小范围的变量
            - 可能造成数据的溢出或丢失
            - 浮点型转整型，直接丢掉小数部分
                ```java
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
                ```
    5. 运算符
        - 优先级问题：

    

