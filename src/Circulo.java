
public class Circulo extends FiguraGeometrica {
private double radio;


  Circulo (String color,double radio)
 
  {
	super(color);
	this.radio=radio;
	  
  }
  
  double getRadio()
  {
	  return radio;
  }
   void setRadio(double radio)
   {
	   this.radio=radio;
   }
   
   double getArea()
   {
	  return Math.PI*radio;
   }

}
