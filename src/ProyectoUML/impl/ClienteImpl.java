/**
 */
package ProyectoUML.impl;

import ProyectoUML.Cliente;
import ProyectoUML.Parte;
import ProyectoUML.ProyectoUMLPackage;
import ProyectoUML.interfazContrasenia;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProyectoUML.impl.ClienteImpl#getDni <em>Dni</em>}</li>
 *   <li>{@link ProyectoUML.impl.ClienteImpl#getCiudad <em>Ciudad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClienteImpl extends UsuarioImpl implements Cliente {
	/**
	 * The default value of the '{@link #getDni() <em>Dni</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDni()
	 * @generated
	 * @ordered
	 */
	protected static final String DNI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDni() <em>Dni</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDni()
	 * @generated
	 * @ordered
	 */
	protected String dni = DNI_EDEFAULT;

	/**
	 * The default value of the '{@link #getCiudad() <em>Ciudad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCiudad()
	 * @generated
	 * @ordered
	 */
	protected static final String CIUDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCiudad() <em>Ciudad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCiudad()
	 * @generated
	 * @ordered
	 */
	protected String ciudad = CIUDAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClienteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectoUMLPackage.Literals.CLIENTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDni() {
		return dni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDni(String newDni) {
		String oldDni = dni;
		dni = newDni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.CLIENTE__DNI, oldDni, dni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCiudad(String newCiudad) {
		String oldCiudad = ciudad;
		ciudad = newCiudad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.CLIENTE__CIUDAD, oldCiudad, ciudad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void recordarPass(String email) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cambiarPass(String pass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registrarParte(Parte parte) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectoUMLPackage.CLIENTE__DNI:
				return getDni();
			case ProyectoUMLPackage.CLIENTE__CIUDAD:
				return getCiudad();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProyectoUMLPackage.CLIENTE__DNI:
				setDni((String)newValue);
				return;
			case ProyectoUMLPackage.CLIENTE__CIUDAD:
				setCiudad((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProyectoUMLPackage.CLIENTE__DNI:
				setDni(DNI_EDEFAULT);
				return;
			case ProyectoUMLPackage.CLIENTE__CIUDAD:
				setCiudad(CIUDAD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProyectoUMLPackage.CLIENTE__DNI:
				return DNI_EDEFAULT == null ? dni != null : !DNI_EDEFAULT.equals(dni);
			case ProyectoUMLPackage.CLIENTE__CIUDAD:
				return CIUDAD_EDEFAULT == null ? ciudad != null : !CIUDAD_EDEFAULT.equals(ciudad);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == interfazContrasenia.class) {
			switch (baseOperationID) {
				case ProyectoUMLPackage.INTERFAZ_CONTRASENIA___RECORDAR_PASS__STRING: return ProyectoUMLPackage.CLIENTE___RECORDAR_PASS__STRING;
				case ProyectoUMLPackage.INTERFAZ_CONTRASENIA___CAMBIAR_PASS__STRING: return ProyectoUMLPackage.CLIENTE___CAMBIAR_PASS__STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProyectoUMLPackage.CLIENTE___RECORDAR_PASS__STRING:
				recordarPass((String)arguments.get(0));
				return null;
			case ProyectoUMLPackage.CLIENTE___CAMBIAR_PASS__STRING:
				cambiarPass((String)arguments.get(0));
				return null;
			case ProyectoUMLPackage.CLIENTE___REGISTRAR_PARTE__PARTE:
				registrarParte((Parte)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dni: ");
		result.append(dni);
		result.append(", ciudad: ");
		result.append(ciudad);
		result.append(')');
		return result.toString();
	}

} //ClienteImpl
