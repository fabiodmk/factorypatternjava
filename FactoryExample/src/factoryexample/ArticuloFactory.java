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
public class ArticuloFactory implements IArticuloFactoryMethod{

    @Override
    public Articulo create(int id, String nombre, TipoArticulo tipoArticulo, long precio, boolean isExento) {
        
        if(tipoArticulo.getTipoArticulo() == TipoArticulo.TIPO_INFORMATICO){
            return new ArticuloInformatico(id, nombre, tipoArticulo, precio, isExento);
        }
        if(tipoArticulo.getTipoArticulo() == TipoArticulo.TIPO_OFICINA){
            return new ArticuloOficina(id, nombre, tipoArticulo, precio);
        }
        return null;
        
    }
    
}
