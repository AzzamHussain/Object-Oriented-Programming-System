/**
 * FinalMethod
 */
class FinalMethod {
    final void show(){
        System.out.println("Azzam");
    }
}
class Final extends FinalKeyword{
    void show(){
        System.out.println("UBIT");
    }
    public static void main(String[] args) {
        Final f=new Final();
        f.show();
        //FinalKeyword fk=new FinalKeyword();
        f.show();
    }
}