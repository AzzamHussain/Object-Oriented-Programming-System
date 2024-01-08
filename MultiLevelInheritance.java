class A{
    void showA(){
        System.out.println("A class method");
    }
}
class B extends A{
    void showB(){
        System.out.println("B class method");
    }
}
class C extends B{
    void showC(){
        System.out.println("*********");
    }
public static void main(String[]args){
    C obj1=new C();
    obj1.showA();
    B obj2=new B();
    obj1.showC();
    A obj3=new A();
    obj3.showA();


}

}