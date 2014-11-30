/**
 * @(#)fenetre.java
 *
 *
 * @author 
 * @version 1.00 2014/3/17
 */

import java.awt.*;
import javax.swing.*;
public class fenetre extends JFrame

{
	//declaration des variables.(buttons)
	
	JButton b1= new JButton("valider");
	JButton b2= new JButton("java");
	JButton b3= new JButton("option");
	
	
	
	
	//CONDTRECTEUR
	public fenetre()
	{
		
		
		Container c=getContentPane();
		
		// technique d'emplacement: flow l'un a cote de l'autre .
		c.setLayout(new FlowLayout());
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		
		
		
		
		this.setTitle("Helo World");
		this.setSize(500,400);
		this.show();  // this.setVisible(true);
	}
	
	
	
	
 public static void main (String[] args) 
{ 	
 	fenetre f =new fenetre();
 
}  
}     
