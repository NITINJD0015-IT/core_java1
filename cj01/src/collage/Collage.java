package collage;

public class Collage {      //user class

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 object values");
        s1.display();
        //Initialize all properties of person and student
        //in this object
        s1.name = "HK";
        s1.height = 6;
        s1.weight = 70;
        s1.institute = "NIT";
        int sno = 101;
        s1.setSno(sno);
        String course = "cj";
        s1.setCourse(course);
        double fee = 1000;
        s1.setFee(fee);
        System.out.println("s1 object values ");
        s1.display();
        s1.eat();
        s1.sleep();
        s1.listen();
        //s1.write();
        //s1.read();

    }

}
