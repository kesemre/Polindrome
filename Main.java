import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Polindrome olup olmadığını kontrol temek istediğiniz sözcüğü giriniz:");
        String str = scanner.nextLine();
        int StartNum=0;
        int EndNum = (str.length()-1);

        while(StartNum<EndNum){
            if(str.charAt(StartNum)==str.charAt(EndNum)){
                if(EndNum-StartNum<=2){
                    System.out.println("Girdiğiniz sözcük bir Polindrome");
                    StartNum++;
                    EndNum--;
                }
                else{
                    StartNum++;
                    EndNum--;
                }
            }
            else {
                System.out.println("Girdiğiniz sözcük bir Polindrome değil");
                break;
            }
        }


    }
}