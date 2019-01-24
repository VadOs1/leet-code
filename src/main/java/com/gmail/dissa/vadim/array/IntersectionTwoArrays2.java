package com.gmail.dissa.vadim.leet.array;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Given two arrays, write a function to compute their intersection.
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.*/

public class IntersectionTwoArrays2 {
	public int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : nums1) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int k : nums2) {
			if (map.containsKey(k)) {
				if (map.get(k) > 1) {
					map.put(k, map.get(k) - 1);
				} else {
					map.remove(k);
				}
				list.add(k);
			}
		}

		return list.stream().mapToInt(i -> i).toArray();
	}
}
