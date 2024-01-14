class student{
    private int student_id;
    public void setStudent_id(int std_id){
        student_id=std_id;
    }
    public int getStudent_id(){
        return student_id;
    }
}
class school{
    public static void main(String[] args) {
        student s=new student();
        s.setStudent_id(106068);
        System.out.println(s.getStudent_id());
    }
}