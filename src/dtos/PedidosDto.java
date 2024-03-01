package dtos;

import java.time.LocalDateTime;

public class PedidosDto {//ente de los pedidos

	long  idPedido ;
	String nombreProducto ="aaaaa";
	int cantidad =11111;
	LocalDateTime fecahEntrega = LocalDateTime.now();
	
	public long getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public LocalDateTime getFecahEntrega() {
		return fecahEntrega;
	}
	public void setFecahEntrega(LocalDateTime fecahEntrega) {
		this.fecahEntrega = fecahEntrega;
	}
	
	public PedidosDto() {}
	public PedidosDto(long idPedido, String nombreProducto, int cantidad, LocalDateTime fecahEntrega) {
		super();
		this.idPedido = idPedido;
		this.nombreProducto = nombreProducto;
		this.cantidad = cantidad;
		this.fecahEntrega = fecahEntrega;
	}
	
	
	
	
}
