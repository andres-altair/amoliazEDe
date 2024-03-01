package servicios;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import dtos.VentaDto;
/**
 * implemtacion que implenta a la interfaz del menu
 */

public class EmpleadoImplementacion implements EmpleadoInterfaz {
	

	Scanner sc = new Scanner(System.in);
	/**
	 * metodo que se encarga de genrar un id
	 * @param listaVenta
	 * @return long
	 */
private long  generarId(List<VentaDto> listaVenta) {
		
		long id =0;
		int  tamaño= listaVenta.size();
		for (VentaDto venta : listaVenta) {
			if (tamaño==0) {
				id = 1;
						
			}else {
				id = venta.getIdVenta()+1;
				
			}
			
		}
		return id;	
	}
	@Override
	public void AñadirVenta(List<VentaDto> listaVenta) {
		VentaDto venta = new VentaDto();
		System.out.println("escribe las unidades a vender");
		venta.setCantidadVenta(sc.nextInt());
		long id = generarId(listaVenta);
		venta.setIdVenta(id);
		System.out.println("escribe las ganacias");
		venta.setPrecio(sc.nextDouble());
		listaVenta.add(venta);
		
	}
	

	
	@Override
	public void CalculoTotalVentasDiario(List<VentaDto> listaVenta) {
		VentaDto venta = new VentaDto();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("escribe la fecha (dd-MM-yyyy");
		LocalDateTime fechaIntroducida = LocalDateTime.parse(sc.next(),formato);
		int cantidadventa = 0;
		for (VentaDto v : listaVenta) {
			if (fechaIntroducida == v.getHoraVenta()) {
				 cantidadventa ++;
				 }	
			}
		
		
		Duration d = Duration.between(fechaIntroducida,venta.getHoraVenta() );
		System.out.println("cantidad :"+cantidadventa+ "  tiempo :"+d.toHours()+d.toMinutes()+d.getSeconds());
			
	}
}
