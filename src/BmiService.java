public class BmiService {
    public double calculate (double weight, double height) {
        double massIndex = weight/(height*height);
        return massIndex;

    }
}
