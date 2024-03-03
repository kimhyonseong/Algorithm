package main.dataStructure.List;

import java.util.Arrays;

public class MyList {
  private final int LIST_LEN = 100;
  private final int[] listData = new int[this.LIST_LEN];
  private int numOfData;
  private int curPosition;

  public MyList() {
    this.numOfData = 0;
    this.curPosition = -1;
  }

  public boolean listInsert(int data) {
    if (this.numOfData >= this.LIST_LEN) {
      System.out.println("저장 불가능");
      return false;
    }

    this.listData[this.numOfData] = data;
    this.numOfData++;
    System.out.println("현재 크기: " + this.numOfData);
    System.out.println(Arrays.toString(this.listData));
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

  public int getCurrentData() {
    return this.listData[this.curPosition];
  }

  public int listRemove() {
    int currentPosition = this.curPosition;
    int returnData = this.listData[currentPosition];

    for (int i=currentPosition; i<this.numOfData-1; i++) {
      this.listData[i] = this.listData[i+1];
    }

    return returnData;
  }

  public int lstCount() {
    return this.numOfData;
  }
}
