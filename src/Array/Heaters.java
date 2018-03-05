package Array;

/**
 * 先找和house距离最小的heater，在从中选出最的的distance
 * 但时间复杂度过高
 * 网友解法备注在后
 */

import java.util.Arrays;

public class Heaters {

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        Arrays.sort(houses);
        int minRadius=Integer.MIN_VALUE;
        for (int postion:houses
             ) {
            int distance=Integer.MAX_VALUE;//循环次数过多
            for (int i=0;i<heaters.length;i++){
                if (Math.abs(postion-heaters[i])<distance){
                    distance=Math.abs(postion-heaters[i]);
                }
            }

            if (minRadius<distance) {
                minRadius = distance;
            }
        }

        return minRadius;
    }

    public static void main(String[] args){
        int[] houses={1,1,1,1,1,999,999,999,999};
        int[] heters={499,500,501};
        Heaters heaters=new Heaters();
        System.out.println(heaters.findRadius(houses,heters));
    }
}
/**
 * 总体思路相同
 * public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int result = Integer.MIN_VALUE;

        for (int house : houses) {
        int index = Arrays.binarySearch(heaters, house);---------------------找出heater中不大于house的下标
        if (index < 0) {
        index = -(index + 1);
        }
        int dist1 = index - 1 >= 0 ? house - heaters[index - 1] : Integer.MAX_VALUE;------左边距离
        int dist2 = index < heaters.length ? heaters[index] - house : Integer.MAX_VALUE;------右边距离

        result = Math.max(result, Math.min(dist1, dist2));
        }

        return result;
    }
 *
 */