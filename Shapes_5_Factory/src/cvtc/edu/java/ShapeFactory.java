package cvtc.edu.java;
 



import cvtc.edu.java.Interfaces.Dialog;
import cvtc.edu.java.Interfaces.Shape;
import cvtc.edu.java.models.Cuboid;
import cvtc.edu.java.models.Cylinder;
import cvtc.edu.java.ShapeType;
import cvtc.edu.java.models.Sphere;


public class ShapeFactory {

	private Dialog dialog;

	public Dialog getDialog() {
		return dialog;
	}

	public void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	
	public ShapeFactory(Dialog dialog) {
	
	}
	
	 public Shape make(ShapeType type){
	      if(type == null){
	         return null;
	      }		
	      if(type.equals(ShapeType.SPHERE)){
	         return new Sphere();
	         
	      } else if(type.equals(ShapeType.CYLINDER)){
	         return new Cylinder();
	         
	      } else if(type.equals(ShapeType.CUBOID)){
	         return new Cuboid();
	      }
	      
	      return null;
	   }
	
	
}
