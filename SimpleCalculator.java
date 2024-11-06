import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int x=sc.nextInt();
        System.out.println("enter the operator");
        char op = sc.next().charAt(0);
        System.out.println("enter the other number");
        int y=sc.nextInt();
        switch(op){
            case '+':
            System.out.println("the sum number " +(x+y));
            break;
            case '-':
            System.out.println("the difference number" +(x-y));
            break;
            case '*':
            System.out.println("the product number" +(x*y));
            break;
            case '/':
            System.out.println("divisor number" +(x/y));
           break;
            default:
        }
    }
}