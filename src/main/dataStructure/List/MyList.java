package main.dataStructure.List;

import java.util.Arrays;

public class MyList {
  private final int LIST_LEN = 100;
  private final LData[] listData = new LData[LIST_LEN];
  private int numOfData;
  private int curPosition;

  public MyList() {
    this.numOfData = 0;
    this.curPosition = -1;
  }

  public boolean listInsert(LData data) {
    if (this.numOfData >= this.LIST_LEN) {
      System.out.println("저장 불가능");
      return false;
    }

    this.listData[this.numOfData] = data;
    this.numOfData++;
    System.out.println("현재 크기: " + this.numOfData);
    return true;
  }

  public boolean listFirst() {
    if (this.numOfData == 0) {
      return false;
    }
    this.curPosition = 0;
    return true;
  }

  public boolean listNext() {
    if (this.curPosition >= this.numOfData - 1) {
      return false;
    }
    this.curPosition++;
    return true;
  }

  public LData getCurrentData() {
    return this.listData[this.curPosition];
  }

  public LData listRemove() {
    int currentPosition = this.curPosition;
    LData returnData = this.listData[currentPosition];

    for (int i=currentPosition; i<this.numOfData-1; i++) {
      this.listData[i] = this.listData[i+1];
    }
    this.numOfData--;
    this.curPosition--;

    return returnData;
  }

  public int listCount() {
    return this.numOfData;
  }
}
