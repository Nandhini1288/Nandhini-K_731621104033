import java.util.*;

class MAin10 {

    public static void main(String[] args) {

        int originalNum, digit, cubeSum = 0,num;
        Scanner sc = new Scanner(System. in );
        num = sc.nextInt();
        originalNum = num;

        while (num!= 0)
        {
            digit = num % 10;
            cubeSum += Math.pow(digit, 3);
            num /= 10;
        }

        if(cubeSum == originalNum)
            System.out.println("is an Armstrong number");
        else
            System.out.println("is not an Armstrong number");
    }
}