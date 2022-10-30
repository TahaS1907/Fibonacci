import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number,n1=0,n2=0,n3;
        System.out.println("Please enter a number:");
        number= scanner.nextInt();
        for(int i=0;i<=number;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            if(n2==0){n2++;}
            n1=n2;
            n2=n3;



        }

System.out.println();
        }
    }
