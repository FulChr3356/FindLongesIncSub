package io.fulchr3356;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));
        list.add(random.nextInt(100));


        for(Integer i : list){ // List the integers in the array to test
            System.out.print(i + ", ");
        }
        System.out.print("\nLongest Increasing Subsequence:\n");


        System.out.println(FindLongestSub.findLongestSub(list));


	// write your code here
    }
}
