public class StaticBlock {
    static int a = 10;
    static int b;

    static {
        System.out.println("Static block is executed.");
        b = a*4;
    }

    static void meth(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        meth(42);
    }
    
}
