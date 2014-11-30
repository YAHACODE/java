/**
 * @(#)CHAINE.java
 *
 *
 * @author 
 * @version 1.00 2014/3/14
 */


public class CHAINE {
	String tab[]=new String [7];

    //CONSTRECTEUR
    public CHAINE()
    {
    	tab[0]="ali" ;
			tab[1]="Med";
				tab[2]="Hedi";
					tab[3]="ala";
						tab[4]="yahia";
							tab[5]="imed";
							 	tab[6]="foulen";
    } 
    
    void recherche()
    		{
			String nom="ali";
			boolean  test=false;
			int pos=0;
			for(int i=0;i<tab.length;i++)
			{
				if (nom.equals(tab[i]))
				{
					test=true;
					pos=i;
				}
			}
			if (test==true)
				System.out.println("nom exist dans la position "+pos);
				else
				System.out.println("nom n'exist pas");
					
			}
			
			
			void recherche1()
			{
				char ch ='f';
				for(int i=0	;i<tab.length;i++)
				{
					
					if(ch==tab[i].charAt(0))
						System.out.println(tab[i]);
				}
			}
				
	void  affiche()
	{
		for(int i=0;i<tab.length;i++)
			System.out.print("["+ tab[i]+"]" );		
				
	}
	
	
	public static  void main(String args[])
	{
		CHAINE t1= new CHAINE ();
		t1.affiche();
		t1.recherche();
		t1.recherche1();
	}
   
    
}