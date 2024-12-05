package BenhVien;

public class BacSi extends Nguoi{
    private String chuyenKhoa;
    private double soGioLamViec;

    public BacSi(String ten, int tuoi, String chuyenKhoa, double soGioLamViec) {
        super(ten, tuoi);
        this.chuyenKhoa = chuyenKhoa;
        this.soGioLamViec = soGioLamViec;
    }

    @Override
    public String toString() {
        return getTen()+" - "+ getTuoi()+ " - " + chuyenKhoa + " - "+ soGioLamViec;
    }

    public String getChuyenKhoa() {
        return chuyenKhoa;
    }

    public void setChuyenKhoa(String chuyenKhoa) {
        this.chuyenKhoa = chuyenKhoa;
    }

    public double getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(double soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }
}
