package lib;


public class MM1_lib {
	
	private double lamda,mu,rho;
	

	public MM1_lib(double lamda, double mu) {
		this.lamda = lamda;
		this.mu = mu;  //�E�N���b�N��Source��Generate constructor...
		rho=lamda/mu;
		
		
	}	
      public Double getRho(){
    	  return rho;
      }      
      public Double getLength(){ //���όn���l��
    	  return (rho/(1-rho));
      }
      public Double getQueue(){//���ϑ҂��l��
           return(Math.pow(rho,2)/(1-rho));
      }
      public double getTime(){ //���όn������
    	  return(1/((1-rho)*mu));    			  
      }      
      public double getWtime(){//���ϑ҂�����
           return(rho/((1-rho)*mu));
      } 
      
}

