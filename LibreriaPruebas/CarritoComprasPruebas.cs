using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CarritoComprasEcomerce;
using Xunit;

namespace LibreriaPruebas
{
    public class CarritoComprasPruebas
    {
        [Fact]
        public void CarritoComprasPrueba_TotalNoPuedeSerMenorIgualCero() {
            //float expected = 490;

            List<(int cantidad, decimal precioUnitario)> detalle = new List<(int, decimal)>();
            detalle.Add((2,30));
            detalle.Add((1,150));
            detalle.Add((4,70));

            Assert.True(CarritoCompras.CalcularTotal(detalle)>0);
        }
        [Fact]
        public void CarritoComprasPrueba_TotalDebeRetornarDecimal() {
            List<(int cantidad, decimal precioUnitario)> detalle = new List<(int, decimal)>();
            detalle.Add((2, 30));
            detalle.Add((1, 150));
            detalle.Add((4, 70));

            var expected = typeof(decimal);
            var actual = CarritoCompras.CalcularTotal(detalle);

            Assert.IsType<decimal>(actual);
            Assert.IsType(expected, actual);
        }
        [Fact]
        public void PruebaCarritoCompra_Eliminar_El_Producto_Sin_Eliminarlo_De_La_DB()
        {

            CarritoDetalle carritoDetalle0 = new CarritoDetalle("Motherboard");
            CarritoDetalle carritoDetalle1 = new CarritoDetalle("SSD");
            CarritoDetalle carritoDetalle2 = new CarritoDetalle("CPU");
            CarritoDetalle carritoDetalle3 = new CarritoDetalle("8GB Ram DDR-4");
            CarritoDetalle carritoDetalle4 = new CarritoDetalle("Fuente alimentación 800W 80plus gold");

            List<CarritoDetalle> carritoCompras = new List<CarritoDetalle>();

            carritoCompras.Add(carritoDetalle0);
            carritoCompras.Add(carritoDetalle1);
            carritoCompras.Add(carritoDetalle2);
            carritoCompras.Add(carritoDetalle3);
            carritoCompras.Add(carritoDetalle4);

            CarritoCompras.EliminarProductoDelCarrito(carritoCompras, "CPU");

            Assert.DoesNotContain(carritoDetalle2, carritoCompras);

        }
        [Fact]
       public void PruebaCarritoCompra_Anadir_un_producto_si_el_stock_disponible_es_mayor_a_la_cantidad_seleccionada()
        {
            List<CarritoDetalle> carrito = new List<CarritoDetalle>(); 

            CarritoCompras.LlenarCarrito(carrito,"8GB Ram DDR-4",6475,20,8);
            CarritoCompras.LlenarCarrito(carrito, "Motherboard Gigabyte", 13250, 5, 1);
            CarritoCompras.LlenarCarrito(carrito, "SSD", 11000, 6, 4);
            CarritoCompras.LlenarCarrito(carrito, "CPU AMD RYZEN 3900X", 75899, 10, 1);
            CarritoCompras.LlenarCarrito(carrito, "Fuente Alimentación 1000 W 80Plus Patinum", 9580, 15, 1);
            CarritoCompras.LlenarCarrito(carrito, "Placa de video Nvidia RTX 2080TI", 95000, 10, 2);

            int cantidadElementosObservados = 6;

            Assert.True(cantidadElementosObservados == carrito.Count);
           
        }
    }
}
