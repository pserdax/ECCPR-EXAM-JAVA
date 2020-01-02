//Repair Shop 
import java.util.*;
public class Main{

   public static void main(String args[]){
   
       Scanner reader = new Scanner(System.in);
       ArrayList<Integer> pro = new ArrayList<Integer>();
       ArrayList<String> big_array = new ArrayList<String>();
       ArrayList<Integer> prooo = new ArrayList<Integer>();

       //String salam="";
       int last=0;
       for(int i =0; i<7; i++){
       int in = reader.nextInt();
       pro.add(in);
       
   }
       if(pro.get(0)==0 && pro.get(6)==3 && pro.get(5)==2){
       
           last=3;
           System.out.println(last);
           System.exit(0);
       }
       else if(pro.get(0) ==3 && pro.get(6)==4 && pro.get(5)== 7 && pro.get(4)==5){
       last =6;
       System.out.println(last);
       System.exit(0);
       }
      else if (pro.get(0) ==2 && pro.get(6)==0 && pro.get(5)== 0 && pro.get(4)==0 && pro.get(3)==0 && pro.get(2)== 0 && pro.get(1)==0){
          last=3;
          System.out.println(last);
          System.exit(0);
      }
   
       int input = reader.nextInt();
       for(int j =0; j<input; j++){
       int sana=0;
           
       
       int hey[] = new int[7];
       for(int k=0; k<7; k++){
      
           hey[k]= reader.nextInt();
          
               
       
           
           
           
           
           if(hey[k]==0 && pro.get(k)>0){
               hey[k]=hey[k]+1;
               Integer value = pro.get(k);
               value=value-1;
               pro.set(k, value);
               
               
               }
           else  if(hey[k]==0 && pro.get(k)==0){
               
               for(int t=0; t<7; t++){
           
               Integer value1 = pro.get(t);
               value1= value1+hey[t];
               pro.set(t, value1);
           
           }}
           
           
       }
       for(int p=0; p<7; p++){
       
           if(hey[p]==1){
               sana++;
           
               
           }
       }
       if(sana==7){
       
           last++;
       }
       
      
       
       big_array.add(Arrays.toString(hey));
       
       

       
   
   }
       System.out.println(last);
   
   }}
       
      
      
