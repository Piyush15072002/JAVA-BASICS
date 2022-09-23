import java.util.Arrays;

public class Array {
        public static void main(String[] args) throws Exception {

                // Arrays are like list which contains the values

                // To create an Array in JAVA, use the datatype int[]
                // since the arrays are reference type, so u need to allocate the memory using
                // 'new' keyword, then specify the size of the array

                int[] fightersPower = new int[5];

                System.out.println(fightersPower);

                // Adding items in the array
                fightersPower[0] = 100;
                fightersPower[1] = 100;
                fightersPower[2] = 50;
                fightersPower[3] = 70;
                fightersPower[4] = 100;

                // this will just print the address of the memory
                System.out.println(fightersPower);

                // but how can u see the actual items in the arrays
                // to do that, there is a class in JAVA that allows us called as "Array" which
                // comes under the java.utils, this class comes with many methods as well

                System.out.println(Arrays.toString(fightersPower));

                // ! Another way to make an array is

                int[] age = { 21, 22, 22, 25, 25 };

                // to know its length
                System.out.println(age.length);

                // To sort

                Arrays.sort(age);

                System.out.println(Arrays.toString(age));

                // ! Multidimensional Arrays

                // 2 D array (Matrix)

                int[][] area = new int[3][3]; // 3x3 matrix

                // if you print this 2D array, u will just get the address and not the actual
                // data
                System.out.println(Arrays.toString(area));

                // using this, u can print the 2d array
                System.out.println(Arrays.deepToString(area));

                // to add the values
                area[0][0] = 100;
                area[1][1] = 100;
                area[2][2] = 100;

                System.out.println(Arrays.deepToString(area));

                // Another way to make the array

                int[][] subMarks = {
                                {
                                                100, 70
                                },
                                {
                                                90, 80, 50, 60
                                }
                };

                System.out.println(Arrays.deepToString(subMarks));

                // 3d array

                int[][][] house = new int[5][5][5];

                house[0][0][0] = 100;
                house[1][1][1] = 100;
                house[2][2][2] = 100;

                // to print
                System.out.println(Arrays.deepToString(house));

        }
}
