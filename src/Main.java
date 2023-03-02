import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            String firstName = in.nextLine();
            String lastName = in.nextLine();
            int age = in.nextInt();
            if(age>0){
                System.out.println("Tuura jazyldy");
            }else {
                throw new Exception("Can not use nagative number");
            }
            String email =new Scanner(System.in).nextLine();
            if (!email.contains("@gmail.com")){
                throw new Exception("Use @gmail.com ");
            }else {
                System.out.println("Correct email");
            }
            String password =new Scanner(System.in).nextLine();
            if (password.length()>7){
                System.out.println("Strong password");
            }else {
                throw new Exception("Easier try again");
            }
            Registration person = new Registration(firstName,lastName,age,email,password);
            System.out.println(person.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Can not use latter");
        }

    }
}