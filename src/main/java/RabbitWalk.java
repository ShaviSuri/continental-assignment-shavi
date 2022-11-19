import java.util.ArrayList;
import java.util.List;

public class RabbitWalk {

  public List<String> getAllPossibleWays(int[][] matrix) {
    List<String> allPaths = new ArrayList<>();
    addPathInList(matrix, 0, 0, allPaths, "");
    return allPaths;
  }

  private void addPathInList(int[][] matrix, int x, int y, List<String> allPaths, String path) {
    int rowLength = matrix.length;
    int colmLength = matrix[0].length;
    if (x >= rowLength || y >= colmLength || matrix[x][y] == 0) {
      return;
    }
    if (x == rowLength - 1 && y == colmLength - 1) {
      allPaths.add(path);
      return;
    }
    addPathInList(matrix, x, y + 1, allPaths, path + "F");
    addPathInList(matrix, x + 1, y, allPaths, path + "D");
  }
}
