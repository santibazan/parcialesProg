package com.example.miPrimeraApi;

import com.example.miPrimeraApi.entities.*;
import com.example.miPrimeraApi.entities.enums.*;
import com.example.miPrimeraApi.repositories.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;


@SpringBootApplication
public class MiPrimeraApiApplication {

	@Autowired
	private ArticuloInsumoRep articuloInsumoRep;

	@Autowired
	private ArticuloManufacturadoRep articuloManufacturadoRep;

	@Autowired
	private ArticuloManufacturadoDetalleRep articuloManufacturadoDetalleRep;

	@Autowired
	private CategoriaRep categoriaRep;

	@Autowired
	private ClienteRep clienteRep;

	@Autowired
	private DetallePedidoRep detallePedidoRep;

	@Autowired
	private DomicilioRep domicilioRep;

	@Autowired
	private EmpleadoRep empleadoRep;

	@Autowired
	private EmpresaRep empresaRep;

	@Autowired
	private FacturaRep facturaRep;

	@Autowired
	private ImagenRep imagenRep;

	@Autowired
	private LocalidadRep localidadRep;

	@Autowired
	private PaisRep paisRep;

	@Autowired
	private PedidoRep pedidoRep;

	@Autowired
	private PromocionRep promocionRep;

	@Autowired
	private PromocionDetalleRep promocionDetalleRep;

	@Autowired
	private ProvinciaRep provinciaRep;

	@Autowired
	private SucursalRep sucursalRep;

	@Autowired
	private UnidadMedidaRep unidadMedidaRep;

	@Autowired
	private UsuarioRep usuarioRep;


	public static void main(String[] args) {
		SpringApplication.run(MiPrimeraApiApplication.class, args);
		System.out.println("Servidor iniciado.");
	}

	@Bean
	@Transactional
	CommandLineRunner init(ArticuloInsumoRep articuloInsumoRep, ArticuloManufacturadoRep articuloManufacturadoRep,
						   ArticuloManufacturadoDetalleRep articuloManufacturadoDetalleRep, CategoriaRep categoriaRep,
						   ClienteRep clienteRep, DetallePedidoRep detallePedidoRep,
						   DomicilioRep domicilioRep,EmpleadoRep empleadoRep,
						   EmpresaRep empresaRep, FacturaRep facturaRep,
						   ImagenRep imagenRep, LocalidadRep localidadRep,
						   PaisRep paisRep ,PedidoRep pedidoRep,
						   PromocionRep promocionRep, PromocionDetalleRep promocionDetalleRep,
						   ProvinciaRep provinciaRep, SucursalRep sucursalRep,
						   UnidadMedidaRep unidadMedidaRep, UsuarioRep usuarioRep){
		return args -> {

			Imagen img1 = Imagen.builder().denominacion("Imagen 1").build();
			imagenRep.save(img1);

			Imagen img2 = Imagen.builder().denominacion("Imagen 2").build();
			imagenRep.save(img2);

			Usuario user = Usuario.builder().auth0Id("pass").userName("usuario 1").build();
			usuarioRep.save(user);

			Usuario user2 = Usuario.builder().auth0Id("pass").userName("usuario 2").build();
			usuarioRep.save(user2);

			Empleado em1 = Empleado.builder().rolEmpleado(Rol.CAJERO).build();
			em1.setNombre("Mario");
			em1.setApellido("Bazan");
			em1.setTelefono("2616630994");
			em1.setEmail("mariorbazan@gmail.com");
			em1.setFechaNacimiento(LocalDate.of(1955, 4, 15));
			em1.setImagenEmpleado(img1);
			em1.setUsuarioEmpleado(user);
			empleadoRep.save(em1);

			Cliente client1 = Cliente.builder().rolCliente(Rol.CLIENTE).build();
			client1.setNombre("Santiago");
			client1.setApellido("Bazan");
			client1.setTelefono("2613297612");
			client1.setEmail("Santiago.n.bazan@gmail.com");
			client1.setFechaNacimiento(LocalDate.of(2002,7,19));
			client1.setImagenCliente(img2);
			client1.setUsuarioCliente(user2);
			clienteRep.save(client1);

			Categoria categoriaHija = Categoria.builder().denominacion("manzana").build();
			Categoria categoriaPadre = Categoria.builder().denominacion("frutas").build();
			categoriaRep.save(categoriaPadre);
			categoriaHija.setCategoriaPadre(categoriaPadre);
			categoriaRep.save(categoriaHija);

			Imagen imagen1ArticuloInsumo = Imagen.builder().denominacion("Imagen 1 articulo insumo").build();
			Imagen imagen2ArticuloInsumo = Imagen.builder().denominacion("Imagen 2 Articulo insumo").build();
			imagenRep.save(imagen1ArticuloInsumo);
			imagenRep.save(imagen2ArticuloInsumo);

			Set<Imagen> imagenesArticulos = new HashSet<Imagen>();
			imagenesArticulos.add(imagen1ArticuloInsumo);
			imagenesArticulos.add(imagen2ArticuloInsumo);

			Categoria categoriaInsumo = Categoria.builder().denominacion("insumos frutas y verduras").build();
			categoriaRep.save(categoriaInsumo);

			UnidadMedida unidadMedidaArticulos = UnidadMedida.builder().denominacion("kg").build();
			unidadMedidaRep.save(unidadMedidaArticulos);

			ArticuloInsumo articuloInsumo = ArticuloInsumo.builder().denominacion("Sal").build();
			articuloInsumo.setPrecioVenta(150.0);
			articuloInsumo.setImagenesArticulos(imagenesArticulos);
			articuloInsumo.setCategoria(categoriaInsumo);
			articuloInsumo.setUnidadMedida(unidadMedidaArticulos);
			articuloInsumo.setPrecioCompra(70.5);
			articuloInsumo.setStockActual(100);
			articuloInsumo.setStockMaximo(350);
			articuloInsumo.setEsParaElaborar(true);
			articuloInsumoRep.save(articuloInsumo);
			imagenesArticulos.clear();

			Imagen imagen1ArticuloManufacturado = Imagen.builder().denominacion("Imagen 1 articulo manufacturado").build();
			Imagen imagen2ArticuloManufacturado = Imagen.builder().denominacion("Imagen 2 Articulo manufacturado").build();
			imagenRep.save(imagen1ArticuloManufacturado);
			imagenRep.save(imagen2ArticuloManufacturado);

			imagenesArticulos.add(imagen1ArticuloManufacturado);
			imagenesArticulos.add(imagen2ArticuloManufacturado);



			Categoria categoriaSucursal1 = Categoria.builder().denominacion("Bebidas").build();
			Categoria categoriaSucursal2 = Categoria.builder().denominacion("platos salados").build();
			categoriaRep.save(categoriaSucursal1);
			categoriaRep.save(categoriaSucursal2);

			Set<Categoria> categoriasSucursal = new HashSet<Categoria>();
			categoriasSucursal.add(categoriaSucursal1);
			categoriasSucursal.add(categoriaSucursal2);


			ArticuloManufacturado articuloManufacturado = ArticuloManufacturado.builder().denominacion("Ensalada rusa").build();
			articuloManufacturado.setPrecioVenta(150.0);
			articuloManufacturado.setImagenesArticulos(imagenesArticulos);
			articuloManufacturado.setCategoria(categoriaSucursal2);
			articuloManufacturado.setUnidadMedida(unidadMedidaArticulos);
			articuloManufacturado.setDescripcion("Ensalada de papas, arvejas, zanahorias con un poco de mayonesa");
			articuloManufacturado.setTiempoEstimadoMinutos(20);
			articuloManufacturado.setPreparacion("Hervir las papas, pelarlas, cortar las verduras en cubos chiquitos para luego añadirle la mayonesa y mezclar");
			articuloManufacturadoRep.save(articuloManufacturado);

			ArticuloManufacturadoDetalle articuloManufacturadoDetalle = ArticuloManufacturadoDetalle.builder().cantidad(3).build();
			articuloManufacturadoDetalle.setArticuloManufacturado(articuloManufacturado);
			articuloManufacturadoDetalleRep.save(articuloManufacturadoDetalle);

			Pais pais1 = Pais.builder()
					.nombre("Argentina")
					.build();
			paisRep.save(pais1);

			Provincia prov1 = Provincia.builder()
					.nombre("Mendoza")
					.pais(pais1)
					.build();
			provinciaRep.save(prov1);

			Localidad loc1 = Localidad.builder()
					.nombre("Ciudad")
					.provincia(prov1)
					.build();
			localidadRep.save(loc1);

			Domicilio domicilioSucursal = Domicilio.builder()
					.calle("Carrillo")
					.numero(3090)
					.cp(5500)
					.localidad(loc1)
					.build();
			domicilioRep.save(domicilioSucursal);


			Empresa empr1 = Empresa.builder()
					.razonSocial("Buen Sabor S.A.")
					.nombre("Buen Sabor")
					.cuil(53289740)
					.build();
			empresaRep.save(empr1);

			Imagen imgPromocion11 = Imagen.builder().denominacion("Imagen 1 promocion 1").build();
			Imagen imgPromocion12 = Imagen.builder().denominacion("Imagen 2 promocion 1").build();
			imagenRep.save(imgPromocion11);
			imagenRep.save(imgPromocion12);

			Promocion promocion = Promocion.builder().denominacion("Ensalada rusa tamaño XL con un descuento de 20%").build();
			promocion.setFechaDesde(LocalDate.of(2024,6,1));
			promocion.setFechaHasta(LocalDate.of(2024,6,30));
			promocion.setHoraDesde(LocalTime.of(10,0));
			promocion.setHoraHasta(LocalTime.of(14,0));
			promocion.setDescripcionDescuento("Aprovecha esta super oferta");
			promocion.setPrecioPromocional(160.0);
			promocion.setTipoPromocion(TipoPromocion.PROMOCION);
			Set<Imagen> imagenesPromocion = new HashSet<Imagen>();
			imagenesPromocion.add(imgPromocion11);
			imagenesPromocion.add(imgPromocion12);
			promocion.setImagenesPromociones(imagenesPromocion);
			promocionRep.save(promocion);

			PromocionDetalle promocion1Detalle = PromocionDetalle.builder().cantidad(10).build();
			promocion1Detalle.setArticulo(articuloManufacturado);
			promocion1Detalle.setPromocion(promocion);
			promocionDetalleRep.save(promocion1Detalle);

			Imagen imgPromocion21 = Imagen.builder().denominacion("Imagen 1 promocion 2").build();
			Imagen imgPromocion22 = Imagen.builder().denominacion("Imagen 2 promocion 2").build();
			imagenRep.save(imgPromocion21);
			imagenRep.save(imgPromocion22);

			Promocion promocion2 = Promocion.builder().denominacion("Descuentos en vinos por el dia del padre").build();
			promocion2.setFechaDesde(LocalDate.of(2024,6,14));
			promocion2.setFechaHasta(LocalDate.of(2024,6,16));
			promocion2.setHoraDesde(LocalTime.of(11,0));
			promocion2.setHoraHasta(LocalTime.of(23,0));
			promocion2.setDescripcionDescuento("Descuento del 10% para regalarle un vino a papa");
			promocion2.setTipoPromocion(TipoPromocion.PROMOCION);
			Set<Imagen> imagenesPromocion2 = new HashSet<Imagen>();
			imagenesPromocion2.add(imgPromocion21);
			imagenesPromocion2.add(imgPromocion22);
			promocion2.setImagenesPromociones(imagenesPromocion2);
			promocionRep.save(promocion2);

			Set<Promocion> promocionesSucursal = new HashSet<Promocion>();
			promocionesSucursal.add(promocion);
			promocionesSucursal.add(promocion2);

			Sucursal sucursal = Sucursal.builder().nombre("Buen Sabor Pueyrredon").build();
			sucursal.setHorarioApertura(LocalTime.of(10,0));
			sucursal.setHorarioCierre(LocalTime.of(2,0));
			sucursal.setCasaMatriz(true);
			sucursal.setEmpresa(empr1);
			sucursal.setDomicilio(domicilioSucursal);
			sucursal.setPromociones(promocionesSucursal);
			sucursal.setCategorias(categoriasSucursal);
			sucursalRep.save(sucursal);


			Factura facturaPedido = Factura.builder().fechaFacturacion(LocalDate.of(2024,6,15)).build();
			facturaPedido.setMpPaymentId(497059);
			facturaPedido.setMpMerchantOrderId(87035118);
			facturaPedido.setMpPreferenceId("12345678-abcd-1234-abcd-1234567890ab");
			facturaPedido.setMpPaymentType("Dinero en cuenta");
			facturaPedido.setFormaPago(FormaPago.MERCADOPAGO);
			facturaPedido.setTotalVenta(170.5);
			facturaRep.save(facturaPedido);

			Pedido pedido = Pedido.builder().horaEstimadaFinalizacion(LocalTime.of(13,30)).build();
			pedido.setTotal(170.5);
			pedido.setTotalCosto(110.0);
			pedido.setEstado(Estado.PREPARACION);
			pedido.setTipoEnvio(TipoEnvio.DELIVERY);
			pedido.setFormaPago(FormaPago.MERCADOPAGO);
			pedido.setFechaPedido(LocalDate.of(2024,6,14));
			pedido.setDomicilio(domicilioSucursal);
			pedido.setSucursal(sucursal);
			pedido.setEmpleado(em1);
			pedido.setCliente(client1);
			pedido.setFactura(facturaPedido);
			pedidoRep.save(pedido);

			DetallePedido detallePedido = DetallePedido.builder().cantidad(2).build();
			detallePedido.setSubTotal(70.5);
			detallePedido.setArticulo(articuloManufacturado);
			detallePedido.setPedido(pedido);
			detallePedidoRep.save(detallePedido);
		};
	}
}