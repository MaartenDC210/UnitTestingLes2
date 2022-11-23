package ex02_product_description_OPL;

import java.util.Locale;

public class Product {
    private String name;
    private Integer size;
    private Double percentage;

    public Product(String name, Integer size, Double percentage) {
        this.name = name;
        this.size = size;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public String productDescription() {
        if (size == null && percentage == null) return "";
        String result = " • ";
        if (size != null) {
            result += size + "CL";
        }
        if (percentage != null) {
            String format = percentage % 1 == 0 ? "%.0f%%" : "%.1f%%";
            if (size != null) result += " ";
            //result += String.format(format, percentage);
            result += String.format(Locale.ROOT, format, percentage);
        }
        return result;
    }

    public static void main(String[] args) {
        Product p1 = new Product("empty", null, null);
        System.out.println(p1.productDescription());

        Product p2 = new Product("empty", 25, null);
        System.out.println(p2.productDescription());

        Product p3 = new Product("empty", null, 8.0);
        System.out.println(p3.productDescription());

        Product p4 = new Product("empty", 33, 6.0);
        System.out.println(p4.productDescription());

        Product p5 = new Product("empty", 33, 6.3);
        System.out.println(p5.productDescription());

        Product p6 = new Product("empty", 33, 6.333);
        System.out.println(p6.productDescription());

        Locale originalLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);

        Product p7 = new Product("empty", 33, 6.3);
        System.out.println(p7.productDescription());

        Product p8 = new Product("empty", 33, 6.333);
        System.out.println(p8.productDescription());

        Locale.setDefault(originalLocale);
    }
}
