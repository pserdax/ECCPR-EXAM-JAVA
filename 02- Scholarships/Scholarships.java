package scholarships; 
import java.util.Scanner;
import java.util.ArrayList;



public class Scholarships {

    
    public static void main(String[] args) {
        
        ArrayList<Double> gosh =  new ArrayList();
        ArrayList<String> name  =  new ArrayList();
     
        
        
  Scanner sc = new Scanner(System.in);
int[] integers = new int[3];
for(int i = 0; i < 3; i++)
{
    integers[i] = sc.nextInt();
}
int m = integers[0];
int n = integers[1];
int p = integers[2];

int j=1;

double average;
int t = 0;
while(j<=m){
    double l=0;
    
    String he = sc.next();
   int[] hey = new int[3];
   for(int k = 0; k < 3; k++)
{
    hey[k] = sc.nextInt();
    l=l+(double)hey[k];
} 
   average = l/3;
   if(average>=8){
   t++;
   }
   if(t>p){
   t=p;
   }
   gosh.add(average);
   name.add(he);
   
   
   
 
   
 
    
   
   
   
    
    
    
  j++;
}
double max = gosh.get(0);
        int  i =1;
        int w=0;
        while(i<gosh.size()){
        if(gosh.get(i)>max){
            
            max=gosh.get(i);
            w=i;
 }
        i++;
        }



        System.out.println(t);
        
        System.out.println(name.get(w)+" "+max);
        
        
  
        
        
  
  
  
  
    }
   
    }

   

     
        

  
    

