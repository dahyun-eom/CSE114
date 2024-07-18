public class RowsAndColumns {
    public static void main(String[] args) {
        
    int [][]inputMatrix = {{10, 15, -1, 22, 11},
        {100, 200, 150, -30, 27},
        {11, 44, 2, 1, -15},
        {44, 89, 10, 21, -2},
        {44, 55, 105, 205, 305}};
    printIntArr("Row Sums:", sumRows(inputMatrix));
    printIntArr("Column Sums:", sumColumns(inputMatrix));
    printDoubArr("Row Average:", averageRows(inputMatrix));
    printDoubArr("Column Averages:", averageColumns(inputMatrix));

    System.out.println();

    int [][]inputMatrix3 = {{10, 15, -1},
        {100, 200, 150},
        {11, 44, 2},
        {44, 89, 10},
        {44, 55, 105}};
    printIntArr("Row Sums:", sumRows(inputMatrix3));
    printIntArr("Column Sums:", sumColumns(inputMatrix3));
    printDoubArr("Row Average:", averageRows(inputMatrix3));
    printDoubArr("Column Averages:", averageColumns(inputMatrix3));

    System.out.println();

    int [][]inputMatrix4 = {{10, 15},
        {100, 200},
        {11, 44},
        {44, 89},
        {44, 55}};
    printIntArr("Row Sums:", sumRows(inputMatrix4));
    printIntArr("Column Sums:", sumColumns(inputMatrix4));
    printDoubArr("Row Average:", averageRows(inputMatrix4));
    printDoubArr("Column Averages:", averageColumns(inputMatrix4));

    System.out.println();

    int[][] inputMatrix2 = {{10, 15, -1},  //jagged array
        {100, 200, 150, -30, 27, 59, -201, 3},
        {11, 44, 2, 1, -15},
        {44, 89, 10, 21, -2, 10},
        {44, 55, 105, 205, 305}};
    printIntArr("Row Sums:", sumRows(inputMatrix2));
    printIntArr("Column Sums:", sumColumns(inputMatrix2));
    printDoubArr("Row Average:", averageRows(inputMatrix2));
    printDoubArr("Column Averages:", averageColumns(inputMatrix2));

    System.out.println();

    int[][] inputMatrix5 = {{10},  //jagged array
        {100, 200, 150, -30, 27, 59, -201, 3},
        {11, 44, 2},
        {44, 89},
        {44}};
    printIntArr("Row Sums:", sumRows(inputMatrix5));
    printIntArr("Column Sums:", sumColumns(inputMatrix5));
    printDoubArr("Row Average:", averageRows(inputMatrix5));
    printDoubArr("Column Averages:", averageColumns(inputMatrix5));

    }

    public static int[] sumRows(int[][] inArray){ 
    
        int [] sumArr = new int[inArray.length];

        for (int i=0; i < inArray.length; i++){
            for (int j=0; j<inArray[i].length; j++){
                sumArr[i] += inArray[i][j];
            }
        }
        return sumArr;

    }

    public static int[] sumColumns(int[][] inArray){

        //find the column number
        int[] columnsLength = new int[inArray.length];

        for (int k=0; k<inArray.length; k++){
            columnsLength[k] = inArray[k].length;
        }
        //find the largest element of the array "columnsLength" to decide the length of array "sumArr"
        int max = columnsLength[0];
    
        for (int m=0; m<columnsLength.length; m++){
            if (max < columnsLength[m]){
                max = columnsLength[m];
            }
        } //found the max element in "columnsLength"

        int [] sumArr = new int[max];

        for (int i=0; i<inArray.length; i++){
            for (int j=0; j<max; j++){
                if (j<inArray[i].length) {
                    sumArr[j] += inArray[i][j];
                }
            }
        }
        return sumArr;

    }

    public static double[] averageRows(int[][] inArray){ 

        int [] sumArr = new int[inArray.length];
        double [] averageArr = new double[inArray.length];

        for (int i=0; i<inArray.length; i++){
            for (int j=0; j<inArray[i].length; j++){
                sumArr[i] += inArray[i][j];
            }
            averageArr[i] = (double)sumArr[i] / inArray[i].length;       
        }
        return averageArr;

    }

    public static double[] averageColumns(int[][] inArray){

        //find the column number
        int[] columnsLength = new int[inArray.length];
        
        for (int k=0; k<inArray.length; k++){
            columnsLength[k] = inArray[k].length;
        }
        //find the largest element of the array "columnsLength" to decide the length of array "sumArr"
        int max = columnsLength[0];
    
        for (int m=0; m<columnsLength.length; m++){
            if (max < columnsLength[m]){
                max = columnsLength[m];
            }
        } //found the max element in "columnsLength"

        int [] sumArr = new int[max];
        double [] averArr = new double[max];
        int [] count = new int[max];

        for (int i=0; i<inArray.length; i++){
            for (int j=0; j<max; j++){
                if (j<inArray[i].length) {
                    sumArr[j] += inArray[i][j];
                    count[j] += 1;
                }
            }
        }
        
        for (int p=0; p<sumArr.length; p++){
            averArr[p] = (double)sumArr[p] / count[p];
        }

        return averArr;

    }

    public static void printIntArr(String head, int[] inArray){

        System.out.println(head);

        for(int i=0; i<inArray.length; i++){
            System.out.println(inArray[i]);
        }

    }

    public static void printDoubArr(String head, double[] doubArray){

        System.out.println(head);

        for(int i=0; i<doubArray.length; i++){
            System.out.printf("%.2f%n", doubArray[i]);
        }
    }

}

    
