/**
 * generated by Xtext 2.13.0
 */
package uibk.ac.at.qe.dsl.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uibk.ac.at.qe.dsl.game.Person#getName <em>Name</em>}</li>
 *   <li>{@link uibk.ac.at.qe.dsl.game.Person#getType <em>Type</em>}</li>
 *   <li>{@link uibk.ac.at.qe.dsl.game.Person#getResponse <em>Response</em>}</li>
 *   <li>{@link uibk.ac.at.qe.dsl.game.Person#getPosition <em>Position</em>}</li>
 *   <li>{@link uibk.ac.at.qe.dsl.game.Person#getAction <em>Action</em>}</li>
 *   <li>{@link uibk.ac.at.qe.dsl.game.Person#getFinalObject <em>Final Object</em>}</li>
 * </ul>
 *
 * @see uibk.ac.at.qe.dsl.game.GamePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uibk.ac.at.qe.dsl.game.GamePackage#getPerson_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uibk.ac.at.qe.dsl.game.Person#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see uibk.ac.at.qe.dsl.game.GamePackage#getPerson_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link uibk.ac.at.qe.dsl.game.Person#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Response</b></em>' containment reference list.
   * The list contents are of type {@link uibk.ac.at.qe.dsl.game.Person_R}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Response</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Response</em>' containment reference list.
   * @see uibk.ac.at.qe.dsl.game.GamePackage#getPerson_Response()
   * @model containment="true"
   * @generated
   */
  EList<Person_R> getResponse();

  /**
   * Returns the value of the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' attribute.
   * @see #setPosition(String)
   * @see uibk.ac.at.qe.dsl.game.GamePackage#getPerson_Position()
   * @model
   * @generated
   */
  String getPosition();

  /**
   * Sets the value of the '{@link uibk.ac.at.qe.dsl.game.Person#getPosition <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' attribute.
   * @see #getPosition()
   * @generated
   */
  void setPosition(String value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' attribute.
   * The literals are from the enumeration {@link uibk.ac.at.qe.dsl.game.Action_P}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' attribute.
   * @see uibk.ac.at.qe.dsl.game.Action_P
   * @see #setAction(Action_P)
   * @see uibk.ac.at.qe.dsl.game.GamePackage#getPerson_Action()
   * @model
   * @generated
   */
  Action_P getAction();

  /**
   * Sets the value of the '{@link uibk.ac.at.qe.dsl.game.Person#getAction <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' attribute.
   * @see uibk.ac.at.qe.dsl.game.Action_P
   * @see #getAction()
   * @generated
   */
  void setAction(Action_P value);

  /**
   * Returns the value of the '<em><b>Final Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Final Object</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Final Object</em>' reference.
   * @see #setFinalObject(My_Object)
   * @see uibk.ac.at.qe.dsl.game.GamePackage#getPerson_FinalObject()
   * @model
   * @generated
   */
  My_Object getFinalObject();

  /**
   * Sets the value of the '{@link uibk.ac.at.qe.dsl.game.Person#getFinalObject <em>Final Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Final Object</em>' reference.
   * @see #getFinalObject()
   * @generated
   */
  void setFinalObject(My_Object value);

} // Person
