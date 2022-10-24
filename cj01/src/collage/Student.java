package collage;

class Student extends Person {                      //subclass

    //static fileds/properties
    static String institute;
    //instance fields
    private int sno;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }
    //private String sname;
    private String course;
    private double fee;

    static {
        institute = "NIT";
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void display() {
        System.out.println("eyes :" + eyes);
        System.out.println("ears :" + ears);
        System.out.println("hand :" + hand);
        System.out.println("leg  :" + legs);
        System.out.println("name :" + name);
        System.out.println("height :" + height);
        System.out.println("weight :" + weight);
        System.out.println("collage :" + institute);
        System.out.println("RollNo : " + sno);
        // System.out.println("Student Name :"+sname);
        System.out.println("Course :" + course);
        System.out.println("Fee :" + fee);

    }

}
