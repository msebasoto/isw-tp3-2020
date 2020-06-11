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
    }
}
