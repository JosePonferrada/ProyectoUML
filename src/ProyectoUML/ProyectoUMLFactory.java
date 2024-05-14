/**
 */
package ProyectoUML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ProyectoUML.ProyectoUMLPackage
 * @generated
 */
public interface ProyectoUMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProyectoUMLFactory eINSTANCE = ProyectoUML.impl.ProyectoUMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Recogida De Vehiculos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recogida De Vehiculos</em>'.
	 * @generated
	 */
	RecogidaDeVehiculos createRecogidaDeVehiculos();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProyectoUMLPackage getProyectoUMLPackage();

} //ProyectoUMLFactory
