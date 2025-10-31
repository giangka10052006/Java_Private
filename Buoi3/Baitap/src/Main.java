import model.User;
import service.AuthService;
import service.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static Scanner sc = new Scanner(System.in);
    private static ArrayList<User> users = new ArrayList<>();
    public static void main(String[] args){

        users.add(new User("ducgiang", "123", "giang@gmail.com", "032618815"));
        users.add(new User("ngochien", "456", "hien@gmail.com", "0327272382"));
        users.add(new User("daochien", "789", "chien@gmail.com", "0303123453"));
        users.add(new User("linhxinh", "987", "linh@gmail.com", "0345264757"));
        users.add(new User("nhungoc", "098", "ngoc@gmail.com", "034756384"));


        AuthService authService = new AuthService(users);
        UserService userService = new UserService(users);

        String select;
        do {
            System.out.println("----Menu Auth----");
            System.out.println("-----------------");
            System.out.println("|1. Login       |");
            System.out.println("|2. Register    |");
            System.out.println("|3.Exit         |");
            System.out.println("-----------------");
            System.out.print(">> Mời chọn: ");
            select = sc.nextLine();

            switch(select) {
                case "1":{
                    System.out.print("->Username: ");
                    String username = sc.nextLine();
                    System.out.print("->Password: ");
                    String password = sc.nextLine();
                    User user1 = authService.login(username,password);

                    if(user1 != null){
                        System.out.println(">>Đăng nhâp thành công");
                        menu(user1,authService,userService);
                    }
                    else {
                        System.out.println(">> Sai tên đăng nhập hoặc mật khẩu!");
                    }
                    break;
                }
                case "2": {
                    System.out.print("->Username: ");
                    String username = sc.nextLine();
                    System.out.print("->Password: ");
                    String password = sc.nextLine();
                    System.out.print("->Email: ");
                    String email = sc.nextLine();
                    System.out.print("->NumberPhone: ");
                    String numberphone = sc.nextLine();
                    authService.register(username,password,email,numberphone);
                    break;
                }
                case "3": {
                    System.out.println(">>Đã thoát");
                    break;
                }
                default:{
                    System.out.println(">>Không hợp lệ");
                }
            }
        }while(!select.equals("3"));
    }

    public static void menu(User user,AuthService authService, UserService userService){
        String select;
        do {
            System.out.println("-------Menu User-------");
            System.out.println("-----------------------");
            System.out.println("|1. Get user by i     |");
            System.out.println("|2. Get all user      |");
            System.out.println("|3.Change password    |");
            System.out.println("|4.Logout             |");
            System.out.println("-----------------------");
            System.out.println(">> Mời chọn: ");
            select = sc.nextLine();

            switch(select) {
                case "1":{
                    System.out.print(">> Nhập id:");
                    String id = sc.nextLine();
                    if(userService.getUserById(id) != null){
                        System.out.println(userService.getUserById(id));
                    }
                    else {
                        System.out.println(">> Không tìm thấy người dùng");
                    }
                    break;
                }
                case "2": {
                    System.out.println(">> Danh sách người dùng");
                    for(User u : userService.getAllUsers()){
                        System.out.println(u);
                    }
                    break;
                }
                case "3": {
                    System.out.print("Mật khẩu mới: ");
                    String newpass = sc.nextLine();
                    System.out.print("Xác nhân lại mật khẩu: ");
                    String cofirmpass = sc.nextLine();
                    authService.changePassWord(user.getId(),newpass,cofirmpass);
                    break;
                }
                case "4": {
                    System.out.println(">>Đã đăng xuất");
                    break;
                }
                default:{
                    System.out.println(">>Không hợp lệ");
                }
            }
        }while(!select.equals("4"));
    }
}