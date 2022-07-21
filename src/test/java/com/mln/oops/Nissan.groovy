package com.mln.oops



class Nissan extends Cars {

	def Type;

	Nissan(){
		println("Am the Constructor of Nissan");;
	}


	def start(){
		println("Nissan--->Start");
	}

	def  applyBrake(){
		println("Nissan--->Stop");
	}

	def theftsafety(){
		println("Nissan--->Theftsafe");
	}

	def gear(){
		println("Nissan--->Gear");
	}


	@Override
	def void isAutomatic() {
		// TODO Auto-generated method stub
	    println("Nissan--->Automatic");
	}


	public void additonalfeature() {
		// TODO Auto-generated method stub
	 println("Nissan--->additonal feature-moon roof");
	}
}



