package co.edu.sena.project_2687365.model.repository;


import co.edu.sena.project_2687365.model.Product;
import co.edu.sena.project_2687365.util.connection_test.ConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpI implements Repository<Product>{

    private String sql = null;

    @Override
    public List<Product> listAllObj() throws SQLException {
        sql = "select p.Product_id, p.Product_name, p.Product_value, p.Category_id " +
                "from Product p order by p.Product_name, p.Product_value";
        List<Product> products = new ArrayList<>();
        try (Connection conn = ConnectionPool.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Product p = createObj(rs);
                products.add(p);
            }
        }
        return products;
    }

    @Override
    public Product byIdObj(Integer id) throws SQLException {
        sql = "select p.Product_id, p.Product_name, p.Product_value, p.Category_id " +
                "from Product p where p.Product_id = ?";
        Product product = null;

        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    product =createObj(rs);
                }
            }
        }
        return product;
    }

    @Override
    public Integer saveObj(Product product) throws SQLException {
        Integer rowsAffected = 0;

        if (product.getProduct_id() != null && product.getProduct_id() > 0) {
            sql = "update Product set Product_name = ?, Product_value = ?, Category_id = ? " +
                    " where Product_id = ? ";
        } else {
            sql = "insert into Product (Product_name, Product_value, Category_id) " +
                    "values(upper(?), upper(?), lower(?), ";
        }
        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, product.getProduct_name());
            ps.setFloat(2, product.getProduct_value());
            ps.setInt(3, product.getCategory_id());
            if (product.getProduct_id() != null && product.getProduct_id() > 0) {
                ps.setInt(4, product.getProduct_id());
            }
            rowsAffected = ps.executeUpdate();
        }
        return rowsAffected;
    }

    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql = "delete from Product where Product_id = ?";
        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    @Override
    public Product createObj(ResultSet rs) throws SQLException {
        Product product = new Product();
        product.setProduct_id(rs.getInt("id_Product"));
        product.setProduct_name(rs.getString("Product_name"));
        product.setProduct_value(rs.getFloat("Product_value"));
        product.setCategory_id(rs.getInt("id_Category"));

        return product;
    }
}