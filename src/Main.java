import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String user;
                int sum=0;
                int num=0;
                System.out.println("Input Your Name:  ");
                user = input.nextLine();
                user.toUpperCase();
                for(int i=0;i<user.length();i++){
                    switch(user.charAt(i)){
                        case 'A','J','S'->
                                num +=1;
                        case 'B','K','T'->
                                num +=2;
                        case 'C','L','U'->
                                num +=3;
                        case 'D','M','V'->
                                num +=4;
                        case 'E','N','W'->
                                num +=5;
                        case 'F','O','X'->
                                num +=6;
                        case 'G','P','Y'->
                                num +=7;
                        case 'H','Q','Z'->
                                num +=8;
                        case 'I','R'->
                                num +=9;
                    }

                }if (num>10){
                    // convert to char
                    char[] chars = String.valueOf(num).toCharArray();
                    for (int i = 0; i <chars.length ; i++) {
                        sum=sum+Character.getNumericValue(chars[i]); // Convert to int then calculate
                    }
                    System.out.println("You are part number is : " +sum);
                }else {
                    System.out.println(num);
                }

            }
        }


