/**
 * @(#)tableau.java
 *
 *
 * @author 
 * @version 1.00 2014/3/17
 */

import java.io.*;
public class tableau {
int n;
String tab[];

public  tableau()
{
}

void  Saisir ()
{
	String t ;
	try{
		System.out.print("donner taille tableau");
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		t = bf.readLine();
		
		n=Integer.parseInt(t) ;
			
			
			//System.out.print(tab.length);
	}
	catch(Exception e) {}
	tab=new String[n];
}



void saisirTableau()
{
	
	
	
	String nom="";
	try
	{
		for(int i=0;i<tab.length;i++)
		{
			System.out.println("Donner le nom num: "+i);
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			nom=bf.readLine();
			tab[i]=nom;
		}
		
		
	}
	catch(Exception e){
	}
}




void affichage()
{
	for(int i=0;i<tab.length;i++)
	{
		System.out.print("|"+tab[i]+"|");
	}
}


 public static void main (String[] args) 
 	{
 		
 		tableau t1 = new tableau() ;
 		
 		t1.Saisir();
 		t1.saisirTableau();
 		t1.affichage();
}    
    
}