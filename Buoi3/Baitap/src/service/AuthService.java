package service;
import model.User;
import java.util.ArrayList;

public class AuthService  {
    private ArrayList<User> users;

    public AuthService(ArrayList<User> users){
        this.users = users;
    }

    public User login(String userName, String passWord){
        for(User u : users){
            if(u.getUsername().equals(userName) && u.getPassword().equals(passWord)){
                return u;
            }

        }
        return null;
    }

    public void register(String username, String password, String email, String phoneNumber){
        for(User u : users){
            if(u.getUsername().equals(username) && u.getEmail().equals(email) && u.getPhoneNumber().equals(phoneNumber) ){
                System.out.println(">> Đã tồn tại tài khoản");
                return;
            }
        }

        User newUser = new User(username,password,email,phoneNumber);
        users.add(newUser);
        System.out.println(">> Đã đăng ký thành công");
    }

    public void changePassWord(String userID, String newPassWord, String confirmNewPassWord){
        if(!newPassWord.equals(confirmNewPassWord)){
            System.out.println(">> Mật khẩu không trùng khớp");
            return;
        }

        for(User u : users){
            if(u.getId().equals(userID)){
                u.setPassword(newPassWord);
                System.out.println(">> Đã đổi mật khẩu thành công");
                return;
            }
        }

        System.out.println(">> Không tìm thấy User");
    }
}
