package Array;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int count=0;
        int max=0;

        if (nums.length==0)return 0;

        for (int i:nums) {
            if (i==1){
                count++;
                if (count>max)max=count;
            }else{
                count=0;
            }
        }

//        for (int i=0;i<nums.length;i++){
//            if (nums[i]==1){
//                count++;
//                if (count>max)max=count;
//            }else{
//                count=0;
//            }
//
//        }

        return max;
    }

    public static void main(String[] args){
        int[] nums={1,1,0,0,1};
        MaxConsecutiveOnes maxConsecutiveOnes=new MaxConsecutiveOnes();
        System.out.println(maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }
}
