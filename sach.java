public class sach extends tailieu{
    private String tentacgia;
    private int sotrang;

    public sach(  String id,String tennhasx,int sobanphathanh,String tentacgia, int sotrang) {
        super(id, tennhasx, sobanphathanh);
        this.tentacgia = tentacgia;
        this.sotrang = sotrang;

    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;

    }
    @Override
    public String toString(){
        return super.toString()+"ten tác giả"+tentacgia+"số trang "+sotrang;

    }
}


