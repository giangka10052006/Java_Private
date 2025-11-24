package model;

import constant.Constants;

public class TextBook extends Book{
    private String subject;

    public TextBook() {
    }

    public TextBook(String id, String title, String author, double price, int quantity, String subject) {
        super(id, title, author, price, quantity);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf(Constants.HienThi.DISPLAY_INFO_TEXTBOOK,subject);
    }
}
