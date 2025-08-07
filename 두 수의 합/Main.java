//  두 수의 합

import java.util.StringTokenizer;
import java.util.Arrays;
import java.lang.System;
import java.lang.Integer;
import java.lang.String;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer input = new StringTokenizer(br.readLine(), " ");
        int result = 0;

        boolean[] arr = new boolean[1000001];

        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(input.nextToken());
            if (num >= 1 && num <= 1000000) {
                arr[num] = true;
            }
        }

        int X = Integer.parseInt(br.readLine());

        for (int i = 1; i <= X / 2; i++) {
            int b = X - i;
            if(b >= 1 && b <= 1000000 && i != b && arr[i] && arr[b]) {
                result++;
            }
        }

        System.out.print(result);
    }
}