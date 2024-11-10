public class tailieu {
    private String id;
    private String tennhasx;
    private int sobanphathanh;
    public tailieu(  String id,String tennhasx,int sobanphathanh){
        this.id=id;
        this.tennhasx=tennhasx;
        this.sobanphathanh=sobanphathanh;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTennhasx() {
        return tennhasx;
    }

    public void setTennhasx(String tennhasx) {
        this.tennhasx = tennhasx;
    }

    public int getSobanphathanh() {
        return sobanphathanh;
    }

    public void setSobanphathanh(int sobanphathanh) {
        this.sobanphathanh = sobanphathanh;
    }
    @Override
    public String toString(){
        return "ma tai lieu "+id+"ten nha san xuat"+tennhasx+"so ban phat hanh"+sobanphathanh;
    }
}
