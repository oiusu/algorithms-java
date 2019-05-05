package com.study.algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 111
 * Created by chenc on 2019-05-03
 */
class Test1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map =  new HashMap();

        int y;
        for(int i =0 ; i<nums.length ; i++){
            y = target - nums[i];
            if(map.containsKey(y)){
                return new int[]{map.get(y),i};
            }
            map.put(nums[i],i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        Test1 test = new Test1();
        int[] nums = {11, 7, 2, 15};
        int target = 9;
        int[] ints = test.twoSum(nums, target);
        System.out.println(ints.toString());
    }
}
