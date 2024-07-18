public class UseRational {
    public static void main(String[] args) {
        
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(2, 3);
        r1.add(r2);
        System.out.println(r1.toString());

        Rational r3 = new Rational(3, 4);
        Rational r4 = new Rational(1, 2);
        r3.subtrace(r4);
        System.out.println(r3.toString());

        Rational r5 = new Rational(2, 3);
        Rational r6 = new Rational(4, 5);
        r5.multiply(r6);
        System.out.println(r5.toString());
        
        Rational r7 = new Rational(1, 5);
        Rational r8 = new Rational(3, 5);
        r7.divide(r8);
        System.out.println(r7.toString());

    }
    
}
