//  문자열 반복

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcCount = Integer.parseInt(br.readLine());

        while(tcCount-- > 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
            int count = Integer.parseInt(stringTokenizer.nextToken());
            String input = stringTokenizer.nextToken();
            StringBuilder output = new StringBuilder();

            for (char c: input.toCharArray()){
                for (int i = 0; i < count; i++){
                    output.append(c);
                }
            }

            System.out.println(output.toString());
        }
    }
}