import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());

        int[] a = new int[n];
        for(int i = 0; i < n;i++){
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            a[i] = Integer.parseInt(sc.nextLine());
        }

        String chon;
        do{
            System.out.println("              -------Menu------");
            System.out.println("-----------------------------------------------");
            System.out.println("|1.Tinh tổng các phần tử trong mảng           |");
            System.out.println("|2.In ra phần tử lớn nhất, nhỏ nhất trong mảng|");
            System.out.println("|3.Sắp xếp lại mảng theo chiều tăng dần       |");
            System.out.println("|4.In ra số nguyên tố lớn nhất trong mảng     |");
            System.out.println("|5.Thoát                                      |");
            System.out.println("-----------------------------------------------");

            System.out.print(">> Nhập lựa chọn: ");
            chon = sc.nextLine();

            switch(chon) {
                case "1": {
                    System.out.println("Tổng các phần tử = " + Utils.sum(a));
                    break;
                }
                case "2": {
                    System.out.println("Phần tử lớn nhất: " + Utils.isMax(a));
                    System.out.println("Phần tử nhỏ nhất: " + Utils.isMin(a));
                    break;
                }
                case "3": {
                    Utils.sapXep(a);
                    System.out.println(">>Mảng sau khi sắp xếp: ");
                    Utils.inMang(a);
                    break;
                }
                case "4": {
                    int maxPrime = Utils.soNguyenToMax(a);
                    if (maxPrime == -1)
                        System.out.println("Không có số nguyên tố trong mảng.");
                    else
                        System.out.println("Số nguyên tố lớn nhất là: " + maxPrime);
                    break;
                }
                case "5": {
                    System.out.println("KET THUC");
                    break;
                }
                default:{
                    System.out.println(">>Không hợp lệ , vui lòng nhập lại!");
                    break;
                }
            }
        }while(!chon.equalsIgnoreCase("5"));
    }
}