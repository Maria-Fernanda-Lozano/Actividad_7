package co.edu.sena.project_2687365.model;

public class Product {
    private Integer Product_id;
    private String Product_name;
    private Float Product_value;
    private Integer Category_id;


    public Product() {

    }

    public Product(Integer product_id, String product_name, Float product_value, Integer category_id) {
        Product_id = product_id;
        Product_name = product_name;
        Product_value = product_value;
        Category_id = category_id;
    }



    public Integer getProduct_id() {
        return Product_id;
    }

    public void setProduct_id(Integer product_id) {
        Product_id = product_id;
    }

    public String getProduct_name() {
        return Product_name;
    }

    public void setProduct_name(String product_name) {
        Product_name = product_name;
    }

    public Float getProduct_value() {
        return Product_value;
    }

    public void setProduct_value(Float product_value) {
        Product_value = product_value;
    }

    public Integer getCategory_id() {
        return Category_id;
    }

    public void setCategory_id(Integer category_id) {
        Category_id = category_id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Product_id=" + Product_id +
                ", Product_name='" + Product_name + '\'' +
                ", Product_value=" + Product_value +
                ", Category_id=" + Category_id +
                '}';
    }
}

