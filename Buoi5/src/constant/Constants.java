package constant;

public class Constants {
    public static class HienThi{
        public static final String DISPLAY_INFO = "ID: %s - Title: %s - Author: %s - Price: %.2f - Quantity: %d ";
        public static final String DISPLAY_INFO_NOVEL = "- Genre: %s \n";
        public static final String DISPLAY_INFO_TEXTBOOK = "- Subject: %s \n";
    }

    public static class Menu{
        public static final String MENU = """
                                     |Menu|
                --------------------------------------------------
                |1.Thêm sách                                     |
                |2.Lấy sách theo ID                              |
                |3.Lấy tất cả sách theo thể loại (TextBook/Novel)|
                |4. Lấy tất cả sách                              |
                |5. Xóa sách theo ID                             |
                |6. Tổng giá trị thư viện                        |
                |7.Kết thúc                                      |
                --------------------------------------------------
                >> Mời chọn: \s""";
    }

    public static class Info{
        public static final String INFO_LOAI_SACH = "Nhập loại sách (1-Text book/2-Novel): ";
        public static final String INFO_ID = "Nhập ID: ";
        public static final String INFO_TITLE = "Nhập title: ";
        public static final String INFO_AUTHOR = "Nhập author: ";
        public static final String INFO_PRICE = "Nhập price: ";
        public static final String INFO_QUANTITY = "Nhập quantity: ";
        public static final String INFO_SUBJECT = "Nhập subject: ";
        public static final String INFO_GENRE = "Nhập genre: ";
    }

    public static class SuccessMessage{
        public static final String SUCCESS_ADD = "Đã thêm sách thành công";
        public static final String SUCCESS_DELETE = "Đã xóa sách thành công";
        public static final String SUCCESS_KETTHUC = "KẾT THÚC";
    }

    public static class ErorrMessage{
        public static final String ERORR_FIND = "Không tìm thấy sách";
        public static final String ERORR_INFO = "Không hợp lệ, vui lòng nhập lại!!!";
    }
}
