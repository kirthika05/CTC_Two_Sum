package com.kirthika;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            twoSum(a,m);
        }
    }

    public static void twoSum(int[] prices, int total) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < prices.length; i++) {
            if (map.containsKey(prices[i])) {
                int index = map.get(prices[i]);
                result[0] = index +1;
                result[1] = i+1;
                break;
            } else {
                map.put(total - prices[i], i);
            }
        }
        System.out.printf("%d %d\n",result[0],result[1]);
    }
}
