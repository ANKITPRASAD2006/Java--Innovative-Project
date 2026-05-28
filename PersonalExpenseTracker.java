import java.util.*;
import java.io.*;

class Expense{
    double amount;
    String category,date;

    Expense(double amount,String category,String date){
        this.amount=amount;
        this.category=category;
        this.date=date;
    }

    void display(){
        System.out.println(amount+" "+category+" "+date);
    }
}

public class PersonalExpenseTracker {
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        ArrayList<Expense> list=new ArrayList<>();
        int n;
        System.out.println("Enter number of expenses:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter Amount:");
            double amount=sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter Category:");
            String category=sc.nextLine();
            System.out.println("Enter Date:");
            String date=sc.nextLine();

            list.add(new Expense(amount,category,date));
            System.out.println("\n");
        }

        System.out.println("\nExpenses:");
        double total=0;
        double max=0;
        String maxCategory="";

        FileWriter fw=new FileWriter("expense.txt");
        for(Expense e:list){
            e.display();

            total+=e.amount;
            if(e.amount>max){
                max=e.amount;
                maxCategory=e.category;
            }
            fw.write(e.amount+" "+e.category+" "+e.date+"\n");
        }
        fw.close();
        System.out.println("\nTotal Expense="+total);
        System.out.println("Highest Expense Category="+maxCategory);
    }
}
