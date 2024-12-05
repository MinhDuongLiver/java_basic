package BenhVien;

public class BenhNhan extends Nguoi {
    private int soBenhAn;
    private double ngayNhapVien;

    public BenhNhan(String ten, int tuoi, int soBenhAn, double ngayNhapVien) {
        super(ten, tuoi);
        this.soBenhAn = soBenhAn;
        this.ngayNhapVien = ngayNhapVien;
    }

    public int getSoBenhAn() {
        return soBenhAn;
    }

    public void setSoBenhAn(int soBenhAn) {
        this.soBenhAn = soBenhAn;
    }

    public double getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(double ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    @Override
    public String toString() {
        return getTen()+" - "+ getTuoi()+ " - " + soBenhAn + " - "+ ngayNhapVien;
    }
}
