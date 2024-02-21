package OOPS;

/**
 * Copyright (c) 2024 Your Company. All rights reserved.
 * This file is licensed under the MIT License.
 * See the LICENSE file for details.
 */
public enum size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
}
class Main {
    public static void main(String[] args) {
        System.out.println(size.SMALL);
        System.out.println(size.MEDIUM);

        size a = size.MEDIUM;
        System.out.println(a);
    }
}