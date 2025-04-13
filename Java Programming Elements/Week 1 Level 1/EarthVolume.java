class EarthVolume {
	public static void main(String[] args) {
		
		double radiusKm = 6378;
		double pi = Math.PI;
		
		// Calculate volume in cubic kilometers
		double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
		
		// 1 mile = 1.60934 kilometers
		double radiusMiles = radiusKm / 1.60934;
		
		double volumeMiles = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);
		
		System.out.println("The volume of earth in cubic kilometers is " + volumeKm);
		System.out.println("and cubic miles is " + volumeMiles);
	}
}