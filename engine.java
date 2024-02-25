// https://codingquest.io/problem/1

import java.util.ArrayList;
import java.util.Scanner;
public class engine{
    public static void main(String[] args) {

        // get the data into ArrayList of Integers
        ArrayList<Integer> data = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            data.add(Integer.parseInt(line));
        }

        

    }
}