/**
 */
package org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context#getOutput <em>Output</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context#getParent <em>Parent</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivitydiagramPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Trace)
	 * @see org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivitydiagramPackage#getContext_Output()
	 * @model
	 * @generated
	 */
	Trace getOutput();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Trace value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivitydiagramPackage#getContext_Activity()
	 * @model
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Context)
	 * @see org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivitydiagramPackage#getContext_Parent()
	 * @model
	 * @generated
	 */
	Context getParent();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Context value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(JoinNode)
	 * @see org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivitydiagramPackage#getContext_Node()
	 * @model
	 * @generated
	 */
	JoinNode getNode();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(JoinNode value);

} // Context
