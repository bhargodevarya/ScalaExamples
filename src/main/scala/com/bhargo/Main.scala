package com.bhargo

import com.bhargo.model.Employee

/**
  * Created by barya on 4/17/2017.
  */
object Main {

  def main(args:Array[String]) = {
    val emp:Employee = new Employee("41NYG", "Bhargodev Arya", "Bhargodev.arya@morganstanley.com")
    emp.name = "Amar"
    println(emp)
  }
}
