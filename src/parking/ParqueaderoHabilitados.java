package parking;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public  class ParqueaderoHabilitados{
	static ArrayList<String> parqueaderos = new ArrayList<  >( 5);
	String placa;
	
	static String miplaca;
	static String nombre="libre";

	public static void inicio(){
		parqueaderos.add(null);
    	   parqueaderos.remove(parqueaderos.size() - 1);
    	   parqueaderos.add(0,nombre);
    	   parqueaderos.add(1,nombre);	 
    	   parqueaderos.add(2,nombre);
    	   parqueaderos.add(3,nombre);
    	   parqueaderos.add(4,nombre);
	}
       public static void printList(){
    	   
    	   String lista =" ";
//    	   
    		
    		
    		for (int i = 1; i <= parqueaderos.size(); i++) {
    			if(parqueaderos.get(i-1)=="libre") {
    			lista = lista+" " + i  +" "+ parqueaderos.get(i-1);
    			if (i!=5) {
    			lista=lista +" - ";}
    			else{
    				break;
    			}
    		
    			}
    		}
    		
    		
    		JOptionPane.showMessageDialog(null,lista );
    		  
    	    
}
       
       public static void parquear() {
    	   
   	String[] listaparqueaderos= {"parqueadero 1","parqueadero 2","parqueadero 3","parqueadero 4","parqueadero 5"};
   	 
   	
   	int eleccion= JOptionPane.showOptionDialog(null, "cual fue el lugar que parqueo ",
   			"selecciona el parking",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, listaparqueaderos, listaparqueaderos[0]);
    
   	switch(eleccion) {

   	case 0:
   		if(parqueaderos.get(0)=="libre") {   		 
   		nombre=JOptionPane.showInputDialog("Introduce tu placa");
   		parqueaderos.remove(0);
   		parqueaderos.add(0,nombre);
   		
   		break;
   		}else {
   			JOptionPane.showMessageDialog(null,"parqueadero ocupado");
   			break;}
   		
   	case 1:
   		if(parqueaderos.get(1)=="libre") {   		 
   	   		nombre=JOptionPane.showInputDialog("Introduce tu placa");
   	   		parqueaderos.remove(1);
   	   		parqueaderos.add(1,nombre);
   	   	
   	   		break;
   	   		}else {
   	   			JOptionPane.showMessageDialog(null,"parqueadero ocupado");
   	   			break;}
   	case 2:
   		if(parqueaderos.get(2)=="libre") {   		 
   	   		nombre=JOptionPane.showInputDialog("Introduce tu placa");
   	   		parqueaderos.remove(2);
   	   		parqueaderos.add(2,nombre);
   	   	
   	   		break;}else {
   	   			JOptionPane.showMessageDialog(null,"parqueadero ocupado");
   	   			break;}
   	case 3:
   		if(parqueaderos.get(3)=="libre") {   		 
   	   		nombre=JOptionPane.showInputDialog("Introduce tu placa");
   	   		parqueaderos.remove(3);
   	   		parqueaderos.add(3,nombre);
   	   	
   	   		break;}else {
   	   			JOptionPane.showMessageDialog(null,"parqueadero ocupado");
   	   			break;}
   	case 4:
   		if(parqueaderos.get(4)=="libre") {   		 
   	   		nombre=JOptionPane.showInputDialog("Introduce tu placa");
   	   		parqueaderos.remove(4);
   	   		parqueaderos.add(4,nombre);
   	   	
   	   		break;}else {
   	   			JOptionPane.showMessageDialog(null,"parqueadero ocupado");
   	   			break;}
   	} }
       
       public static void buscar () {
    	   
    	   String miplaca=JOptionPane.showInputDialog("Introduce tu placa");
    	   int imprime =parqueaderos.indexOf(miplaca)+1;
    	   if(imprime>0) {
    	   JOptionPane.showInternalMessageDialog(null,imprime);
    	   imprime=0;
    		   } else {
    			  JOptionPane.showInternalMessageDialog(null,"placa equivocada");
    		   }   	   
    		   }
    	   	    
       public static void vaciarParking() {
    		
    		   	String[] listaparqueaderos= {"parqueadero 1","parqueadero 2","parqueadero 3","parqueadero 4","parqueadero 5"};
    		   	
    			int eleccion= JOptionPane.showOptionDialog(null, "cual fue el lugar que parqueo ",
    		   			"selecciona el parking",
    		            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, listaparqueaderos, listaparqueaderos[0]);
    		   	
    		   	
    		   	switch(eleccion) {

    		   	case 0:
    		   		parqueaderos.remove(0);
    		   		parqueaderos.add(0,"libre");
    		   		
    		   		
    		   		break;
    		   	case 1:
    		   		
    		   		parqueaderos.remove(1);
    		   		parqueaderos.add(1,"libre");
    		   		break;
    		   	case 2:
    		   		
    		   		parqueaderos.remove(2);
    		   		parqueaderos.add(2,"libre");
    		   		break;
    		   	case 3:
    		   		
    		   		parqueaderos.remove(3);
    		   		parqueaderos.add(3,"libre");
    		   		break;
    		   	case 4:
    		   		
    		   		parqueaderos.remove(4);
    		   		parqueaderos.add(4,"libre");
    		   		
    		   		break;
    		   	}}}
 
 
		 
	 
 
