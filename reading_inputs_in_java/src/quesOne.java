import java.util.*;
public class quesOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        int rollNum = sc.nextInt();
        String foi = sc.next();

        System.out.println("Name : "+ firstName + " " + lastName);
        System.out.println("Roll number: " + rollNum);
        System.out.println("Field of interest : " + foi);
    }
}
