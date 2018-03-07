package Array;

/**
 *
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
 * Grid cells are connected horizontally/vertically (not diagonally).
 * The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
 * The island doesn't have "lakes" (water inside that isn't connected to the water around the island).
 * One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 * 注销部分为不可取解法！！
 * 2018年3月7日20:01:51
 */

public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {

        if (grid.length==1&&grid[0].length==1){
            if (grid[0][0]==1)return 4;
            else return 0;
        }

        int vertical=grid.length;
        int horizontal=grid[0].length;
        int incubeline=0;
        int cube=0;
        for (int i=0;i<vertical;i++){
            for (int j=0;j<horizontal;j++){
                if (grid[i][j]==1){
                    cube++;
                    incubeline+=checkaround(grid,i,j);
                }
            }
        }

        System.out.println("cube="+cube+" incubeline="+incubeline);

        return 4*cube-incubeline*2;
    }

    public int checkaround(int[][] grid,int x,int y){
        int count=0;
        if (x<grid.length-1&&grid[x+1][y]==1)count++;
        if (y<grid[0].length-1&&grid[x][y+1]==1)count++;
//        if (x==0){//位于第一行
//            if (y==0){//第一行第一个
//                if (grid.length>=2&&grid[x+1][y]==1)count++;
//                if (grid[0].length>=2&&grid[x][y+1]==1)count++;
//            }else if (y==grid[0].length-1){//第一行最后一个
//                if (grid[x][y-1]==1)count++;
//                if (grid.length>=2&&grid[x+1][y]==1)count++;
//            }else {//第一行中间部分
//                if (grid.length>=2&&grid[x+1][y]==1)count++;
//                if (grid[x][y-1]==1)count++;
//                if (grid[0].length>=2&&grid[0].length>=2&&grid[x][y+1]==1)count++;
//            }
//        }else if (x==grid.length-1){//位于最后一行
//            if (y==0){//最后一行第一个
//                if (grid[x-1][y]==1)count++;
//                if (grid[0].length>=2&&grid[x][y+1]==1)count++;
//            }else if (y==grid[0].length-1){//最后一行最后一个
//                if (grid[x][y-1]==1)count++;
//                if (grid[x-1][y]==1)count++;
//            }else {//最后一行中间部分
//                if (grid[x-1][y]==1)count++;
//                if (grid[x][y-1]==1)count++;
//                if (grid[0].length>=2&&grid[x][y+1]==1)count++;
//            }
//        }else {//中间行
//            //同意验证上下
//            if (grid.length>=2&&grid[x+1][y]==1)count++;
//            if (grid[x-1][y]==1)count++;
//            if (y==0){//第一个少验证左边
//                if (grid[0].length>=2&&grid[x][y+1]==1)count++;
//            }else if (y==grid[0].length-1){//最后一个少验证右边
//                if (grid[x][y-1]==1)count++;
//            }else {//其余验证上下
//                if (grid[x][y-1]==1)count++;
//                if (grid[0].length>=2&&grid[x][y+1]==1)count++;
//            }
//        }

        return count;
    }

    public static void main(String[] args){
        IslandPerimeter islandPerimeter=new IslandPerimeter();
        int[][] grid={{0,0},{1,1},{0,0}};
        System.out.println(islandPerimeter.islandPerimeter(grid));
    }

    /**
     *
     * 解题时仍正思考规律，不能盲目强行遍历，增加多余的工作量且更易出错！！！！！！
     * 2018年3月7日22:30:25
     */

}
