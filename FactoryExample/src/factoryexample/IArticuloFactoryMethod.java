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
public interface IArticuloFactoryMethod {
    public Articulo create(int id, String nombre, TipoArticulo tipoArticulo, long precio, boolean isExento);
}
