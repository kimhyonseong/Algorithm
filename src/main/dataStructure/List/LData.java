package main.dataStructure.List;

public class LData {
  public static final int EQUAL_ALL = 0;
  public static final int EQUAL_X = 1;
  public static final int EQUAL_y = 2;
  public static final int UNEQUAL = -1;

  private int x;
  private int y;

  public LData() {}

  public LData(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void reset() {
    this.x = 0;
    this.y = 0;
  }

  static public int compareLData(LData x, LData y) {
    if (x.getX() == y.getX() && x.getY() == y.getY()) {
      return EQUAL_ALL;
    } else if (x.getX() == y.getX()) {
      return EQUAL_X;
    } else if (x.getY() == y.getY()) {
      return EQUAL_y;
    }
    return UNEQUAL;
  }

  static public void showData(LData lData) {
    System.out.println("x: " + lData.getX() + ", y: " + lData.getY());
  }
}