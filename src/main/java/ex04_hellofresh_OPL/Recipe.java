package ex04_hellofresh_OPL;

import java.util.ArrayList;

public class Recipe {

    private final String dishName;
    private final ArrayList<Ingredient> ingredients = new ArrayList<>();
    private int amountForRecipe = 1;


    public Recipe(String dishName) {
        this.dishName = dishName;
    }

    public Recipe(String dishName, int amountForRecipe) {
        this.dishName = dishName;
        this.amountForRecipe = amountForRecipe;
    }

    public String print(int nrOfPersons) {
        String personen = nrOfPersons == 1 ? " persoon" : " personen";
        StringBuilder resultBuilder = new StringBuilder(dishName + " voor " + nrOfPersons + personen);
        if (nrOfPersons == 0) return resultBuilder.toString();

        for (Ingredient ingredient : ingredients) {
            resultBuilder.append("\n  ").append(ingredient.print(nrOfPersons / amountForRecipe));
        }
        return resultBuilder.toString();

    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public static void main(String[] args) {
        Recipe r1 = new Recipe("appeltaart");
        System.out.println(r1.print(0));

        Recipe r2 = new Recipe("appeltaart");
        System.out.println(r2.print(1));

        Recipe r3 = new Recipe("appeltaart");
        r3.addIngredient(new Ingredient(1, "kopje", "kopjes", "bloem"));
        System.out.println(r3.print(0));

        Recipe r4 = new Recipe("appeltaart");
        r4.addIngredient(new Ingredient(1, "kopje", "kopjes", "bloem"));
        System.out.println(r4.print(1));

        Recipe r5 = new Recipe("appeltaart");
        r5.addIngredient(new Ingredient(1, "kopje", "kopjes", "bloem"));
        r5.addIngredient(new Ingredient(2, "eetlepel", "eetlepels", "suiker"));
        System.out.println(r5.print(1));

        Recipe r6 = new Recipe("appeltaart");
        r6.addIngredient(new Ingredient(1, "kopje", "kopjes", "bloem"));
        r6.addIngredient(new Ingredient(2, "eetlepel", "eetlepels", "suiker"));
        System.out.println(r6.print(10));

        Recipe r7 = new Recipe("cake", 4);
        r7.addIngredient(new Ingredient(1, "kopje", "kopjes", "bloem"));
        r7.addIngredient(new Ingredient(2, "eetlepel", "eetlepels", "suiker"));
        System.out.println(r7.print(4));

        Recipe r8 = new Recipe("cake", 4);
        r8.addIngredient(new Ingredient(1, "kopje", "kopjes", "bloem"));
        r8.addIngredient(new Ingredient(2, "eetlepel", "eetlepels", "suiker"));
        System.out.println(r8.print(8));

        Recipe r9 = new Recipe("cake", 4);
        r9.addIngredient(new Ingredient(1, "kopje", "kopjes", "bloem"));
        r9.addIngredient(new Ingredient(2, "eetlepel", "eetlepels", "suiker"));
        r9.addIngredient(new Ingredient("citroensap"));
        System.out.println(r9.print(4));
    }
}
