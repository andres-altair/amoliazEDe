package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.PedidosDto;
import dtos.VentaDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class inicio {//clase principal


	public static void main(String[] args) {//metodo pricipal
		List<PedidosDto> pedido = new ArrayList<PedidosDto>();
		List<VentaDto> venta = new ArrayList<VentaDto>();
		MenuInterfaz mi = new MenuImplementacion();
		int eleccion ;
		boolean abrir= false;
		while(!abrir) {
			eleccion = mi.menuPrincipal();
			switch (eleccion ) {
			case 0: abrir=true;
			break;
			case 1: mi.menuEmpleado(venta);
			break;
			case 2 : mi.menuGerente(venta, pedido);
			break;
			default:System.out.println("eleccion erroneo");
				
			}
		}
		

	}

}
