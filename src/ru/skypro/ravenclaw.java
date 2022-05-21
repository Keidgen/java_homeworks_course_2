package ru.skypro;

public class ravenclaw extends hogwarts{
    private int mind;       //ум
    private int wisdom;     //мудрость
    private int wit;        //остроумие
    private int creativity; //креативность

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public ravenclaw(String name, int powerMagic, int distanceTransgression, int mind, int wisdom, int wit, int creativity) {
        super(name, powerMagic, distanceTransgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void aboutStudent() {
        System.out.println(this.toString() + "Ум - " + mind + ", Мудрость - " + wisdom + ", Остроумие - " + wit + ", Креативность - " + creativity);
    }

    public static void bestStudent(ravenclaw student1, ravenclaw student2) {
        int resultStudent1;
        int resultStudent2;
        resultStudent1 = student1.mind + student1.wisdom + student1.wit + student1.creativity;
        resultStudent2 = student2.mind + student2.wisdom + student2.wit + student2.creativity;

        if (resultStudent1 > resultStudent2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
    }

}
