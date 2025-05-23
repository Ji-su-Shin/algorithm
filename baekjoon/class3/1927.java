// link: https://www.acmicpc.net/problem/1927

import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    PriorityQueue<Integer> q = new PriorityQueue<>();
    int n = Integer.parseInt(br.readLine());

    for(int i = 0; i < n; i++) {
      int x = Integer.parseInt(br.readLine());

      if(x == 0) {
        if(!q.isEmpty()) {
          sb.append(q.poll() + "\n");
        } else {
          sb.append(0 + "\n");
        }
      } else {
        q.add(x);
      }
    }

    System.out.print(sb.toString());
    br.close();
    return;
  }
}
