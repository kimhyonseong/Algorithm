package test.List;

import main.dataStructure.List.LData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LDataTest {
  private final LData lData = new LData();
  private final LData lData2 = new LData();

  @Test
  void getSet() {
    lData.setX(1);
    System.out.println("x: " + lData.getX());
    LData.showData(lData);

    lData.setY(2);
    System.out.println("y: " + lData.getY());
    LData.showData(lData);
  }

  @Test
  void compare() {
    System.out.print("lData - ");
    LData.showData(lData);
    System.out.print("lData2 - ");
    LData.showData(lData2);
    Assertions.assertEquals(LData.EQUAL_ALL, LData.compareLData(lData, lData2));
    System.out.println();

    LData lData3 = new LData(1, 2);
    LData lData4 = new LData(1, 3);
    System.out.print("lData3 - ");
    LData.showData(lData3);
    System.out.print("lData4 - ");
    LData.showData(lData4);
    Assertions.assertEquals(LData.EQUAL_X, LData.compareLData(lData3, lData4));
    System.out.println();

    LData lData5 = new LData(1, 3);
    LData lData6 = new LData(2, 3);
    System.out.print("lData5 - ");
    LData.showData(lData5);
    System.out.print("lData6 - ");
    LData.showData(lData6);
    Assertions.assertEquals(LData.EQUAL_y, LData.compareLData(lData5, lData6));
    System.out.println();

    LData lData7 = new LData(1, 2);
    LData lData8 = new LData(3, 4);
    System.out.print("lData7 - ");
    LData.showData(lData7);
    System.out.print("lData8 - ");
    LData.showData(lData8);
    Assertions.assertEquals(LData.UNEQUAL, LData.compareLData(lData7, lData8));
    System.out.println();
  }
}
