import java.util.*;

public class coba{
    public static void main(String[] args)  
    {  
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Apakah anda mengalamai BAB lebih dari 2x dalam sehari? (Y/N) : ");  
        String no1= sc.nextLine();              //reads string  
        // System.out.print("You have entered: "+no1);
        if(no1 == "Y"){
            System.out.println("Kamu mempunyai penyakit sakit perut karena makan pedes");
        }

    }  
}