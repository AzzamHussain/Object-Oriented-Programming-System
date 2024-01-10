class Abc{
    void show(){
        System.out.println("&&&&&&&&&&&&&&&&");
    }
}
class xyz extends Abc{
    void show(){
        System.out.println("**************");
    }
    public static void main(String[]args){
        Abc a=new Abc();
        a.show();
        xyz x=new xyz();
        x.show();

    }
}


