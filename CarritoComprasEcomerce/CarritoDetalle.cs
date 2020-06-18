using System;
using System.Collections.Generic;
using System.Text;

namespace CarritoComprasEcomerce
{
    public class CarritoDetalle
    {
        
        
        public CarritoDetalle(string nombreProducto)
        {
            this.nombreProducto = nombreProducto;

        }

        public string nombreProducto { get; set; }
        public float precioUnitarioProducto { get; set; }
        public float TotalporRenglon { get; set; }

        public int CantidadPorRenglon { get; set; }
    }
}
