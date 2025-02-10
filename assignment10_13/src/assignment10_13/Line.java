package assignment10_13;

/**
 * 線を表すクラス
 */
public class Line implements Figure {

	/**
	 * 線の始点を表すPoint型privateフィールド
	 */
	private Point p1;

	/**
	 * 線の終点を表すPoint型privateフィールド
	 */
	private Point p2;

	/**
	 * 引数なしコンストラクタの定義
	 * p1(x,y座標)、p2(x,y座標)全て0で初期化してLineオブジェクトを返す。
	 */
	public Line() {

		this(0, 0, 0, 0);
	}

	/**
	 * 引数で受け取ったデータを用いて、2つのPointオブジェクトを生成。
	 * p1フィールドとp2フィールドにそれぞれを代入してLineオブジェクトを返す。
	 * @param x1 int型の始点のx座標
	 * @param y1 int型の始点のy座標
	 * @param x2 int型の終点のx座標
	 * @param y2 int型の終点のy座標
	 */
	public Line(int x1, int y1, int x2, int y2) {

		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
	}

	/**
	 * 始点と終点の座標を標準出力する
	 */
	@Override
	public void draw() {

		System.out.println("[線を描画]始点(" + p1.getX() + "," + p1.getY() + ")から終点(" + p2.getX() + "," + p2.getY() + ")まで");
	}

	/**
	 * 線の長さを計算して返す。
	 * @return double型の２点間の距離
	 */
	@Override
	public double getPerimeter() {

		double deltaX = this.p1.getX() - this.p2.getX();
		double deltaY = this.p1.getY() - this.p2.getY();

		return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
	}

}
