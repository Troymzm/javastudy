package com.superOOP.exception_;

/**
 * @author mzm
 * @version 1.0
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        /*
        1. 如果发生异常 异常后面的代码块不会执行 直接进入catch
        2. 如果异常没有发生 则顺序执行try代码块 不会进入catch
        3. 如果希望不管是否发生异常 都执行某段代码(比如关闭连接 释放资源等) 使用finally
        4. 如果try代码块可能有多个异常 可以使用多个catch分别捕获不同的异常 相应处理
        5. 要求子类异常写在父类异常前面
        6. finally 必须执行
         */
        try {
            Person person = new Person();
            // person = null;
            System.out.println(person.getName());
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }

        try {
            String str = "aaron";
            int a = Integer.parseInt(str);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally 代码块被执行");
        }

        System.out.println("程序继续运行");
    }
}
class Person {
    private String name = "jack";

    public String getName() {
        return name;
    }
}