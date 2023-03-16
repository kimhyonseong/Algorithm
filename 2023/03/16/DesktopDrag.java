package programmers;

import java.util.Arrays;

class DesktopDragSolution {
  public int[] solution(String[] wallpaper) {
    int[] answer = {wallpaper.length, wallpaper[0].length(), 0,0};

    for(int i=0; i<wallpaper.length; i++) {
      if(wallpaper[i].contains("#")) {
        answer[0] = Math.min(answer[0], i);
        answer[1] = Math.min(answer[1], wallpaper[i].indexOf("#"));
        answer[2] = i+1;
        answer[3] = Math.max(answer[3], wallpaper[i].lastIndexOf("#")+1);
      }
    }

    return answer;
  }
}

class DesktopDragTest {
  public void test(String[] input, int[] output) {
    DesktopDragSolution solution = new DesktopDragSolution();

    if (Arrays.equals(solution.solution(input), output)) {
      System.out.println("test success");
    } else {
      System.out.println(Arrays.toString(solution.solution(input)));
      System.out.println("test fail");
    }
  }
}

public class DesktopDrag {
  public static void main(String[] args) {
    DesktopDragTest testcase = new DesktopDragTest();

    testcase.test(new String[]{".#...", "..#..", "...#."},
            new int[]{0, 1, 3, 4});
    testcase.test(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."},
            new int[]{1, 3, 5, 8});
    testcase.test(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."},
            new int[]{0, 0, 7, 9});
  }
}
