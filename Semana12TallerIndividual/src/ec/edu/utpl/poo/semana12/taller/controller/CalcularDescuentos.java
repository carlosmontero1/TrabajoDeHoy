package ec.edu.utpl.poo.semana12.taller.controller;

import ec.edu.utpl.poo.jfacturacion.model.Factura;
import ec.edu.utpl.poo.jfacturacion.model.ICalculaTotalFactura;

public class CalcularDescuentos implements ICalculaTotalFactura {

    public CalcularDescuentos() {
    }

    @Override
    public double calcularTotal(Factura factura) {

        double total = 0;
        double subtotal = 0;
        double totalDetalle = 0;
        double precioUnitario = 0;
        double descuento = 0;

        if (factura.getCliente().isFrecuente()) {
            for (var detalle : factura.getDetalle()) {

                if (detalle.getCantidad() < 3) {
                    precioUnitario = detalle.getProducto().getPrecioUnitario() - 0.01;
                    subtotal = precioUnitario * detalle.getCantidad();
                    total += subtotal;
                }

                if (detalle.getCantidad() > 3 && detalle.getCantidad() < 6) {
                    precioUnitario = detalle.getProducto().getPrecioUnitario() - 0.01;
                    subtotal = precioUnitario * detalle.getCantidad();
                    descuento = subtotal * 0.02;
                    totalDetalle = subtotal - descuento;
                    total += totalDetalle;
                }

                if (detalle.getCantidad() >= 6 && detalle.getCantidad() < 12) {
                    precioUnitario = detalle.getProducto().getPrecioUnitario() - 0.01;
                    subtotal = precioUnitario * detalle.getCantidad();
                    descuento = subtotal * 0.03;
                    totalDetalle = subtotal - descuento;
                    total += totalDetalle;
                }

                if (detalle.getCantidad() >= 12) {
                    precioUnitario = detalle.getProducto().getPrecioUnitario() - 0.01;
                    subtotal = precioUnitario * detalle.getCantidad();
                    descuento = subtotal * 0.04;
                    totalDetalle = subtotal - descuento;
                    total += totalDetalle;
                }

            }
        } else {

            for (var detalle : factura.getDetalle()) {

                if (detalle.getCantidad() < 3) {
                    precioUnitario = detalle.getProducto().getPrecioUnitario();
                    subtotal = precioUnitario * detalle.getCantidad();
                    total += subtotal;
                }

                if (detalle.getCantidad() > 3 && detalle.getCantidad() < 6) {
                    precioUnitario = detalle.getProducto().getPrecioUnitario();
                    subtotal = precioUnitario * detalle.getCantidad();
                    descuento = subtotal * 0.02;
                    totalDetalle = subtotal - descuento;
                    total += totalDetalle;
                }

                if (detalle.getCantidad() >= 6 && detalle.getCantidad() < 12) {
                    precioUnitario = detalle.getProducto().getPrecioUnitario();
                    subtotal = precioUnitario * detalle.getCantidad();
                    descuento = subtotal * 0.03;
                    totalDetalle = subtotal - descuento;
                    total += totalDetalle;
                }

                if (detalle.getCantidad() >= 12) {
                    precioUnitario = detalle.getProducto().getPrecioUnitario();
                    subtotal = precioUnitario * detalle.getCantidad();
                    descuento = subtotal * 0.04;
                    totalDetalle = subtotal - descuento;
                    total += totalDetalle;
                }

            }

        }

        return total;

    }

}
