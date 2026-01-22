class Profit{
	public static void main(String args[]){
		int sprice=191,cprice=129;
		double profit=sprice -cprice;
		double profit_percentage=profit/cprice*100;
		System.out.println("The Cost Price in INR "+cprice+" and Selling Price is INR "+sprice+"\n"
							+"The Profit is INR "+profit+" and the Profit Percentage is "+profit_percentage);
	}
}