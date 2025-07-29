//  최소, 최대

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < count; i ++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            if(num < min) {
                min = num;
            }
            if(num > max) {
                max = num;
            }
        }

        System.out.println(min + " " + max);
    }
}