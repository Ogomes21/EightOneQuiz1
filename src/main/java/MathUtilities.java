

public class MathUtilities {

    /**
     * Add two number together
     *
     * @param baseValue  first number
     * @param valueToAdd number
     * @return the sum of the two numbers
     */
    public Integer add(Integer num1, Integer num2) {
        return num1 + num2;
    }

    /**
     * Add two number together
     *
     * @param baseValue  first number
     * @param valueToAdd second number
     * @return the sum of the two numbers
     */
    public Double add(Double num1, Double num2) {
        return num1 + num2;
    }

    /**
     * Get half the value of the number
     *
     * @param number the number given
     * @return the half of the number in double
     */
    public Integer half(Integer number) {
        return number / 2;
    }

    /**
     * Determine if the number is odd
     *
     * @param number the number given
     * @return true if the number is odd, false if it is even
     */
    public Boolean isOdd(Integer number) {

        if (number % 2 != 0) {

        return true;
    }
        else { return false;

    }


}



/**
 * Multiply the number by itself
 *
 * @param number the number given
 * @return the result of the number multiply by itself
 */
public Integer square(Integer number){

        return number*number;
        }

}