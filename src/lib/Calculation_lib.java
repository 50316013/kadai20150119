package lib;

public class Calculation_lib {

		// TODO Auto-generated method stub
		private double m,n;

		public Calculation_lib(double m, double n) {
			super();
			this.m = m;
			this.n = n;
		}
                public double getPlus(){
                             return m+n;
                }
                public double getMinus(){
                           return m-n;
                }
		public double getMultiple(){
			return m * n;
		}
		public double getDivide(){
			return m / n;
		}
		

	}
