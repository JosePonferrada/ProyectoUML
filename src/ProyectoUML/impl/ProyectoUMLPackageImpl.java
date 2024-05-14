/**
 */
package ProyectoUML.impl;

import ProyectoUML.ProyectoUMLFactory;
import ProyectoUML.ProyectoUMLPackage;
import ProyectoUML.RecogidaDeVehiculos;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(recogidaDeVehiculosEClass, RecogidaDeVehiculos.class, "RecogidaDeVehiculos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
