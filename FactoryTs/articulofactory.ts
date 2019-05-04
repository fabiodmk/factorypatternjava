import { TipoArticulo } from "./tipoarticulo";
import { ArticuloInformatico } from "./articuloinformatico";
import { ArticuloOficina } from "./articulooficina";

export class ArticuloFactory{

    constructor(){

    }
    public create(idArticulo:number, 
                  nombre:string, 
                  tipoArticulo:TipoArticulo, 
                  precio:number, 
                  isExento:boolean) {
        
        if(tipoArticulo.getTipoArticulo() == TipoArticulo.TIPO_INFORMATICO){
            
            return new ArticuloInformatico(idArticulo, nombre, tipoArticulo, precio, isExento);
        }
        if(tipoArticulo.getTipoArticulo() == TipoArticulo.TIPO_OFICINA){
            return new ArticuloOficina(idArticulo, nombre, tipoArticulo, precio);
        }
        return null;
        
    }

}