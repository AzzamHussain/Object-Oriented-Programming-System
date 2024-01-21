//this keyword can be used to invoke current class method(implicitly)
class ThisDemo{
    void display(){
        System.out.println("Azzam");
    }
    void show(){
        this.display();
    }
    public static void main(String[] args) {
        ThisDemo d=new ThisDemo();
        d.show();
    }
}
