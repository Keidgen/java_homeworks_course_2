package ru.skypro;

public class Main {
    public static void main(String[] args) {
        gryffindor griffStudent1 = new gryffindor("Гарри Поттер", 50, 35, 70, 50,60);
        gryffindor griffStudent2 = new gryffindor("Гермиона Грейнджер", 45, 30, 60, 60,60);
        gryffindor griffStudent3 = new gryffindor("Рон Уизли", 35, 20, 40, 350,40);

        griffStudent1.aboutStudent();
        griffStudent2.aboutStudent();
        griffStudent3.aboutStudent();
        gryffindor.bestStudent(griffStudent1, griffStudent2);
        hogwarts.compareStudent(griffStudent1, griffStudent2);
        System.out.println("");

        slytherin slythStudent1 = new slytherin("Драко Малфой", 50, 40, 30, 50, 70, 45, 50);
        slytherin slythStudent2 = new slytherin("Грэхэм Монтегю", 40, 35, 30, 40, 50, 30, 50);
        slytherin slythStudent3 = new slytherin("Грегори Гойл", 30, 20, 15, 26, 23, 15, 40);
        slythStudent1.aboutStudent();
        slythStudent2.aboutStudent();
        slythStudent3.aboutStudent();
        slytherin.bestStudent(slythStudent1, slythStudent2);
        hogwarts.compareStudent(slythStudent1, slythStudent2);
        System.out.println("");

        ravenclaw ravenStudent1 = new ravenclaw("Чжоу Чанг", 40, 35, 45, 35, 45, 20);
        ravenclaw ravenStudent2 = new ravenclaw("Падма Патил", 30, 35, 50, 30, 27, 30);
        ravenclaw ravenStudent3 = new ravenclaw("Маркус Белби", 35, 27, 45, 37, 10, 25);
        ravenStudent1.aboutStudent();
        ravenStudent2.aboutStudent();
        ravenStudent3.aboutStudent();
        ravenclaw.bestStudent(ravenStudent1, ravenStudent2);
        hogwarts.compareStudent(ravenStudent1, ravenStudent2);
        System.out.println("");

        hufflepuff huffleStudent1 = new hufflepuff("Захария Смит", 35, 35, 20, 25, 40);
        hufflepuff huffleStudent2 = new hufflepuff("Седрик Диггори", 50, 55, 50, 40, 45);
        hufflepuff huffleStudent3 = new hufflepuff("Джастин Финч-Флетчли", 35, 30, 40, 35, 20);
        huffleStudent1.aboutStudent();
        huffleStudent2.aboutStudent();
        huffleStudent3.aboutStudent();
        hufflepuff.bestStudent(huffleStudent1, huffleStudent2);
        hogwarts.compareStudent(huffleStudent1, huffleStudent2);
        System.out.println("");

        hogwarts.compareStudent(griffStudent1, slythStudent1);
        hogwarts.compareStudent(huffleStudent2, griffStudent1);
        hogwarts.compareStudent(huffleStudent2, slythStudent1);
        hogwarts.compareStudent(ravenStudent1,griffStudent2);
    }
}