import easy.LinkedListMiddle;
import easy.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LinkedListMiddleTest {

    private LinkedListMiddle linkedListMiddle;

    @BeforeEach
    void prepare() {
        linkedListMiddle = new LinkedListMiddle();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(ListNode head, ListNode expected) {
        Assertions.assertThat(linkedListMiddle.middleNode(head)).isEqualTo(expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                new ListNode(3, new ListNode(4, new ListNode(5)))),
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))),
                        new ListNode(3, new ListNode(4, new ListNode(5))))
        );
    }
}
