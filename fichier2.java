/**
 * @(#)fichier.java
 *
 *
 * @author 
 * @version 1.00 2014/3/17
 */

import java.io.*;
public class fichier {
String chemin="D:/test.txt";
String chemin1="D:/test1.txt";
String chemin2="D:/test1.txt";

public fichier()

{
}

void lire()
{
	String ligne="";
	try{
	
	BufferedReader bf=new BufferedReader (new FileReader (chemin));
	while((ligne=bf.readLine())!=null)
	{
		System.out.println(ligne);
	}
}
catch(Exception e)
{
	System.out.println("fichier n'exsite pas");
}

}


void ecrire()
{
	String l="";
	try
	{
		BufferedWriter bf=new BufferedWriter (new FileWriter (chemin1));
		
	BufferedReader bf1=new BufferedReader (new InputStreamReader (System.in));
	for(int i=0;i<5;i++)
	{
		System.out.println("donner line n="+i);
		l=bf1.readLine();
		bf.write(l);
		bf.newLine();	
					
	}
		
	
		
		bf.close();
		
	}
	catch(Exception e)	
	{
}
	
	
	
	
}





 public static void main (String[] args) 
 	{
 		
 		fichier t1 = new fichier() ;
 		t1.lire();
        t1.ecrire();
}    
    
}
