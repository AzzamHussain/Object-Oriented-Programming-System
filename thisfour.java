//this method can be used to pass an argument method call

class thisfour{
    void method1(thisfour td){
        System.out.println("I am in the method 1");
    }
    void method2(){
       method1(this);
      // method1();
    }
    public static void main(String[] args) {
        thisfour td=new thisfour();
        td.method2();
        
    }
}
