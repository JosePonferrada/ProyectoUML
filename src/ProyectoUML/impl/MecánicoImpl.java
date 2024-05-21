/**
 */
package ProyectoUML.impl;

import ProyectoUML.Fecha;
import ProyectoUML.Grua;
import ProyectoUML.Mecánico;
import ProyectoUML.ProyectoUMLPackage;
import ProyectoUML.interfazContrasenia;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mecánico</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProyectoUML.impl.MecánicoImpl#getNumMecanico <em>Num Mecanico</em>}</li>
 *   <li>{@link ProyectoUML.impl.MecánicoImpl#getFechaAlta <em>Fecha Alta</em>}</li>
 *   <li>{@link ProyectoUML.impl.MecánicoImpl#getGrua <em>Grua</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MecánicoImpl extends UsuarioImpl implements Mecánico {
	/**
	 * The default value of the '{@link #getNumMecanico() <em>Num Mecanico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumMecanico()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_MECANICO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumMecanico() <em>Num Mecanico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumMecanico()
	 * @generated
	 * @ordered
	 */
	protected int numMecanico = NUM_MECANICO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFechaAlta() <em>Fecha Alta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaAlta()
	 * @generated
	 * @ordered
	 */
	protected Fecha fechaAlta;

	/**
	 * The cached value of the '{@link #getGrua() <em>Grua</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrua()
	 * @generated
	 * @ordered
	 */
	protected Grua grua;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MecánicoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectoUMLPackage.Literals.MECÁNICO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumMecanico() {
		return numMecanico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumMecanico(int newNumMecanico) {
		int oldNumMecanico = numMecanico;
		numMecanico = newNumMecanico;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.MECÁNICO__NUM_MECANICO, oldNumMecanico, numMecanico));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fecha getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFechaAlta(Fecha newFechaAlta, NotificationChain msgs) {
		Fecha oldFechaAlta = fechaAlta;
		fechaAlta = newFechaAlta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.MECÁNICO__FECHA_ALTA, oldFechaAlta, newFechaAlta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFechaAlta(Fecha newFechaAlta) {
		if (newFechaAlta != fechaAlta) {
			NotificationChain msgs = null;
			if (fechaAlta != null)
				msgs = ((InternalEObject)fechaAlta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProyectoUMLPackage.MECÁNICO__FECHA_ALTA, null, msgs);
			if (newFechaAlta != null)
				msgs = ((InternalEObject)newFechaAlta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProyectoUMLPackage.MECÁNICO__FECHA_ALTA, null, msgs);
			msgs = basicSetFechaAlta(newFechaAlta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.MECÁNICO__FECHA_ALTA, newFechaAlta, newFechaAlta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Grua getGrua() {
		if (grua != null && grua.eIsProxy()) {
			InternalEObject oldGrua = (InternalEObject)grua;
			grua = (Grua)eResolveProxy(oldGrua);
			if (grua != oldGrua) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectoUMLPackage.MECÁNICO__GRUA, oldGrua, grua));
			}
		}
		return grua;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grua basicGetGrua() {
		return grua;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrua(Grua newGrua) {
		Grua oldGrua = grua;
		grua = newGrua;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.MECÁNICO__GRUA, oldGrua, grua));
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
	public void usarGrua(String matricula) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProyectoUMLPackage.MECÁNICO__FECHA_ALTA:
				return basicSetFechaAlta(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectoUMLPackage.MECÁNICO__NUM_MECANICO:
				return getNumMecanico();
			case ProyectoUMLPackage.MECÁNICO__FECHA_ALTA:
				return getFechaAlta();
			case ProyectoUMLPackage.MECÁNICO__GRUA:
				if (resolve) return getGrua();
				return basicGetGrua();
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
			case ProyectoUMLPackage.MECÁNICO__NUM_MECANICO:
				setNumMecanico((Integer)newValue);
				return;
			case ProyectoUMLPackage.MECÁNICO__FECHA_ALTA:
				setFechaAlta((Fecha)newValue);
				return;
			case ProyectoUMLPackage.MECÁNICO__GRUA:
				setGrua((Grua)newValue);
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
			case ProyectoUMLPackage.MECÁNICO__NUM_MECANICO:
				setNumMecanico(NUM_MECANICO_EDEFAULT);
				return;
			case ProyectoUMLPackage.MECÁNICO__FECHA_ALTA:
				setFechaAlta((Fecha)null);
				return;
			case ProyectoUMLPackage.MECÁNICO__GRUA:
				setGrua((Grua)null);
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
			case ProyectoUMLPackage.MECÁNICO__NUM_MECANICO:
				return numMecanico != NUM_MECANICO_EDEFAULT;
			case ProyectoUMLPackage.MECÁNICO__FECHA_ALTA:
				return fechaAlta != null;
			case ProyectoUMLPackage.MECÁNICO__GRUA:
				return grua != null;
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
				case ProyectoUMLPackage.INTERFAZ_CONTRASENIA___RECORDAR_PASS__STRING: return ProyectoUMLPackage.MECÁNICO___RECORDAR_PASS__STRING;
				case ProyectoUMLPackage.INTERFAZ_CONTRASENIA___CAMBIAR_PASS__STRING: return ProyectoUMLPackage.MECÁNICO___CAMBIAR_PASS__STRING;
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
			case ProyectoUMLPackage.MECÁNICO___RECORDAR_PASS__STRING:
				recordarPass((String)arguments.get(0));
				return null;
			case ProyectoUMLPackage.MECÁNICO___CAMBIAR_PASS__STRING:
				cambiarPass((String)arguments.get(0));
				return null;
			case ProyectoUMLPackage.MECÁNICO___USAR_GRUA__STRING:
				usarGrua((String)arguments.get(0));
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
		result.append(" (numMecanico: ");
		result.append(numMecanico);
		result.append(')');
		return result.toString();
	}

} //MecánicoImpl
