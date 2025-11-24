package model;

import constant.Constants;

public class Novel extends Book{
    private String genre;

    public Novel() {
        super();
    }

    public Novel(String id, String title, String author, double price, int quantity, String genre) {
        super(id, title, author, price, quantity);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf(Constants.HienThi.DISPLAY_INFO_NOVEL,genre);
    }
}
