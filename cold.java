import java.util.Scanner;

// https://open.kattis.com/problems/cold

public class cold {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // first line of input (not needed)
        String temp = sc.nextLine();
        int numTimes = Integer.parseInt(temp);

        int count = 0;
        for(int i=0; i<numTimes; i++){
            temp = sc.next();
            if(Integer.parseInt(temp) < 0) count++;
        }
        System.out.println(count);

    }
}
