package ru.skypro;

public class hogwarts {
    private int powerMagic;
    private int distanceTransgression;
    private String name;

    public hogwarts(String name, int powerMagic, int distanceTransgression) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.distanceTransgression = distanceTransgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        this.distanceTransgression = distanceTransgression;
    }

    public void aboutStudent() {
    }

    @Override
    public String toString() {
        return name + ": " + "Сила магии - " + powerMagic + ", Расстояние трансгрессии - " + distanceTransgression + ", ";
    }

    public static void compareStudent(hogwarts student1, hogwarts student2) {
        if ((student1.powerMagic + student1.distanceTransgression) > (student2.powerMagic + student2.distanceTransgression)) {
            System.out.println(student1.name + " обладает бОльшей мощностью магии, чем " + student2.name);
        } else System.out.println(student2.name + " обладает бОльшей мощностью магии, чем " + student1.name);
    }
}
