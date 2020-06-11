using System;
using System.Collections.Generic;
using System.Text;

namespace CarritoComprasEcomerce
{
    public static class CarritoCompras
    {
        public static decimal CalcularTotal(List<(int cantidad,decimal precioUnitario)>detalle) {
            decimal total = 0;
            foreach (var item in detalle) {
                total = total + (item.cantidad * item.precioUnitario);
            }
            return total;
        }
        
    }
}
