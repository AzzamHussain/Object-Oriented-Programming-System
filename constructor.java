

//**********************CONSTRUCTOR **********************//
class Employee{
    String Name;
    int id;
    Employee(String Name,int id){
        this.Name=Name;
        this.id=id;
    }
    public static void main(String[]args){
        Employee e1=new Employee("Azzam", 345);
        Employee e2=new Employee("Irfan", 678);
        System.out.println("Employee Name:"+" "+e1.Name+" "+"Empoyee Id"+" "+e1.id);
        System.out.println("Employee Name:"+" "+e2.Name+" "+"Empoyee Id"+" "+e2.id);



    }

}


