

    
interface T1{
    public  abstract void play();
}

 interface T2 {

    void display();
    
}
class Abstraction implements T1,T2{
    public void play(){
        System.out.println("Musiccc");

    }
    public void display(){
        System.out.println("%%%%%%%");
    }
    public static void main(String[] args) {
        Abstraction T1=new Abstraction();
        Abstraction T2=new Abstraction();
        T2.display();
        T1.play();
    }
}