package com.mln.oops

abstract class Cars implements Vehicle {
	def name
	def color
	def Modelno

	def  getName() {
		return name
	}

	def setName(def name) {
		this.name= name
	}

	def getColor() {
		return color
	}

	def setColor(def color) {
		this.color = color
	}
	def getModelno() {
		return Modelno;
	}
	def setModelno(def modelno) {
		Modelno = modelno
	}


	def start(){
		println("Car--->Start");
	}

	def applyBrake(){
		println("Car--->Stop");
	}

	def  gear(){
		System.out.println("Car--->Gear");
	}

	def  getCarDetails(){
		println ("""Your car details is
Make: $name
ModelNo: $Modelno
Color:	$color
""")

	}
	
	def abstract void isAutomatic();
}
