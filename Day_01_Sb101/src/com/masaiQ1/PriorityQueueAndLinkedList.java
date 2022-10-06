package com.masaiQ1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueAndLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 java.util.LinkedList is a doubly-linked list implementation of the List and Deque 
		 interfaces. Implements all optional list operations, and permits all elements (including null).

		  java.util.PriorityQueue is an unbounded priority queue based on a priority heap. 
		  The elements of the priority queue are ordered according to their natural ordering, 
		  or by a Comparator provided at queue construction time, depending on which constructor
		   is used. A priority queue does not permit null elements. A priority queue relying on
		    natural ordering also does not permit insertion of non-comparable objects (doing 
		    so may result in ClassCastException).
		 */
		

        int len = 5;
        Random random = new Random();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(len);
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Random number generated:");
        for (int i = 0; i < len; i++) {
            Integer randomNumber = new Integer(random.nextInt(100));
            linkedList.add(new Integer(randomNumber));
            priorityQueue.add(new Integer(randomNumber));
            System.out.println(i + ": " + randomNumber);
        }
        System.out.println("Number in linkedList:");
        for (int i = 0; i < len; i++) {
            Integer item = linkedList.poll();
            System.out.println(i + ": " + item);
        }
        System.out.println("Number in priorityQueue:");
        for (int i = 0; i < len; i++) {
            Integer item = priorityQueue.poll();
            System.out.println(i + ": " + item);
        }

	}

}
