public class StaticVar {
    public static void main(String[] args) {
        test.College = "IPEC";
        test obj1 = new test("Name1", 01);
        test obj2 = new test("Name2", 02);
    
        obj1.display();
        obj2.display();
    
        test.College = "IIT";
    
        obj1.display();
        obj2.display();   
    }
}

class test{
    static String College;
    String name;
    int rollno;

    test(String n, int r){
        name = n;
        rollno = r;
    }

    void display(){
        System.out.println("College: " + College);
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno + "\n");
    }
}
