package easy;

import java.math.BigInteger;

public class AddBinary {

    public String addBinary(String a, String b) {
        BigInteger aBig = new BigInteger(a, 2);
        BigInteger bBig = new BigInteger(b, 2);
        BigInteger sum = aBig.add(bBig);
        return sum.toString(2);
    }
}
