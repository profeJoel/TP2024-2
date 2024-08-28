
public class Rut {
    int run;
    String dv;

    Rut(int run, String dv){
        this.run = run;
        this.dv = dv;
        if(this.validar())
            System.out.println("Rut validado");
        else
            System.out.println("Rut invalidado");
    }

    boolean validar(){
        int M=0,S=1,T=this.run;
		for (;T!=0;T=(int) Math.floor(T/=10))
			S=(S+T%10*(9-M++%6))%11;
        String dv;
        if(S > 0)
            dv = String.valueOf(S-1);
        else
            dv = "k";
        System.out.println(">" + dv);
        
        if(this.dv.equals(dv)) 
            return true;
        else
            return false;
    }

    public String toString(){
        return this.run + "-" + this.dv;
    }
}
