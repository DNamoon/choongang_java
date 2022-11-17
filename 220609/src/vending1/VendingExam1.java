package vending1;

import vending1.VendingMachine.Products;

public class VendingExam1 {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		//vm.select(Products.COLA);
		
		vm.select(Products.COLA);
		vm.insertCoin();	
		vm.select(Products.COLA);
		vm.insertCoin();
		vm.select(Products.COLA);
		vm.select(Products.CIDEER);
		vm.insertCoin();
		vm.select(Products.COFFEE);
		//vm.select(Poducts.

	}

}
