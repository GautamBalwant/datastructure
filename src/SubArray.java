public class SubArray {


    static int[] countSubarrays(int[] arr) {
        // Write your code here
        int[] result = new int[arr.length];
        int previous=arr[0];
        int previousCount=1;

        int maxIndex=0;
        result[0]= 1;
        int currentMax=arr[0];


        for(int i=1;i<result.length;i++){

            int current = arr[i];
            int max= 0;
            int index=0;

            if(current> previous){
                previousCount = previousCount+1;
                result[i]= previousCount;
                max= current;
                index=i;

            }else{
                max=previous;
                result[i-1]=  previousCount+1;
                previousCount=1;
                result[i]=1;
                index=i-1;
            }
            previous=current;


                if(max>currentMax){
                    currentMax= max;
                    maxIndex=index;
                   // result[maxIndex]= result[maxIndex]+1;
                }
            result[maxIndex]= i+1;






        }


        return result;

    }

    public static void main(String args[]) {
        // int[] array= {3, 4, 5, 6, 9, 3, 1};

        int[] test_1 = {3, 4, 1, 6, 2};
        int[] expected_1 = {1, 3, 1, 5, 1};
        int[] output_1 = countSubarrays(test_1);
        check(expected_1, output_1);

        int[] test_2 = {2, 4, 7, 1, 5, 3};
        int[] expected_2 = {1, 2, 6, 1, 3, 1};
        int[] output_2 = countSubarrays(test_2);
        check(expected_2, output_2);

        // Add your own test cases here

        int[] test_3 = {3, 4,5,1,2};
        int[] expected_3 = {1, 2,5,1,2};
        int[] output_3 = countSubarrays(test_3);
        check(expected_3, output_3);

    }


    static void check(int[] expected, int[] output) {
        int expected_size = expected.length;
        int output_size = output.length;
        boolean result = true;
        if (expected_size != output_size) {
            result = false;
        }
        for (int i = 0; i < Math.min(expected_size, output_size); i++) {
            result &= (output[i] == expected[i]);
        }
        char rightTick = '\u2713';
        char wrongTick = '\u2717';
        if (result) {
            System.out.println(rightTick + " Test #" );
        }
        else {
            System.out.print(wrongTick + " Test #"  + ": Expected ");
            printIntegerArray(expected);
            System.out.print(" Your output: ");
            printIntegerArray(output);
            System.out.println();
        }

    }
    static void printIntegerArray(int[] arr) {
        int len = arr.length;
        System.out.print("[");
        for(int i = 0; i < len; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
    }
}
