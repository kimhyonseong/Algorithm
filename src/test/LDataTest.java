package test;

import main.dataStructure.List.LData;
import main.dataStructure.List.LDataUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LDataTest {
  private final LData lData = new LData();
  private final LData lData2 = new LData();

  @Test
  void getSet() {
    lData.setX(1);
    System.out.println("x: " + lData.getX());
    LDataUtils.showData(lData);

    lData.setY(2);
    System.out.println("y: " + lData.getY());
    LDataUtils.showData(lData);
  }

  @Test
  void compare() {
    System.out.print("lData - ");
    LDataUtils.showData(lData);
    System.out.print("lData2 - ");
    LDataUtils.showData(lData2);
    Assertions.assertEquals(0, LDataUtils.compareLData(lData, lData2));
    System.out.println();

    LData lData3 = new LData(1, 2);
    LData lData4 = new LData(1, 3);
    System.out.print("lData3 - ");
    LDataUtils.showData(lData3);
    System.out.print("lData4 - ");
    LDataUtils.showData(lData4);
    Assertions.assertEquals(1, LDataUtils.compareLData(lData3, lData4));
    System.out.println();

    LData lData5 = new LData(1, 3);
    LData lData6 = new LData(2, 3);
    System.out.print("lData5 - ");
    LDataUtils.showData(lData5);
    System.out.print("lData6 - ");
    LDataUtils.showData(lData6);
    Assertions.assertEquals(2, LDataUtils.compareLData(lData5, lData6));
    System.out.println();

    LData lData7 = new LData(1, 2);
    LData lData8 = new LData(3, 4);
    System.out.print("lData7 - ");
    LDataUtils.showData(lData7);
    System.out.print("lData8 - ");
    LDataUtils.showData(lData8);
    Assertions.assertEquals(-1, LDataUtils.compareLData(lData7, lData8));
    System.out.println();
  }
}
