package servicios;

import java.util.List;

import dtos.PedidosDto;
import dtos.VentaDto;
/***
 * interfaz encargad de la gerencia
 */
public interface GerenteInterfaz {
	public void MostrarVentasDelDia(List<VentaDto> listaVenta);
	public void pedidoDelProducto(List<PedidosDto> listaPedido);

}
