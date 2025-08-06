//  큐

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Deque<String> queue = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();

        while (count-- > 0) {
            StringTokenizer input = new StringTokenizer(br.readLine(), " ");
            String cmd = input.nextToken();

            switch (cmd) {
                case "push":
                    String value = input.nextToken();
                    queue.addLast(value);
                    break;
                case "pop":
                    result.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
                    break;
                case "size":
                    result.append(queue.size()).append("\n");
                    break;
                case "empty":
                    result.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    result.append(queue.isEmpty() ? -1 : queue.getFirst()).append("\n");
                    break;
                case "back":
                    result.append(queue.isEmpty() ? -1 : queue.getLast()).append("\n");
                    break;
            }
        }

        System.out.println(result.toString());
    }
}