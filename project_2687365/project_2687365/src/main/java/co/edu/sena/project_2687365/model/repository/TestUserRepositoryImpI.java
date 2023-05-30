package co.edu.sena.project_2687365.model.repository;

import co.edu.sena.project_2687365.model.User;

import java.sql.SQLException;
import java.sql.SQLOutput;

public class TestUserRepositoryImpI {
    public static void main(String[] args) throws SQLException {
        Repository<User> repository = new UseRepositoryImpI();

        System.out.println("========== saveObj Insert ==========");
        User userInsert = new User();
        userInsert.setUser_firstname("Hector");
        userInsert.setUser_lastname("Beltran");
        userInsert.setUser_email("Hecter2023@gmail.com");
        userInsert.setUser_password("wasd0630");
        repository.saveObj(userInsert);
        userInsert.setUser_firstname("Brayan");
        userInsert.setUser_lastname("Alfonso");
        userInsert.setUser_email("Brayis111@gmail.com");
        userInsert.setUser_password("GomitasconPapas777");
        repository.saveObj(userInsert);

        System.out.println("========== listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("========== saveObj ==========");
        User userUpdate = new User();
        userUpdate.setUser_id(2);
        userUpdate.setUser_firstname("Sebastian");
        userUpdate.setUser_lastname("Rondon");
        userUpdate.setUser_email("Sebas777@gmail.com");
        userUpdate.setUser_password("S3bas1212");
        repository.saveObj(userUpdate);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== deleteObj ==========");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }
}
