
import medium.ListNode;
import medium.RemoveNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class RemoveNodeTest {

    private RemoveNode removeNode;

    @BeforeEach
    void prepare() {
        removeNode = new RemoveNode();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(ListNode head, int n, ListNode expected) {
        Assertions.assertThat(removeNode.removeNthFromEnd(head, n)).isEqualTo(expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2,
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))))),
                Arguments.of(new ListNode(1), 1, null),
                Arguments.of(new ListNode(1, new ListNode(2)), 1, new ListNode(1))
//                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))),
//                        new ListNode(3, new ListNode(4, new ListNode(5))))
        );
    }
}
