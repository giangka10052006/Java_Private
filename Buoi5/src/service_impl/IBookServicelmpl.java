package service_impl;

import constant.Category;
import model.Book;
import model.Novel;
import model.TextBook;
import service.IBookService;

import java.util.ArrayList;

public class IBookServicelmpl implements IBookService {
    public ArrayList<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book){
        books.add(book);
    }
    @Override
    public Book getBookById(String id){
        for(Book x : books){
            if(x.getId().equalsIgnoreCase(id)){
                return x;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Book> getAllBooksByCategory(Object category){
        ArrayList<Book> result = new ArrayList<>();
        Category category1 = (Category) category;
        for (Book b : books) {
            if(category1 == Category.TEXTBOOK && b instanceof TextBook){
                result.add(b);
            }
            else if(category1 == Category.NOVEL && b instanceof Novel){
                result.add(b);
            }
        }
        return result;
    }

    @Override
    public boolean deleteBookById(String id){
        for(int i = 0; i < books.size();i++){
            if(books.get(i).getId().equalsIgnoreCase(id)){
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Book> getAllBooks(){
        return books;
    }

    public double calculateTotalValue(){
        double total = 0;
        for(Book x : books){
            total += x.getPrice() * x.getQuantity();
        }
        return total;
    }
}
