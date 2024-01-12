abstract class vehicles{
    abstract void start();
}

class jeep extends vehicles{
    void start(){
        System.out.println("Car starts with ignition");
    }
}
class bike extends vehicles{
    void start(){
        System.out.println("bike start with kick or ignition");
    }
    public static void main(String[] args) {
        jeep c=new jeep();
        c.start();
        bike b=new bike();
        b.start();
    }
}