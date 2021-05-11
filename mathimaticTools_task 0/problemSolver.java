
/**
 * kanei mathimatikes prakseis
 * 
 * @aegopounaxesw (Το όνομά σας) 
 * @version (Αριθμός έκδοσης ή ημερομηνία εδώ)
 */
public class problemSolver
{
    // kai edo sxolia mpainoun alla prepei na baleis// Sto apo katw orizeis thn metabliti. 
    // den thn peirazeis. Pas katw sto public int to deytero kai bazeis oti thes
    private int x;

    /**
     * Κατασευαστής αντικειμένων της κλάσης problemSolver
     */
    public problemSolver()
    {
        // αρχικοποίηση μεταβλητών στιγμιοτύπου
        x = 0;
    }

    /**
     * auth h meth kanei dayto
     * 
     * @param  y  num1 num2 num3
     * @return       tpt gt einai void kai apla typonei apotelesma
     */
    public void averageThreeIntegers(int num1, int num2, int num3)
    {
      double average=0;
      average=(num1+num2+num3)/3;
      System.out.println("the average is:"+average);
       
    }
     /**
     * auth h meth kanei eksisosh
     * meta to 
     * @param 
     * @return       tpt gt einai void kai apla typonei apotelesma (kai auti)
     */
    public void firstDegreeEquation(double a,double b)
    {
      double solution=0;
      if (a!=0)
      {
         solution=b/a;
         System.out.println("The result is:"+solution);
        }
        else
        {
            if (b!=0)
            {
                System.out.println("No solutions exist");
            }
            else
            {
                System.out.println("Infinetely solutions exist");
            }
            
  }
}

/**
 * 
     * auth h methodos upol to ginomeno toy pinaka
     * meta to 
     * @param 
     * @return       tpt gt einai void kai apla typoneiginomeno(kai auti)
     */
    public void productArray(double[] arrayOfReal)
    {
        double product=1;
        int sizeOfArray;
        sizeOfArray=arrayOfReal.length;
        for (int i=0;i<sizeOfArray;i++)
        {
            product=product*arrayOfReal[i];
        }
        System.out.println("The result is:"+product);
    }
}