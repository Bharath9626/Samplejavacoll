import java.text.SimpleDateFormat;
import java.util.Date;

public class Project1 {

	public static void main(String[] args) {

		System.out.println("hola amigo");
		int is = 27;
       for(int i=1;i<is;i++)
       {
    	   i=i++;
    	   System.out.println(i);
    	   if(i==7)
    	   {
    		   System.out.println(i +"good");
    		   break;
    	   }
    	  /* while(is>20)
    	   {
    		   System.out.println(is);
    		   is++;
    		   if(is==299)
    		   {
    			   System.out.println(is);
    			   break;
    			 
    		   }
    	   }*/
       }
       int k=1;
     /*  for(int s=1;s<7;s++)
       {
    	   for(int j=1;j<s;j++)
    	   {
    		   System.out.print("1");
    		
    		   k++;
    	   }
    	   
       }*/
       for(int i=1;i<5;i++)
       {
       for(int j=1;j<=i;j++)
       {
       System.out.print(j);
       
       //k++;
       }
       System.out.println("");

       }
       int z[]= {2,4,6,7,8,9,};
       for(int i=0;i<z.length;i++)
       {
    	   System.out.println(z[i]);
       }
       Date d=new Date();
       d.toString();
       System.out.println(d);
       SimpleDateFormat df=new SimpleDateFormat("dd/mm/yyyy");
       System.out.println(df.format(d));
       
       
       }
	}


