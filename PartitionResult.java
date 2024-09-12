public class PartitionResult {
  private int res;
  private int swaps;

  public PartitionResult(int _res, int _swaps) {
    this.res = _res;
    this.swaps = _swaps;
  }

  public int getRes() {
    return res;
  }

  public void setRes(int res) {
    this.res = res;
  }

  public int getSwaps() {
    return swaps;
  }

  public void setSwaps(int swaps) {
    this.swaps = swaps;
  }
}
