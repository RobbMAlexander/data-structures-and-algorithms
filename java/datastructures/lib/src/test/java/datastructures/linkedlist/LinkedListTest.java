package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
 /* @Test
  void testAMethod() {
    LinkedList sut = new LinkedList();
    System.out.println(sut);
    assertTrue(true);
  }  */

  @Test
  void Test_insert_method_input_equals_head_value() {
    LinkedList testList = new LinkedList();
    testList.insert(1010);
    assertEquals(1010, testList.head.value, "Insert did not result in node at head holding expected value");
  }

  @Test
  void Test_insert_method_previous_head_equals_next() {
    LinkedList testList = new LinkedList();
    testList.insert(2323);
    testList.insert(1010);
    assertEquals(2323, testList.head.next.value, "Insert did not result in previous head as expected next-from-head");
  }

  @Test
  void Test_includes_method_returns_true_if_node_value_was_inserted() {
    LinkedList testList = new LinkedList();
    testList.insert(1010);
    testList.insert(2323);
    testList.insert(4545);
    assertTrue(testList.includes(2323));
  }

  @Test
  void Test_includes_method_returns_false_if_node_value_was_NOT_inserted() {
    LinkedList testList = new LinkedList();
    testList.insert(1010);
    testList.insert(2323);
    testList.insert(4545);
    assertFalse(testList.includes(6767));

  }


  @Test
  void Test_toString_OVERRIDE_method_return_equals_expected_formatting_around_input_to_string() {
    LinkedList testList = new LinkedList();
    testList.insert(1010);
    testList.insert(2323);
    testList.insert(4545);
    assertEquals("{1010} -> {2323} -> {4545} -> NULL", testList.toString(), "ToString did not return expected string output");

  }

}
