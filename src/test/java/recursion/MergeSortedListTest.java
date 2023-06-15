package recursion;

import easy.recursion.ListNode;
import easy.recursion.MergeSortedList;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MergeSortedListTest {

    private MergeSortedList mergeSortedList;

    @BeforeEach
    void prepare() {
        mergeSortedList = new MergeSortedList();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(ListNode first, ListNode second, ListNode expected) {
        Assertions.assertThat(mergeSortedList.mergeTwoLists(first, second)).isEqualTo(expected);
    }

    /*
    list1 = [1,2,4], list2 = [1,3,4]
    Output: [1,1,2,3,4,4]
     */
    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(4))),
                        new ListNode(1, new ListNode(3, new ListNode(4))),
                        new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4)))))))
        );
    }
}
