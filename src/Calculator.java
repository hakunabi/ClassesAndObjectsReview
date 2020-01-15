public class Calculator {
    double a;
    double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Calculator() {
        this.a = 1.0;
        this.b = 1.0;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double addMethod () {
    return a + b;
}

    public double subtractMethod () {
    return a - b;
}
    public double multiplyMethod () {
    return a * b;
}
    public double divideMethod () {
    return a / b;
}
    public double overloadedAddMethod(double example1, double example2) {
    example1 += example2;
    return a + b + example1;
}
    public double overloadedSubtractMethod (double example1, double example2) {
    example1 -= example2;
    return a - b - example1;
}
    public double overloadedMultiplyMethod (double example1, double example2) {
    example1 *= example2;
    return a * b * example1;
}
    public double overloadedDivideMethod (double example1, double example2) {
    example1 /= example2;
    return a / b / example1;
}
}
