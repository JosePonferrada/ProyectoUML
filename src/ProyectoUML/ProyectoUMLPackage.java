/**
 */
package ProyectoUML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ProyectoUML.ProyectoUMLFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Proyecto-UML'"
 * @generated
 */
public interface ProyectoUMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ProyectoUML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ProyectoUML.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ProyectoUML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProyectoUMLPackage eINSTANCE = ProyectoUML.impl.ProyectoUMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link ProyectoUML.impl.RecogidaDeVehiculosImpl <em>Recogida De Vehiculos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProyectoUML.impl.RecogidaDeVehiculosImpl
	 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getRecogidaDeVehiculos()
	 * @generated
	 */
	int RECOGIDA_DE_VEHICULOS = 0;

	/**
	 * The number of structural features of the '<em>Recogida De Vehiculos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOGIDA_DE_VEHICULOS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Recogida De Vehiculos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOGIDA_DE_VEHICULOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProyectoUML.impl.UsuarioImpl <em>Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProyectoUML.impl.UsuarioImpl
	 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getUsuario()
	 * @generated
	 */
	int USUARIO = 1;

	/**
	 * The feature id for the '<em><b>Apellido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__APELLIDO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__TELEFONO = 3;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProyectoUML.impl.MecánicoImpl <em>Mecánico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProyectoUML.impl.MecánicoImpl
	 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getMecánico()
	 * @generated
	 */
	int MECÁNICO = 2;

	/**
	 * The feature id for the '<em><b>Apellido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECÁNICO__APELLIDO = USUARIO__APELLIDO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECÁNICO__NOMBRE = USUARIO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECÁNICO__EMAIL = USUARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECÁNICO__TELEFONO = USUARIO__TELEFONO;

	/**
	 * The feature id for the '<em><b>Num Mecanico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECÁNICO__NUM_MECANICO = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fecha Alta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECÁNICO__FECHA_ALTA = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Grua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECÁNICO__GRUA = USUARIO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mecánico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECÁNICO_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Recordar Pass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECÁNICO___RECORDAR_PASS__STRING = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Cambiar Pass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECÁNICO___CAMBIAR_PASS__STRING = USUARIO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Usar Grua</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECÁNICO___USAR_GRUA__STRING = USUARIO_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mecánico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECÁNICO_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ProyectoUML.impl.FechaImpl <em>Fecha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProyectoUML.impl.FechaImpl
	 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getFecha()
	 * @generated
	 */
	int FECHA = 3;

	/**
	 * The feature id for the '<em><b>Dia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FECHA__DIA = 0;

	/**
	 * The feature id for the '<em><b>Mes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FECHA__MES = 1;

	/**
	 * The feature id for the '<em><b>Anio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FECHA__ANIO = 2;

	/**
	 * The number of structural features of the '<em>Fecha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FECHA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Fecha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FECHA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProyectoUML.impl.GruaImpl <em>Grua</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProyectoUML.impl.GruaImpl
	 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getGrua()
	 * @generated
	 */
	int GRUA = 4;

	/**
	 * The feature id for the '<em><b>Matricula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUA__MATRICULA = 0;

	/**
	 * The feature id for the '<em><b>Dimension Largo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUA__DIMENSION_LARGO = 1;

	/**
	 * The feature id for the '<em><b>Peso Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUA__PESO_MAX = 2;

	/**
	 * The number of structural features of the '<em>Grua</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Grua</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProyectoUML.interfazContrasenia <em>interfaz Contrasenia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProyectoUML.interfazContrasenia
	 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getinterfazContrasenia()
	 * @generated
	 */
	int INTERFAZ_CONTRASENIA = 5;

	/**
	 * The number of structural features of the '<em>interfaz Contrasenia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ_CONTRASENIA_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Recordar Pass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ_CONTRASENIA___RECORDAR_PASS__STRING = 0;

	/**
	 * The operation id for the '<em>Cambiar Pass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ_CONTRASENIA___CAMBIAR_PASS__STRING = 1;

	/**
	 * The number of operations of the '<em>interfaz Contrasenia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFAZ_CONTRASENIA_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ProyectoUML.impl.ClienteImpl <em>Cliente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProyectoUML.impl.ClienteImpl
	 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getCliente()
	 * @generated
	 */
	int CLIENTE = 6;

	/**
	 * The feature id for the '<em><b>Apellido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__APELLIDO = USUARIO__APELLIDO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__NOMBRE = USUARIO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__EMAIL = USUARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__TELEFONO = USUARIO__TELEFONO;

	/**
	 * The feature id for the '<em><b>Dni</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__DNI = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ciudad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__CIUDAD = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Recordar Pass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE___RECORDAR_PASS__STRING = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Cambiar Pass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE___CAMBIAR_PASS__STRING = USUARIO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Registrar Parte</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE___REGISTRAR_PARTE__PARTE = USUARIO_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ProyectoUML.impl.ParteImpl <em>Parte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProyectoUML.impl.ParteImpl
	 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getParte()
	 * @generated
	 */
	int PARTE = 7;

	/**
	 * The feature id for the '<em><b>Num Parte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTE__NUM_PARTE = 0;

	/**
	 * The feature id for the '<em><b>Fecha Parte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTE__FECHA_PARTE = 1;

	/**
	 * The feature id for the '<em><b>Matricula Vehiculo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTE__MATRICULA_VEHICULO = 2;

	/**
	 * The feature id for the '<em><b>Carretera</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTE__CARRETERA = 3;

	/**
	 * The feature id for the '<em><b>Km</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTE__KM = 4;

	/**
	 * The number of structural features of the '<em>Parte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Parte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProyectoUML.Meses <em>Meses</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProyectoUML.Meses
	 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getMeses()
	 * @generated
	 */
	int MESES = 8;


	/**
	 * Returns the meta object for class '{@link ProyectoUML.RecogidaDeVehiculos <em>Recogida De Vehiculos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recogida De Vehiculos</em>'.
	 * @see ProyectoUML.RecogidaDeVehiculos
	 * @generated
	 */
	EClass getRecogidaDeVehiculos();

	/**
	 * Returns the meta object for class '{@link ProyectoUML.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario</em>'.
	 * @see ProyectoUML.Usuario
	 * @generated
	 */
	EClass getUsuario();

	/**
	 * Returns the meta object for the attribute '{@link ProyectoUML.Usuario#getApellido <em>Apellido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apellido</em>'.
	 * @see ProyectoUML.Usuario#getApellido()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Apellido();

	/**
	 * Returns the meta object for the attribute '{@link ProyectoUML.Usuario#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ProyectoUML.Usuario#getNombre()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link ProyectoUML.Usuario#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see ProyectoUML.Usuario#getEmail()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Email();

	/**
	 * Returns the meta object for the attribute '{@link ProyectoUML.Usuario#getTelefono <em>Telefono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono</em>'.
	 * @see ProyectoUML.Usuario#getTelefono()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Telefono();

	/**
	 * Returns the meta object for class '{@link ProyectoUML.Mecánico <em>Mecánico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mecánico</em>'.
	 * @see ProyectoUML.Mecánico
	 * @generated
	 */
	EClass getMecánico();

	/**
	 * Returns the meta object for the attribute '{@link ProyectoUML.Mecánico#getNumMecanico <em>Num Mecanico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Mecanico</em>'.
	 * @see ProyectoUML.Mecánico#getNumMecanico()
	 * @see #getMecánico()
	 * @generated
	 */
	EAttribute getMecánico_NumMecanico();

	/**
	 * Returns the meta object for the containment reference '{@link ProyectoUML.Mecánico#getFechaAlta <em>Fecha Alta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fecha Alta</em>'.
	 * @see ProyectoUML.Mecánico#getFechaAlta()
	 * @see #getMecánico()
	 * @generated
	 */
	EReference getMecánico_FechaAlta();

	/**
	 * Returns the meta object for the reference '{@link ProyectoUML.Mecánico#getGrua <em>Grua</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grua</em>'.
	 * @see ProyectoUML.Mecánico#getGrua()
	 * @see #getMecánico()
	 * @generated
	 */
	EReference getMecánico_Grua();

	/**
	 * Returns the meta object for the '{@link ProyectoUML.Mecánico#usarGrua(java.lang.String) <em>Usar Grua</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Usar Grua</em>' operation.
	 * @see ProyectoUML.Mecánico#usarGrua(java.lang.String)
	 * @generated
	 */
	EOperation getMecánico__UsarGrua__String();

	/**
	 * Returns the meta object for class '{@link ProyectoUML.Fecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fecha</em>'.
	 * @see ProyectoUML.Fecha
	 * @generated
	 */
	EClass getFecha();

	/**
	 * Returns the meta object for the attribute '{@link ProyectoUML.Fecha#getDia <em>Dia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dia</em>'.
	 * @see ProyectoUML.Fecha#getDia()
	 * @see #getFecha()
	 * @generated
	 */
	EAttribute getFecha_Dia();

	/**
	 * Returns the meta object for the attribute '{@link ProyectoUML.Fecha#getMes <em>Mes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mes</em>'.
	 * @see ProyectoUML.Fecha#getMes()
	 * @see #getFecha()
	 * @generated
	 */
	EAttribute getFecha_Mes();

	/**
	 * Returns the meta object for the attribute '{@link ProyectoUML.Fecha#getAnio <em>Anio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anio</em>'.
	 * @see ProyectoUML.Fecha#getAnio()
	 * @see #getFecha()
	 * @generated
	 */
	EAttribute getFecha_Anio();

	/**
	 * Returns the meta object for class '{@link ProyectoUML.Grua <em>Grua</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grua</em>'.
	 * @see ProyectoUML.Grua
	 * @generated
	 */
	EClass getGrua();

	/**
	 * Returns the meta object for the attribute '{@link ProyectoUML.Grua#getMatricula <em>Matricula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matricula</em>'.
	 * @see ProyectoUML.Grua#getMatricula()
	 * @see #getGrua()
	 * @generated
	 */
	EAttribute getGrua_Matricula();

	/**
	 * Returns the meta object for the attribute '{@link ProyectoUML.Grua#getDimensionLargo <em>Dimension Largo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension Largo</em>'.
	 * @see ProyectoUML.Grua#getDimensionLargo()
	 * @see #getGrua()
	 * @generated
	 */
	EAttribute getGrua_DimensionLargo();

	/**
	 * Returns the meta object for the attribute '{@link ProyectoUML.Grua#getPesoMax <em>Peso Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peso Max</em>'.
	 * @see ProyectoUML.Grua#getPesoMax()
	 * @see #getGrua()
	 * @generated
	 */
	EAttribute getGrua_PesoMax();

	/**
	 * Returns the meta object for class '{@link ProyectoUML.interfazContrasenia <em>interfaz Contrasenia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>interfaz Contrasenia</em>'.
	 * @see ProyectoUML.interfazContrasenia
	 * @generated
	 */
	EClass getinterfazContrasenia();

	/**
	 * Returns the meta object for the '{@link ProyectoUML.interfazContrasenia#recordarPass(java.lang.String) <em>Recordar Pass</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Recordar Pass</em>' operation.
	 * @see ProyectoUML.interfazContrasenia#recordarPass(java.lang.String)
	 * @generated
	 */
	EOperation getinterfazContrasenia__RecordarPass__String();

	/**
	 * Returns the meta object for the '{@link ProyectoUML.interfazContrasenia#cambiarPass(java.lang.String) <em>Cambiar Pass</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cambiar Pass</em>' operation.
	 * @see ProyectoUML.interfazContrasenia#cambiarPass(java.lang.String)
	 * @generated
	 */
	EOperation getinterfazContrasenia__CambiarPass__String();

	/**
	 * Returns the meta object for class '{@link ProyectoUML.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliente</em>'.
	 * @see ProyectoUML.Cliente
	 * @generated
	 */
	EClass getCliente();

	/**
	 * Returns the meta object for the attribute '{@link ProyectoUML.Cliente#getDni <em>Dni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dni</em>'.
	 * @see ProyectoUML.Cliente#getDni()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Dni();

	/**
	 * Returns the meta object for the attribute '{@link ProyectoUML.Cliente#getCiudad <em>Ciudad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ciudad</em>'.
	 * @see ProyectoUML.Cliente#getCiudad()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Ciudad();

	/**
	 * Returns the meta object for the '{@link ProyectoUML.Cliente#registrarParte(ProyectoUML.Parte) <em>Registrar Parte</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Registrar Parte</em>' operation.
	 * @see ProyectoUML.Cliente#registrarParte(ProyectoUML.Parte)
	 * @generated
	 */
	EOperation getCliente__RegistrarParte__Parte();

	/**
	 * Returns the meta object for class '{@link ProyectoUML.Parte <em>Parte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parte</em>'.
	 * @see ProyectoUML.Parte
	 * @generated
	 */
	EClass getParte();

	/**
	 * Returns the meta object for the attribute '{@link ProyectoUML.Parte#getNumParte <em>Num Parte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Parte</em>'.
	 * @see ProyectoUML.Parte#getNumParte()
	 * @see #getParte()
	 * @generated
	 */
	EAttribute getParte_NumParte();

	/**
	 * Returns the meta object for the containment reference '{@link ProyectoUML.Parte#getFechaParte <em>Fecha Parte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fecha Parte</em>'.
	 * @see ProyectoUML.Parte#getFechaParte()
	 * @see #getParte()
	 * @generated
	 */
	EReference getParte_FechaParte();

	/**
	 * Returns the meta object for the attribute '{@link ProyectoUML.Parte#getMatriculaVehiculo <em>Matricula Vehiculo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matricula Vehiculo</em>'.
	 * @see ProyectoUML.Parte#getMatriculaVehiculo()
	 * @see #getParte()
	 * @generated
	 */
	EAttribute getParte_MatriculaVehiculo();

	/**
	 * Returns the meta object for the attribute '{@link ProyectoUML.Parte#getCarretera <em>Carretera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carretera</em>'.
	 * @see ProyectoUML.Parte#getCarretera()
	 * @see #getParte()
	 * @generated
	 */
	EAttribute getParte_Carretera();

	/**
	 * Returns the meta object for the attribute '{@link ProyectoUML.Parte#getKm <em>Km</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Km</em>'.
	 * @see ProyectoUML.Parte#getKm()
	 * @see #getParte()
	 * @generated
	 */
	EAttribute getParte_Km();

	/**
	 * Returns the meta object for enum '{@link ProyectoUML.Meses <em>Meses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Meses</em>'.
	 * @see ProyectoUML.Meses
	 * @generated
	 */
	EEnum getMeses();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProyectoUMLFactory getProyectoUMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ProyectoUML.impl.RecogidaDeVehiculosImpl <em>Recogida De Vehiculos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProyectoUML.impl.RecogidaDeVehiculosImpl
		 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getRecogidaDeVehiculos()
		 * @generated
		 */
		EClass RECOGIDA_DE_VEHICULOS = eINSTANCE.getRecogidaDeVehiculos();

		/**
		 * The meta object literal for the '{@link ProyectoUML.impl.UsuarioImpl <em>Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProyectoUML.impl.UsuarioImpl
		 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getUsuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getUsuario();

		/**
		 * The meta object literal for the '<em><b>Apellido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__APELLIDO = eINSTANCE.getUsuario_Apellido();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__NOMBRE = eINSTANCE.getUsuario_Nombre();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__EMAIL = eINSTANCE.getUsuario_Email();

		/**
		 * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__TELEFONO = eINSTANCE.getUsuario_Telefono();

		/**
		 * The meta object literal for the '{@link ProyectoUML.impl.MecánicoImpl <em>Mecánico</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProyectoUML.impl.MecánicoImpl
		 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getMecánico()
		 * @generated
		 */
		EClass MECÁNICO = eINSTANCE.getMecánico();

		/**
		 * The meta object literal for the '<em><b>Num Mecanico</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MECÁNICO__NUM_MECANICO = eINSTANCE.getMecánico_NumMecanico();

		/**
		 * The meta object literal for the '<em><b>Fecha Alta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MECÁNICO__FECHA_ALTA = eINSTANCE.getMecánico_FechaAlta();

		/**
		 * The meta object literal for the '<em><b>Grua</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MECÁNICO__GRUA = eINSTANCE.getMecánico_Grua();

		/**
		 * The meta object literal for the '<em><b>Usar Grua</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MECÁNICO___USAR_GRUA__STRING = eINSTANCE.getMecánico__UsarGrua__String();

		/**
		 * The meta object literal for the '{@link ProyectoUML.impl.FechaImpl <em>Fecha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProyectoUML.impl.FechaImpl
		 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getFecha()
		 * @generated
		 */
		EClass FECHA = eINSTANCE.getFecha();

		/**
		 * The meta object literal for the '<em><b>Dia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FECHA__DIA = eINSTANCE.getFecha_Dia();

		/**
		 * The meta object literal for the '<em><b>Mes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FECHA__MES = eINSTANCE.getFecha_Mes();

		/**
		 * The meta object literal for the '<em><b>Anio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FECHA__ANIO = eINSTANCE.getFecha_Anio();

		/**
		 * The meta object literal for the '{@link ProyectoUML.impl.GruaImpl <em>Grua</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProyectoUML.impl.GruaImpl
		 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getGrua()
		 * @generated
		 */
		EClass GRUA = eINSTANCE.getGrua();

		/**
		 * The meta object literal for the '<em><b>Matricula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRUA__MATRICULA = eINSTANCE.getGrua_Matricula();

		/**
		 * The meta object literal for the '<em><b>Dimension Largo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRUA__DIMENSION_LARGO = eINSTANCE.getGrua_DimensionLargo();

		/**
		 * The meta object literal for the '<em><b>Peso Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRUA__PESO_MAX = eINSTANCE.getGrua_PesoMax();

		/**
		 * The meta object literal for the '{@link ProyectoUML.interfazContrasenia <em>interfaz Contrasenia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProyectoUML.interfazContrasenia
		 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getinterfazContrasenia()
		 * @generated
		 */
		EClass INTERFAZ_CONTRASENIA = eINSTANCE.getinterfazContrasenia();

		/**
		 * The meta object literal for the '<em><b>Recordar Pass</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERFAZ_CONTRASENIA___RECORDAR_PASS__STRING = eINSTANCE.getinterfazContrasenia__RecordarPass__String();

		/**
		 * The meta object literal for the '<em><b>Cambiar Pass</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERFAZ_CONTRASENIA___CAMBIAR_PASS__STRING = eINSTANCE.getinterfazContrasenia__CambiarPass__String();

		/**
		 * The meta object literal for the '{@link ProyectoUML.impl.ClienteImpl <em>Cliente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProyectoUML.impl.ClienteImpl
		 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getCliente()
		 * @generated
		 */
		EClass CLIENTE = eINSTANCE.getCliente();

		/**
		 * The meta object literal for the '<em><b>Dni</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__DNI = eINSTANCE.getCliente_Dni();

		/**
		 * The meta object literal for the '<em><b>Ciudad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__CIUDAD = eINSTANCE.getCliente_Ciudad();

		/**
		 * The meta object literal for the '<em><b>Registrar Parte</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENTE___REGISTRAR_PARTE__PARTE = eINSTANCE.getCliente__RegistrarParte__Parte();

		/**
		 * The meta object literal for the '{@link ProyectoUML.impl.ParteImpl <em>Parte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProyectoUML.impl.ParteImpl
		 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getParte()
		 * @generated
		 */
		EClass PARTE = eINSTANCE.getParte();

		/**
		 * The meta object literal for the '<em><b>Num Parte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTE__NUM_PARTE = eINSTANCE.getParte_NumParte();

		/**
		 * The meta object literal for the '<em><b>Fecha Parte</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTE__FECHA_PARTE = eINSTANCE.getParte_FechaParte();

		/**
		 * The meta object literal for the '<em><b>Matricula Vehiculo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTE__MATRICULA_VEHICULO = eINSTANCE.getParte_MatriculaVehiculo();

		/**
		 * The meta object literal for the '<em><b>Carretera</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTE__CARRETERA = eINSTANCE.getParte_Carretera();

		/**
		 * The meta object literal for the '<em><b>Km</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTE__KM = eINSTANCE.getParte_Km();

		/**
		 * The meta object literal for the '{@link ProyectoUML.Meses <em>Meses</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProyectoUML.Meses
		 * @see ProyectoUML.impl.ProyectoUMLPackageImpl#getMeses()
		 * @generated
		 */
		EEnum MESES = eINSTANCE.getMeses();

	}

} //ProyectoUMLPackage
