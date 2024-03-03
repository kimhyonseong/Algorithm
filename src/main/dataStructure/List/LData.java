package main.dataStructure.List;

public class LData {
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
}