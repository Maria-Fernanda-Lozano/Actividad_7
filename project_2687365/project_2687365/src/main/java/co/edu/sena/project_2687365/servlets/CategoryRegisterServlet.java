package co.edu.sena.project_2687365.servlets;

import co.edu.sena.project_2687365.model.Category;
import co.edu.sena.project_2687365.model.repository.CategoryRepositoryImpI;
import co.edu.sena.project_2687365.model.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

public class CategoryRegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String Category_name=request.getParameter("Category_name");

        Category category=new Category(Category_name);
        //call Repository layer and save the user object to DB
        Repository<Category> repository= new CategoryRepositoryImpI();
        int rows=0;
        try {
            rows=repository.saveObj(category);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // prepare an information message for User about success or failure of the operation
        String infoMessage= null;
        if(rows==0){
            System.out.println("Ocurrio Un Error");
        }else {
            System.out.println("Regitro Exitoso");
        }
    }
}