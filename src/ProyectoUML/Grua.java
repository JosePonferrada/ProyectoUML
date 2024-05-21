/**
 */
package ProyectoUML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grua</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProyectoUML.Grua#getMatricula <em>Matricula</em>}</li>
 *   <li>{@link ProyectoUML.Grua#getDimensionLargo <em>Dimension Largo</em>}</li>
 *   <li>{@link ProyectoUML.Grua#getPesoMax <em>Peso Max</em>}</li>
 * </ul>
 *
 * @see ProyectoUML.ProyectoUMLPackage#getGrua()
 * @model
 * @generated
 */
public interface Grua extends EObject {
	/**
	 * Returns the value of the '<em><b>Matricula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matricula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matricula</em>' attribute.
	 * @see #setMatricula(String)
	 * @see ProyectoUML.ProyectoUMLPackage#getGrua_Matricula()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getMatricula();

	/**
	 * Sets the value of the '{@link ProyectoUML.Grua#getMatricula <em>Matricula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matricula</em>' attribute.
	 * @see #getMatricula()
	 * @generated
	 */
	void setMatricula(String value);

	/**
	 * Returns the value of the '<em><b>Dimension Largo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension Largo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Largo</em>' attribute.
	 * @see #setDimensionLargo(int)
	 * @see ProyectoUML.ProyectoUMLPackage#getGrua_DimensionLargo()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getDimensionLargo();

	/**
	 * Sets the value of the '{@link ProyectoUML.Grua#getDimensionLargo <em>Dimension Largo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Largo</em>' attribute.
	 * @see #getDimensionLargo()
	 * @generated
	 */
	void setDimensionLargo(int value);

	/**
	 * Returns the value of the '<em><b>Peso Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peso Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peso Max</em>' attribute.
	 * @see #setPesoMax(int)
	 * @see ProyectoUML.ProyectoUMLPackage#getGrua_PesoMax()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPesoMax();

	/**
	 * Sets the value of the '{@link ProyectoUML.Grua#getPesoMax <em>Peso Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peso Max</em>' attribute.
	 * @see #getPesoMax()
	 * @generated
	 */
	void setPesoMax(int value);

} // Grua
