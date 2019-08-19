package eccpr;
import java.util.Scanner;
import java.util.ArrayList;

public class Eccpr{
    public static void main(String args[]){
  
        Scanner reader = new Scanner(System.in);
        
        ArrayList<String> menarray = new ArrayList<String>();
        
        System.out.println("HOW MANY PLAYERS: ");
        int players = Integer.parseInt(reader.nextLine());
        int i = 1;
        int cheat =1;
        String hii = "";
        while(players>=i){
            
        String name = reader.nextLine();
        
        i++;
    
        
        if(menarray.contains(name)){
        
           cheat++;
           hii = name;  
           
           
        }
        else{
        menarray.add(name);
        
        }     }
        if(cheat>=2){
        
            System.out.println(hii+" STOPPPPPP, cheating!!!");
        
        }
        else {
        
            System.out.println("JOK OK!");
        
        }
   
    }

}