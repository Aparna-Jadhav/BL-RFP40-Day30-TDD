package Day30_JUnitTDD;


public class InvoiceService<InvoiceSummary> 
{
	private static final double MINIMUN_COST_PER_KILOMETER = 10.0;
	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_FARE = 5;

	//RideRepository rideRepository =new RideRepository();
	//step1
	public double calculateFare(double distance, int time) 
	{
        double totalFare = distance * MINIMUN_COST_PER_KILOMETER + time * COST_PER_TIME;
		
		if(totalFare < MINIMUM_FARE)
			return MINIMUM_FARE;
		return totalFare;
    }
	
	//step2
	public double calculateFare(Ride[] rides)
	{
		double totalFare=0;
		for(Ride ride : rides )
		{
			totalFare += this.calculateFare(ride.distance, ride.time);
		}
		
		return totalFare;
			
	}
	
	
	 public void addRides(String userId, Ride[] rides) throws NullPointerException 
	 {
		 try
		 {
	        if (userId == null)
	        	System.out.println("userId cant be null");
		 } catch(Exception e) 
	        {
	            System.out.println("userId cant be null");
	        }   
	    }

	   
}
