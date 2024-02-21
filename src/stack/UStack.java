package stack;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2024 Your Company. All rights reserved.
 * This file is licensed under the MIT License.
 * See the LICENSE file for details.
 */
class UStack<T> {
    private int len = 0;
    ArrayList<T> arr = new ArrayList<>();
    List<T> l = new ArrayList<>();


    public void push(T n){
        arr.add(n);
        len++;
    }

    public void pop(){
            if (len == 0) {
                System.out.println("stack is empty");
            } else {
                arr.remove(--len);
            }
        }

    public T peek(){
        return arr.get(len-1);
    }

    public int len(){
        return len;
    }
}
