import java.io.*;
import java.util.*;
import java.lang.String;

class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = scan.nextInt();
    for (int i = 0; i < t; i++) {
      String n = scan.next();
      String[] ans = solve(n);
      System.out.println("Case #" + (i+1) + ": " + ans[0] + " " + ans[1]);
    }
  }

  static String[] solve(String n) {
    String a = "", b = "";
    for (int i = 0; i < n.length(); i++) {
      if(n.charAt(i) == '4') {
        a += '3';
        b += '1';
      }
      else {
        a += n.charAt(i);
        b += '0';
      }
    }

    return new String[] {a,b};
  }  
}
