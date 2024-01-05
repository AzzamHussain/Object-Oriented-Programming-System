//****************************INHERITANCE*******************************//
class car{
    void maintenance(){
        System.out.println("The car is washing");
    }
}
class corolla extends car{
    public static void main(String[]args){
        corolla m=new corolla();
        m.maintenance();
    }
}