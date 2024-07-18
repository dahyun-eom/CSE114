import java.util.Scanner;
public class Printjob{
    public static int computePrintJobCost(String colorType, String paperSize, int count){


        int colorTypeCost;
        if (colorType.equals("Grayscale")){
            colorTypeCost = 5;
        }
        else{
            colorTypeCost = 15;
        }



        int paperSizeCost;
        if (paperSize.equals("A4")){
            paperSizeCost = 40;
        }
        else if (paperSize.equals("A5")){
            paperSizeCost = 20;
        }
        else if (paperSize.equals("Letter")){
            paperSizeCost = 30;
        }
        else{
            paperSizeCost = 25;
        }


        int totalCost = (colorTypeCost+paperSizeCost)*count;

        if (totalCost%10 == 5){
            totalCost = totalCost + 5;
        }

        return totalCost;

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter colortype papersize and count:");
        String colorType = sc.next();
        String paperSize = sc.next();
        int count = sc.nextInt();

        System.out.println("Print job cost: "+ computePrintJobCost(colorType, paperSize, count));

    sc.close();
    }
}
