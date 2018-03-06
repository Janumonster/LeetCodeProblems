package Array;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that
 * the distance between i and j equals the distance between i and k (the order of the tuple matters).
 * Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).
 */
public class Boomerangs {
    public int numberOfBoomerangs(int[][] points) {
        HashMap<Integer,Integer> distance=new HashMap<Integer, Integer>();
        int num=0;

        if (points.length<3)return 0;
        for (int i=0;i<points.length;i++) {
            for (int j=0;j<points.length;j++){
                if (j==i)continue;
                int dis=(points[i][0]-points[j][0])*(points[i][0]-points[j][0])+(points[i][1]-points[j][1])*(points[i][1]-points[j][1]);
//                System.out.println(dis);
                if (distance.containsKey(dis)){
                    int d=distance.get(dis);
//                    System.out.println("i="+i+" j="+j+" d="+d);
                    d++;
                    distance.put(dis,d);
                }else {
                    distance.put(dis,1);
                }
            }
            Iterator iter=distance.values().iterator();
            while (iter.hasNext()){
                int count=(int)iter.next();
//                System.out.println("i="+i+" count="+count);
                if (count>=2){
                    num+=count*(count-1);
//                    System.out.println("num="+num);
//                    System.out.println("---------------");
                }
            }
            distance.clear();
        }
        return num;
    }

    public static void main(String[] args){
        int[][] points={{3,6},{7,5},{3,5},{6,2},{9,1},{2,7},{0,9},{0,6},{2,6}};
        Boomerangs boomerangs=new Boomerangs();
        System.out.println(boomerangs.numberOfBoomerangs(points));
    }
    /**
     * 每次选取一个点作为重点，用一个hash表记录其余的点到该点的距离，统计相同距离的次数，大于2次的可以满足题目要求，通过次数*次数减一获得该点的满足条件的个数
     * 遍历这个数组，求出每个点的个数累加可得
     * 时间复杂度O(n2),空间复杂度O(n);
     *
     */
}
