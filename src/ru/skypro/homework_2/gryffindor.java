package ru.skypro.homework_2;

public class gryffindor extends hogwarts{
    private int nobility;   //Благородство
    private int honor;      //Честь
    private int courage;    //Храбрость

    public gryffindor(String name, int powerMagic, int distanceTransgression, int nobility, int honor, int courage) {
        super(name, powerMagic, distanceTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void aboutStudent() {
        System.out.println(this.toString() + "Благородство - " + nobility + ", Честь - " + honor + ", Храбрость - " + courage);
    }

    public static void bestStudent(gryffindor student1, gryffindor student2) {
        int resultStudent1;
        int resultStudent2;
        resultStudent1 = student1.courage + student1.honor + student1.nobility;
        resultStudent2 = student2.courage + student2.honor + student2.nobility;

        if (resultStudent1 > resultStudent2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
    }
}
