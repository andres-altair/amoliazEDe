package servicios;

import java.util.List;

import dtos.VentaDto;

public interface EmpleadoInterfaz {//interfaz encargada de los empledos

	/**
	 * metodo que se encarga de añadir venta
	 * amd-01022024
	 * @param listaVenta 
	 */
	public void AñadirVenta(List<VentaDto> listaVenta);
	/**
	 * metodo que calcula las ventas
	 * amd-01022024
	 * @param listaVenta
	 */
	public void CalculoTotalVentasDiario(List<VentaDto> listaVenta);
}
