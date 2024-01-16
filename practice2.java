class bike{
    void ride(){
        System.out.println("Riding");
    }
}
class honda extends bike{
    void ride(){
        System.out.println("Riding a honda");
    }

    void price(){
        System.out.println("The price is little high");
    }
    public static void main(String[] args) {
        bike b=new bike();
        b.ride();
        honda h=new honda();
        h.ride();
        h.price();

        
    }
}