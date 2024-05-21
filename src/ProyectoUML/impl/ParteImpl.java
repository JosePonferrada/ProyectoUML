/**
 */
package ProyectoUML.impl;

import ProyectoUML.Fecha;
import ProyectoUML.Parte;
import ProyectoUML.ProyectoUMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProyectoUML.impl.ParteImpl#getNumParte <em>Num Parte</em>}</li>
 *   <li>{@link ProyectoUML.impl.ParteImpl#getFechaParte <em>Fecha Parte</em>}</li>
 *   <li>{@link ProyectoUML.impl.ParteImpl#getMatriculaVehiculo <em>Matricula Vehiculo</em>}</li>
 *   <li>{@link ProyectoUML.impl.ParteImpl#getCarretera <em>Carretera</em>}</li>
 *   <li>{@link ProyectoUML.impl.ParteImpl#getKm <em>Km</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParteImpl extends MinimalEObjectImpl.Container implements Parte {
	/**
	 * The default value of the '{@link #getNumParte() <em>Num Parte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumParte()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_PARTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumParte() <em>Num Parte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumParte()
	 * @generated
	 * @ordered
	 */
	protected int numParte = NUM_PARTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFechaParte() <em>Fecha Parte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaParte()
	 * @generated
	 * @ordered
	 */
	protected Fecha fechaParte;

	/**
	 * The default value of the '{@link #getMatriculaVehiculo() <em>Matricula Vehiculo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriculaVehiculo()
	 * @generated
	 * @ordered
	 */
	protected static final String MATRICULA_VEHICULO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatriculaVehiculo() <em>Matricula Vehiculo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriculaVehiculo()
	 * @generated
	 * @ordered
	 */
	protected String matriculaVehiculo = MATRICULA_VEHICULO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarretera() <em>Carretera</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarretera()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRETERA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarretera() <em>Carretera</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarretera()
	 * @generated
	 * @ordered
	 */
	protected String carretera = CARRETERA_EDEFAULT;

	/**
	 * The default value of the '{@link #getKm() <em>Km</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKm()
	 * @generated
	 * @ordered
	 */
	protected static final int KM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKm() <em>Km</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKm()
	 * @generated
	 * @ordered
	 */
	protected int km = KM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectoUMLPackage.Literals.PARTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumParte() {
		return numParte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumParte(int newNumParte) {
		int oldNumParte = numParte;
		numParte = newNumParte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.PARTE__NUM_PARTE, oldNumParte, numParte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fecha getFechaParte() {
		return fechaParte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFechaParte(Fecha newFechaParte, NotificationChain msgs) {
		Fecha oldFechaParte = fechaParte;
		fechaParte = newFechaParte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.PARTE__FECHA_PARTE, oldFechaParte, newFechaParte);
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
	public void setFechaParte(Fecha newFechaParte) {
		if (newFechaParte != fechaParte) {
			NotificationChain msgs = null;
			if (fechaParte != null)
				msgs = ((InternalEObject)fechaParte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProyectoUMLPackage.PARTE__FECHA_PARTE, null, msgs);
			if (newFechaParte != null)
				msgs = ((InternalEObject)newFechaParte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProyectoUMLPackage.PARTE__FECHA_PARTE, null, msgs);
			msgs = basicSetFechaParte(newFechaParte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.PARTE__FECHA_PARTE, newFechaParte, newFechaParte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMatriculaVehiculo() {
		return matriculaVehiculo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatriculaVehiculo(String newMatriculaVehiculo) {
		String oldMatriculaVehiculo = matriculaVehiculo;
		matriculaVehiculo = newMatriculaVehiculo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.PARTE__MATRICULA_VEHICULO, oldMatriculaVehiculo, matriculaVehiculo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarretera() {
		return carretera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarretera(String newCarretera) {
		String oldCarretera = carretera;
		carretera = newCarretera;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.PARTE__CARRETERA, oldCarretera, carretera));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getKm() {
		return km;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKm(int newKm) {
		int oldKm = km;
		km = newKm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.PARTE__KM, oldKm, km));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProyectoUMLPackage.PARTE__FECHA_PARTE:
				return basicSetFechaParte(null, msgs);
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
			case ProyectoUMLPackage.PARTE__NUM_PARTE:
				return getNumParte();
			case ProyectoUMLPackage.PARTE__FECHA_PARTE:
				return getFechaParte();
			case ProyectoUMLPackage.PARTE__MATRICULA_VEHICULO:
				return getMatriculaVehiculo();
			case ProyectoUMLPackage.PARTE__CARRETERA:
				return getCarretera();
			case ProyectoUMLPackage.PARTE__KM:
				return getKm();
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
			case ProyectoUMLPackage.PARTE__NUM_PARTE:
				setNumParte((Integer)newValue);
				return;
			case ProyectoUMLPackage.PARTE__FECHA_PARTE:
				setFechaParte((Fecha)newValue);
				return;
			case ProyectoUMLPackage.PARTE__MATRICULA_VEHICULO:
				setMatriculaVehiculo((String)newValue);
				return;
			case ProyectoUMLPackage.PARTE__CARRETERA:
				setCarretera((String)newValue);
				return;
			case ProyectoUMLPackage.PARTE__KM:
				setKm((Integer)newValue);
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
			case ProyectoUMLPackage.PARTE__NUM_PARTE:
				setNumParte(NUM_PARTE_EDEFAULT);
				return;
			case ProyectoUMLPackage.PARTE__FECHA_PARTE:
				setFechaParte((Fecha)null);
				return;
			case ProyectoUMLPackage.PARTE__MATRICULA_VEHICULO:
				setMatriculaVehiculo(MATRICULA_VEHICULO_EDEFAULT);
				return;
			case ProyectoUMLPackage.PARTE__CARRETERA:
				setCarretera(CARRETERA_EDEFAULT);
				return;
			case ProyectoUMLPackage.PARTE__KM:
				setKm(KM_EDEFAULT);
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
			case ProyectoUMLPackage.PARTE__NUM_PARTE:
				return numParte != NUM_PARTE_EDEFAULT;
			case ProyectoUMLPackage.PARTE__FECHA_PARTE:
				return fechaParte != null;
			case ProyectoUMLPackage.PARTE__MATRICULA_VEHICULO:
				return MATRICULA_VEHICULO_EDEFAULT == null ? matriculaVehiculo != null : !MATRICULA_VEHICULO_EDEFAULT.equals(matriculaVehiculo);
			case ProyectoUMLPackage.PARTE__CARRETERA:
				return CARRETERA_EDEFAULT == null ? carretera != null : !CARRETERA_EDEFAULT.equals(carretera);
			case ProyectoUMLPackage.PARTE__KM:
				return km != KM_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (numParte: ");
		result.append(numParte);
		result.append(", matriculaVehiculo: ");
		result.append(matriculaVehiculo);
		result.append(", carretera: ");
		result.append(carretera);
		result.append(", km: ");
		result.append(km);
		result.append(')');
		return result.toString();
	}

} //ParteImpl
