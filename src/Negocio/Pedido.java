package Negocio;

public class Pedido {
    String CodPedido, nitProveedor, fecha;
    int cantProductos;
    float totalPagar;

    public String getCodPedido() {
        return CodPedido;
    }

    public void setCodPedido(String CodPedido) {
        this.CodPedido = CodPedido;
    }

    public String getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(String nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantProductos() {
        return cantProductos;
    }

    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }

    public float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(float totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    
}
