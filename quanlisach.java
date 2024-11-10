import java.util.ArrayList;

public class quanlisach {
private ArrayList<tailieu>danhsachtailieu;
public  quanlisach(){
    danhsachtailieu= new ArrayList<>();
}
public  void addBook(tailieu tailieu){
    danhsachtailieu.add(tailieu);
}
public void removeBook(String BookId){
    boolean found = false;
    for(int i=0;i<danhsachtailieu.size();i++){
        tailieu s= danhsachtailieu.get(i);
        if(s.getId().equals(BookId)){
            danhsachtailieu.remove(i);
            found=true;
            System.out.print("Đã xóa sách");
            break;
        }
    }
    if(!found){
        System.out.print("không tìm thấy sách");
    }
}
public void hienthi(){
    for(tailieu s: danhsachtailieu){
        System.out.print(s);
    }
}
public void timkiemtheoloai(String loai){
    for(tailieu tailieu:danhsachtailieu){
        { if (loai.equalsIgnoreCase("Sach") && tailieu instanceof sach) {
            System.out.println(tailieu); }
        else if (loai.equalsIgnoreCase("TapChi") && tailieu instanceof tapchi) {
            System.out.println(tailieu); }
        else if (loai.equalsIgnoreCase("Bao") && tailieu instanceof bao) {
            System.out.println(tailieu);
        }
        }
    }
}
}
