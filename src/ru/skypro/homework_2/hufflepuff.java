package ru.skypro.homework_2;

public class hufflepuff extends hogwarts {
    private int hardwork;   //трудолюбие
    private int loyalty;    //верность
    private int honesty;    //честность

    public hufflepuff(String name, int powerMagic, int distanceTransgression, int hardwork, int loyalty, int honesty) {
        super(name, powerMagic, distanceTransgression);
        this.hardwork = hardwork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardwork() {
        return hardwork;
    }

    public void setHardwork(int hardwork) {
        this.hardwork = hardwork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void aboutStudent() {
        System.out.println(this.toString() + "Трудолюбие - " + hardwork + ", Верность - " + loyalty + ", Честность - " + honesty);
    }

    public static void bestStudent(hufflepuff student1, hufflepuff student2) {
        int resultStudent1;
        int resultStudent2;
        resultStudent1 = student1.hardwork + student1.loyalty + student1.honesty;
        resultStudent2 = student2.hardwork + student2.loyalty + student2.honesty;

        if (resultStudent1 > resultStudent2) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
    }
}
