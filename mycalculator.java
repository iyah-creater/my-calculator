import java.util.Scanner;
    public class mycalculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            double numA, numB, result;
            char sign;
            
            System.out.println("Enter fisrt number: ");
            numA = input.nextDouble();
            
            System.out.println("Enter sign (+, -, *, /):");
            sign = input.next().charAt(0);
            
            System.out.println("Enter second number: ");
            numB = input.nextDouble();
            
            switch(sign){
                case '+':
                    result = numA + numB;
                    System.out.println("Result: " + result);
                    break;
                    
                case '-':
                    result = numA - numB;
                    System.out.println("Result: " + result);
                    break;
                    
                case '*':
                    result = numA * numB;
                    System.out.println("Result: " + result);
                    break;
                
                case '/':
                    if(numB == 0){
                        System.out.println("Can't divide by zero");
                    } else{
                        result = numA / numB;
                        System.out.println("Result: " + result);
                    }
                    break;
                    
                    default:
                        System.out.println("Invalid sign");
            }
        }
    }
