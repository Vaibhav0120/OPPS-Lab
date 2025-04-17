public class OverMeth {
    public static void main(String[] args) {
        meth obj1 = new meth();

        int size1 = obj1.size(10, 20);
        System.out.println("Size: " + size1);

        int size2 = obj1.size(10, 20, 30);
        System.out.println("Size: " + size2);
    }
}

class meth{
    int size(int a, int b){
        return a*b;
    }
    int size(int a, int b, int c){
        return a*b*c;
    }
}
