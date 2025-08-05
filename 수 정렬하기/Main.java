//  수 정렬하기

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        List<Integer> integerList = new ArrayList<>();

        while(count-- > 0){
            integerList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(integerList);

        for(int num: integerList){
            System.out.println(num);
        }
    }
}