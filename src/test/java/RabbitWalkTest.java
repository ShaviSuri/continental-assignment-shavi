import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RabbitWalkTest {

  private RabbitWalk rabbitWalk;

  @BeforeEach
  void setup() {
    rabbitWalk = new RabbitWalk();
  }

  @Test
  void test1() {
    int[][] matrix = {
      {1, 0, 0, 0},
      {1, 1, 0, 1},
      {0, 1, 0, 0},
      {1, 1, 1, 1}
    };

    List<String> response = rabbitWalk.getAllPossibleWays(matrix);
    System.out.println(response.toString());
    Assertions.assertEquals(List.of("DFDDFF"), response);
  }

  @Test
  void test2() {
    int[][] matrix = {{1, 0, 0, 0}, {1, 1, 0, 0}, {0, 1, 0, 0}, {0, 1, 1, 1}};

    List<String> response = rabbitWalk.getAllPossibleWays(matrix);
    System.out.println(response.toString());
    Assertions.assertEquals("[DFDDFF]", response.toString());
  }

  @Test
  void test3() {
    int[][] matrix = {{1, 0, 0, 0}, {1, 1, 1, 0}, {0, 1, 1, 1}};

    List<String> response = rabbitWalk.getAllPossibleWays(matrix);
    System.out.println(response.toString());
    Assertions.assertEquals("[DFFDF, DFDFF]", response.toString());
  }

  @Test
  void test4() {
    int[][] matrix = {{1, 1, 1, 1, 1}, {1, 1, 0, 0, 1}, {0, 1, 0, 0, 1}, {0, 1, 1, 1, 1}};

    List<String> response = rabbitWalk.getAllPossibleWays(matrix);
    System.out.println(response.toString());
    Assertions.assertEquals("[FFFFDDD, FDDDFFF, DFDDFFF]", response.toString());
  }

  @Test
  void test5() {
    int[][] matrix = {
      {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}
    };

    List<String> response = rabbitWalk.getAllPossibleWays(matrix);
    System.out.println(response.toString());
    Assertions.assertEquals(
        "[FFDDDD, FDFDDD, FDDFDD, FDDDFD, FDDDDF, DFFDDD, DFDFDD, DFDDFD, DFDDDF, DDFFDD, DDFDFD, DDFDDF, DDDFFD, DDDFDF, DDDDFF]",
        response.toString());
  }
}
