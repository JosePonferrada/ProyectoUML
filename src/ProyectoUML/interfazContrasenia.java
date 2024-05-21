/**
 */
package ProyectoUML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>interfaz Contrasenia</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ProyectoUML.ProyectoUMLPackage#getinterfazContrasenia()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface interfazContrasenia extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	void recordarPass(String email);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model passDataType="org.eclipse.uml2.types.String" passRequired="true" passOrdered="false"
	 * @generated
	 */
	void cambiarPass(String pass);

} // interfazContrasenia
