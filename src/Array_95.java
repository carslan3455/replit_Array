public class Array_95 {
    public static void main(String[] args)
    {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        System.out.println(diffHiLo(a)); //should print 12
    }
    public static int diffHiLo(int[][] array)
    {
        int max =array[0][0];
        int min =array[0][0];

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                    max = Math.max(max,array[i][j]);
                    min = Math.min(min,array[i][j]);
            }
        }
        return max-min;
    }
}
