package com.fis.loan.bean;

public class Loan {

		private long number;
		private String type;
		private double loan;
		private double emi;
		private long tenure;
		
		public Loan() {
			
		}
		
		public Loan(long number,String type,double balance) {
			super();
			this.number = number;
			this.type = type;
			this.loan = loan;
			this.emi = emi;
			this.tenure = tenure;
		}
		@Override
		public String toString() {
			return "Loan [number=" + number + ", type=" + type + ", loan=" + loan + ", emi=" + emi + ", tenure="
					+ tenure + "]";
		}
		public long getNumber() {
			return number;
		}
		public void setNumber(long number) {
			this.number = number;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public double getLoan() {
			return loan;
		}
		public void setLoan(double loan) {
			this.loan = loan;
		}
		public double getEmi() {
			return emi;
		}
		public void setEmi(double emi) {
			this.emi = emi;
		}
		public long getTenure() {
			return tenure;
		}
		public void setTenure(long tenure) {
			this.tenure = tenure;
		}

}
