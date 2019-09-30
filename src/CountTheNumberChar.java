import java.util.Scanner;

public class CountTheNumberChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("inout char count number:= ");
        String text = sc.nextLine();
        String test = new String("dsadsadsadsadsadsadsadsadsadsadsvcxvdsafef");
        String[] newString;
        newString = test.split("");
        for (int i = 0; i < newString.length; i++) {
            if (newString[i].equals(text)) {
                count++;
            }
            System.out.print(newString[i] + " ");
        }
        System.out.println("\n" + text + " xuất hiện " + count + " lan");
    }
}
