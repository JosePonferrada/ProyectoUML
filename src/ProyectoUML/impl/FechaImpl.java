/**
 */
package ProyectoUML.impl;

import ProyectoUML.Fecha;
import ProyectoUML.Meses;
import ProyectoUML.ProyectoUMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fecha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProyectoUML.impl.FechaImpl#getDia <em>Dia</em>}</li>
 *   <li>{@link ProyectoUML.impl.FechaImpl#getMes <em>Mes</em>}</li>
 *   <li>{@link ProyectoUML.impl.FechaImpl#getAnio <em>Anio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FechaImpl extends MinimalEObjectImpl.Container implements Fecha {
	/**
	 * The default value of the '{@link #getDia() <em>Dia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDia()
	 * @generated
	 * @ordered
	 */
	protected static final int DIA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDia() <em>Dia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDia()
	 * @generated
	 * @ordered
	 */
	protected int dia = DIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMes() <em>Mes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMes()
	 * @generated
	 * @ordered
	 */
	protected static final Meses MES_EDEFAULT = Meses.ENE;

	/**
	 * The cached value of the '{@link #getMes() <em>Mes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMes()
	 * @generated
	 * @ordered
	 */
	protected Meses mes = MES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnio() <em>Anio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnio()
	 * @generated
	 * @ordered
	 */
	protected static final int ANIO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnio() <em>Anio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnio()
	 * @generated
	 * @ordered
	 */
	protected int anio = ANIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FechaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectoUMLPackage.Literals.FECHA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDia() {
		return dia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDia(int newDia) {
		int oldDia = dia;
		dia = newDia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.FECHA__DIA, oldDia, dia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Meses getMes() {
		return mes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMes(Meses newMes) {
		Meses oldMes = mes;
		mes = newMes == null ? MES_EDEFAULT : newMes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.FECHA__MES, oldMes, mes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAnio() {
		return anio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnio(int newAnio) {
		int oldAnio = anio;
		anio = newAnio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.FECHA__ANIO, oldAnio, anio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectoUMLPackage.FECHA__DIA:
				return getDia();
			case ProyectoUMLPackage.FECHA__MES:
				return getMes();
			case ProyectoUMLPackage.FECHA__ANIO:
				return getAnio();
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
			case ProyectoUMLPackage.FECHA__DIA:
				setDia((Integer)newValue);
				return;
			case ProyectoUMLPackage.FECHA__MES:
				setMes((Meses)newValue);
				return;
			case ProyectoUMLPackage.FECHA__ANIO:
				setAnio((Integer)newValue);
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
			case ProyectoUMLPackage.FECHA__DIA:
				setDia(DIA_EDEFAULT);
				return;
			case ProyectoUMLPackage.FECHA__MES:
				setMes(MES_EDEFAULT);
				return;
			case ProyectoUMLPackage.FECHA__ANIO:
				setAnio(ANIO_EDEFAULT);
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
			case ProyectoUMLPackage.FECHA__DIA:
				return dia != DIA_EDEFAULT;
			case ProyectoUMLPackage.FECHA__MES:
				return mes != MES_EDEFAULT;
			case ProyectoUMLPackage.FECHA__ANIO:
				return anio != ANIO_EDEFAULT;
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
		result.append(" (Dia: ");
		result.append(dia);
		result.append(", Mes: ");
		result.append(mes);
		result.append(", Anio: ");
		result.append(anio);
		result.append(')');
		return result.toString();
	}

} //FechaImpl
