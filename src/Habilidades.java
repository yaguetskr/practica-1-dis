
public class Habilidades {
	String tipo;
	String definicion;
	Habilidades(){
		
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDefinicion() {
		return definicion;
	}
	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}
	@Override
	public String toString() {
		return"\n\t\t\t<Habilidades>\n\t\t\t\t<Tipo>" +this.tipo +"</Tipo>\n\t\t\t\t<Definicion>"+this.definicion+"</Definicion>\n\t\t\t</Habilidades>\n";
	}
	
}
