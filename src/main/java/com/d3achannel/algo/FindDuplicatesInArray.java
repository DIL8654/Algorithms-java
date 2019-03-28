package com.d3achannel.algo;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInArray {
	
	public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                res.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return res;
    }
	
	public static void main(String[] args) {
		int[] a = {4,3,2,7,8,2,3,1};
		findDuplicates(a);
	}



}
