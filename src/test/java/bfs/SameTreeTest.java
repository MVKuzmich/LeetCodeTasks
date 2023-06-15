package bfs;

import easy.breadthfirstsearch.SameTree;
import easy.breadthfirstsearch.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SameTreeTest {

    private SameTree sameTree;

    @BeforeEach
    void prepare() {
        sameTree = new SameTree();
    }

    @ParameterizedTest
    @MethodSource("getDataCaseTrue")
    void checkMethodCaseTrue(TreeNode first, TreeNode second) {
        Assertions.assertThat(sameTree.isSameTree(first, second)).isTrue();
    }
    /*
    p = [1,2,3], q = [1,2,3]

    p = [1,2], q = [1,null,2]
     */
    static Stream<Arguments> getDataCaseTrue() {
        return Stream.of(
                Arguments.of(new TreeNode(1, new TreeNode(2), new TreeNode(3)), new TreeNode(1, new TreeNode(2), new TreeNode(3)))
        );
    }

    @ParameterizedTest
    @MethodSource("getDataCaseFalse")
    void checkMethodCaseFalse(TreeNode first, TreeNode second) {
        Assertions.assertThat(sameTree.isSameTree(first, second)).isFalse();
    }

    static Stream<Arguments> getDataCaseFalse() {
        return Stream.of(
                Arguments.of(new TreeNode(1, new TreeNode(2), null), new TreeNode(1, null, new TreeNode(2)))
        );
    }
}
