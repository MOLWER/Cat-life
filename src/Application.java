import model.Kotik;

public class Application {

    public static void main(String[] args) {
 Kotik smoky = new Kotik();
 smoky.setKotik(4,"Смоки", 5,"Мау");
 Kotik kotik = new Kotik (8,"Эллис", 8,"Мау");
 smoky.liveAnotherDay();
        System.out.println("Количество созданных Котиков: "+Kotik.getCount());
        System.out.println("Результат сравнения мяуканья: "+ smoky.getMeow().equals(kotik.getMeow()));
    }
}
