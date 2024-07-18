import java.util.Arrays;
public class InterleaveArrays {
    public static void main(String[] args) {

        //interleaveArrays test cases
        System.out.println(Arrays.toString(interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6})));
        System.out.println(Arrays.toString(interleaveArrays(new int[]{10,20,30,40}, new int[]{2,4,6,8})));
        System.out.println(Arrays.toString(interleaveArrays(new int[]{0, 0, 0, 0, 0}, new int[]{1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(interleaveArrays(new int[]{3, 6, 9, 6, 7, 2}, new int[]{300, 500, 39, 48, 44, 29})));

        //mergeArrays test casees
        System.out.println(Arrays.toString(mergeArrays(new int[]{2, 5, 15, 20, 25, 40}, new int[]{10, 20, 30, 40})));
        System.out.println(Arrays.toString(mergeArrays(new int[]{1,11,31,45,77,78,79,101}, new int[]{2,5,12,80,103,120})));
        System.out.println(Arrays.toString(mergeArrays(new int[]{2, 6, 9, 17, 38}, new int[]{28, 30, 40})));
        System.out.println(Arrays.toString(mergeArrays(new int[]{5, 7, 100}, new int[]{7})));

    }

    public static int[] interleaveArrays(int[] array1, int[] array2){
        int [] interleaveArr = new int[array1.length + array2.length];
        for(int i=0, j=0; j<array1.length; i+=2, j++){
            interleaveArr[i] = array1[j];
            interleaveArr[i+1] = array2[j];
        }
        return interleaveArr;
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {

        int[] mergedArr = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArr[k++] = array1[i++];
            }
            else {
                mergedArr[k++] = array2[j++];
            }
        }

        //if therre is left over in array1(if array1.length > array2.length)
        while (i < array1.length) {
            mergedArr[k++] = array1[i++];
        }

        //if therre is left over in array2(if array2.length > array1.length)
        while (j < array2.length) {
            mergedArr[k++] = array2[j++];
        }

        return mergedArr;
    }
}


/* //try with the for loop..not working..

        int[] merged = new int[array1.length + array2.length];

        int i = 0, j = 0, k = 0;
        for (; i<array1.length && j<array2.length; k++){
            if (array1[i] < array2[j]) {
                merged[k] = array1[i++];
            }
            else{
                merged[k] = array2[j++];
            }
        }

        for (; i<array1.length; i++, k++){
            merged[k] = array1[i];
        }

        for (; i <array2.length; j++, k++){
            merged[k] = array1[j];
        }

        return merged;
    }
}
*/






       
