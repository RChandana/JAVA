 /*Create a class named Billing that includes three overloaded computeBill() methods for a
photo book store.
When computeBill() receives a single parameter, it represents the price of one photo book ordered. Add 8% tax, and return the total due.
When computeBill() receives two parameters, they represent the price of a photo book and the quantity ordered. 
Multiply the two values, add 8% tax, and return the total due.
When computeBill() receives three parameters, they represent the price of a photo book, the quantity ordered, and a coupon value. 
Multiply the quantity and price, reduce the result by the coupon value, and then add 8% tax and return the total due.
Write a main() method that tests all three overloaded methods. Save the application as Billing.java.*/


public class Billing {
	private float photobookprice=0; 
	private int photobooks = 1;
        private final int taxpercent = 8; 
	private float couponValuePercent=0; 
	private float totalDue=0;
        public Billing(float photobookprice) { 
		this.photobookprice = photobookprice; 
		totalDue = calculateOneBookPrice();
  }
	public Billing(float photobookprice, int photobooks) { 
		this(photobookprice);
                this.photobooks = photobooks;
                totalDue = calculateBooksPrice(); 
	}
        public Billing(float photobookprice, int photobooks, float couponValuePercent) {  
		this(photobookprice, photobooks);
                this.couponValuePercent = couponValuePercent;
                totalDue = calculateBooksPriceWithCoupon();
	}
	private float calculateOneBookPrice() {
		return photobookprice + (0.08f * photobookprice);
	}
	private float calculateBooksPrice() {
		return calculateOneBookPrice() * photobooks;
	}
	private float calculateBooksPriceWithCoupon() {
		return (calculateOneBookPrice() * photobooks) - couponValuePercent;
	}
	public static void main(String[] args) {
		Billing bill1 = new Billing(250);
		Billing bill2 = new Billing(250,4); 
		Billing bill3 = new Billing(250,12,2.5f);
		System.out.println(bill1.toString()); 
		System.out.println(bill2.toString()); 
		System.out.println(bill3.toString());
	}
	public float getTotalDue() { 
		return totalDue;
	}
	public float getPhotobookprice() {
		return photobookprice;
	}
	public void setPhotobookprice(float photobookprice) { 
		this.photobookprice = photobookprice;
	}
	public int getPhotobooks() { 
		return photobooks;
	}
	public void setPhotobooks(int photobooks) { 
		this.photobooks = photobooks;
	}
	public float getCouponValuePercent() { 
		return couponValuePercent;
	}
	public void setCouponValuePercent(float couponValuePercent) { 
		this.couponValuePercent = couponValuePercent;
	}
	public int getTaxpercent() {
		return taxpercent;
	}
	public String toString() {
		return "PhotoBookPrice=" + photobookprice + "\n" + " PhotoBooks="+ photobooks + "\n" + "CouponValuePercent=" + couponValuePercent + "\n" + "TotalDue="+ totalDue ;
} 
}
