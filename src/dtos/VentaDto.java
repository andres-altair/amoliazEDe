package dtos;

import java.time.LocalDateTime;

public class VentaDto {//ente de las ventas

	long idVenta;
	int cantidadVenta= 1111111;
	double precio = 1111111111;
	LocalDateTime horaVenta = LocalDateTime.now();
	public long getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(long idVenta) {
		this.idVenta = idVenta;
	}
	public int getCantidadVenta() {
		return cantidadVenta;
	}
	public void setCantidadVenta(int cantidadVenta) {
		this.cantidadVenta = cantidadVenta;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public LocalDateTime getHoraVenta() {
		return horaVenta;
	}
	public void setHoraVenta(LocalDateTime horaVenta) {
		this.horaVenta = horaVenta;
	}
	
	public VentaDto() {}
	public VentaDto(int cantidadVenta, double precio, long idVenta) {
		super();
		this.cantidadVenta = cantidadVenta;
		this.precio = precio;
		this.idVenta = idVenta;
	}
}
