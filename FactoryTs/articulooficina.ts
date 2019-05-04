import { Articulo } from "./articulo";
import { TipoArticulo } from "./tipoarticulo";

export class ArticuloOficina extends Articulo{

    constructor(idArticulo:number, 
                nombre:string, 
                tipoArticulo:TipoArticulo, 
                precio:number){
            
                    super(idArticulo,nombre,tipoArticulo,precio);
    }

    public calcularIva():number {
        if(this.getPrecio() == 0){
            return 0;
        }else{
            console.log(0.21*this.getPrecio());
            return 0.21 * this.getPrecio();
        }
        
    }
}