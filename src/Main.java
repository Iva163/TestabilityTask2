public class Main {
    public static void main(String[] args) {
        BmiService body = new BmiService();
        double weight = 72; // вес в кг
        double height = 1.7; // рост в м
        double massIndex = body.calculate(weight, height);
        if (massIndex<18.5){
            System.out.println("Недовес: меньше чем 18.5");
        }
        if (massIndex>=18.5 && massIndex<25){
            System.out.println("Нормальный: между 18.5 и 25");
        }
        if (massIndex>=25 && massIndex<30){
            System.out.println("Избыточный вес: между 25 и 30");
        }
        if (massIndex>=30){
            System.out.println("Ожирение: 30 или больше");
        }

    }
}