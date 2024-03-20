public class Client{
    public static void main (String[]agrs){
        Student studentA;
        Student studentB;
        studentA = new Student(0,"duongthu",true);
        studentB=new Student(1,"Nguyen Van A",true);
        studentA.printInfo();
        studentB.printInfo();
        studentB.setName("Nguyen Van B");
        studentB.printInfo();
    }
}