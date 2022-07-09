package base01;

public class TestLiteral {
    public static void main(String[] args) {
        // 1.整数
        System.out.println(666);

        // 2.小数
        System.out.println(99.5);


        System.out.println('b'); // 3.字符: 必须用单引号引起来，且有且只有一个字符
        System.out.println('a');
        System.out.println(' '); // 空字符
//        System.out.println(''); // 这种写法错误

        // 4.特殊字符:  \n 换行， \t 代表一个tab
        System.out.println("11\n2");
        System.out.println("11\t2");
    }
}
