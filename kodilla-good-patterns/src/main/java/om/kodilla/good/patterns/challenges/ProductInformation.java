package om.kodilla.good.patterns.challenges;

public class ProductInformation {

    private String productName;
    private String productCategory;
    private String productBrand;

    public ProductInformation(String productName, String productCategory, String productBrand) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productBrand = productBrand;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductBrand() {
        return productBrand;
    }

    @Override
    public String toString() {
        return "ProductInformation{" +
                "productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productBrand='" + productBrand + '\'' +
                '}';
    }
}
