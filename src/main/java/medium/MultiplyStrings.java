package medium;

import java.math.BigInteger;

public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        BigInteger first = new BigInteger(num1);
        BigInteger second = new BigInteger(num2);
        BigInteger multiply = first.multiply(second);

    return multiply.toString();
    }
}
