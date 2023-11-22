package oops;
class Box {
    private double l,b,h;

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    double volume() {
        return this.l * this.b * this.h;
    }
}

class Box1 extends Box {
    double weight;

    Box1(double l, double b, double h, double weight) {
        super(l, b, h);
        this.weight = weight;
    }
}

class Box2 extends Box1 {
    double cost;

    Box2(double l, double b, double h, double weight, double cost) {
        super(l, b, h, weight);
        this.cost = cost;
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Box2 b1 = new Box2(5, 5, 5, 20, 199);

        System.out.println("Volume: " + b1.volume());
        System.out.println("Weight: " + b1.weight);
        System.out.println("Cost: " + b1.cost);
    }
}
