package com.cat;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    private class TreeElement {
        private int value;
        private TreeElement right;
        private TreeElement left;

        public TreeElement(int value) {
            this.value = value;
        }
    }

    private TreeElement headerTreeElement;

    public void add(int value) {
        TreeElement treeElement = new TreeElement(value);
        if (headerTreeElement == null) {
            headerTreeElement = treeElement;
        } else {
            addToTree(headerTreeElement, treeElement);
        }
    }

    public void addToTree(TreeElement headerTreeElement, TreeElement treeElement) {
        if (treeElement.value < headerTreeElement.value) {
            if (headerTreeElement.left == null) {
                headerTreeElement.left = treeElement;
            } else {
                addToTree(headerTreeElement.left, treeElement);
            }
        } else if (treeElement.value > headerTreeElement.value) {
            if (headerTreeElement.right == null) {
                headerTreeElement.right = treeElement;
            } else {
                addToTree(headerTreeElement.right, treeElement);
            }
        }
    }

    public List<Integer> createBinaryTreeList() {
        List<Integer> binaryTreeList = new ArrayList<>();
        addToBinaryTreeList(headerTreeElement, binaryTreeList);
        return binaryTreeList;
    }

    private void addToBinaryTreeList(TreeElement treeElement, List<Integer> binaryTreeList) {
        if (treeElement == null) {
            return;
        }
        addToBinaryTreeList(treeElement.left, binaryTreeList);
        binaryTreeList.add(treeElement.value);
        addToBinaryTreeList(treeElement.right, binaryTreeList);
    }


    @Override
    public String toString() {
        List<Integer> list = createBinaryTreeList();
        StringBuilder resultBinaryTree = new StringBuilder();
        boolean firstAdded = false;
        for (Integer value : list) {
            if (firstAdded) {
                resultBinaryTree.append("");
            } else {
                firstAdded = true;
            }
            resultBinaryTree.append("[" + String.valueOf(value) + "]");
        }
        return resultBinaryTree.append("").toString();
    }
}
