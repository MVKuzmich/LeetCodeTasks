import easy.TwoSum;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    public TwoSum twoSum;

    @BeforeEach
    void prepare() {
        twoSum = new TwoSum();
    }

    @Test
    void twoSumTest() {
        int[] expected = {0, 2};
        int [] given = {3, 2, 3};
        int target = 6;

        Assertions.assertThat(twoSum.twoSum(given, target)).isEqualTo(expected);


    }


}
