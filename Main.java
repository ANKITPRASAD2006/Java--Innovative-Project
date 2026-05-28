import java.util.Scanner;

public class Main{
    static String generatePassword(String name, String pan, String dob){
        String part1=name.substring(0,2).toUpperCase();
        String part2=pan.substring(0,3).toUpperCase();
        String part3=dob.replace("/","");
        return part1+"@"+part2+part3;
    }

    static String checkStrength(String password){
        if(password.length()>=12){
            return "Strong";
        }else if(password.length()>=8){
            return "Medium";
        }else{
            return "Week";
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        String name=sc.nextLine();

        System.out.println("Enter PAN:");
        String pan=sc.nextLine();

        System.out.println("Enter DOB(dd/mm/yyyy):");
        String dob=sc.nextLine();

        String password=generatePassword(name,pan,dob);

        System.out.println("Generated Password:"+ password);
        System.out.println("Password Strength:"+ checkStrength(password));
    }
}
