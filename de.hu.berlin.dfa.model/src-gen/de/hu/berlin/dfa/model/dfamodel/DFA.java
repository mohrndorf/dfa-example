/**
 */
package de.hu.berlin.dfa.model.dfamodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DFA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hu.berlin.dfa.model.dfamodel.DFA#getStates <em>States</em>}</li>
 *   <li>{@link de.hu.berlin.dfa.model.dfamodel.DFA#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see de.hu.berlin.dfa.model.dfamodel.DfamodelPackage#getDFA()
 * @model
 * @generated
 */
public interface DFA extends EObject {

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link de.hu.berlin.dfa.model.dfamodel.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see de.hu.berlin.dfa.model.dfamodel.DfamodelPackage#getDFA_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.hu.berlin.dfa.model.dfamodel.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see de.hu.berlin.dfa.model.dfamodel.DfamodelPackage#getDFA_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();
} // DFA
