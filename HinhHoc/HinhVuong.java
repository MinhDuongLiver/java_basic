package HinhHoc;

public class HinhVuong {
    public int side;

    public HinhVuong(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "side=" + side +
                '}';
    }
}
