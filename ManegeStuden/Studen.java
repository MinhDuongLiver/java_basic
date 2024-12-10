package ManegeStuden;

public class Studen implements Iclassification{
    private String name;
    private int age;
    private double marks;
    private String classification;

    public Studen(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }



    @Override
    public void classify() {
        if(marks >= 8){
            classification = "A";
        } else if (marks >= 6) {
            classification = "B";
        } else  {
            classification = "C";
        }
    }

    @Override
    public void display() {
        System.out.println("Student Information");
        System.out.println("name : "+ name);
        System.out.println("age : "+ age);
        System.out.println("mark : "+ marks);
        System.out.println("classification : "+ classification);

    }
}
