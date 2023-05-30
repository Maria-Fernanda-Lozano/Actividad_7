package co.edu.sena.project_2687365.model;

public class Category {
    private Integer Category_id;
    private String Category_name;

    public Category(String Category_name) {
    }

    public Category(int Category_id, String Category_name) {
        this.Category_id = Category_id;
        this.Category_name = Category_name;
    }

    public int getCategory_id() {
        return Category_id;
    }
    public void setCategory_id(int Category_id) {
        this.Category_id = Category_id;
    }
    public String getCategory_name() {
        return Category_name;
    }
    public void setCategory_name(String Category_name) {
        this.Category_name = Category_name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "Category_id=" + Category_id +
                ", Category_name='" + Category_name + '\'' +
                '}';
    }
}