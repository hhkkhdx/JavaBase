### JavaSE 基础

-----
<br>

#### Day1 <!-- 2021.07.10  -->

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
        
    