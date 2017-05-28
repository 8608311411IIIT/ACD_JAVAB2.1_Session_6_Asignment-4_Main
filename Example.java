//program in which we generate our own exception NegativeAgeException whenever the age entered by user on command line prompt is negative
import java.lang.Exception;

class NegativeAgeException extends Exception{//user defined exception extends Exception class
        
  
     NegativeAgeException(String s){
           super(s);//passing s to constructor of super class
     }

   
}
public class Example{

     public static void main(String []args){
            int age;
           
           
            age=Integer.parseInt(args[0]);//taking argument from command prompt

              try{
                 if(age<0)
                    throw new NegativeAgeException("Negative age is not possible");//throwing exception defined by user
                
                    else
                       System.out.println("Your age is "+age);
             }
                  
                  catch(NegativeAgeException e){//catching exception defined by user
                        System.out.println(e);
                   }
              
     }
}
