package ahmed.mansour;

public class ahmed {
 //public final int a=50;
 public int [] x =new int [20];
 public int top=-1;
 public int values;
 public boolean empty(){
     if (this.top==-1)
         return true;
     else 
         return false;
 }
 public void push(int y){
     if (x.length-1>top){
         this.top++;
     this.x[top]= y;
     
     }
 }
 public int pop(){
   this. values=x[top];
    this.x[top]=0;
    this.top--;
     return this.values;
 }

 public void clear(){
     this.top=-1;  
 }
 public int top(){
    return this.top;
 }

 
 

}
