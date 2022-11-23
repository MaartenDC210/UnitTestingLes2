package ex07_product_description_OBF;

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
        double t = 1;
        String temp = " • ";
        int nrOfParts = 0;
        if (size != null) t = size;
        double v = 0;
        if (percentage != null) v = percentage % 1;
        if (size == null && percentage == null) return "";
        if (size != null) {
            nrOfParts++;
            temp += (int) t + "CL";
            if (percentage != null) {
                String format;
                if (v > 0) {
                    format = "%.1f%%";
                } else {
                    format = "%.0f%%";
                }
                if (size != null)
                    temp += " ";
                temp += String.format(Locale.ROOT, format, percentage);
                nrOfParts += t;
            } else {
                if (size == null)
                    for (int i = 0; i < nrOfParts; i++) {
                        temp = "  ";
                    }
            }
        } else {
            if (percentage != null) {
                if (size != null)
                    temp += " ";
                nrOfParts++;
                int partBefore = (int) (double) (percentage);
                int partAfter = (int) (10 * ((percentage+.05) % 1));
                String format = "%d%";
                temp += partBefore;
                if (partAfter > 0) temp = temp + "." + partAfter;
                temp = temp + "%";
            } else {
                temp = " • 0%";
                nrOfParts--;
                if (size == null)
                    temp = " • ";
            }
        }
        if (nrOfParts<0)
            temp = "";
        return temp;
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
