public class Planet{

    private int x;
    private int y;
    private int z;
    private float dist;
    
    public Planet(int x, int y, int z){
        
        this.x=x;
        this.y=y;
        this.z=z;
    }
        public float getDistance(){
        
           return this.dist;
        }
        public void setDistance(float dist){
        
            this.dist=dist; 
            
            
        }
        
        public int getX(){
        
            return this.x;
        }
        public int getY(){
        
            return this.y;
        }
        public int getZ(){
        
            return this.z;
        }
        
        public String toString(){
        
            return this.x+" "+this.y+" "+this.z+" "+this.dist;
        }
 
        
        
}