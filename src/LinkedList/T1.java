package LinkedList;

import java.util.*;

/**
 * Copyright (c) 2024 Your Company. All rights reserved.
 * This file is licensed under the MIT License.
 * See the LICENSE file for details.
 */
public class T1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        List<Integer> l1 = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();

        l1.add(10);
        l1.add(20);
        q.add(50);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.remove();
        System.out.println(q.toString() + q.size());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);

        pq.remove();
//        System.out.println(pq.toString());



        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.remove(2);
//        System.out.println(ll.toString());
    }
}
