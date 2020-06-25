using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;

namespace CarritoComprasEcomerce
{
    public static class CarritoCompras
    {
        public static decimal CalcularTotal(List<(int cantidad, decimal precioUnitario)> detalle)
        {
            decimal total = 0;
            foreach (var item in detalle)
            {
                total = total + (item.cantidad * item.precioUnitario);
            }
            return total;
        }

        public static void EliminarProductoDelCarrito(List<CarritoDetalle> Carrito, string nombre_producto_a_eliminar)
        {
            if (Carrito == null)
            {
                throw new NullReferenceException("El carrito no contiene ningún producto.");
            }
            else
            {
                for (int contador = 0; contador < Carrito.Count; contador++)
                {
                    if(Carrito.ElementAt(contador).nombreProducto == nombre_producto_a_eliminar)
                    {
                        Carrito.RemoveAt(contador);
                    }
                }
            }

        }

        public static void LlenarCarrito(List<CarritoDetalle> Carrito,string ProductoSeleccionado, float precioUnitario, int cantidadDisponible, int cantidadSeleccionada) 
        {
            if (cantidadDisponible > cantidadSeleccionada)
            {
                CarritoDetalle carritoDetalle = new CarritoDetalle(ProductoSeleccionado);

                carritoDetalle.precioUnitarioProducto = precioUnitario;

                carritoDetalle.CantidadPorRenglon = cantidadSeleccionada;

                carritoDetalle.TotalporRenglon = precioUnitario * cantidadSeleccionada;

                Carrito.Add(carritoDetalle);
            }
            else
            {
                System.Console.WriteLine("No hay stock disponible para" + ProductoSeleccionado + ", usted puede seleccionar hasta" + cantidadDisponible + "del producto");
            }

        }

        public static bool VerificarNombreProducto_Vacio (Producto producto)
        {
            if(String.IsNullOrEmpty(producto.nombre)){
                return false;
            }
            else
            {
                return true;
            }
        }

        public static bool VerificarStockNONegativoProducto(Producto producto)
        {
            if(producto.cantProd < 0)
            {
                return false;
            }else
            {
                return true;
            }

        }

        public static bool VerificarDescripcionNOnula(Producto producto)
        {
            if (String.IsNullOrEmpty(producto.descripcion))
            {
                return false;
            }else
            {
                return true;
            }

        }
    }

}
