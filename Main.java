import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

        Scanner in = new Scanner(System.in);
        String handA = in.next();
        String handB = in.next();
        String regExp = "[0-9]{1}[0]?[HSQD]$";
        if(handA.length() > 3 || handB.length() > 3){
            throw new IllegalArgumentException("The given handValue is invalid");
        }
        if(!handA.matches(regExp) || !handB.matches(regExp)){
            throw new IllegalArgumentException("The given handValue is invalid");
        }


        int result = determineWinner(handA,handB);
        System.out.println(result);
    }

    public static int determineWinner(String handA, String handB){
            int valueOfHand1 = getValue(handA);
            int valueOfHand2 = getValue(handB);
            if(valueOfHand1 > valueOfHand2)
                return 1;
            else if(valueOfHand1 < valueOfHand2)
                return 2;
            else
                return 0;

    }

    public static int getValue(String hand){
        char[] charArray = hand.toCharArray();
        int val=0;
        switch (hand.charAt(0)){
            case 'A':
                val = 14;
                break;
            case '2':
                val = 2;
                break;
            case '3':
                val = 3;
                break;
            case '4':
                val = 4;
                break;
            case '5':
                val = 5;
                break;
            case '6':
                val = 6;
                break;
            case '7':
                val = 7;
                break;
            case '8':
                val = 8;
                break;
            case '9':
                val = 9;
                break;
            case  'J':
                val = 11;
                break;
            case  'Q':
                val = 12;
                break;
            case 'K':
                val = 13;
                break;
            default:
                val = 10;
        }

        return val;
    }
}
