import java.util.*;
public class Main{

    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.nextLine());
    ArrayList<Planet> list =  new ArrayList<Planet>();
    
      for(int i=0; i<n; i++) {
            String line = scan.nextLine();
            String [] parts = line.split("\\s+");
            list.add(new Planet(Integer.parseInt(parts[0]), 
                            Integer.parseInt(parts[1]),
                            Integer.parseInt(parts[2])));
        }//list.size()==n;
     
       
        String line = scan.nextLine();
        String [] items = line.split("\\s+");// line.split spilts the arays in one line
        Planet p = new Planet(Integer.parseInt(items[0]), 
                            Integer.parseInt(items[1]),
                            Integer.parseInt(items[2]));
        
         for(int i=0; i<list.size(); i++) {
            list.get(i).setDistance(dist(p, list.get(i)));
        }
         
          float total = 0;
         
         while(list.size() > 0) {
            Collections.sort(list, new Comparator<Planet>() {
                @Override
                public int compare(Planet p1, Planet p2) {
                    if(p1.getDistance() <= p2.getDistance()) {
                        return -1;
                    }
                    return 1;
                }
            });
            Planet temp = list.get(0);
            total += temp.getDistance();//total = temp.getDistance()+total;
            list.remove(0);
            for(int i=0; i<list.size(); i++) {
                list.get(i).setDistance(dist(temp, list.get(i)));    
            }
            
        }
         System.out.println(String.format("%.2f", total));
         
         
         
         
         
         
         
    
    
        
    }
    
    
    
     public static float dist(Planet p1, Planet p2) {
        return (float) Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2)
                            + Math.pow(p1.getY() - p2.getY(), 2)
                            + Math.pow(p1.getZ() - p2.getZ(), 2));
    }

}