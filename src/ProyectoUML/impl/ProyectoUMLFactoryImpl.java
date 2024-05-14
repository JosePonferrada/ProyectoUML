/**
 */
package ProyectoUML.impl;

import ProyectoUML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProyectoUMLFactoryImpl extends EFactoryImpl implements ProyectoUMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProyectoUMLFactory init() {
		try {
			ProyectoUMLFactory theProyectoUMLFactory = (ProyectoUMLFactory)EPackage.Registry.INSTANCE.getEFactory(ProyectoUMLPackage.eNS_URI);
			if (theProyectoUMLFactory != null) {
				return theProyectoUMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProyectoUMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectoUMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProyectoUMLPackage.RECOGIDA_DE_VEHICULOS: return createRecogidaDeVehiculos();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecogidaDeVehiculos createRecogidaDeVehiculos() {
		RecogidaDeVehiculosImpl recogidaDeVehiculos = new RecogidaDeVehiculosImpl();
		return recogidaDeVehiculos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProyectoUMLPackage getProyectoUMLPackage() {
		return (ProyectoUMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProyectoUMLPackage getPackage() {
		return ProyectoUMLPackage.eINSTANCE;
	}

} //ProyectoUMLFactoryImpl
