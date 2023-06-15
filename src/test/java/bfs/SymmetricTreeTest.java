package bfs;

import easy.breadthfirstsearch.SymmetricTree;
import easy.breadthfirstsearch.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SymmetricTreeTest {

    private SymmetricTree symmetricTree;

    @BeforeEach
    void prepare() {
        symmetricTree = new SymmetricTree();
    }

    @ParameterizedTest
    @MethodSource("getDataCaseTrue")
    void checkMethodCaseTrue(TreeNode root) {
        Assertions.assertThat(symmetricTree.isSymmetric(root)).isTrue();
    }

    @ParameterizedTest
    @MethodSource("getDataCaseFalse")
    void checkMethodCaseFalse(TreeNode root) {
        Assertions.assertThat(symmetricTree.isSymmetric(root)).isFalse();
    }

    /*
    root = [1,2,2,3,4,4,3]
     */
    static Stream<Arguments> getDataCaseTrue() {
        return Stream.of(
                Arguments.of(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3))))
        );
    }
    /*
    root = [1,2,2,null,3,null,3]
     */
    static Stream<Arguments> getDataCaseFalse() {
        return Stream.of(
                Arguments.of(new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3))))
        );
    }
}
