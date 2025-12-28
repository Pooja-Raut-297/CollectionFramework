package com.example.demo;

import java.sql.Array;
import java.util.Arrays;

public class ArrayAndList {
    public static int[] twoSum(int[] nums, int target) {
        int[] targetIndexArr = new int[2];

        for(int i = 0 ; i < nums.length ; i++){
            int firstTarIndex;
            int secondTarIndex;
            System.out.println("index  i = "+i+" /nums = "+nums[i]);
            targetIndexArr[0] = i;
            int tobeSearched = target - nums[i];
            boolean flag = false;

            for(int j = i+1 ; j < nums.length ; j++) {
                System.out.println("index  j = "+j+" /nums = "+nums[j]);
                targetIndexArr[1] = j;
                if (tobeSearched == nums[j]) {
                    flag = true;
                    break;
                }
            }
            if(flag == true)
            break;
        }
        Arrays.stream(targetIndexArr).forEach(System.out::print);
//        System.out.println("firstTarIndex: "+firstTarIndex+ " /");

        //logic
        //tar =6
        //given arr = 1 2 3 4 0
        //tar2ind = [_,_]

        //g_arr = loop with int i = 0 i < arr.size
        // i=0 //val 1
        // tar(6) - val(1) = 5
        // loop with int j = i+1 j<arr.size
        // to be searche = 5
        // j = 1 //val 2 nomatch
        // j = 2 //val 3 nm
        //j = 3 //val 4  nm
        //j = 4 //val 0 nm
        //j return with no match(5)
        //goto i ===========
        //i = 1 //val 2
        //tar(6) - val(2) = 4
        //  j = i + 1 = 2
        // j =2 //val 3 no match
        //j =3 //val 4 MATCH
        //j return with match and index of match (3)

        //index i and index j
        //answer tar2ind = [ind i(1) // 2, ind j(3) // 4] == tar (6)



        return targetIndexArr;
    }

    public static void main(String[] args) {
        int target = 6;
        int[] nums = {3,3};

        twoSum(nums,target);
    }
}
//problem statement
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//        You can return the answer in any order.
//        Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//        Example 2:
//
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
//        Example 3:
//
//        Input: nums = [3,3], target = 6
//        Output: [0,1]
