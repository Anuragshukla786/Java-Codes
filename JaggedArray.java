//Jagged Array using Enhanced For loop
public class JaggedArray {
    public static void main(String[] args) {
        int num[][]={
                {2,3,4,5},
                {3,4},
                {4,6,7},
        };

        // We are used Enhanced for loop in java




        for (int a[]: num)
        {
            for(int b : a)
            {
                System.out.print(b +" ");
            }
         System.out.println();
        }
    }
}
