import java.io.*;
import java.util.*;

class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = scan.nextInt();
    for (int i = 0; i < t; i++) {
      int n = scan.nextInt();
      String ans = solve(scan.next(), n);
      System.out.println("Case #" + (i+1) + ": " + ans);
    }
  }

  static String solve(String s, int n) {
    int[] pos = {n, n};
    int[] myPos = {n, n};
    char nextMove = (s.charAt(0) == 'E'? 'S':'E');
    int i = 0;
    StringBuilder ans = new StringBuilder("");
    while (pos[0] > 1 || pos[1] > 1) {
      nextMove = (nextMove == 'E'? 'S':'E');
      if (Arrays.equals(pos, myPos)) {
        nextMove = (s.charAt(i) == 'E'? 'S':'E');
      }
      if(s.charAt(i) == 'E') {
        pos[0]--;
      }
      else {
        pos[1]--;
      }
      ans.append(nextMove);
      i++;
      if(nextMove == 'E') {
        myPos[0]--;
      }
      else {
        myPos[1]--;
      }
    }
    return ans.toString();
  }
}
