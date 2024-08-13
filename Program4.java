//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)

import java.util.Scanner;
public class Program4{
    public static void main(String[] args){
        int aNum = 0;
        int bNum = 0;
        int cNum = 0;
        int dNum = 0;
        
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        aNum = numScanner.nextInt();
        
        System.out.println("Enter the second number: ");
        bNum = numScanner.nextInt();
        
        System.out.println("Enter the third number: ");
        cNum = numScanner.nextInt();
        
        System.out.println("Enter the fourth number: ");
        dNum = numScanner.nextInt();
        
        int sum = aNum + bNum + cNum + dNum;
        double average = sum / 4.0;
        
        System.out.println("The sum of the four numbers is "+ sum);
        System.out.println("The average of the four numbers is " + average);
        
    }
}

//Paste console output below:
/*


*/
