public class Point {
  private int x;
  private int y;
  // different values if x and y is entered separately
  public Point(int x, int y){
     this.x = x;
     this.y = y;
  }

  // value x and y is the same if only 1 value is entered
  public Point(int value){
      x = value;
      y = value;
  }

  //Sets x and y to the origin
  public Point() {
    x = 0;
    y = 0;
  }

  //Getter method for X
  public int getX() {
    return x;
  }

  //Setter method for X
  public void setX(int newX) {
    x = newX;
  }

  //Getter method for Y
  public int getY() {
    return y;
  }

  //Setter method for Y
  public void setY(int newY) {
    y = newY;
  }
  public String coordinate() {
    String coordinate = "(" + x + "," + y + ")";
    return coordinate;
  }

  public String quadrant(){
    if (x>0 && y>0){
      return "I";
    }
    if (x>0 && y<0){
      return "IV";
    }
    if (x<0 && y>0){
      return "II";
    }
    if (x<0 && y<0){
      return "III";
    }
    if (x==0 && y!=0){
      return "on an axis";
    }
    if (x!=0 && y==0){
      return "on an axis";
    }
    if (x==0 && y==0){
      return "origin";
    }
    return null;
  }
}
