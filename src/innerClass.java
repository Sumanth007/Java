import java.util.concurrent.ExecutionException;

/**
 * Copyright (c) 2024 Your Company. All rights reserved.
 * This file is licensed under the MIT License.
 * See the LICENSE file for details.
 */
public class innerClass {
    private class one{
        static int b = 10;
        int a = 10;
        public one() {
        }

    }


    class two{
        int b = 10;
        Integer a = b;

    }

    public void main(String[] args) throws Exception {
        innerClass obj = new innerClass();
//        System.out.println(obj.one.a);

        one obj2 = new one();


    }

    public void fun() throws Exception{

    }
}
