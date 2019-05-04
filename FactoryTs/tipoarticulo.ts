
export class TipoArticulo{

    public idTipoArticulo:number;
    public tipoArticulo:string;
    public static TIPO_INFORMATICO:string = "INFORMATICO";
    public static TIPO_OFICINA:string = "OFICINA";

    constructor(idTipoArticulo: number, tipoArticulo:string){
        this.idTipoArticulo = idTipoArticulo;
        this.tipoArticulo = tipoArticulo;
    }

    getIdTipoArticulo():number{
        return this.idTipoArticulo;
    }

    setIdTipoArticulo(idTipoArticulo: number){
        this.idTipoArticulo = idTipoArticulo;
    }

    getTipoArticulo():string{
        return this.tipoArticulo;
    }

    setTipoArticulo(tipoArticulo: string){
        this.tipoArticulo = tipoArticulo;
    }
}