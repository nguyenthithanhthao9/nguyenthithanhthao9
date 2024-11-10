public class bao extends tailieu {
    private int ngayphathanh;
    public bao (String id,String tennhasx,int sobanphathanh,int ngayphathanh){
        super(id, tennhasx, sobanphathanh);
        this.ngayphathanh=ngayphathanh;
    }

    public bao(String id, String tennhasx, int sobanphathanh) {
        super(id, tennhasx, sobanphathanh);
    }

    public int getNgayphathanh() {
        return ngayphathanh;
    }

    public void setNgayphathanh(int ngayphathanh) {
        this.ngayphathanh = ngayphathanh;
    }
@Override
    public String toString (){
        return  super.toString()+",ngay phat hanh"+ngayphathanh;
}
}


