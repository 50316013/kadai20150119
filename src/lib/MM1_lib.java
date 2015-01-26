package lib;


public class MM1_lib {
	
	private double lamda,mu,rho;
	

	public MM1_lib(double lamda, double mu) {
		this.lamda = lamda;
		this.mu = mu;  //ENbN¨Source¨Generate constructor...
		rho=lamda/mu;
		
		
	}	
      public Double getRho(){
    	  return rho;
      }      
      public Double getLength(){ //½Ïnàl
    	  return (rho/(1-rho));
      }
      public Double getQueue(){//½ÏÒ¿l
           return(Math.pow(rho,2)/(1-rho));
      }
      public double getTime(){ //½ÏnàÔ
    	  return(1/((1-rho)*mu));    			  
      }      
      public double getWtime(){//½ÏÒ¿Ô
           return(rho/((1-rho)*mu));
      } 
      
}

