package com.mln.oops
class Car{
	def startCar(){
		println "My car is started"
	}
}

class Methods {
	static main(args) {
		Car carObj1 = new Car()
		carObj1.startCar()
	}
}
