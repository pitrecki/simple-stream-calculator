import java.util.Arrays;

/**
 * Simple calculator, perform basic mathematical operations such like addition, subtraction etc.
 *
 *
 * Code in {@link #divide(double...)} & {@link #substract(double...)} is replacement for this
 * imperative style:
 * <pre>{@code
 *      //entire method body with array declaration and etc.
 *      double result = numbers[0];
 *      for (double element : numbers) {
 *          if (element != numbers[0])
 *              result -= element;
 *      }
 * }</pre>
 *
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-01-01.
 */
public class Calculator
{

    /**
     * It's do simple addition
     *
     * @param values packet of numbers
     * @return calculated sum result
     */

    public double add(double... values) {
        Calculation add = params -> Arrays.stream(params)
                .reduce(0, Double::sum);
        return add.calculate(values);
    }

    /**
     * It's do simple substraction
     *
     * @param values packet of numbers
     * @return calculated difference result
     */

    public double substract(double... values) {
        Calculation substract = params -> Arrays.stream(params)
                .filter(value -> value != params[0])
                .reduce(params[0], (result, element) -> result - element);
        return  substract.calculate(values);
    }

    /**
     * It's do simple multiplication
     *
     * @param values packet of numbers
     * @return calculated product result
     */

    public double multiply(double... values) {
        Calculation multiply = params -> Arrays.stream(params)
                .reduce(1d, (result, element) -> result * element);
        return multiply.calculate(values);
    }

    /**
     * It's do simple division
     *
     * @param values packet of numbers
     * @return calculated quotient result
     */

    public double divide (double... values) {
        Calculation divide= params -> Arrays.stream(params)
                .filter(value -> value != params[0])
                .reduce(params[0], (result, element) -> result / element);
        return  divide.calculate(values);
    }
}

