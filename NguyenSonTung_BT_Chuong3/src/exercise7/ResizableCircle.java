package exercise7;

import java.util.Scanner;

public class ResizableCircle extends Circle implements IReszable  {
	public ResizableCircle(double radius) {
		super(radius);
	}

	@Override
	public void resize(int percent) {
		this.radius += percent;
	}
	
	
	
	
	
}
