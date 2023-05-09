package task5.service;

import task5.model.User;
import task5.repository.UserRepository;

public class UserServiceImpl implements UserService{
    private UserRepository userRepository = new UserRepository();
    @Override
    public void saveUser(User user) {
        if (user == null){
            System.out.println("User is null!");
        }

        userRepository.saveUser(user);

    }
}
