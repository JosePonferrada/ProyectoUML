/**
 */
package ProyectoUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProyectoUML.Cliente#getDni <em>Dni</em>}</li>
 *   <li>{@link ProyectoUML.Cliente#getCiudad <em>Ciudad</em>}</li>
 * </ul>
 *
 * @see ProyectoUML.ProyectoUMLPackage#getCliente()
 * @model
 * @generated
 */
public interface Cliente extends Usuario, interfazContrasenia {
	/**
	 * Returns the value of the '<em><b>Dni</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dni</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dni</em>' attribute.
	 * @see #setDni(String)
	 * @see ProyectoUML.ProyectoUMLPackage#getCliente_Dni()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDni();

	/**
	 * Sets the value of the '{@link ProyectoUML.Cliente#getDni <em>Dni</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dni</em>' attribute.
	 * @see #getDni()
	 * @generated
	 */
	void setDni(String value);

	/**
	 * Returns the value of the '<em><b>Ciudad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ciudad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ciudad</em>' attribute.
	 * @see #setCiudad(String)
	 * @see ProyectoUML.ProyectoUMLPackage#getCliente_Ciudad()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCiudad();

	/**
	 * Sets the value of the '{@link ProyectoUML.Cliente#getCiudad <em>Ciudad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ciudad</em>' attribute.
	 * @see #getCiudad()
	 * @generated
	 */
	void setCiudad(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parteRequired="true" parteOrdered="false"
	 * @generated
	 */
	void registrarParte(Parte parte);

} // Cliente
