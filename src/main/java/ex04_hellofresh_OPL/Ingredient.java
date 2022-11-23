package ex04_hellofresh_OPL;

public class Ingredient {
    private Integer amount;
    private String singular;
    private String plural;
    private String what;

    public Ingredient(String what) {
        this.what = what;
    }

    public Ingredient(int amount, String singular, String plural) {
        this.amount = amount;
        this.singular = singular;
        this.plural = plural;
    }

    public Ingredient(int amount, String singular, String plural, String what) {
        this.amount = amount;
        this.singular = singular;
        this.plural = plural;
        this.what = what;
    }

    public String print(int nrOfPortions) {
        if (nrOfPortions == 0) return "";
        if (amount == null) return what + " naar smaak";
        final int amountNeeded = amount * nrOfPortions;
        if (amountNeeded == 0) return "";
        final String postFix = what != null ? " " + what : "";
        if (amountNeeded == 1) {
            return "" + amountNeeded + " " + singular + postFix;
        }
        return "" + amountNeeded + " " + plural + postFix;
    }

    public static void main(String[] args) {
        Ingredient i1 = new Ingredient(1, "appel", "appels");
        System.out.println(i1.print(1));
        Ingredient i2 = new Ingredient(2, "appel", "appels");
        System.out.println(i2.print(1));
        Ingredient i3 = new Ingredient(2, "appel", "appels");
        System.out.println(i3.print(10));

        Ingredient i4 = new Ingredient(100, "gram", "gram", "bloem");
        System.out.println(i4.print(0));
        Ingredient i5 = new Ingredient(0, "gram", "gram", "bloem");
        System.out.println(i5.print(10));
        Ingredient i6 = new Ingredient(100, "gram", "gram", "bloem");
        System.out.println(i6.print(1));
        Ingredient i7 = new Ingredient(100, "gram", "gram", "bloem");
        System.out.println(i7.print(2));

        Ingredient i8 = new Ingredient(1, "eetlepel", "eetlepels", "suiker");
        System.out.println(i8.print(20));
        Ingredient i9 = new Ingredient(2, "eetlepel", "eetlepels", "suiker");
        System.out.println(i9.print(2));
        Ingredient i10 = new Ingredient(1, "eetlepel", "eetlepels", "suiker");
        System.out.println(i10.print(0));

        Ingredient i11 = new Ingredient("peper en zout");
        System.out.println(i11.print(0));
        Ingredient i12 = new Ingredient("peper en zout");
        System.out.println(i12.print(17));
    }
}
