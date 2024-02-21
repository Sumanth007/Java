package stack;

import java.util.ArrayList;

/**
 * Copyright (c) 2024 Your Company. All rights reserved.
 * This file is licensed under the MIT License.
 * See the LICENSE file for details.
 */
public class Driver {
    public static void main(String[] args) {
        UStack<Integer> s = new UStack<>();
//        s.pop();
        s.push(10);
        s.push(20);
//        s.pop();
        System.out.println(s.peek());
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
