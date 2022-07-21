package com.mln.oops


class Methods {
	static main(args) {
		Car carObj1 = new Car()
		carObj1.setColor("Black")
		carObj1.setMake("Nissan")
		carObj1.setModelno(2.5)
		carObj1.getCarDetails()
		carObj1.startIgnition()
	}
}
class Car{
	def make
	def color
	def Modelno

	def  getMake() {
		return make;
	}

	def setMake(def make) {
		this.make = make;
	}

	def getColor() {
		return color;
	}

	def setColor(def color) {
		this.color = color;
	}
	def getModelno() {
		return Modelno;
	}
	def setModelno(def modelno) {
		Modelno = modelno;
	}

	def startIgnition(){
		println "My car is started"
	}

	def getCarDetails(){
		println ("""Your car details is 
Make: $make
ModelNo: $Modelno
Color:	$color
""")

	}

}

