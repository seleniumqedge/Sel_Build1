import java.util.Scanner;

public class SortinganArray 
{ 
               public static void main(String args[]) 
         { 
               int i,j,temp=0; 
             
               Scanner s=new Scanner(System. in) ; 
               
               System.out.print("Enter The Size of The Array : "); 
              
               int size=s.nextInt();
               
               int a[]=new int[size]; 
               System.out.println("Enter The array Elements"); 
             
               for(i=0;i<a.length;i++) 
                  { 
                     a[i]=s.nextInt(); 
                      
                     for(j=0;j<a.length;j++) 
                          { 
                              if(a[i]<a[j]) 
                                { 
                                    temp=a[j]; 
                                    a[j]=a[i] ; 
                                    a[i]=temp; 
                                    
                                    System.out.println("i---"+a[i]);
                                    System.out.println("j---"+a[j]);
                                    System.out.println("temp---"+temp);
                                 } 
                           } 
                  } 
               
               System.out.println("\nSorted an Array in Ascending Order \n"); 
                
               for(i=0;i<a.length;i++) 
                   { 
                      System.out.print(a[i]+"\t"); 
                    } 
          } 
} 

