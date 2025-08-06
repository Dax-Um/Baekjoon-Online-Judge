//  나머지

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int input = Integer.parseInt(br.readLine());
            result.add(input % 42);
        }

        System.out.println(result.size());
    }
}