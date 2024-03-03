package test.List;

import main.dataStructure.List.LData;
import main.dataStructure.List.LDataUtils;
import main.dataStructure.List.MyList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyListTest {
  private final MyList myList = new MyList();

  @BeforeEach
  void insert() {
    myList.listInsert(new LData(1,4));
    myList.listInsert(new LData(2,5));
    myList.listInsert(new LData(3,6));

    if (myList.listFirst()) {
      LDataUtils.showData(myList.getCurrentData());

      while (myList.listNext()) {
        LDataUtils.showData(myList.getCurrentData());
      }
    }
  }

  @Test
  void remove() {
    if (myList.listFirst()) {
      while (myList.listNext()) {
        if (LDataUtils.compareLData(myList.getCurrentData(), new LData(2,5)) == LDataUtils.EQUAL_ALL) {
          System.out.print("삭제 데이터 - ");
          LDataUtils.showData(myList.listRemove());
        }
      }

      Assertions.assertEquals(2, myList.listCount());
    }
  }
}
