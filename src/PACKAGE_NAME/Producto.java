package PACKAGE_NAME;

public class Producto {
        //ATRIBUTOS
        String idProducto;
        String nombreProducto;
        double precioProducto;
        String detalleProducto;
        int stockdisponible;
        int cantidad;
        double descuento;
        //CONSTRUCTORES
        public Producto() {
        }
        public Producto(String nombreProducto, double precioProducto, String detalleProducto) {
                this.nombreProducto = nombreProducto;
                this.precioProducto = precioProducto;
                this.detalleProducto = detalleProducto;
        }
        public Producto(String nombreProducto, String descripcionProducto, double precioUnitario, int stockDisponible, int cantidad) {
                this.nombreProducto = nombreProducto;
                this.detalleProducto = descripcionProducto;
                this.precioProducto = precioUnitario;
                this.stockdisponible = stockDisponible;
                this.cantidad = cantidad;
        }
        public Producto(String nombreProducto, String descripcionProducto, double precioUnitario, int stockDisponible, int cantidad,double descuento) {
                this.nombreProducto = nombreProducto;
                this.detalleProducto = descripcionProducto;
                this.precioProducto = precioUnitario;
                this.stockdisponible = stockDisponible;
                this.cantidad = cantidad;
                this.descuento= descuento;
        }
        //GETTERS Y SETTERS
        public String getIdProducto() {
                return idProducto;
        }

        public void setIdProducto(String idProducto) {
                this.idProducto = idProducto;
        }

        public String getNombreProducto() {
                return nombreProducto;
        }

        public void setNombreProducto(String nombreProducto) {
                this.nombreProducto = nombreProducto;
        }

        public double getPrecioProducto() {
                return precioProducto;
        }

        public void setPrecioProducto(double precioProducto) {
                this.precioProducto = precioProducto;
        }

        public String getDetalleProducto() {
                return detalleProducto;
        }

        public void setDetalleProducto(String detalleProducto) {
                this.detalleProducto = detalleProducto;
        }

        public int getStockdisponible() {
                return stockdisponible;
        }

        public void setStockdisponible(int stockdisponible) {
                this.stockdisponible = stockdisponible;
        }

        public int getCantidad() {
                return cantidad;
        }

        public void setCantidad(int cantidad) {
                this.cantidad = cantidad;
        }

        public double getDescuento() {
                return descuento;
        }

        public void setDescuento(double descuento) {
                this.descuento = descuento;
        }

        //METODOS
        public static boolean controlCantidad(Producto p){
               if(p.cantidad>0){
                       return true;
               }else
                       return false;
        }
}
