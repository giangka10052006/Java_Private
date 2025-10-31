package service;

import model.User;
import java.util.ArrayList;

public class UserService {
    private ArrayList<User> users;

    public UserService(ArrayList<User> users){
        this.users = users;
    }

    public User getUserById(String userId){
        for(User u : users){
            if(u.getId().equals(userId)){
                return u;
            }
        }

        return null;
    }

    public ArrayList<User> getAllUsers(){
        return users;
    }
}
