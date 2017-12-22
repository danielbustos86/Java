/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas;

/**
 *
 * @author daniel
 */
public class Producto {
    private String Codigo;
    private String Descripcion;
    private int StockMinimo;

    private int Stockactual;
    private int PrecioVenta;
    private int PrecioCompra;

    
    
    public Producto(String Codigo, String Descripcion, int StockMinimo, int Stockactual, int PrecioVenta, int PrecioCompra) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.StockMinimo = StockMinimo;
        this.Stockactual = Stockactual;
        this.PrecioVenta = PrecioVenta;
        this.PrecioCompra = PrecioCompra;
    
    }
    
    public Producto() {
    
    }
    public int getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(int PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public int getPrecioCompra() {
        return PrecioCompra;
    }

    public void setPrecioCompra(int PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }
    

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getStockMinimo() {
        return StockMinimo;
    }

    public void setStockMinimo(int StockMinimo) {
        this.StockMinimo = StockMinimo;
    }

    public int getStockactual() {
        return Stockactual;
    }

    public void setStockactual(int Stockactual) {
        this.Stockactual = Stockactual;
    }
    
}
