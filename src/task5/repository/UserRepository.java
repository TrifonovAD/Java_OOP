package task5.repository;

import task5.model.User;

import java.io.FileWriter;

public class UserRepository {
    public void saveUser(User user){
        try(FileWriter fileWriter = new FileWriter("users.txt", true)){
            fileWriter.write(user.toString());

        }catch (Exception e){
            System.out.println("error in repo");
        }

    }
}
