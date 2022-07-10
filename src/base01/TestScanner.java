package base01;

import java.util.Scanner;

/**
 * @BelongsProject: JavaSE
 * @BelongsPackage: base01
 * @Author: xuan
 * @CreateTime: 2022-07-10  22:05
 * @Description: Scanner练习
 * @Version: 1.0
 */
public class TestScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your username: ");
        String name = scanner.next();
        System.out.println("Please input your password: ");
        String password = scanner.next();
        System.out.println("Welcome back, " + name + "!");
    }

}
