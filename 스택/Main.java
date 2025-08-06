//  스택

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Deque<String> stack = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();

        while(count -- > 0) {
            StringTokenizer input = new StringTokenizer(br.readLine(), " ");
            String cmd = input.nextToken();

            switch(cmd) {
                case "push":
                    String value = input.nextToken();
                    stack.push(value);
                    break;
                case "top":
                    result.append(stack.isEmpty() ? -1 : stack.getFirst().toString()).append("\n");
                    break;
                case "size":
                    result.append(stack.size()).append("\n");
                    break;
                case "empty":
                    result.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "pop":
                    result.append(stack.isEmpty() ? -1 : stack.poll().toString()).append("\n");
                    break;
            }
        }

        System.out.println(result.toString());
    }
}