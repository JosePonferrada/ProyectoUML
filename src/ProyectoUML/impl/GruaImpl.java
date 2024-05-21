/**
 */
package ProyectoUML.impl;

import ProyectoUML.Grua;
import ProyectoUML.ProyectoUMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grua</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProyectoUML.impl.GruaImpl#getMatricula <em>Matricula</em>}</li>
 *   <li>{@link ProyectoUML.impl.GruaImpl#getDimensionLargo <em>Dimension Largo</em>}</li>
 *   <li>{@link ProyectoUML.impl.GruaImpl#getPesoMax <em>Peso Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GruaImpl extends MinimalEObjectImpl.Container implements Grua {
	/**
	 * The default value of the '{@link #getMatricula() <em>Matricula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricula()
	 * @generated
	 * @ordered
	 */
	protected static final String MATRICULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatricula() <em>Matricula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricula()
	 * @generated
	 * @ordered
	 */
	protected String matricula = MATRICULA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDimensionLargo() <em>Dimension Largo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionLargo()
	 * @generated
	 * @ordered
	 */
	protected static final int DIMENSION_LARGO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDimensionLargo() <em>Dimension Largo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionLargo()
	 * @generated
	 * @ordered
	 */
	protected int dimensionLargo = DIMENSION_LARGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPesoMax() <em>Peso Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPesoMax()
	 * @generated
	 * @ordered
	 */
	protected static final int PESO_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPesoMax() <em>Peso Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPesoMax()
	 * @generated
	 * @ordered
	 */
	protected int pesoMax = PESO_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GruaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectoUMLPackage.Literals.GRUA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMatricula() {
		return matricula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatricula(String newMatricula) {
		String oldMatricula = matricula;
		matricula = newMatricula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.GRUA__MATRICULA, oldMatricula, matricula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDimensionLargo() {
		return dimensionLargo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDimensionLargo(int newDimensionLargo) {
		int oldDimensionLargo = dimensionLargo;
		dimensionLargo = newDimensionLargo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.GRUA__DIMENSION_LARGO, oldDimensionLargo, dimensionLargo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPesoMax() {
		return pesoMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPesoMax(int newPesoMax) {
		int oldPesoMax = pesoMax;
		pesoMax = newPesoMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoUMLPackage.GRUA__PESO_MAX, oldPesoMax, pesoMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectoUMLPackage.GRUA__MATRICULA:
				return getMatricula();
			case ProyectoUMLPackage.GRUA__DIMENSION_LARGO:
				return getDimensionLargo();
			case ProyectoUMLPackage.GRUA__PESO_MAX:
				return getPesoMax();
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
			case ProyectoUMLPackage.GRUA__MATRICULA:
				setMatricula((String)newValue);
				return;
			case ProyectoUMLPackage.GRUA__DIMENSION_LARGO:
				setDimensionLargo((Integer)newValue);
				return;
			case ProyectoUMLPackage.GRUA__PESO_MAX:
				setPesoMax((Integer)newValue);
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
			case ProyectoUMLPackage.GRUA__MATRICULA:
				setMatricula(MATRICULA_EDEFAULT);
				return;
			case ProyectoUMLPackage.GRUA__DIMENSION_LARGO:
				setDimensionLargo(DIMENSION_LARGO_EDEFAULT);
				return;
			case ProyectoUMLPackage.GRUA__PESO_MAX:
				setPesoMax(PESO_MAX_EDEFAULT);
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
			case ProyectoUMLPackage.GRUA__MATRICULA:
				return MATRICULA_EDEFAULT == null ? matricula != null : !MATRICULA_EDEFAULT.equals(matricula);
			case ProyectoUMLPackage.GRUA__DIMENSION_LARGO:
				return dimensionLargo != DIMENSION_LARGO_EDEFAULT;
			case ProyectoUMLPackage.GRUA__PESO_MAX:
				return pesoMax != PESO_MAX_EDEFAULT;
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
		result.append(" (matricula: ");
		result.append(matricula);
		result.append(", dimensionLargo: ");
		result.append(dimensionLargo);
		result.append(", pesoMax: ");
		result.append(pesoMax);
		result.append(')');
		return result.toString();
	}

} //GruaImpl
