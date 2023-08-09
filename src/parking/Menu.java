package parking;



import javax.swing.JOptionPane;

public class Menu {
	public static void	opciones() {
		String[] opciones= {"parqueadero habilitados","encontrar carro","parqueando","vaciar Parking","salir"};
		int opcion;
		
		try {
			ParqueaderoHabilitados.inicio();
			while(true) {
				
			
				
		opcion= JOptionPane.showOptionDialog(null, "Elige tu opcion",
				"bienvenido usuario",
			         JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
			    
					if(opcion==0){
							 
								ParqueaderoHabilitados.printList();
					}
					else if(opcion==1){
								//ParqueaderoHabilitados.inicio();
								ParqueaderoHabilitados.buscar();
					}
					else if(opcion==2){
								//ParqueaderoHabilitados.inicio();
								ParqueaderoHabilitados.parquear();
								
					}
					else if(opcion==3){
								
								//ParqueaderoHabilitados.inicio();
								ParqueaderoHabilitados.vaciarParking();
					}
					else {
								break;}
			}
					
			}

		catch(Exception e) {
						JOptionPane.showMessageDialog(null, "saliste del programa");}
	}	}

	

