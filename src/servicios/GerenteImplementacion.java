package servicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import dtos.PedidosDto;
import dtos.VentaDto;
/**
 * implementacion que implementa a la gerencia
 */
public class GerenteImplementacion implements GerenteInterfaz {
	
	Scanner sc = new Scanner(System.in);
/**
 * metodo que genera un id
 * @param listaPedido
 * @return long
 */
private long  generarId(List<PedidosDto> listaPedido) {
		
		long id =0;
		int  tamaño= listaPedido.size();
		for (PedidosDto pedido : listaPedido) {
			if (tamaño==0) {
				id = 1;
						
			}else {
				id = pedido.getIdPedido()+1;
				
			}
			
		}
		return id;	
	}
@Override
public void pedidoDelProducto(List<PedidosDto> listaPedido) {
	PedidosDto pedido = new PedidosDto();
	System.out.println("nombre del pedido");
	pedido.setNombreProducto(sc.next());
	System.out.println("cantidad");
	pedido.setCantidad(sc.nextInt());
	long id = generarId(listaPedido);
	pedido.setIdPedido(id);
	listaPedido.add(pedido);
	
}

	@Override
	public void MostrarVentasDelDia(List<VentaDto> listaVenta) {
		
		VentaDto venta = new VentaDto();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("escribe la fecha (dd-MM-yyyy");
		LocalDateTime fechaIntroducida = LocalDateTime.parse(sc.next(),formato);
		for (VentaDto v : listaVenta) {
			if (fechaIntroducida == v.getHoraVenta()) {
				boolean cerrar =false;
				while(!cerrar)
				 System.out.println("Venta número: "+venta.getIdVenta());
				 System.out.println("Euros: "+venta.getPrecio());
				 System.out.println("Instante de compra: "+venta.getHoraVenta());
				 System.out.println("quieres  terminar (true/false)");
				 cerrar = sc.hasNext();
				 }	
		}
		
		
	}


}
