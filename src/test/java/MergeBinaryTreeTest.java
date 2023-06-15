import com.sun.source.tree.Tree;
import easy.MergeBinaryTree;
import easy.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MergeBinaryTreeTest {

    private MergeBinaryTree mergeBinaryTree;


    @BeforeEach
    void prepare() {
        mergeBinaryTree = new MergeBinaryTree();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(TreeNode first, TreeNode second, TreeNode expected) {
        Assertions.assertThat(mergeBinaryTree.mergeTrees(first, second)).isEqualTo(expected);
    }
    /*
    Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
    Output: [3,4,5,5,4,null,7]
     */
    static Stream<Arguments> getData() {
        TreeNode first = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        TreeNode second = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));
        TreeNode expected = new TreeNode(3, new TreeNode(4, new TreeNode(5), new TreeNode(4)), new TreeNode(5, null, new TreeNode(7)));

        return Stream.of(
                Arguments.of(first, second, expected)
        );
    }
}
