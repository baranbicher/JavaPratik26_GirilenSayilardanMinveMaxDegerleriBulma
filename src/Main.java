import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter,number,minNum = 0,maxNum = 0;
        System.out.print("Gireceğiniz Sayı Adetini Girin: ");
        counter= input.nextInt();
        for (int i = 1; i<=counter;i++){
            System.out.print(i + ". Sayıyı Girin: ");
            number= input.nextInt();
            if (number>maxNum){
                maxNum=number;
            } else if (number<minNum) {
                minNum=number;
            }
        }

        System.out.println("En büyük: " + maxNum);
        System.out.println("En küçük: " + minNum);

        //while Örneği .......................................................
        /*        while (counter != 0){

                System.out.print(counter + ". Sayıyı Girin: ");
                number= input.nextInt();
                if (number>maxNum){
                    maxNum=number;
                } else if (number<minNum) {
                    minNum=number;
                }
            counter--;
        }

        */
    }
}