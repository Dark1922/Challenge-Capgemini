package challenge2;

import java.util.Scanner;

public class Challenge2 {

    public static String msgSucess = "";

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu(){

        Scanner write = new Scanner(System.in);

        System.out.println("------------------------------------------------------------");
        System.out.println("Enter a password that meets the following criteria:"+ "\n" +
                "* Have a minimum of 6 characters."+ "\n" +
                "* Contain at least 1 digit."+ "\n" +
                "* Contain at least 1 lowercase letter." + "\n" +
                "* Contain at least 1 capital letter." + "\n" +
                "* Contain at least 1 special character (!@#$%^&*()-+)."
        );

        System.out.print("Type it: ");
        String password = write.nextLine();

        ValidatePassword(password);


        write.close();
    }

    public static void ValidatePassword(String password){

        int charactersValidated = 0;

        if(password.length() < 6){
            charactersValidated = 6 - password.length();
        }else{

            if (!password.matches("(.*)[0-9](.*)")){
                charactersValidated++;
            }
            if (!password.matches("(.*)[a-z](.*)")){
                charactersValidated++;
            }
            if (!password.matches("(.*)[A-Z](.*)")){
                charactersValidated++;
            }
            if (!password.matches("(.*)[!@#$%^&*()-+](.*)")){
                charactersValidated++;
            }
        }

        System.out.printf("\n Remaining characters for your password to meet security requirements: %s",charactersValidated);

        System.out.println(" ");

        if (charactersValidated > 0){
            Menu();
        } else {
           System.out.println(msgSucess = "successfully registered");
        }
    }
}