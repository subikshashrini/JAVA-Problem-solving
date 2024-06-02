import java.util.*;
public class purplecap{

    public static double purplecaphold(double[] heights) {
        for(int i=1;i<heights.length;i++){
            for(int j=0;j<heights.length-1;j++)
            {
                if(heights[j]>heights[j+1])
                {
                    double temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1]=temp;
                }
            }
        }
        int middleIndex = heights.length / 2;
        return heights[middleIndex];
    }

    public static void main(String[] args)
    {
        double[] heights1 = {5.5, 6.2, 5.7, 7.1, 4.9, 5.0, 5.3};
        System.out.println(purplecaphold(heights1));

        double[] heights2 = {6.0, 7.0, 5.0};
        System.out.println(purplecaphold(heights2));
    }
}

