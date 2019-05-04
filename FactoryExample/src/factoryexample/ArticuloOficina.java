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
public class ArticuloOficina extends Articulo{
    
    public ArticuloOficina(int id, String nombre, TipoArticulo tipoArticulo, long precio) {
        super(id, nombre, tipoArticulo, precio);
    }

    @Override
    public long calcularIva() {
        if(this.getPrecio() == 0){
            return 0;
        }else{
            long iva = (long) (0.21 * this.getPrecio());
            return iva;
        }
        
    }
    
}
