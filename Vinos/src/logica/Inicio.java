package logica;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Inicio extends JFrame{
	
	private static JFrame visual;
	private static TWine vino=new TWine();
	private static String texto;
	

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try{
			visual=new JFrame();
		}catch(Exception e){
			System.out.print(e);
		}
		
		
		
		
		try {
			
			
			if(vino.getClass().getConstructor(null) != null){
				
				vino.setaExistence(Integer.parseInt(JOptionPane.showInputDialog("Introdusca el numero de existencia :")));
				vino.setaName(JOptionPane.showInputDialog("Introdusca el nombre de la region del pedido :"));
				vino.setaSales(Float.parseFloat(JOptionPane.showInputDialog("Introdusca el precio")));
				vino.setaSupplier(new TSupplier(JOptionPane.showInputDialog("Introdusca el nombre del pais provedor"),Integer.parseInt(JOptionPane.showInputDialog("Introdusca el pedido"))));
			}
			else{
			 vino=new TWine(40,"Canal",500,"Cuba",30);
			}
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean res=vino.DoPucharse();

		JOptionPane.showMessageDialog(null,
									"\n Precio : "+vino.getaSales()+
									"\n Existencias : "+vino.getaExistence()+
									"\n Localizacion : "+vino.getaName()+
									"\n Provedor : "+vino.getaSupplier().getaCountry()+
									"\n Pedidos : "+vino.getaSupplier().getaDelivery());
		if(res==true){
			texto="Si";
		}
		else{texto="NO";}

		JOptionPane.showMessageDialog(null,"¿Se necesita comprar mas vino ?\n"+texto);
		

		
	}
}
