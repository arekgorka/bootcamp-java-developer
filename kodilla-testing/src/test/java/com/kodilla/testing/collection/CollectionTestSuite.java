package com.kodilla.testing.collection;

//import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

public class CollectionTestSuite {

    @BeforeEach
    public void beforeEach() {
        System.out.println("Case Test: begin");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Case Test: end");
    }

    @DisplayName(
            "sprawdzający, czy klasa zachowuje się poprawnie, gdy lista jest pusta")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        int emptyList = oddNumbersExterminator.numbers.size();
        System.out.println("Check if the list is empty...");
        //Then
        Assertions.assertEquals(0, emptyList);
    }

    @DisplayName(
            "sprawdzający, czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste.")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        int fullList = oddNumbersExterminator.exterminate().size();
        System.out.println("Check if the list is full...");
        //Then
        Assertions.assertEquals(10, fullList);
    }
}
