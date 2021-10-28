import java.util.Arrays;

public class FieldPrinter {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {2, 3, 4};
        System.out.println("input :\n" + Arrays.toString(a) + "\n" + Arrays.toString(b)+"\n");
        //{ 1, 4 }

        //new XORed array creating
        int counter = 0;
        for (int ints : a) {
            if (!Arrays.toString(b).contains(String.valueOf(ints)))
                counter++;
        }
        for (int ints : b) {
            if (!Arrays.toString(a).contains(String.valueOf(ints)))
                counter++;
        }


        //filling the array
        int[] xor = new int[counter];
        int i = 0;
        for (int ints : a) {

            if (!Arrays.toString(b).contains(String.valueOf(ints))) {
                xor[i] = ints;
                i++;
            }
        }
        for (int ints : b) {

            if (!Arrays.toString(a).contains(String.valueOf(ints))) {
                xor[i] = ints;
                i++;
            }
        }

        System.out.println("result " + Arrays.toString(xor));


    }
}
