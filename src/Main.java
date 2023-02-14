public class Main {
    public static void main(String[] args) {
    BmiService service = new BmiService();
    double high = 1.65;
    int weight = 50;
    int index = service.calculate(high, weight);
    System.out.println("Ваш BMI-индекс: " + (index));
    }
}
