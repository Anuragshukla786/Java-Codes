public class TwoDarray {
    public static void main(String[] args) {

        int nums[][]={
                      {2,3,6},
                      {4,5},
                      {5,6,8},
        };

        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                System.out.print(nums[i][j] +" ");
            }
            System.out.println();
        }


    }
}
