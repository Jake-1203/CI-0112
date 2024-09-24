
import java.util.Random;
public class vector
{   Random random = new Random();
    private int[]vector;
    
    public vector(){
        
        this.vector = vector;
        
    }

   public void setVector(){
        
       this.vector = vector;
       
    }
   
   public void printVector(){
   
       for(int i = 0; i < this.vector.length; i++){
        
            System.out.print(this.vector[i] + ",");
            
        }
        System.out.println();
        
    }
   
   public void random(){
    
       for(int i = 0; i < this.vector.length; i++){
           
           this.vector[i] = random.nextInt(101);
       }
    }
    
   public void sort(){
    
       for(int i = 0; i < this.vector.length; i++){
           
           int posicionMenor = i;
           int valorMenor = this.vector[i];
           for(int j = i + 1; j < this.vector.length; j++){
            
                if(this.vector[j]<valorMenor){
                
                    valorMenor = this.vector[j];
                    posicionMenor = j;
                
                }
            }
            int aux = vector[posicionMenor];
            vector[posicionMenor] = vector[i];
            vector[i] = aux;
            
        }
        
   }
   
   public void parImpar(){
    
        int contPar = 0;
        int contImpar = 0;
        
        for(int i = 0; i < this.vector.length; i++){
        
            if (this.vector[i]%2 == 0){
                
                contPar+=1;
                
            }
            else{
            
                contImpar+=1;
        
            }
        
        }
    }
}
