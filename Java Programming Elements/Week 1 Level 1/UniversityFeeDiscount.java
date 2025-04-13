class UniversityFeeDiscount {
	public static void main(String args) {
		
		int fee = 125000;
		int discountPercent = 10;
		
		double discount = (double) fee * discountPercent / 100; // Calculate discount
		
		double discountedFee = fee - discount; // Calculate discounted fee
		
		System.out.println("The discount amount is INR " + discount);
		System.out.println("and final discounted fee is INR " + discountedFee);
	}
}