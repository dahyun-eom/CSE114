
public class EliminateDuplicates{
    public static void main(String[] args) {
        System.out.println("Test 1: range 25, count 50");
        testEliminateDuplicates(25, 50);

        System.out.println();

        System.out.println("Test 2: range 5, count 0");
        testEliminateDuplicates(5, 0);

        System.out.println();

        System.out.println("Test 3: range 100, count 10");
        testEliminateDuplicates(100, 10);

        System.out.println();

        System.out.println("Test 4: range 100, count 2");
        testEliminateDuplicates(100, 2);

    }

    // return array that contains both the filtered elements and the list of duplicate values(seperated by a -1)
    public static int[] eliminateDuplicates(int[] ary){

        int[] aryWithMarker = new int[ary.length];

        for (int i = 0; i < ary.length; i++){

            if (aryWithMarker[i] != -1){
                aryWithMarker[i] = ary[i];
            }

            for (int j = i+1; j < ary.length; j++){
                if (ary[i] == ary[j]){
                    aryWithMarker[j] = -1;
                }
            }
        }
        return aryWithMarker;

        /* //why this does not work?.....
        for (int i = 0; i < ary.length; i++){
            for (int j = i+1; j < ary.length; j++){
                if (ary[i] == ary[j]){
                    ary[j] = -1;
                }
            }
        }
        return ary;
         */
    }

    public static void testEliminateDuplicates(int rangeMax, int count){

        int[] ary1 = ArrUtils.randomArray(rangeMax, count);
        int[] filteredAry = eliminateDuplicates(ary1);

        //find the number of -1 occurrence in filteredAry
        int k =0;
        if(filteredAry.length>0){
            for (int i=0; i < filteredAry.length; i++){
                if (filteredAry[i] == -1){
                    k += 1;
                }
            }
        }

        int[] aryOfDups = new int[k];
        int[] removedDups = new int[filteredAry.length - k];

        //if ary doesn't have marker -1
        if (ArrUtils.contains(filteredAry, filteredAry.length-1, -1) == false){
                if (filteredAry.length >= 1){
                    ArrUtils.printIntArray("No Dups:", filteredAry);
                }
                else if (filteredAry.length == 0){
                    System.out.println("Empty array");
                }
        }

        //if ary has marker -1
        else {
            //print array that eliminated -1
            int j=0;
            for (int i=0; i < filteredAry.length; i++){
                if (filteredAry[i] != -1){
                    removedDups[j++] = filteredAry[i];
                }
            }
            ArrUtils.printIntArrayRange("Removed Dups:", removedDups, 0, removedDups.length);



            //print duplicates
            j=0;
            for (int i=0; i < filteredAry.length; i++){
                if (filteredAry[i] == -1){
                    aryOfDups[j++] = ary1[i];
                }
            }
        }
            ArrUtils.printIntArrayRange("Duplicates:", aryOfDups, 0, aryOfDups.length);
    }

}
