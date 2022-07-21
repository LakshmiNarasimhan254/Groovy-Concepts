package com.mln.oops

class Inheritance {

	static main(args) {

		//Cars
		//Cars cars = new Cars()
//		cars.setColor("Black")
//		cars.setName("Nissan")
//		cars.setModelno(2.5)
//		cars.getCarDetails()
//		cars.start()
//		cars.gear()
//		cars.applyBrake()

		
		//Nissan
		Cars cars1 = new Nissan()
		cars1.setColor("Black")
		cars1.setName("Altima")
		cars1.setModelno(2.5)
		cars1.getCarDetails()
		cars1.start()
		cars1.gear()
		cars1.applyBrake()
		//cars1.theftsafety()
		cars1.isAutomatic()
		cars1.additonalfeature()
		
		
		Nissan cars2= new Nissan()
		cars2.setColor("Black")
		cars2.setName("Altima")
		cars2.setModelno(2.5)
		cars2.getCarDetails()
		cars2.start()
		cars2.gear()
		cars2.applyBrake()
		cars2.theftsafety()
		cars2.isAutomatic()
		cars2.additonalfeature()
		
		
		
	}
}