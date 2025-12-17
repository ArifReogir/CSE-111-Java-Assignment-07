/*Design the ComplexNumber class with the necessary property 
to produce the output from the given driver code. 
 */

public class ComplexNumberTester {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber();
        System.out.println(cn1.details());
        System.out.println("----------------");
        ComplexNumber cn2 = new ComplexNumber(5.0, 7.0);
        System.out.println(cn2.details());
    }
}

// class starts here

class RealNumber { // parent class
    public double realValue;

    public RealNumber() {
        this(0.0);
    }

    public RealNumber(double realValue) {
        this.realValue = realValue;
    }

    public String getReal() {
        return "RealPart: " + realValue;
    }
}

class ComplexNumber extends RealNumber { // child class
    public double ImaginaryPart = 1.0;

    public ComplexNumber() {
        super(1.0);
    }

    public ComplexNumber(double r, double i) {
        super(r);
        ImaginaryPart = i;
    }

    public String details() {
        return super.getReal() + "\nImaginaryPart: " + ImaginaryPart;
    }

}
