package ejemplos.entornos;

/**
 *
 * @author Cristian Lobo Marrozos
 * @version 29-05-2019
 */
public class NumComplejo {
	private double pReal;
	private double pImaginaria;

    /**
     *
     */
    public NumComplejo(){

	}

    /**
     * Constructor.
     * @param pReal numero: parte real del numero.
     * @param pImaginaria numero: parte imaginaria del numero.
     */
    public NumComplejo(double pReal, double pImaginaria){
		this.pReal=pReal;
		this.pImaginaria=pImaginaria;
	}

    /**
     * Getter.
     * @return numero: parte real.
     */
    public double getpReal() {
		return pReal;
	}

    /**
     * Setter
     * @param pReal numero: numero que queremos introducir.
     */
    public void setpReal(double pReal) {
		this.pReal = pReal;
	}

    /**
     * Getter.
     * @return numero: parte imaginaria.
     */
    public double getpImaginaria() {
		return pImaginaria;
	}

    /**
     * Setter
     * @param pImaginaria numero: numero que queremos introducir.
     */
    public void setpImaginaria(double pImaginaria) {
		this.pImaginaria = pImaginaria;
	}

    /**
     * Suma dos numeros complejos
     * @param c1 numero: primer numero
     * @param c2 numero: segundo numero
     * @return resultado
     */
    public static NumComplejo sumarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		result.setpReal(c1.getpReal()+c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()+c2.getpImaginaria());

		return result;
	}

    /**
     * Resta dos numeros complejos
     * @param c1 numero: primer numero
     * @param c2 numero: segundo numero
     * @return resultado
     */
    public static NumComplejo restarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		result.setpReal(c1.getpReal()-c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()-c2.getpImaginaria());

		return result;
	}

    /**
     * Multiplica dos numeros complejos
     * @param c1 numero: primer numero
     * @param c2 numero: segundo numero
     * @return resultado
     */
    public static NumComplejo multiplicarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		double a=c1.getpReal();
		double b=c1.getpImaginaria();
		double c=c2.getpReal();
		double d=c2.getpImaginaria();

		result.setpReal((a*c)-(b*d));
		result.setpImaginaria((a*d)+(b*c));

		return result;
	}

    /**
     * Divide dos numero complejos
     * @param c1 numero: primer numero
     * @param c2 numero: segundo numero
     * @return resuldato
     */
    public  static NumComplejo dividirComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		double a=c1.getpReal();
		double b=c1.getpImaginaria();
		double c=c2.getpReal();
		double d=c2.getpImaginaria();

		double dividendoReal = (a*c)+(b*d);
		double dividendoImaginario = (b*c)-(a*d);
		double divisor = (Math.pow(c, 2)+Math.pow(d, 2));

		result.setpReal(dividendoReal/divisor);
		result.setpImaginaria(dividendoImaginario/divisor);

		return result;
	}

    /**
     * Realiza el modulo de un numero complejo
     * @param numComplejo numero: numero complejo
     * @return modulo
     */
    public static double modulo (NumComplejo numComplejo){
		double real =  numComplejo.getpReal();
		double imaginaria = numComplejo.getpImaginaria();

		return Math.sqrt(Math.pow(real, 2)+Math.pow(imaginaria, 2));
	}

	@Override
	public String toString(){
		
		String mostrar="";
		if (pReal!=0){
			mostrar+=pReal;
		}
		if (pImaginaria>=0){
			mostrar=mostrar+"+"+pImaginaria+"i";
		}else {
			mostrar=mostrar+"-"+(pImaginaria*(-1))+"i";
		}
		return mostrar;
	}
}
