package com.cat;

public class BinaryTreeElement {
    private int value;
    private BinaryTreeElement right;
    private BinaryTreeElement left;

    public BinaryTreeElement(int value, BinaryTreeElement right, BinaryTreeElement length) {
        this.value = value;
        this.right = right;
        this.left = length;
    }

    public static BinaryTreeElement newBinaryTreeElement(int value) {
        return new BinaryTreeElement(value, null, null);
    }

    public static void print(BinaryTreeElement binaryTreeElement) {
        if (binaryTreeElement == null) {
            return;
        }
        print(binaryTreeElement.left);
        System.out.print("[" + binaryTreeElement.value + "]");
        print(binaryTreeElement.right);
    }

    public static BinaryTreeElement mergeBinaryTrees(BinaryTreeElement binaryTreeElement1, BinaryTreeElement binaryTreeElement2) {
        if (binaryTreeElement1 == null) {
            return binaryTreeElement2;
        }
        if (binaryTreeElement2 == null) {
            return binaryTreeElement1;
        }
        binaryTreeElement1.value += binaryTreeElement2.value;
        binaryTreeElement1.left = mergeBinaryTrees(binaryTreeElement1.left, binaryTreeElement2.left);
        binaryTreeElement1.right = mergeBinaryTrees(binaryTreeElement1.right, binaryTreeElement2.right);
        return binaryTreeElement1;
    }

    public static void main(String[] args) {
        BinaryTreeElement binaryTreeElement1 = newBinaryTreeElement(1);
        binaryTreeElement1.left = newBinaryTreeElement(3);
        binaryTreeElement1.right = newBinaryTreeElement(2);
        binaryTreeElement1.left.left = newBinaryTreeElement(5);
        System.out.print("First binary tree is ");
        print(binaryTreeElement1);
        System.out.println();
        BinaryTreeElement binaryTreeElement2 = newBinaryTreeElement(2);
        binaryTreeElement2.right = newBinaryTreeElement(3);
        binaryTreeElement2.left = newBinaryTreeElement(1);
        binaryTreeElement2.left.right = newBinaryTreeElement(4);
        binaryTreeElement2.right.right = newBinaryTreeElement(7);
        System.out.print("Second binary tree is ");
        print(binaryTreeElement2);
        System.out.println();
        BinaryTreeElement binaryTreeElement3 = mergeBinaryTrees(binaryTreeElement1, binaryTreeElement2);
        System.out.print("Merge of first and second trees is ");
        print(binaryTreeElement3);
        System.out.println();
    }
}
