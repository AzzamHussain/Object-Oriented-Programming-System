
//this keyword can be used to invoke current class method
class ThissDemo{
    void ThissDemo(){
        System.out.println("no-arg constructor");
    }
    void ThissDemo(int a){
        System.out.println("Parametrised constructor");
    }
    public static void main(String[] args) {
        ThissDemo d=new ThissDemo();
        d.ThissDemo();
    }
}
