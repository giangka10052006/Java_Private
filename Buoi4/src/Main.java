import domain.*;
import service.*;
import constants.*;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        Scanner sc = new Scanner(System.in);
        String select;
        do {
            System.out.print(Constant.Menu.MENU);
            select = sc.nextLine();

            switch (select){
                case "1":{
                    String type;
                    do {
                        System.out.print(Constant.INSERT.PRODUCT_TYPE);
                        type = sc.nextLine();

                        if(!(type.equalsIgnoreCase("Laptop") || type.equalsIgnoreCase("SmartPhone")))
                        {
                            System.out.println(Constant.ErrorMessage.SELECT_ERROR);
                        }
                    }while (!(type.equalsIgnoreCase("Laptop") || type.equalsIgnoreCase("SmartPhone")));

                    System.out.print(Constant.INSERT.PRODUCT_NAME);
                    String name = sc.nextLine();
                    System.out.print(Constant.INSERT.PRODUCT_DESCRIPTION);
                    String description = sc.nextLine();
                    System.out.print(Constant.INSERT.PRODUCT_PRICE);
                    double price = Double.parseDouble(sc.nextLine());

                    productController.addProduct(type,name,description,price);
                    break;
                }
                case "2":{
                    productController.getAllProducts();
                    break;
                }
                case "3":{
                    System.out.print(Constant.INSERT.PRODUCT_ID);
                    int id = Integer.parseInt(sc.nextLine());
                    productController.getById(id);
                    break;
                }
                case "4": {
                    System.out.print(Constant.INSERT.PRODUCT_ID);
                    int id = Integer.parseInt(sc.nextLine());
                    productController.removeById(id);
                    break;
                }
                case "5":{
                    System.out.println(Constant.SuccessMessage.EXIT_SUCCUSS);
                    System.exit(0);
                }
                default:{
                    System.out.println(Constant.ErrorMessage.SELECT_ERROR);
                }
            }

        }while(!select.equalsIgnoreCase("6"));
    }
}