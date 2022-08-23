package Exercise04;

public class Rectangle {
    private int base;
    private int high;

    public Rectangle(){}
    public Rectangle(int base, int high){
        this.base = base;
        this.high = high;
    }
    public int area(int base, int high){
        int area = base * high;
        return area;
    }
    public int perimeter(int base, int high){
        int perimeter = 2 * base + 2 * high;
        return perimeter;
    }

    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getHigh() {
        return high;
    }
    public void setHigh(int high) {
        this.high = high;
    }
}
