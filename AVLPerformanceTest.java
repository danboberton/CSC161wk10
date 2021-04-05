// Dan Butcher
// Week 9 Homework
// 4/4/21

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.Scanner;
import chapter25.BST;
import chapter26.AVLTree;


/**
 * This class tests the performance of an AVL tree
 * versus a binary search tree
 */
public class AVLPerformanceTest {

    public static void main(String[] arg){

        // Objects
        Scanner scnr = new Scanner(System.in);
        Random rnd = new Random();

        // Data Structures under test;
        BST<Integer> bst;
        AVLTree<Integer> avlTree;

        // Vars
        int testSize;
        long curTime;
        long elapseTime;
        long[] average;
        OptionalDouble avgResult;
        Double dResult;

        Integer[] intArr; // Test data set

        // Get test size from user
        System.out.println("How many vars to test?");
        testSize = scnr.nextInt();
        intArr = new Integer[testSize];

        for (int i = 0; i < intArr.length; i++){
            intArr[i] = rnd.nextInt();
        }

        // Sort array
        Arrays.sort(intArr);

        // Test Creation
        System.out.println("Tree creation through constructor(E[] objects).\n");

        // BST Tree
        curTime = System.nanoTime();
        bst = new BST<>(intArr);
        elapseTime = System.nanoTime() - curTime;
        System.out.printf("BST constructor() execution time for %d elements is %d nanoseconds.\n", testSize, elapseTime);

        // AVL Tree
        curTime = System.nanoTime();
        avlTree = new AVLTree<>(intArr);
        elapseTime = System.nanoTime() - curTime;
        System.out.printf("AVL constructor() execution time for %d elements is %d nanoseconds.\n\n", testSize, elapseTime);


        // Test Search Time
        // Search each tree for a random number
        // Measure average of n searches
        // n = the size of the data set
        System.out.println("Average element search time comparison.\n");
        average = new long[intArr.length];


        // BST Tree
        for (int i = 0; i < average.length; i++){
            curTime = System.nanoTime();
            bst.search(rnd.nextInt());
            elapseTime = System.nanoTime() - curTime;

            average[i] = elapseTime;
        }

        // Get average of measurement array
        avgResult = Arrays.stream(average).average();
        System.out.printf("BST average search execution time for %d elements is %f nanoseconds.\n", testSize, avgResult.getAsDouble());

        // Reset average array
        average = new long[intArr.length];

        // AVL Tree
        for (int i = 0; i < average.length; i++){
            curTime = System.nanoTime();
            avlTree.search(rnd.nextInt());
            elapseTime = System.nanoTime() - curTime;

            average[i] = elapseTime;
        }

        // Get average of measurement array
        avgResult = Arrays.stream(average).average();
        System.out.printf("AVL average search execution time for %d elements is %f nanoseconds.\n", testSize, avgResult.getAsDouble());

    }

}
