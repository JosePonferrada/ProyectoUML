/**
 */
package ProyectoUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mecánico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProyectoUML.Mecánico#getNumMecanico <em>Num Mecanico</em>}</li>
 *   <li>{@link ProyectoUML.Mecánico#getFechaAlta <em>Fecha Alta</em>}</li>
 *   <li>{@link ProyectoUML.Mecánico#getGrua <em>Grua</em>}</li>
 * </ul>
 *
 * @see ProyectoUML.ProyectoUMLPackage#getMecánico()
 * @model
 * @generated
 */
public interface Mecánico extends Usuario, interfazContrasenia {
	/**
	 * Returns the value of the '<em><b>Num Mecanico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Mecanico</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Mecanico</em>' attribute.
	 * @see #setNumMecanico(int)
	 * @see ProyectoUML.ProyectoUMLPackage#getMecánico_NumMecanico()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumMecanico();

	/**
	 * Sets the value of the '{@link ProyectoUML.Mecánico#getNumMecanico <em>Num Mecanico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Mecanico</em>' attribute.
	 * @see #getNumMecanico()
	 * @generated
	 */
	void setNumMecanico(int value);

	/**
	 * Returns the value of the '<em><b>Fecha Alta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Alta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Alta</em>' containment reference.
	 * @see #setFechaAlta(Fecha)
	 * @see ProyectoUML.ProyectoUMLPackage#getMecánico_FechaAlta()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Fecha getFechaAlta();

	/**
	 * Sets the value of the '{@link ProyectoUML.Mecánico#getFechaAlta <em>Fecha Alta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Alta</em>' containment reference.
	 * @see #getFechaAlta()
	 * @generated
	 */
	void setFechaAlta(Fecha value);

	/**
	 * Returns the value of the '<em><b>Grua</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grua</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grua</em>' reference.
	 * @see #setGrua(Grua)
	 * @see ProyectoUML.ProyectoUMLPackage#getMecánico_Grua()
	 * @model ordered="false"
	 * @generated
	 */
	Grua getGrua();

	/**
	 * Sets the value of the '{@link ProyectoUML.Mecánico#getGrua <em>Grua</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grua</em>' reference.
	 * @see #getGrua()
	 * @generated
	 */
	void setGrua(Grua value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model matriculaDataType="org.eclipse.uml2.types.String" matriculaRequired="true" matriculaOrdered="false"
	 * @generated
	 */
	void usarGrua(String matricula);

} // Mecánico
