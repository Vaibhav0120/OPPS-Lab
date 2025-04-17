public class AccessCtrl {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        obj.a = 10;
        obj.b = 20;
        // obj.c = 30; // private access - not allowed

        obj.setC(30);
        System.out.println("A = " + obj.a);
        System.out.println("B = " + obj.b);
        System.out.println("C = " + obj.getC());
    }
}

class AccessDemo{
    int a;
    public int b;
    private int c;

    void setC(int c){
        this.c = c;
    }
    int getC(){
        return c;
    }
}
