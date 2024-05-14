/**
 */
package ProyectoUML;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
	 * Returns the meta object for class '{@link ProyectoUML.RecogidaDeVehiculos <em>Recogida De Vehiculos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recogida De Vehiculos</em>'.
	 * @see ProyectoUML.RecogidaDeVehiculos
	 * @generated
	 */
	EClass getRecogidaDeVehiculos();

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

	}

} //ProyectoUMLPackage
