package tree;

import easy.tree.MinimumNodeValueDifference;
import easy.tree.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MinimumNodeValueDifferenceTest {

    private MinimumNodeValueDifference minimumNodeValueDifference;

    @BeforeEach
    void prepare() {
        minimumNodeValueDifference = new MinimumNodeValueDifference();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(TreeNode root, int expected) {
        Assertions.assertThat(minimumNodeValueDifference.minDiffInBST(root)).isEqualTo(expected);
    }
    /*
    root = [4,2,6,1,3] -> 1
    root = [1,0,48,null,null,12,49] -> 1
     */
    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6)), 1),
                Arguments.of(new TreeNode(1, new TreeNode(0, null, null), new TreeNode(48, new TreeNode(12), new TreeNode(49))), 1)
        );
    }
}
