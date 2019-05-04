import { expect } from "chai";
import { ArticuloFactory } from "../articulofactory";
import { TipoArticulo } from "../tipoarticulo";

describe("Testing calculo IVA 10.7", () => {
    it("Debe calcular el IVA 10.7 correctamente", () => {
        var articuloFactory = new ArticuloFactory();
        var tipoArticulo = new TipoArticulo(1,"INFORMATICO");
        var articulo = articuloFactory.create(1,"Router Cisco 2200", tipoArticulo, 10000, false);
        //console.log("Precio del articulo: " + articulo.getPrecio());
        //console.log("IVA del articulo: "+ articulo.calcularIva());
        expect(articulo.calcularIva()).equal(1070);
    });
  });

  describe("Testing calculo IVA exento", () => {
    it("Debe calcular el IVA exento correctamente", () => {
        var articuloFactory = new ArticuloFactory();
        var tipoArticulo = new TipoArticulo(1,"INFORMATICO");
        var articulo = articuloFactory.create(2,"Server BGH IVA Exento", tipoArticulo, 10000, true);
        //console.log("Precio del articulo: " + articulo.getPrecio());
        //console.log("IVA del articulo: "+ articulo.calcularIva());
        expect(articulo.calcularIva()).equal(0);
    });
  });

  describe("Testing calculo IVA 21", () => {
    it("Debe calcular el IVA 21 correctamente", () => {
        var articuloFactory = new ArticuloFactory();
        var tipoArticulo = new TipoArticulo(2,"OFICINA");
        var articulo = articuloFactory.create(3,"Pack x 100 resma hojas A4", tipoArticulo, 3000, false);
        //console.log("Precio del articulo: " + articulo.getPrecio());
        //console.log("IVA del articulo: "+ articulo.calcularIva());
        expect(articulo.calcularIva()).equal(630);
    });
  });


  /*
        ArticuloFactory articuloFactory = new ArticuloFactory();
        Articulo articulo = articuloFactory.create(3, "Pack x 100 resma hojas A4", new TipoArticulo(2, "OFICINA"), 3000, true);
        System.out.println("Unit test calculo IVA IVA 21 Articulo oficina");
        System.out.println("Precio del articulo " + String.valueOf(articulo.getPrecio()));
        System.out.println("Valor del IVA: " + String.valueOf(articulo.calcularIva()));
        assertEquals(630, articulo.calcularIva());
  */
  