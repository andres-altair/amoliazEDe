package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.PedidosDto;
import dtos.VentaDto;

public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);
	@Override
	public int menuPrincipal() {
		System.out.println("0. cerrar");
		System.out.println("1. menu de empledo");
		System.out.println("2. menu del gerente");
		int eleccion = sc.nextInt();
		return eleccion;
	}
	
	private int menuPrivadoEmpleado() {
		System.out.println("0. volver");
		System.out.println("1. añadir venta");
		System.out.println("2. Cálculo total de ventas diario");
		int eleccion = sc.nextInt();
		return eleccion;
	}

	@Override
	public void menuEmpleado(List<VentaDto> listaventa) {
		
		EmpleadoInterfaz ei = new EmpleadoImplementacion();
		int eleccion = menuPrivadoEmpleado();
		switch(eleccion) {
		case 0:  break;
		case 1: ei.AñadirVenta(listaventa);
			break;
		case 2: ei.CalculoTotalVentasDiario(listaventa);
			break;
			default: System.out.println("eleccion incorrecta");
			break;
		
		}
	}
	
	private int menuPrivadoGerente() {
		System.out.println("0. volver");
		System.out.println("1. Mostrar ventas del día");
		System.out.println("2. Crear pedido para proveedores");
		int eleccion = sc.nextInt();
		return eleccion;
	}

	@Override
	public void menuGerente(List<VentaDto> listaventa, List<PedidosDto> listaPedido) {
		GerenteInterfaz gi = new GerenteImplementacion();
		
		int eleccion = menuPrivadoEmpleado();
		switch(eleccion) {
		case 0:  break;
		case 1: gi.MostrarVentasDelDia(listaventa);
			break;
		case 2: gi.pedidoDelProducto(listaPedido);
			break;
			default: System.out.println("eleccion incorrecta");
			break;
		
	}
	
	}
}
