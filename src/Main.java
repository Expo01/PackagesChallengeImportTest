import com.timbuckalka.mylibary.Series;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Series.nSum(i));
        }
        //up top, note that when using the Series class we imported, the import will automatically be added

        System.out.println(" ");
        for (int i = 0; i <= 5; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println(" ");

        for (int i = 0; i <= 5; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }


}