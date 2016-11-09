
public class Rectangulo  extends FiguraGeometrica{
	private double base;
	double altura;
	
	Rectangulo(String color,double base,double altura)
	{
		super(color);
		this.altura=altura;
		this.base=base;
		
				
	}
	
	double getBase()
	{
		return base;
	}
	double getAltura()
	{
		return altura;
	}
	void setBase(double base)
	{
		this.base=base;
	}
	void setAltura(double altura)
	{
		this.altura=altura;
	}
	double getArea()
	{
		return base*altura;
	}

}
