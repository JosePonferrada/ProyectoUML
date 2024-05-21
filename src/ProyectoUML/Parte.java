/**
 */
package ProyectoUML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProyectoUML.Parte#getNumParte <em>Num Parte</em>}</li>
 *   <li>{@link ProyectoUML.Parte#getFechaParte <em>Fecha Parte</em>}</li>
 *   <li>{@link ProyectoUML.Parte#getMatriculaVehiculo <em>Matricula Vehiculo</em>}</li>
 *   <li>{@link ProyectoUML.Parte#getCarretera <em>Carretera</em>}</li>
 *   <li>{@link ProyectoUML.Parte#getKm <em>Km</em>}</li>
 * </ul>
 *
 * @see ProyectoUML.ProyectoUMLPackage#getParte()
 * @model
 * @generated
 */
public interface Parte extends EObject {
	/**
	 * Returns the value of the '<em><b>Num Parte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Parte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Parte</em>' attribute.
	 * @see #setNumParte(int)
	 * @see ProyectoUML.ProyectoUMLPackage#getParte_NumParte()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumParte();

	/**
	 * Sets the value of the '{@link ProyectoUML.Parte#getNumParte <em>Num Parte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Parte</em>' attribute.
	 * @see #getNumParte()
	 * @generated
	 */
	void setNumParte(int value);

	/**
	 * Returns the value of the '<em><b>Fecha Parte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Parte</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Parte</em>' containment reference.
	 * @see #setFechaParte(Fecha)
	 * @see ProyectoUML.ProyectoUMLPackage#getParte_FechaParte()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Fecha getFechaParte();

	/**
	 * Sets the value of the '{@link ProyectoUML.Parte#getFechaParte <em>Fecha Parte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Parte</em>' containment reference.
	 * @see #getFechaParte()
	 * @generated
	 */
	void setFechaParte(Fecha value);

	/**
	 * Returns the value of the '<em><b>Matricula Vehiculo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matricula Vehiculo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matricula Vehiculo</em>' attribute.
	 * @see #setMatriculaVehiculo(String)
	 * @see ProyectoUML.ProyectoUMLPackage#getParte_MatriculaVehiculo()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getMatriculaVehiculo();

	/**
	 * Sets the value of the '{@link ProyectoUML.Parte#getMatriculaVehiculo <em>Matricula Vehiculo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matricula Vehiculo</em>' attribute.
	 * @see #getMatriculaVehiculo()
	 * @generated
	 */
	void setMatriculaVehiculo(String value);

	/**
	 * Returns the value of the '<em><b>Carretera</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carretera</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carretera</em>' attribute.
	 * @see #setCarretera(String)
	 * @see ProyectoUML.ProyectoUMLPackage#getParte_Carretera()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCarretera();

	/**
	 * Sets the value of the '{@link ProyectoUML.Parte#getCarretera <em>Carretera</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carretera</em>' attribute.
	 * @see #getCarretera()
	 * @generated
	 */
	void setCarretera(String value);

	/**
	 * Returns the value of the '<em><b>Km</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Km</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Km</em>' attribute.
	 * @see #setKm(int)
	 * @see ProyectoUML.ProyectoUMLPackage#getParte_Km()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getKm();

	/**
	 * Sets the value of the '{@link ProyectoUML.Parte#getKm <em>Km</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Km</em>' attribute.
	 * @see #getKm()
	 * @generated
	 */
	void setKm(int value);

} // Parte
