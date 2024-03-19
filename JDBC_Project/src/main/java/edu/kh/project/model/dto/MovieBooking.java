package edu.kh.project.model.dto;

public class MovieBooking {
	private  String name;
	private  int price;
	private  int ratings;
	private  int sr_no;

	
	public MovieBooking() {
		// TODO Auto-generated constructor stub
	}
	
	
	public MovieBooking(String name, int price, int ratings,int sr_no) {
		super();
		this.name = name;
		this.price = price;
		this.ratings = ratings;
		this.sr_no = sr_no;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getRatings() {
		return ratings;
	}


	public void setRatings(int ratings) {
		this.ratings = ratings;
	}


	public int getSr_no() {
		return sr_no;
	}


	public void setSr_no(int sr_no) {
		this.sr_no = sr_no;
	}


	@Override
	public String toString() {
		return "MovieBooking [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
