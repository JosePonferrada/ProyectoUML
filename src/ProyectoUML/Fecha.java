/**
 */
package ProyectoUML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fecha</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProyectoUML.Fecha#getDia <em>Dia</em>}</li>
 *   <li>{@link ProyectoUML.Fecha#getMes <em>Mes</em>}</li>
 *   <li>{@link ProyectoUML.Fecha#getAnio <em>Anio</em>}</li>
 * </ul>
 *
 * @see ProyectoUML.ProyectoUMLPackage#getFecha()
 * @model
 * @generated
 */
public interface Fecha extends EObject {
	/**
	 * Returns the value of the '<em><b>Dia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dia</em>' attribute.
	 * @see #setDia(int)
	 * @see ProyectoUML.ProyectoUMLPackage#getFecha_Dia()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getDia();

	/**
	 * Sets the value of the '{@link ProyectoUML.Fecha#getDia <em>Dia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dia</em>' attribute.
	 * @see #getDia()
	 * @generated
	 */
	void setDia(int value);

	/**
	 * Returns the value of the '<em><b>Mes</b></em>' attribute.
	 * The literals are from the enumeration {@link ProyectoUML.Meses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mes</em>' attribute.
	 * @see ProyectoUML.Meses
	 * @see #setMes(Meses)
	 * @see ProyectoUML.ProyectoUMLPackage#getFecha_Mes()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Meses getMes();

	/**
	 * Sets the value of the '{@link ProyectoUML.Fecha#getMes <em>Mes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mes</em>' attribute.
	 * @see ProyectoUML.Meses
	 * @see #getMes()
	 * @generated
	 */
	void setMes(Meses value);

	/**
	 * Returns the value of the '<em><b>Anio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anio</em>' attribute.
	 * @see #setAnio(int)
	 * @see ProyectoUML.ProyectoUMLPackage#getFecha_Anio()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getAnio();

	/**
	 * Sets the value of the '{@link ProyectoUML.Fecha#getAnio <em>Anio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anio</em>' attribute.
	 * @see #getAnio()
	 * @generated
	 */
	void setAnio(int value);

} // Fecha
