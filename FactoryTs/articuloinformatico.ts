import { Articulo } from "./articulo";
import { TipoArticulo } from "./tipoarticulo";

export class ArticuloInformatico extends Articulo{

    public isExento: boolean;

    constructor(idArticulo:number, 
                                    nombre:string, 
                                    tipoArticulo:TipoArticulo, 
                                    precio:number, 
                                    isExento: boolean){
        super(idArticulo,nombre,tipoArticulo,precio);
        this.isExento = isExento;
    }

    public calcularIva():number{
        if(this.isExento == true || (this.getPrecio() == 0)){
            console.log(0);
            return 0;
        }else{
            console.log(0.107*this.getPrecio());
            return 0.107 * this.getPrecio();
        }
    }
}