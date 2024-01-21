//this method can be used to pass an argument contructor call
class Test{
    Test(thisfour t1){
        System.out.println("Test class constructor");
    }

}
class thisfour{
    void method1(){
        Test t=new Test(this);
    }
    public static void main(String[] args) {
       // t.method1();        
    }
}

