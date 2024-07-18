public class Rational {
    private int numerator; 
    private int denominator;

////////getter&setter///////////////////////////////////
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
////////constructor///////////////////////////////////////////

    public Rational(int numerator, int denominator){
        int maxCommonDivisor = 0;
        for (int i=1; i<=numerator && i<=denominator; i++){
            if(numerator%i==0 && denominator%i==0){
                maxCommonDivisor=i;
            }
        }
        this.numerator = numerator/maxCommonDivisor;
        this.denominator = denominator/maxCommonDivisor;
    }

///////////method/////////////////////////////////////////////

    public String toString(){
        return getNumerator() + "/" + getDenominator();
    }

    public void add(Rational r){

        int roughNumerator = numerator*r.denominator + denominator*r.numerator;
        int roughDenominator = denominator*r.denominator;

        int maxCommonDivisor = 0;
        for (int i=1; i<=roughNumerator && i<=roughDenominator; i++){
            if(roughNumerator%i==0 && roughDenominator%i==0){
                maxCommonDivisor=i;
            }
        }
        this.numerator = roughNumerator / maxCommonDivisor;
        this.denominator = roughDenominator / maxCommonDivisor;

    }

    public void subtrace(Rational r){

        int roughNumerator = numerator*r.denominator - denominator*r.numerator;
        int roughDenominator = denominator*r.denominator;

        int maxCommonDivisor = 0;
        for (int i=1; i<=roughNumerator && i<=roughDenominator; i++){
            if(roughNumerator%i==0 && roughDenominator%i==0){
                maxCommonDivisor=i;
            }
        }
        this.numerator = roughNumerator / maxCommonDivisor;
        this.denominator = roughDenominator / maxCommonDivisor;
    }

    public void multiply(Rational r){

        int roughNumerator = numerator*r.numerator;
        int roughDenominator = denominator*r.denominator;

        int maxCommonDivisor = 0;
        for (int i=1; i<=roughNumerator && i<=roughDenominator; i++){
            if(roughNumerator%i==0 && roughDenominator%i==0){
                maxCommonDivisor=i;
            }
        }
        this.numerator = roughNumerator / maxCommonDivisor;
        this.denominator = roughDenominator / maxCommonDivisor;
    }

    public void divide(Rational r){

        int roughNumerator = numerator* r.denominator;
        int roughDenominator = denominator*r.numerator;

        int maxCommonDivisor = 0;
        for (int i=1; i<=roughNumerator && i<=roughDenominator; i++){
            if(roughNumerator%i==0 && roughDenominator%i==0){
                maxCommonDivisor=i;
            }
        }
        this.numerator = roughNumerator / maxCommonDivisor;
        this.denominator = roughDenominator / maxCommonDivisor;
    }
    
}
