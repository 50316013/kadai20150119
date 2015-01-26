package lib;


public class MM1_lib {
	
	private double lamda,mu,rho;
	

	public MM1_lib(double lamda, double mu) {
		this.lamda = lamda;
		this.mu = mu;  //右クリック→Source→Generate constructor...
		rho=lamda/mu;
		
		
	}	
      public Double getRho(){
    	  return rho;
      }      
      public Double getLength(){ //平均系内人数
    	  return (rho/(1-rho));
      }
      public Double getQueue(){//平均待ち人数
           return(Math.pow(rho,2)/(1-rho));
      }
      public double getTime(){ //平均系内時間
    	  return(1/((1-rho)*mu));    			  
      }      
      public double getWtime(){//平均待ち時間
           return(rho/((1-rho)*mu));
      } 
      
}

