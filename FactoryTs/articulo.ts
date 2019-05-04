import { TipoArticulo } from "./tipoarticulo";

export abstract class Articulo{
    public idArticulo: number;
    public nombre: string;
    public tipoArticulo: TipoArticulo;
    public precio:number;
    public iva:number;

    constructor(idArticulo:number, nombre:string, tipoArticulo:TipoArticulo, precio:number){
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.tipoArticulo = tipoArticulo;
        this.precio = precio;
        this.iva = 0;
    }
    
    public getPrecio():number{
        return this.precio;
    }
    
    public abstract calcularIva():number;
    
    public getIva():number{
        return this.iva;
    }
}