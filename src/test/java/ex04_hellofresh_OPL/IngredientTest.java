package ex04_hellofresh_OPL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngredientTest {
    @Test
    void printNrOfPortions0() {
        Ingredient ingredient = new Ingredient(100, "gram", "gram", "bloem");
        assertEquals("", ingredient.print(0));
    }

    @Test
    void printAmount0() {
        Ingredient ingredient = new Ingredient(0, "gram", "gram", "bloem");
        assertEquals("", ingredient.print(10));
    }

    @Test
    void printBloem100Gram() {
        Ingredient ingredient = new Ingredient(100, "gram", "gram", "bloem");
        assertEquals("100 gram bloem", ingredient.print(1));
    }

    @Test
    void printSuiker1Kopje() {
        Ingredient ingredient = new Ingredient(1, "kopje", "kopjes", "suiker");
        assertEquals("1 kopje suiker", ingredient.print(1));
    }

    @Test
    void printSuiker2Kopjes() {
        Ingredient ingredient = new Ingredient(2, "kopje", "kopjes", "suiker");
        assertEquals("2 kopjes suiker", ingredient.print(1));
    }

    @Test
    void print1Appel() {
        Ingredient ingredient = new Ingredient(1, "appel", "appels");
        assertEquals("1 appel", ingredient.print(1));
    }

    @Test
    void print2Appels() {
        Ingredient ingredient = new Ingredient(2, "appel", "appels");
        assertEquals("2 appels", ingredient.print(1));
    }

    @Test
    void print2Appels10Portions() {
        Ingredient ingredient = new Ingredient(2, "appel", "appels");
        assertEquals("20 appels", ingredient.print(10));
    }

    @Test
    void printBloem_2Persons() {
        Ingredient ingredient = new Ingredient(100, "gram", "gram", "bloem");
        assertEquals("200 gram bloem", ingredient.print(2));
    }

    @Test
    void printSuiker_20Persons() {
        Ingredient ingredient = new Ingredient(1, "eetlepel", "eetlepels", "suiker");
        assertEquals("20 eetlepels suiker", ingredient.print(20));
    }

    @Test
    void printNaarSmaak_0Persons() {
        Ingredient ingredient = new Ingredient("peper en zout");
        assertEquals("", ingredient.print(0));
    }

    @Test
    void printNaarSmaak_10Persons() {
        Ingredient ingredient = new Ingredient("peper en zout");
        assertEquals("peper en zout naar smaak", ingredient.print(10));
    }
}
