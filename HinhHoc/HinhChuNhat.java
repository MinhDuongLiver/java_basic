package HinhHoc;

public class HinhChuNhat {
    private int length;
    private int weith;

    public HinhChuNhat(int length, int weith) {
        this.length = length;
        this.weith = weith;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeith() {
        return weith;
    }

    public void setWeith(int weith) {
        this.weith = weith;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "length=" + length +
                ", weith=" + weith +
                '}';
    }
}
