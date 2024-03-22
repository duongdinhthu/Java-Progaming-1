public class Client{
    public static void main (String[]agrs){
        Student studentA;
        Student studentB;
        studentA = new Student();
        studentB=new Student(1,"Nguyen Van A",true);
        studentA.printInfo();
        studentB.printInfo();
        studentB.setName("Nguyen Van B");
        studentB.setId(4);
        studentB.setMale(false);
        studentB.printInfo();
    }
}