package servicios;

import java.util.List;

import dtos.PedidosDto;
import dtos.VentaDto;

public interface MenuInterfaz {
	
	public int menuPrincipal();
	public void menuEmpleado(List<VentaDto> listaventa);
	public void menuGerente(List<VentaDto> listaventa,List<PedidosDto>listaPedido);
}
