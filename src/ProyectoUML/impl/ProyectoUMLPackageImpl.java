/**
 */
package ProyectoUML.impl;

import ProyectoUML.Cliente;
import ProyectoUML.Fecha;
import ProyectoUML.Grua;
import ProyectoUML.Mecánico;
import ProyectoUML.Meses;
import ProyectoUML.Parte;
import ProyectoUML.ProyectoUMLFactory;
import ProyectoUML.ProyectoUMLPackage;
import ProyectoUML.RecogidaDeVehiculos;
import ProyectoUML.Usuario;
import ProyectoUML.interfazContrasenia;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProyectoUMLPackageImpl extends EPackageImpl implements ProyectoUMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recogidaDeVehiculosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usuarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mecánicoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fechaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gruaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfazContraseniaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clienteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mesesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ProyectoUML.ProyectoUMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProyectoUMLPackageImpl() {
		super(eNS_URI, ProyectoUMLFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ProyectoUMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProyectoUMLPackage init() {
		if (isInited) return (ProyectoUMLPackage)EPackage.Registry.INSTANCE.getEPackage(ProyectoUMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProyectoUMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProyectoUMLPackageImpl theProyectoUMLPackage = registeredProyectoUMLPackage instanceof ProyectoUMLPackageImpl ? (ProyectoUMLPackageImpl)registeredProyectoUMLPackage : new ProyectoUMLPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theProyectoUMLPackage.createPackageContents();

		// Initialize created meta-data
		theProyectoUMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProyectoUMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProyectoUMLPackage.eNS_URI, theProyectoUMLPackage);
		return theProyectoUMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecogidaDeVehiculos() {
		return recogidaDeVehiculosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsuario() {
		return usuarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Apellido() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Nombre() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Email() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsuario_Telefono() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMecánico() {
		return mecánicoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMecánico_NumMecanico() {
		return (EAttribute)mecánicoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMecánico_FechaAlta() {
		return (EReference)mecánicoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMecánico_Grua() {
		return (EReference)mecánicoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMecánico__UsarGrua__String() {
		return mecánicoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFecha() {
		return fechaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFecha_Dia() {
		return (EAttribute)fechaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFecha_Mes() {
		return (EAttribute)fechaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFecha_Anio() {
		return (EAttribute)fechaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGrua() {
		return gruaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrua_Matricula() {
		return (EAttribute)gruaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrua_DimensionLargo() {
		return (EAttribute)gruaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrua_PesoMax() {
		return (EAttribute)gruaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getinterfazContrasenia() {
		return interfazContraseniaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getinterfazContrasenia__RecordarPass__String() {
		return interfazContraseniaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getinterfazContrasenia__CambiarPass__String() {
		return interfazContraseniaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCliente() {
		return clienteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCliente_Dni() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCliente_Ciudad() {
		return (EAttribute)clienteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCliente__RegistrarParte__Parte() {
		return clienteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParte() {
		return parteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParte_NumParte() {
		return (EAttribute)parteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParte_FechaParte() {
		return (EReference)parteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParte_MatriculaVehiculo() {
		return (EAttribute)parteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParte_Carretera() {
		return (EAttribute)parteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParte_Km() {
		return (EAttribute)parteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMeses() {
		return mesesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProyectoUMLFactory getProyectoUMLFactory() {
		return (ProyectoUMLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		recogidaDeVehiculosEClass = createEClass(RECOGIDA_DE_VEHICULOS);

		usuarioEClass = createEClass(USUARIO);
		createEAttribute(usuarioEClass, USUARIO__APELLIDO);
		createEAttribute(usuarioEClass, USUARIO__NOMBRE);
		createEAttribute(usuarioEClass, USUARIO__EMAIL);
		createEAttribute(usuarioEClass, USUARIO__TELEFONO);

		mecánicoEClass = createEClass(MECÁNICO);
		createEAttribute(mecánicoEClass, MECÁNICO__NUM_MECANICO);
		createEReference(mecánicoEClass, MECÁNICO__FECHA_ALTA);
		createEReference(mecánicoEClass, MECÁNICO__GRUA);
		createEOperation(mecánicoEClass, MECÁNICO___USAR_GRUA__STRING);

		fechaEClass = createEClass(FECHA);
		createEAttribute(fechaEClass, FECHA__DIA);
		createEAttribute(fechaEClass, FECHA__MES);
		createEAttribute(fechaEClass, FECHA__ANIO);

		gruaEClass = createEClass(GRUA);
		createEAttribute(gruaEClass, GRUA__MATRICULA);
		createEAttribute(gruaEClass, GRUA__DIMENSION_LARGO);
		createEAttribute(gruaEClass, GRUA__PESO_MAX);

		interfazContraseniaEClass = createEClass(INTERFAZ_CONTRASENIA);
		createEOperation(interfazContraseniaEClass, INTERFAZ_CONTRASENIA___RECORDAR_PASS__STRING);
		createEOperation(interfazContraseniaEClass, INTERFAZ_CONTRASENIA___CAMBIAR_PASS__STRING);

		clienteEClass = createEClass(CLIENTE);
		createEAttribute(clienteEClass, CLIENTE__DNI);
		createEAttribute(clienteEClass, CLIENTE__CIUDAD);
		createEOperation(clienteEClass, CLIENTE___REGISTRAR_PARTE__PARTE);

		parteEClass = createEClass(PARTE);
		createEAttribute(parteEClass, PARTE__NUM_PARTE);
		createEReference(parteEClass, PARTE__FECHA_PARTE);
		createEAttribute(parteEClass, PARTE__MATRICULA_VEHICULO);
		createEAttribute(parteEClass, PARTE__CARRETERA);
		createEAttribute(parteEClass, PARTE__KM);

		// Create enums
		mesesEEnum = createEEnum(MESES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mecánicoEClass.getESuperTypes().add(this.getUsuario());
		mecánicoEClass.getESuperTypes().add(this.getinterfazContrasenia());
		clienteEClass.getESuperTypes().add(this.getUsuario());
		clienteEClass.getESuperTypes().add(this.getinterfazContrasenia());

		// Initialize classes, features, and operations; add parameters
		initEClass(recogidaDeVehiculosEClass, RecogidaDeVehiculos.class, "RecogidaDeVehiculos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(usuarioEClass, Usuario.class, "Usuario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsuario_Apellido(), theTypesPackage.getString(), "apellido", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Nombre(), theTypesPackage.getString(), "nombre", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Email(), theTypesPackage.getString(), "email", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Telefono(), theTypesPackage.getString(), "telefono", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mecánicoEClass, Mecánico.class, "Mecánico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMecánico_NumMecanico(), theTypesPackage.getInteger(), "numMecanico", null, 1, 1, Mecánico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMecánico_FechaAlta(), this.getFecha(), null, "fechaAlta", null, 1, 1, Mecánico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMecánico_Grua(), this.getGrua(), null, "grua", null, 0, 1, Mecánico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getMecánico__UsarGrua__String(), null, "usarGrua", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "matricula", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(fechaEClass, Fecha.class, "Fecha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFecha_Dia(), theTypesPackage.getInteger(), "Dia", null, 1, 1, Fecha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFecha_Mes(), this.getMeses(), "Mes", null, 1, 1, Fecha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFecha_Anio(), theTypesPackage.getInteger(), "Anio", null, 1, 1, Fecha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gruaEClass, Grua.class, "Grua", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrua_Matricula(), theTypesPackage.getString(), "matricula", null, 1, 1, Grua.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGrua_DimensionLargo(), theTypesPackage.getInteger(), "dimensionLargo", null, 1, 1, Grua.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGrua_PesoMax(), theTypesPackage.getInteger(), "pesoMax", null, 1, 1, Grua.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interfazContraseniaEClass, interfazContrasenia.class, "interfazContrasenia", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getinterfazContrasenia__RecordarPass__String(), null, "recordarPass", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getinterfazContrasenia__CambiarPass__String(), null, "cambiarPass", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "pass", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(clienteEClass, Cliente.class, "Cliente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCliente_Dni(), theTypesPackage.getString(), "dni", null, 1, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCliente_Ciudad(), theTypesPackage.getString(), "ciudad", null, 1, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCliente__RegistrarParte__Parte(), null, "registrarParte", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getParte(), "parte", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(parteEClass, Parte.class, "Parte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParte_NumParte(), theTypesPackage.getInteger(), "numParte", null, 1, 1, Parte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParte_FechaParte(), this.getFecha(), null, "fechaParte", null, 1, 1, Parte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParte_MatriculaVehiculo(), theTypesPackage.getString(), "matriculaVehiculo", null, 1, 1, Parte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParte_Carretera(), theTypesPackage.getString(), "carretera", null, 1, 1, Parte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParte_Km(), theTypesPackage.getInteger(), "km", null, 1, 1, Parte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mesesEEnum, Meses.class, "Meses");
		addEEnumLiteral(mesesEEnum, Meses.ENE);
		addEEnumLiteral(mesesEEnum, Meses.FEB);
		addEEnumLiteral(mesesEEnum, Meses.MAR);
		addEEnumLiteral(mesesEEnum, Meses.ABR);
		addEEnumLiteral(mesesEEnum, Meses.MAY);
		addEEnumLiteral(mesesEEnum, Meses.JUN);
		addEEnumLiteral(mesesEEnum, Meses.JUL);
		addEEnumLiteral(mesesEEnum, Meses.AGO);
		addEEnumLiteral(mesesEEnum, Meses.SEP);
		addEEnumLiteral(mesesEEnum, Meses.OCT);
		addEEnumLiteral(mesesEEnum, Meses.NOV);
		addEEnumLiteral(mesesEEnum, Meses.DIC);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "originalName", "Proyecto-UML"
		   });
	}

} //ProyectoUMLPackageImpl
