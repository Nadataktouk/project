package service;


public class CalculatriceWS {
	 
	    public double somme(double a,double b) {
	    	double res=0;
	    			res= a+b;
	    	 return res;
	    }
	    @webService(name="CalculatriceWS ")
	    public class CalculService{
	    	@webMethod(operationName="somme")
	    	public double somme (double a,double b) {
	    		double res =0;
	    		res= a+b;
		    	 return res;
		    }
	    	}
	    public int somme(@WebParam(name="a")int a,@WebParam(name="b")int b){
	    	return a+b;
	    }
	    
	}



