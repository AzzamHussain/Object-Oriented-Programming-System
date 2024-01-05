//**********************SINGLE INHERITANCE**********//
class A{
    void showA(){
        System.out.println("Method of A class");
    }
}
class B extends A{
    void showB(){
        System.out.println("Method of B class");
    }
    public static void main(String[]args){
        A a=new A();
        a.showA();
        B b=new B();

        b.showB();
        b.showA();
    }
}