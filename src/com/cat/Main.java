package com.cat;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Homework_number_8");
        System.out.println("Task_1");
        Scanner w = new Scanner(System.in);
        int number;
        System.out.println("Enter number for create Fibonacci`s numbers");
        number = w.nextInt();
        System.out.println("Your number is " + number);
        System.out.println("Fibonacci`s numbers are ");
        numbersFibonacci(number);
        System.out.println("Task_2");
        System.out.println("Join binary trees");
        BinaryTree binaryTree1 = new BinaryTree();
        binaryTree1.add(1);
        binaryTree1.add(3);
        binaryTree1.add(2);
        binaryTree1.add(5);
        System.out.println("First binary tree is " + binaryTree1);
        BinaryTree binaryTree2 = new BinaryTree();
        binaryTree2.add(2);
        binaryTree2.add(1);
        binaryTree2.add(3);
        binaryTree2.add(4);
        binaryTree2.add(7);
        System.out.println("Second binary tree is " + binaryTree2);
        joinBinaryTrees(binaryTree1, binaryTree2);
    }

    public static void numbersFibonacci(int n) {
        int number1 = 1;
        int number2 = 1;
        int fibonacciNumber;
        System.out.print("[" + number1 + "]" + "[" + number2 + "]");
        for (int i = 0; i < n; i++) {
            fibonacciNumber = number1 + number2;
            number1 = number2;
            number2 = fibonacciNumber;
            System.out.print("[" + fibonacciNumber + "]");
        }
        System.out.println();
    }

    public static void joinBinaryTrees(BinaryTree tree1, BinaryTree tree2) {
        Object[] arrayTree1 = tree1.createBinaryTreeList().toArray();
        Object[] arrayTree2 = tree2.createBinaryTreeList().toArray();
        BinaryTree binaryTree = new BinaryTree();
        for (int i = 0; i < arrayTree1.length; i++) {
            binaryTree.add((Integer) arrayTree1[i]);
        }
        for (int i = 0; i < arrayTree2.length; i++) {
            binaryTree.add((Integer) arrayTree2[i]);
        }
        System.out.println("Array of elements of first binary tree is " + Arrays.toString(arrayTree1));
        System.out.println("Array of elements of second binary tree is " + Arrays.toString(arrayTree2));
        System.out.println("Join of first and second tree is " + binaryTree);
    }
}
