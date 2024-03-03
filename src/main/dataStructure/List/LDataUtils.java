package main.dataStructure.List;

public class LDataUtils {
  static int EQUAL_ALL = 0;
  static int EQUAL_X = 1;
  static int EQUAL_y = 2;
  static int UNEQUAL = -1;

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
