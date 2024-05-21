/**
 */
package ProyectoUML.util;

import ProyectoUML.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ProyectoUML.ProyectoUMLPackage
 * @generated
 */
public class ProyectoUMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProyectoUMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectoUMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProyectoUMLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProyectoUMLSwitch<Adapter> modelSwitch =
		new ProyectoUMLSwitch<Adapter>() {
			@Override
			public Adapter caseRecogidaDeVehiculos(RecogidaDeVehiculos object) {
				return createRecogidaDeVehiculosAdapter();
			}
			@Override
			public Adapter caseUsuario(Usuario object) {
				return createUsuarioAdapter();
			}
			@Override
			public Adapter caseMecánico(Mecánico object) {
				return createMecánicoAdapter();
			}
			@Override
			public Adapter caseFecha(Fecha object) {
				return createFechaAdapter();
			}
			@Override
			public Adapter caseGrua(Grua object) {
				return createGruaAdapter();
			}
			@Override
			public Adapter caseinterfazContrasenia(interfazContrasenia object) {
				return createinterfazContraseniaAdapter();
			}
			@Override
			public Adapter caseCliente(Cliente object) {
				return createClienteAdapter();
			}
			@Override
			public Adapter caseParte(Parte object) {
				return createParteAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ProyectoUML.RecogidaDeVehiculos <em>Recogida De Vehiculos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProyectoUML.RecogidaDeVehiculos
	 * @generated
	 */
	public Adapter createRecogidaDeVehiculosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProyectoUML.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProyectoUML.Usuario
	 * @generated
	 */
	public Adapter createUsuarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProyectoUML.Mecánico <em>Mecánico</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProyectoUML.Mecánico
	 * @generated
	 */
	public Adapter createMecánicoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProyectoUML.Fecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProyectoUML.Fecha
	 * @generated
	 */
	public Adapter createFechaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProyectoUML.Grua <em>Grua</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProyectoUML.Grua
	 * @generated
	 */
	public Adapter createGruaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProyectoUML.interfazContrasenia <em>interfaz Contrasenia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProyectoUML.interfazContrasenia
	 * @generated
	 */
	public Adapter createinterfazContraseniaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProyectoUML.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProyectoUML.Cliente
	 * @generated
	 */
	public Adapter createClienteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProyectoUML.Parte <em>Parte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProyectoUML.Parte
	 * @generated
	 */
	public Adapter createParteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProyectoUMLAdapterFactory
