package service;

import constants.Constant;
import domain.Laptop;
import domain.Product;
import domain.SmartPhone;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    public static ArrayList<Product> products = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public void addProduct(Product product){
        products.add(product);
    }

    public void addProduct(String type, String name,String description,double price){
        if(type.equalsIgnoreCase("Laptop")){
            System.out.print(Constant.INSERT.RAM);
            String ram = sc.nextLine();
            System.out.print(Constant.INSERT.CPU);
            String cpu = sc.nextLine();

            products.add(new Laptop(name,description,price,ram,cpu));
            System.out.println(Constant.SuccessMessage.ADD_SUCCESS);
        }
        else if (type.equalsIgnoreCase("SmartPhone")) {
            System.out.print(Constant.INSERT.HAS_5G);
            String h_5g = sc.nextLine().trim();
            boolean has5G = h_5g.equalsIgnoreCase("Y");

            products.add(new SmartPhone(name,description,price,has5G));
            System.out.println(Constant.SuccessMessage.ADD_SUCCESS);
        }
        else{
            System.out.println(Constant.ErrorMessage.ADD_ERROR);
        }
    }

    public void removeById(int id){
        for(int i = 0; i < products.size();i++){
            if(products.get(i).getId() == id){
                products.remove(i);
                System.out.println(Constant.SuccessMessage.REMOVE_SUCCESS + id);
                return;
            }
        }

        System.out.println(Constant.ErrorMessage.FIND_ERROR + id);
    }

    public void getById(int id){
        boolean check = false;
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println(Constant.SuccessMessage.FIND_SUCCESS);
                System.out.println(product.getInfo());
                check = true;
                break;
            }
        }
        if(!check)
            System.out.println(Constant.ErrorMessage.FIND_ERROR + id);
    }

    public void getAllProducts(){
        if (products.isEmpty()){
            System.out.println(Constant.ErrorMessage.EMPTY_ERROR);
        }

        System.out.println(Constant.SuccessMessage.SHOW_SUCCUSS);
        for (Product product : products) {
            System.out.println(product.getInfo());
        }
    }
}
