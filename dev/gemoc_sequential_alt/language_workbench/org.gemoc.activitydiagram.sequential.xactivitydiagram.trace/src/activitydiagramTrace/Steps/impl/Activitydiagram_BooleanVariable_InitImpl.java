/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagramTrace.States.activitydiagram.TracedBooleanVariable;

import activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init;
import activitydiagramTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activitydiagram Boolean Variable Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Activitydiagram_BooleanVariable_InitImpl extends SpecificStepImpl implements Activitydiagram_BooleanVariable_Init {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activitydiagram_BooleanVariable_InitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ACTIVITYDIAGRAM_BOOLEAN_VARIABLE_INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBooleanVariable getCaller() {
		return (activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) this.getMseoccurrence().getMse().getCaller();
	}

} //Activitydiagram_BooleanVariable_InitImpl