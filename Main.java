import java.util.Scanner;
public class Main {
    private static quanlisach manager;

    public static void main(String[] args) {
        quanlisach quanlisach = new quanlisach();
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("-----NEMU-------");
        System.out.println("1.Thêm tài liệu mới ");
        System.out.println("2.Xóa tài liệu ");
        System.out.println("3.Hiện thị thông tim về tài liệu");
        System.out.println("4.Tìm kiếm tài liệu ");
        System.out.println("5.thoát ");
        System.out.println("Vui lòng chọn.");
        choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.print("chọn mã tài liệu bạn cần (1: Sách, 2: Tạp chí, 3: Báo): ");
                int loai = sc.nextInt();
                System.out.println("nhập mã tài liêu:");
                String id = sc.nextLine();
                System.out.println("tên nhà sản xuất:");
                String tennhasx = sc.nextLine();
                System.out.println("so  ban hành :");
                int sobanphathanh = sc.nextInt();
                if (loai == 1) {
                    System.out.println("nhập tên tác giả : ");
                    String tentacgia = sc.nextLine();
                    System.out.println("nhập số trang :");
                    int sotrang = sc.nextInt();
                    tailieu sach = new sach(id, tennhasx, sobanphathanh, tentacgia, sotrang);
                   manager.addBook(sach);
                }else if(loai==2){
                    System.out.println("nhập số phát hành sách: ");
                    int sophathanh=sc.nextInt();
                    System.out.println("nhập tháng phát hành");
                    int thangphathanh=sc.nextInt();
                    tailieu tapchi=new tapchi(id,tennhasx,sobanphathanh,sophathanh,thangphathanh);
                    manager.addBook(tapchi);
                }else if(loai ==3 ){
                    System.out.println("nhập ngày phát hành:");
                    int ngayphathanh=sc.nextInt();
                    tailieu bao=new bao(id,tennhasx,sobanphathanh,ngayphathanh);
                    manager.addBook(bao);
                }break;
            case 2:
                System.out.print("nhập mã cần xóa");
                String removeId=sc.nextLine();
                manager.removeBook(removeId);
                break;
            case 3:
                manager.hienthi();
                break;
            case 4:
                System.out.print("nhập tài liệu cần tìm (sách,tạp chí,báo)");
                String loaitailieu=sc.nextLine();
                manager.timkiemtheoloai(loaitailieu);
                break;
            case 5:
                System.out.print("thoát");
                break;
            default:
                System.out.print("vui lòng không hợp lệ");
        }while (choice!=5);
        sc.close();
    }
}