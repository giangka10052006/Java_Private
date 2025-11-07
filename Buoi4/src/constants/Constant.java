package constants;

public class Constant {
    public static class INSERT{
        public static final String RAM = "Nhập RAM của laptop(GB): ";
        public static final String CPU = "Nhập CPU của laptop(Ghz): ";
        public static final String HAS_5G = "Có 5G hay không (Y/N): ";
        public static final String PRODUCT_TYPE = "Nhập loại sản phẩm (Laptop / SmartPhone): ";
        public static final String PRODUCT_NAME = "Nhập tên sản phẩm: ";
        public static final String PRODUCT_DESCRIPTION = "Nhập mô tả sản phẩm: ";
        public static final String PRODUCT_PRICE = "Nhập giá sản phẩm: ";
        public static final String PRODUCT_ID = "Nhập ID sản phẩm: ";
    }

    public static class SuccessMessage{
        public static final String ADD_SUCCESS = ">> Đã thêm thành công";
        public static final String REMOVE_SUCCESS = ">> Đã xóa thành công sản phẩm có ID: ";
        public static final String FIND_SUCCESS = ">> Đã tìm thấy sản phẩm: ";
        public static final String SHOW_SUCCUSS = ">> Danh sách sản phẩm: ";
        public static final String EXIT_SUCCUSS = ">> Kết thúc ";
    }

    public static class ErrorMessage{
        public static final String ADD_ERROR = ">> Sản phẩm không hợp lệ!!!";
        public static final String FIND_ERROR = ">> Không tìm thấy sản phẩm có ID: ";
        public static final String SELECT_ERROR = ">> Không hợp lệ, vui lòng nhập lại!!! ";
        public static final String EMPTY_ERROR = ">> Danh sách rỗng!!! ";
    }

    public static class Menu{
        public static final String MENU = """
                      -------Menu--------
                -------------------------------
                |1.Thêm sản phẩm              |
                |2.Hiển thị danh sách sản phẩm|
                |3.Tìm sản phẩm theo ID       |
                |4.Xóa sản phẩm theo ID       |
                |5.Kết thúc                   |
                -------------------------------
                >> Mời chọn:\s""";
    }
}
