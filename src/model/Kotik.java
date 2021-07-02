package model;

public class Kotik {

    private String name;
    private int weight;
    private int prettiness;
    private int wellFed = 15;
    private String meow;
    private static int count = 0;

    public String getMeow() {
        return meow;
    }

    public static int getCount() {
        return count;
    }

    public Kotik() {
        count++;
    }

    public Kotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        count++;
    }

    public void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public void liveAnotherDay() {
        System.out.println("Имя кота: " + name + "\nВес кота: " + weight);
        for (int i = 0; i < 24; i++) {
            int random = (int) (Math.random() * 4);
            switch (random) {
                case 0:
                    if (sleep())
                        System.out.println("спит");
                    else {
                        System.out.println("Я хочу есть");
                        eat();
                    }
                    break;
                case 1:
                    if (play())
                        System.out.println("играет");
                    else {
                        System.out.println("Я хочу есть");
                        eat();
                    }
                    break;
                case 2:
                    if (chaseMouse())
                        System.out.println("гоняется за мышкой");
                    else {
                        System.out.println("Я хочу есть");
                        eat();
                    }
                    break;
                case 3:
                    if (meow())
                        System.out.println("мяу");
                    else {
                        System.out.println("Я хочу есть");
                        eat();
                    }
                    break;
            }
        }

    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean play() {
        if (wellFed <= 0)
            return false;
        wellFed -= 2;
        return true;
    }

    public boolean sleep() {
        if (wellFed <= 0)
            return false;
        wellFed -= 2;
        return true;
    }

    public boolean chaseMouse() {
        if (wellFed <= 0)
            return false;
        wellFed -= 2;
        return true;
    }

    public void eat() {
        eat(4, "whiskas");
    }

    public boolean eat(int wellFed) {
        this.wellFed = this.wellFed + wellFed;
        return true;
    }

    public void eat(int wellFed, String nameEat) {
        System.out.println("Получил " + wellFed + " от еды " + nameEat);
        eat(wellFed);
    }

    public boolean meow() {
        if (wellFed <= 0)
            return false;
        wellFed -= 2;
        return true;
    }


}

