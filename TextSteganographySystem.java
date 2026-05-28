import java.util.Scanner;

public class TextSteganographySystem {
    static String encode(String cover,String secret){
        return cover+"###"+secret;
    }

    static String decode(String encoded){
        String parts[]=encoded.split("###");
        if(parts.length>1){
            return parts[1];
        }else{
            return "No Secret Message Found";
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Cover Text:");
        String cover=sc.nextLine();
        System.out.println("Enter Secret Message:");
        String secret=sc.nextLine();
        String encoded=encode(cover,secret);
        System.out.println("\nEncoded Text:");
        System.out.println(encoded);
        String decoded=decode(encoded);
        System.out.println("\nDecoded Secret Message:");
        System.out.println(decoded);
    }
}
