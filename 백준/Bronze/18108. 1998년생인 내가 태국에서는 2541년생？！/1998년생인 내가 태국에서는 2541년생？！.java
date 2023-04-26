import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        int result = 0;
        
        if(y >= 1000 && y <= 3000){
            result = y - 543;
        }
           
        System.out.println(result);
        
        
    }
}