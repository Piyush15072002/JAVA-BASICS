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
    }
}
