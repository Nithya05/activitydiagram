/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.SpecificDimension;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Action</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedAction()
 * @model abstract="true"
 * @generated
 */
public interface TracedAction extends TracedActivityNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\nresult.addAll(super.getDimensionsInternal());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedAction