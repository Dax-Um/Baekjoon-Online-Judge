//  아스키 코드

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char input = br.readLine().toCharArray()[0];
        int ascii = (int) input;
        System.out.println(ascii);
    }
}