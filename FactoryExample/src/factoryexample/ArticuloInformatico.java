/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryexample;


/**
 *
 * @author fabm_
 */
public class ArticuloInformatico extends Articulo{
    
    private boolean isExento = false;
    
    public ArticuloInformatico(int id, String nombre, TipoArticulo tipoArticulo, long precio, boolean isExento) {
        super(id, nombre, tipoArticulo, precio);
        this.isExento = isExento;
    }

    @Override
    public long calcularIva() {
        if(isExento || (this.getPrecio() == 0)){
            return 0;
        }else{
            long iva = (long) (0.107 * this.getPrecio());
            return iva;
        }
    }
    
}
