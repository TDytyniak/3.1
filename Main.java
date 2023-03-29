import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    
      Scanner wys = new Scanner(System.in);
      Scanner sym = new Scanner(System.in);
      System.out.println("podaj sym");
String s = sym.nextLine();
      System.out.println("podaj ilość bok");
    int w = wys.nextInt();
      for ( int i=0; i<w; i++)
        {
          for ( int z= 0; z<w; z++)
            {
              System.out.print(s);
            }
              System.out.println(" ");
            }
        
    for(int k=2; k<=w; k++)
    { for(int l=1; l<=w; l++) {
      if (k>1&& k<w && l>1 && l <w)
      
         System.out.print(" ");
          
 else 
      
          System.out.print(s);
    }

    System.out.println(" ");
  }
    }
  }
