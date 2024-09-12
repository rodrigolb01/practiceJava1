public class Result {
  private int swaps;
  private int[] arr;

  public Result(int _swaps, int[] _arr) {
    this.swaps = _swaps;
    this.arr = _arr;
  }

  public int getSwaps() {
    return swaps;
  }

  public void setSwaps(int swaps) {
    this.swaps = swaps;
  }

  public int[] getArr() {
    return arr;
  }

  public void setArr(int[] arr) {
    this.arr = arr;
  }
}
