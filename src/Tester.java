import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class Tester
{
    public static <T extends Comparable> T arr(T[] arr)
    {
        T max = arr[0];
        for (T element : arr)
        {
            if (element.compareTo(max) == 1)
            {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        HigherOrderUtils.FunctionComposition<Double, Double, Double> fc = new HigherOrderUtils.FunctionComposition<>();
        Function<Double, Double> f = new Function<Double, Double>() {
            @Override
            public Double apply(Double aDouble) {
                return Math.sin(aDouble);
            }
        };

        Function<Double, Double> g = new Function<Double, Double>() {
            @Override
            public Double apply(Double aDouble) {
                return Math.cos(aDouble);
            }
        };

        Function<Double, Double> h = fc.composition.apply(f, g);
        System.out.println(h.apply(5.0));
    }
}
