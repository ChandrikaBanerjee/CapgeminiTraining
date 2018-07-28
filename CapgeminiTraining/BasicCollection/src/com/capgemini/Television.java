package com.capgemini;

public class Television {
	private String company;
	private String type;
	private boolean enable;
	private double price;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
//company,type,price defines equality
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", enable=" + enable + ", price=" + price + "]";
	}

	public String getCompany() {
		return company;
	}

	public String getType() {
		return type;
	}

	public boolean isEnable() {
		return enable;
	}

	public double getPrice() {
		return price;
	}

	public Television(String company, String type, boolean enable, double price) {

		this.company = company;
		this.type = type;
		this.enable = enable;
		this.price = price;
	}

}
