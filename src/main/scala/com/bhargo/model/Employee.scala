package com.bhargo.model

/**
  * Created by Bhargo on 4/21/2017.
  */
/**
  * @param empId employee ID which is unique
  * @param _name name
  * @param email email which is unique
  * @param _role role of the employee
  * case class which already has the following:-
  * apply(), unapply(), companion object, toString(), equals(), hashcode(), copy(), serialization
  * variables are val by default
  */
  class Employee (empId:String, _name:String, email:String, private var _role: Role) {

  println("inline code is executed as part of the primary constructor")

  /**
    * for private contructor, private keyword before the constructor parenthesis
    */

  /**
    * overloaded constructor, 1st line must be call to other constructor
    * @param name
    * @param email
    * @return
    */
  def this(empId:String, name:String, email:String) = this(empId, name, email, null)

  /**
    * by default all variables are val, i.e. immutable
    * only getter methods are generated by default.
    * private does not generate getter and setter, must mention whether val or var
    * if var, getters and setters are generated
    */

  /**
    * getter and a setter method, in case your variables are private var
    */
  def role = _role
  def role_=(newRole: Role) = _role = newRole


  /**
    * gives a {@link com.bhargo.model.Role} to the employee
    * @param userRole
    * @return the current instance on which the operation was performed
    */
  def as (userRole: Role) :Employee = {
    println("created user as " + userRole)
    role = userRole
    this
  }

  override def toString(): String = "Empid is " + empId + ", name is "+
    _name + ", email is " + email + ", role is " + role
}

/**
  * object means singleton.
  * When embedded in a class and named the same it becomes a companion Object.
  * apply() methods with varying args can be created to create instances and
  * to execute some code before instance creation
  */
object Employee {
  def apply(empId: String,_name: String , email: String): Employee = new Employee(empId , _name, email)
}