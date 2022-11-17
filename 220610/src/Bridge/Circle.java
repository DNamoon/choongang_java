package Bridge;

public class Circle extends Shape{
		//필드  
		private int x, y, r;
		
		//생성자
		protected Circle(int x, int y, int r, DrawAPI da) {
			super(da);
			this.x = x;
			this.y = y;
			this.r = r;
		}
		
		//메서드
		@Override
		public void draw() {
			da.drawCircle(r, x, y);
			
		}

}
