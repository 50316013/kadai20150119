package lib;

public class MMS_lib {
	private double lamda,mu,rho,alpha;
	private int s,r;
	 
	public MMS_lib(double lamda,double mu , int s, int r){
	 this.lamda=lamda;
	 this.mu=mu;
	 this.alpha=lamda/mu;
	 this.rho=this.alpha/s;
	 this.s=s;
	 this.r=r;
	 
	}
	 public int getFactrial(int s){
		 //s!を求める関数
		 int f =1;//fは階乗の値。1で初期化
		 for(int i=s ; i>=1 ; i--){
	      if(i==0){
	    	  f*=1;
	      }else{
	    	   f*=i;
	         
	           }
	     
		  }
		 return f;
		 
		 
	 }
	 
	 public double getP0(){
		  double p0=0,p01=0,p02=0;
		  for(int k=0;k<this.s;k++){
			 p01 += Math.pow(this.alpha, k)/this.getFactrial(k);  
		  }
		  
		     p02=Math.pow(this.alpha, this.s)/getFactrial(this.s)/(1-this.rho);
	       p0=1/(p01+p02);
	       return p0;
	 
	 }
	 
	 public double getLq(){
		  double lq;
		  lq=Math.pow(this.s, this.s)*Math.pow(this.rho,this.s+1)*getP0()/getFactrial(this.s)/Math.pow(1-this.rho, 2);
		  return lq;
	 }
	 
	 public double getL(){
		 //平均系内人数
          double l;
          l=getLq()+this.alpha;
          return l;
	 }
	 
	 public double getWq(){
		 //平均待ち時間
		 double wq;
		 wq=getLq()/this.lamda;
		 return wq;
	 }
	 
	 public double getW(){
		 //平均系内時間
		 double w;
		 w=getWq()+1/this.mu;
		 return w;
	 }
	 
		
	 public int getConbination(int s,int r){
		  //sCrを求める関数
		int c=1;
		c=getFactrial(s)/getFactrial(r)/getFactrial(s-r);
		return c;
	 }			
		 
		 }
		 
		 
		 
		 
	 


