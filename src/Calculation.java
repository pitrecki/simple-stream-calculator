/**
 * This interface provides basic functionality for perform some basic calculation.
 *
 * @see Calculator
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-01-01.
 */
@FunctionalInterface
public interface Calculation
{
    double calculate(double... params);
}
