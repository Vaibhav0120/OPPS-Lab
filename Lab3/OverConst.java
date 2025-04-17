public class OverConst {
    public static void main(String[] args) {
        constructor obj1 = new constructor(10, 20);
        constructor obj2 = new constructor(10);
        constructor obj3 = new constructor();

        System.out.println("obj1: x = " + obj1.x + ", y = " + obj1.y);
        System.out.println("obj2: x = " + obj2.x + ", y = " + obj2.y);
        System.out.println("obj3: x = " + obj3.x + ", y = " + obj3.y);

    }
}

class constructor {
    int x, y;

    constructor(int a, int b) {
        x = a;
        y = b;
    }

    constructor(int a) {
        x = a;
        y = 0;
    }

    constructor() {
        x = 0;
        y = 0;
    }
}