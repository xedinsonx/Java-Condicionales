
package condicional;


public class Clase {
    
    public Clase(){
        
        
    }
    Integer num1= 0, num2=0;
    
    public void setIgual(int x,int y){
        this.num1=x;
        this.num2=y;
        
        if(num1==num2){
            System.out.println("Los numeros son iguales");
        }
        else{
            System.out.println("Los numeros son diferentes");
        }
        
    }
      public void setMenor(int x,int y){
        this.num1=x;
        this.num2=y;
        
        if(num1<num2){
            System.out.println("El numero:" +num1+ " Es menor que:"+num2);
        }
        else{
            System.out.println("El numero:" +num1+ " Es mayor que:"+num2);
        }
}
       public void setMayor(int x,int y){
        this.num1=x;
        this.num2=y;
        
        if(num1>num2){
            System.out.println("El numero:" +num1+ " Es mayor que:"+num2);
        }
        else{
            System.out.println("El numero:" +num1+ " Es menor que:"+num2);
        }
}
