import java.util.*;
public class Main{


 public static void main(String args[]) {
     
     Scanner reader= new Scanner(System.in);
     int n = Integer.parseInt(reader.nextLine());
     
     ArrayList<Double> numbers = new ArrayList<Double>();
     ArrayList<Double> eval = new ArrayList<Double>();
    
     for(int i=0; i<n; i++){
         
         Double num= reader.nextDouble();
         
         numbers.add(num);
         }
    
     
      if(numbers.get(0)>numbers.get(1)){
//          System.out.println("heyy");
         
             eval.add(numbers.get(0));
         }
      int i=1;
      int y=n-1;
      while(i<y){
     
          if(numbers.get(i)>numbers.get(i-1) && numbers.get(i)>numbers.get(i+1)){
         
              eval.add(numbers.get(i));
         }
        i++;    
     }
          if(numbers.get(numbers.size()-1)>numbers.get(numbers.size()-2)){
           System.out.println("heyyyyyyyy");
             eval.add(numbers.get(numbers.size()-1));
         }
     
     Double k=0.0;
     for(Double hey: eval){
         k=k+hey;
     
         
     }
     Double j=0.0;
            
     j=k/eval.size();//arithmetic mean
     
     int t=0;
     int p=0;
     while(t<n){
     
         if(numbers.get(t)>j){
         
             p++;
         }
         t++;
     }
     System.out.println(p);
     
   
     
     
     
    
     


}

  
}