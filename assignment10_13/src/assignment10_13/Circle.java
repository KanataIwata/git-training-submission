package assignment10_13;

/**
 * 中心座標と半径を指定することで、円を描画するクラス
 */
public class Circle extends Shape {

	/**
	 * 円の中心を表すPoint型privateフィールド
	 */
	private Point center;

	/**
	 * 円の半径を表すint型privateフィールド
	 */
	private int radius;

	/**
	 * 引数なしコンストラクタの定義
	 * centerのx,y座標と半径を全て0で初期化
	 */
	public Circle() {

		this(0, 0, 0);
	}

	/**
	 * 引数ありコンストラクタ
	 * 引数x,yで受け取ったデータを用いて、1つのPointオブジェクトを生成し、centerフィールドに代入する。
	 * 引数rもradiusフィールドに代入する。
	 * @param x centerフィールドのx座標に代入するint型の座標値
	 * @param y centerフィールドのy座標に代入するint型の座標値
	 * @param r radiusフィールドに代入するint型の円の半径
	 */
	public Circle(int x, int y, int r) {

		this.center = new Point(x, y);
		this.radius = r;
	}

	/**
	 * 円の中心座標と半径を標準出力する
	 */
	@Override
	public void draw() {

		System.out.println("[円を描画]中心点(" + this.center.getX() + "," + this.center.getY() + ")から半径" + this.radius);
	}

	/**
	 * 円周の長さを計算して返す。
	 * @return double型の円周の長さ
	 */
	@Override
	public double getPerimeter() {

		return this.radius * 2 * Math.PI;
	}

}
