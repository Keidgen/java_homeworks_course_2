package ru.skypro.homework_2;

public class slytherin extends hogwarts {
    private int cunning;        //хитрость
    private int determination;  //решительность
    private int ambition;       //амбициозность
    private int resource;       //находчивость
    private int powerLust;      //жажда власти

    public slytherin(String name, int powerMagic, int distanceTransgression, int cunning, int determination, int ambition, int resource, int powerLust) {
        super(name, powerMagic, distanceTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resource = resource;
        this.powerLust = powerLust;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void setPowerLust(int powerLust) {
        this.powerLust = powerLust;
    }

    public void aboutStudent() {
        System.out.println(this.toString() + "Хитрость - " + cunning + ", Решительность - " + determination + ", Амбициозность - " + ambition + ", Находчивость - " + resource + ", Жажда власти - " + powerLust);
    }

    public static void bestStudent(slytherin student1, slytherin student2) {
        int resultStudent1;
        int resultStudent2;
        resultStudent1 = student1.cunning + student1.determination + student1.ambition + student1.resource + student1.powerLust;
        resultStudent2 = student2.cunning + student2.determination + student2.ambition + student2.resource + student2.powerLust;

        if (resultStudent1 > resultStudent2) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
    }
}
