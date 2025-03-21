package Problem4;

class Ellipse extends Shape {
    double a; // Major axis
    double b; // Minor axis

    public Ellipse(double a, double b) {
        super("Ellipse");

        if (a < b) {
            double temp = a;
            a = b;
            b = temp;
        }
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return Math.PI * a * b;
    }

    @Override
    public double perimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    } 

    @Override
    public String toString() {
        return "Ellipse with semi-major axis: " + a + " and semi-minor axis: " + a;
    }
}
