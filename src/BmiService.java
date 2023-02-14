public class BmiService {

    public int calculate (double high, int weight){
        int index;
        index = (int) (weight / (high * high));
        return index;
    }
}
