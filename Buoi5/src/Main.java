import constant.*;
import model.Novel;
import model.TextBook;
import service.IBookService;
import service_impl.IBookServicelmpl;
import model.*;
import java.util.Scanner;

public class Main{
    public static Scanner sc = new Scanner(System.in);
    public static IBookService service = new IBookServicelmpl();
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        String select;
        do{
            System.out.print(Constants.Menu.MENU);
            select = sc.nextLine();

            switch (select){
                case "1":{
                    themSach();
                    break;
                }
                case "2":{
                    laySachTheoID();
                    break;
                }
                case "3":{
                    laySachTheoLoai();
                    break;
                }
                case "4":{
                    layTatCaSach();
                    break;
                }
                case "5":{
                    xoaTheoID();
                    break;
                }
                case "6":{
                    tongGiaTriThuVien();
                    break;
                }
                case "7":{
                    System.out.println(Constants.SuccessMessage.SUCCESS_KETTHUC);
                    System.exit(0);
                }
                default:{
                    System.out.println(Constants.ErorrMessage.ERORR_INFO);
                }
            }
        }while (!select.equalsIgnoreCase("7"));
    }

    public static void themSach(){
        System.out.print(Constants.Info.INFO_LOAI_SACH);
        int type = Integer.parseInt(sc.nextLine());

        System.out.print(Constants.Info.INFO_ID);
        String id = sc.nextLine();
        System.out.print(Constants.Info.INFO_TITLE);
        String title = sc.nextLine();
        System.out.print(Constants.Info.INFO_AUTHOR);
        String author = sc.nextLine();
        System.out.print(Constants.Info.INFO_PRICE);
        double price = Double.parseDouble(sc.nextLine());
        System.out.print(Constants.Info.INFO_QUANTITY);
        int quantity = Integer.parseInt(sc.nextLine());

        if(type == 1){
            System.out.print(Constants.Info.INFO_SUBJECT);
            String subject = sc.nextLine();
            service.addBook(new TextBook(id,title,author,price,quantity,subject));
        }
        else {
            System.out.print(Constants.Info.INFO_GENRE);
            String genre = sc.nextLine();
            service.addBook(new Novel(id,title,author,price,quantity,genre));
        }

        System.out.println(Constants.SuccessMessage.SUCCESS_ADD);
    }

    public static void laySachTheoID(){
        System.out.print(Constants.Info.INFO_ID);
        String id = sc.nextLine();
        Book book = service.getBookById(id);
        if(book == null) System.out.println(Constants.ErorrMessage.ERORR_FIND);
        else book.displayInfo();
    }

    public static void laySachTheoLoai() {
        System.out.print(Constants.Info.INFO_LOAI_SACH);
        int type = Integer.parseInt(sc.nextLine());

        Category cat = (type == 1) ? Category.TEXTBOOK : Category.NOVEL;
        for (Book b : service.getAllBooksByCategory(cat)) {
            b.displayInfo();
        }
    }
    public static void layTatCaSach(){
        for (Book b : service.getAllBooks()) {
            b.displayInfo();
        }
    }

    public static void xoaTheoID(){
        System.out.print(Constants.Info.INFO_ID);
        String id = sc.nextLine();

        if(service.deleteBookById(id)){
            System.out.println(Constants.SuccessMessage.SUCCESS_DELETE);
        }
        else {
            System.out.println(Constants.ErorrMessage.ERORR_FIND);
        }
    }

    public static void tongGiaTriThuVien(){
        System.out.println("Tổng giá trị: " + service.calculateTotalValue());
    }
}