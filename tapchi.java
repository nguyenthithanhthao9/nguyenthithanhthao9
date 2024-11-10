public class tapchi extends tailieu{
    private int sophathanh;
    private int thangphathanh;

    public tapchi(String id,String tennhasx,int sobanphathanh,int sophathanh, int thangphathanh) {
        super(id, tennhasx, sobanphathanh);
        this.sophathanh = sophathanh;
        this.thangphathanh = thangphathanh;
    }
    public int getSophathanh() {
        return sophathanh;
    }
    public void setSophathanh(int sophathanh) {
        this.sophathanh = sophathanh;
    }
    public int getThangphathanh() {
        return thangphathanh;
    }
    public void setThangphathanh(int thangphathanh) {
        this.thangphathanh = thangphathanh;
    }
    @Override
    public String toString(){
        return super.toString()+     "số phát hành,"+sophathanh+"số tháng phát hành,"+ thangphathanh;
    }
}


