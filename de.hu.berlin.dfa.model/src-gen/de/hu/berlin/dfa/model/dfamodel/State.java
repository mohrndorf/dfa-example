/**
 */
package de.hu.berlin.dfa.model.dfamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hu.berlin.dfa.model.dfamodel.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link de.hu.berlin.dfa.model.dfamodel.State#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link de.hu.berlin.dfa.model.dfamodel.State#getId <em>Id</em>}</li>
 *   <li>{@link de.hu.berlin.dfa.model.dfamodel.State#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link de.hu.berlin.dfa.model.dfamodel.State#isIsEnd <em>Is End</em>}</li>
 * </ul>
 *
 * @see de.hu.berlin.dfa.model.dfamodel.DfamodelPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link de.hu.berlin.dfa.model.dfamodel.Transition}.
	 * It is bidirectional and its opposite is '{@link de.hu.berlin.dfa.model.dfamodel.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see de.hu.berlin.dfa.model.dfamodel.DfamodelPackage#getState_OutgoingTransitions()
	 * @see de.hu.berlin.dfa.model.dfamodel.Transition#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link de.hu.berlin.dfa.model.dfamodel.Transition}.
	 * It is bidirectional and its opposite is '{@link de.hu.berlin.dfa.model.dfamodel.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see de.hu.berlin.dfa.model.dfamodel.DfamodelPackage#getState_IncomingTransitions()
	 * @see de.hu.berlin.dfa.model.dfamodel.Transition#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.hu.berlin.dfa.model.dfamodel.DfamodelPackage#getState_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.hu.berlin.dfa.model.dfamodel.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Start</em>' attribute.
	 * @see #setIsStart(boolean)
	 * @see de.hu.berlin.dfa.model.dfamodel.DfamodelPackage#getState_IsStart()
	 * @model
	 * @generated
	 */
	boolean isIsStart();

	/**
	 * Sets the value of the '{@link de.hu.berlin.dfa.model.dfamodel.State#isIsStart <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Start</em>' attribute.
	 * @see #isIsStart()
	 * @generated
	 */
	void setIsStart(boolean value);

	/**
	 * Returns the value of the '<em><b>Is End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is End</em>' attribute.
	 * @see #setIsEnd(boolean)
	 * @see de.hu.berlin.dfa.model.dfamodel.DfamodelPackage#getState_IsEnd()
	 * @model
	 * @generated
	 */
	boolean isIsEnd();

	/**
	 * Sets the value of the '{@link de.hu.berlin.dfa.model.dfamodel.State#isIsEnd <em>Is End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is End</em>' attribute.
	 * @see #isIsEnd()
	 * @generated
	 */
	void setIsEnd(boolean value);

} // State
