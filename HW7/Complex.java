public class Complex {
    
    private int real;
    private int imaginary;

    public Complex(){
        real = 1;
        imaginary = 1;
    }

    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;   
    }

    public int getReal(){
        return real;
    }

    public int getImaginary(){
        return imaginary;
    }

    public void setReal(int real){
        this.real = real;
    }
    
    public void setImaginary(int imaginary){
        this.imaginary = imaginary;
    }

    public void add(Complex c){
        this.real += c.real;
        this.imaginary += c.imaginary;
    }

    public void subtract(Complex c){
        this.real -= c.real;
        this.imaginary -= c.imaginary;
    }

    public void multiply(Complex c){
        int initReal = this.real;
        int initImaginary = this.imaginary;

        this.real = initReal*c.real - initImaginary*c.imaginary;
        this.imaginary = initImaginary*c.real + initReal*c.imaginary;
    }

    public String toString(){

        if (this.imaginary < 0){
            return getReal() + "" + getImaginary() + "i";
        }
        else{
            return getReal() + "+" + getImaginary() + "i";
        }
    }

}
