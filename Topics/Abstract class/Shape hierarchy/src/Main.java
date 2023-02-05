abstract class Shape {
    abstract double getPerimeter();

    abstract double getArea();

    abstract void  aa();
    static void bb() {

    }

    private void cc () {

    }


    abstract static dd();
}

class Triangle extends Shape {
    double  a;
    double  b;
    double  c;

    Triangle(double  a, double  b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
         double s = getPerimeter() / 2;
         return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

class Rectangle extends Shape {
    double  ra;
    double  rb;

    Rectangle(double ra, double rb) {
        this.ra = ra;
        this.rb = rb;
    }

    @Override
    double getPerimeter() {
        return 2 * ra + 2 * rb;
    }

    @Override
    double getArea() {
        return ra * rb;
    }
}

class Circle extends Shape {
    double  r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    double getArea() {
        return Math.PI * r * r;
    }
}