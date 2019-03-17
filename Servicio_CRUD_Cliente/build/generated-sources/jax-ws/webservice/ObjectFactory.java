
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Actualizar_QNAME = new QName("http://WebService/", "Actualizar");
    private final static QName _ActualizarResponse_QNAME = new QName("http://WebService/", "ActualizarResponse");
    private final static QName _Eliminar_QNAME = new QName("http://WebService/", "Eliminar");
    private final static QName _EliminarResponse_QNAME = new QName("http://WebService/", "EliminarResponse");
    private final static QName _Ingresar_QNAME = new QName("http://WebService/", "Ingresar");
    private final static QName _IngresarResponse_QNAME = new QName("http://WebService/", "IngresarResponse");
    private final static QName _Listar_QNAME = new QName("http://WebService/", "Listar");
    private final static QName _ListarResponse_QNAME = new QName("http://WebService/", "ListarResponse");
    private final static QName _Agregar_QNAME = new QName("http://WebService/", "agregar");
    private final static QName _AgregarResponse_QNAME = new QName("http://WebService/", "agregarResponse");
    private final static QName _Cargar_QNAME = new QName("http://WebService/", "cargar");
    private final static QName _ListarID_QNAME = new QName("http://WebService/", "listarID");
    private final static QName _ListarIDResponse_QNAME = new QName("http://WebService/", "listarIDResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Actualizar }
     * 
     */
    public Actualizar createActualizar() {
        return new Actualizar();
    }

    /**
     * Create an instance of {@link ActualizarResponse }
     * 
     */
    public ActualizarResponse createActualizarResponse() {
        return new ActualizarResponse();
    }

    /**
     * Create an instance of {@link Eliminar }
     * 
     */
    public Eliminar createEliminar() {
        return new Eliminar();
    }

    /**
     * Create an instance of {@link EliminarResponse }
     * 
     */
    public EliminarResponse createEliminarResponse() {
        return new EliminarResponse();
    }

    /**
     * Create an instance of {@link Ingresar }
     * 
     */
    public Ingresar createIngresar() {
        return new Ingresar();
    }

    /**
     * Create an instance of {@link IngresarResponse }
     * 
     */
    public IngresarResponse createIngresarResponse() {
        return new IngresarResponse();
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link Agregar }
     * 
     */
    public Agregar createAgregar() {
        return new Agregar();
    }

    /**
     * Create an instance of {@link AgregarResponse }
     * 
     */
    public AgregarResponse createAgregarResponse() {
        return new AgregarResponse();
    }

    /**
     * Create an instance of {@link Cargar }
     * 
     */
    public Cargar createCargar() {
        return new Cargar();
    }

    /**
     * Create an instance of {@link ListarID }
     * 
     */
    public ListarID createListarID() {
        return new ListarID();
    }

    /**
     * Create an instance of {@link ListarIDResponse }
     * 
     */
    public ListarIDResponse createListarIDResponse() {
        return new ListarIDResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Actualizar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Actualizar")
    public JAXBElement<Actualizar> createActualizar(Actualizar value) {
        return new JAXBElement<Actualizar>(_Actualizar_QNAME, Actualizar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "ActualizarResponse")
    public JAXBElement<ActualizarResponse> createActualizarResponse(ActualizarResponse value) {
        return new JAXBElement<ActualizarResponse>(_ActualizarResponse_QNAME, ActualizarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eliminar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Eliminar")
    public JAXBElement<Eliminar> createEliminar(Eliminar value) {
        return new JAXBElement<Eliminar>(_Eliminar_QNAME, Eliminar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "EliminarResponse")
    public JAXBElement<EliminarResponse> createEliminarResponse(EliminarResponse value) {
        return new JAXBElement<EliminarResponse>(_EliminarResponse_QNAME, EliminarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ingresar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Ingresar")
    public JAXBElement<Ingresar> createIngresar(Ingresar value) {
        return new JAXBElement<Ingresar>(_Ingresar_QNAME, Ingresar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "IngresarResponse")
    public JAXBElement<IngresarResponse> createIngresarResponse(IngresarResponse value) {
        return new JAXBElement<IngresarResponse>(_IngresarResponse_QNAME, IngresarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "Listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "ListarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agregar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "agregar")
    public JAXBElement<Agregar> createAgregar(Agregar value) {
        return new JAXBElement<Agregar>(_Agregar_QNAME, Agregar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "agregarResponse")
    public JAXBElement<AgregarResponse> createAgregarResponse(AgregarResponse value) {
        return new JAXBElement<AgregarResponse>(_AgregarResponse_QNAME, AgregarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cargar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "cargar")
    public JAXBElement<Cargar> createCargar(Cargar value) {
        return new JAXBElement<Cargar>(_Cargar_QNAME, Cargar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "listarID")
    public JAXBElement<ListarID> createListarID(ListarID value) {
        return new JAXBElement<ListarID>(_ListarID_QNAME, ListarID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "listarIDResponse")
    public JAXBElement<ListarIDResponse> createListarIDResponse(ListarIDResponse value) {
        return new JAXBElement<ListarIDResponse>(_ListarIDResponse_QNAME, ListarIDResponse.class, null, value);
    }

}
