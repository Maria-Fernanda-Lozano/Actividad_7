package co.edu.sena.project_2687365.model.repository;

import co.edu.sena.project_2687365.model.Category;
import co.edu.sena.project_2687365.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CategoryRepositoryImpI implements Repository<Category>{
    @Override
    public List<Category> listAllObj() throws SQLException {
        return null;
    }

    @Override
    public Category byIdObj(Integer id) throws SQLException {
        return null;
    }

    @Override
    public Integer saveObj(Category category) throws SQLException {
        return null;
    }

    @Override
    public void deleteObj(Integer id) throws SQLException {

    }

    @Override
    public Category createObj(ResultSet rs) throws SQLException {
        return null;
    }
}