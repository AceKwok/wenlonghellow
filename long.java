public class DrawApp {
      public static void main(String[] args) {
		  Draw d=new Draw();
		  Circle circle=new Circle("yuan");
		  Square square=new Square("zheng");
		  d.draw(square);
		  d.draw(circle);
	}
}
