package assignment10_13;

/**
 * ３つの座標データを指定することで、三角形を描画するクラス
 */
public class Triangle extends Polygon {

	/**
	 * 三角形の点1を表すPoint型privateフィールド
	 */
	private Point p1;

	/**
	 * 三角形の点2を表すPoint型privateフィールド
	 */
	private Point p2;

	/**
	 * 三角形の点3を表すPoint型privateフィールド
	 */
	private Point p3;

	/**
	 * コンストラクタ
	 * 引数で受け取ったデータを用いて、3つのPointオブジェクトを生成。
	 * p1フィールド、p2フィールド、p3フィールドにそれぞれを代入する。
	 * スーパークラス内で定義されているangleフィールドに3を代入する。
	 * @param x1 p1フィールドに代入するPoint型変数のint型x座標
	 * @param y1 p1フィールドに代入するPoint型変数のint型y座標
	 * @param x2 p2フィールドに代入するPoint型変数のint型x座標
	 * @param y2 p2フィールドに代入するPoint型変数のint型y座標
	 * @param x3 p3フィールドに代入するPoint型変数のint型x座標
	 * @param y3 p3フィールドに代入するPoint型変数のint型y座標
	 */
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {

		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);

		this.angle = 3;
	}

	/**
	 * 三角形の３点の座標を標準出力する
	 */
	@Override
	public void draw() {

		System.out.println("[三角形を描写]点1(" + this.p1.getX() + "," + this.p1.getY() + ")から点2(" + this.p2.getX() + ","
				+ this.p2.getY() + ")、点3(" + this.p3.getX() + "," + this.p3.getY() + ")の三角形");
	}

	/**
	 * 三角形の周長を計算して返す。
	 * @return double型の周長
	 */
	@Override
	public double getPerimeter() {

		Line side1 = new Line(this.p1.getX(), this.p1.getY(), this.p2.getX(), this.p2.getY());
		Line side2 = new Line(this.p2.getX(), this.p2.getY(), this.p3.getX(), this.p3.getY());
		Line side3 = new Line(this.p3.getX(), this.p3.getY(), this.p1.getX(), this.p1.getY());

		return side1.getPerimeter() + side2.getPerimeter() + side3.getPerimeter();
	}

}
