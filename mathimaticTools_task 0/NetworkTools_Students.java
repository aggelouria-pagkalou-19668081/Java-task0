
/**
 * NetworkTools_Students εδώ.
 * 
 * Aggeliki Pagkalou (@alis 19668081)
 * 5/5/2021
 */
public class NetworkTools_Students
{
    
    private String myIP;
    private String myMask;
    
    private String[] ip_array;
    private String[] mask_array;

    /**
     * Constructor
     */
    public NetworkTools_Students()
    {
        myIP = "192.168.1.130";
        myMask = "255.255.255.192";
        
        ip_array= new String [4];
        char c1;
        int pos1=0;
        String octet1="";
        
        for (int i=0; i< myIP.length(); i++)
        {
            c1=myIP.charAt(i);
        if (c1 == '.' )
        {
            ip_array[pos1] = octet1;
            pos1++;
            octet1 = "";
        }
        else
        {
            octet1 = octet1 + String.valueOf(c1);
        }
    }
        ip_array[3]=octet1;
        
        mask_array = new String [4];
        char c2;
        int pos2 = 0;
        String octet2="";
        for (int i=0; i< myMask.length(); i++)
        {
            c2=myMask.charAt(i);
            if (c2 =='.')
            {
                mask_array[pos2] = octet2;
                pos2++;
                octet2 = "";
            }
            else
            {
                octet2 = octet2 + String.valueOf(c2);
            }
        }
        mask_array[3]=octet2;
}
}
    
  

