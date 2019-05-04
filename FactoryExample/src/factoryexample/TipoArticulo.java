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
public class TipoArticulo {
    
    private int idTipoArticulo;
    private String tipoArticulo;
    public final static String TIPO_INFORMATICO = "INFORMATICO";
    public final static String TIPO_OFICINA = "OFICINA";
    
    public TipoArticulo(int idTipoArticulo, String tipoArticulo){
        this.idTipoArticulo = idTipoArticulo;
        this.tipoArticulo = tipoArticulo;
    }

    /**
     * @return the idTipoArticulo
     */
    public int getIdTipoArticulo() {
        return idTipoArticulo;
    }

    /**
     * @param idTipoArticulo the idTipoArticulo to set
     */
    public void setIdTipoArticulo(int idTipoArticulo) {
        this.idTipoArticulo = idTipoArticulo;
    }

    /**
     * @return the tipoArticulo
     */
    public String getTipoArticulo() {
        return tipoArticulo;
    }

    /**
     * @param tipoArticulo the tipoArticulo to set
     */
    public void setTipoArticulo(String tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }
    
    
    
}
