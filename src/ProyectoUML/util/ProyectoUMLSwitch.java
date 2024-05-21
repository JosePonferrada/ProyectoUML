/**
 */
package ProyectoUML.util;

import ProyectoUML.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ProyectoUML.ProyectoUMLPackage
 * @generated
 */
public class ProyectoUMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProyectoUMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectoUMLSwitch() {
		if (modelPackage == null) {
			modelPackage = ProyectoUMLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProyectoUMLPackage.RECOGIDA_DE_VEHICULOS: {
				RecogidaDeVehiculos recogidaDeVehiculos = (RecogidaDeVehiculos)theEObject;
				T result = caseRecogidaDeVehiculos(recogidaDeVehiculos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectoUMLPackage.USUARIO: {
				Usuario usuario = (Usuario)theEObject;
				T result = caseUsuario(usuario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectoUMLPackage.MECÁNICO: {
				Mecánico mecánico = (Mecánico)theEObject;
				T result = caseMecánico(mecánico);
				if (result == null) result = caseUsuario(mecánico);
				if (result == null) result = caseinterfazContrasenia(mecánico);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectoUMLPackage.FECHA: {
				Fecha fecha = (Fecha)theEObject;
				T result = caseFecha(fecha);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectoUMLPackage.GRUA: {
				Grua grua = (Grua)theEObject;
				T result = caseGrua(grua);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectoUMLPackage.INTERFAZ_CONTRASENIA: {
				interfazContrasenia interfazContrasenia = (interfazContrasenia)theEObject;
				T result = caseinterfazContrasenia(interfazContrasenia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectoUMLPackage.CLIENTE: {
				Cliente cliente = (Cliente)theEObject;
				T result = caseCliente(cliente);
				if (result == null) result = caseUsuario(cliente);
				if (result == null) result = caseinterfazContrasenia(cliente);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectoUMLPackage.PARTE: {
				Parte parte = (Parte)theEObject;
				T result = caseParte(parte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recogida De Vehiculos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recogida De Vehiculos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecogidaDeVehiculos(RecogidaDeVehiculos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usuario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsuario(Usuario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mecánico</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mecánico</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMecánico(Mecánico object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fecha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fecha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFecha(Fecha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grua</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grua</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrua(Grua object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>interfaz Contrasenia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>interfaz Contrasenia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseinterfazContrasenia(interfazContrasenia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cliente</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cliente</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCliente(Cliente object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParte(Parte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProyectoUMLSwitch
