package ec.edu.utpl.poo.semana12.taller.model;

import ec.edu.utpl.poo.jfacturacion.controller.JFacturacionMain;
import ec.edu.utpl.poo.jfacturacion.model.CalculoNormal;
import ec.edu.utpl.poo.semana12.taller.controller.CalcularDescuentos;

public class Main {
    public static void main(String[] args) {

        CalculoNormal normal = new CalculoNormal();
        var totalFactura = JFacturacionMain.calcularTotal(normal);
        System.out.println(totalFactura);

        CalcularDescuentos metodo = new CalcularDescuentos();
        totalFactura = JFacturacionMain.calcularTotal(metodo);
        System.out.println(totalFactura);

    }
}
