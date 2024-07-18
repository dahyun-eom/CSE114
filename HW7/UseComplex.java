public class UseComplex {
    public static void main(String[] args) {

        Complex c1 = new Complex(3, 5);
        Complex c2 = new Complex(7, -2);

        c1.add(c2); 
        System.out.println(c1.toString());
        

        Complex c3 = new Complex(3, 5);
        Complex c4 = new Complex(7, -2);

        c3.subtract(c4);
        System.out.println(c3.toString());

        Complex c5 = new Complex(3, 5);
        Complex c6 = new Complex(7, -2);

        c5.multiply(c6);
        System.out.println(c5.toString());

//******************* is there any way that I can reuse instances c1 and c2???? for sub and mul?



    }
    
}
