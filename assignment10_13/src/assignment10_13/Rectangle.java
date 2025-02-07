package assignment10_13;

/**
 * 1つの位置座標と幅、長さを指定することで、長方形(矩形)を描画するクラス
 */
public class Rectangle extends Polygon {

	/**
	 * 長方形の基準の位置を表すPoint型のprotectedフィールド
	 */
	protected Point p;

	/**
	 * 長方形の横幅を表すint型のprotectedフィールド
	 */
	protected int width;

	/**
	 * 長方形の縦幅を表すint型のprotectedフィールド
	 */
	protected int height;

	/**
	 * コンストラクタ
	 * 第1引数と第2引数で受け取った座標データを用いて、1つのPointオブジェクトを生成し、pフィールドに代入する。
	 * 第3引数と第4引数をそれぞれwidthフィールド、heightフィールドに代入する。
	 * スーパークラス内で定義されているangleフィールドに4を代入する。
	 * @param x pフィールドに代入するPointオブジェクトのint型x座標
	 * @param y pフィールドに代入するPointオブジェクトのint型y座標
	 * @param width widthフィールドに代入するint型の長方形の横幅
	 * @param height heightフィールドに代入するint型の長方形の縦幅
	 */
	public Rectangle(int x, int y, int width, int height) {

		this.p = new Point(x, y);

		this.width = width;
		this.height = height;

		this.angle = 4;
	}

	/**
	 * 長方形の基準点の座標と幅、長さを標準出力する。
	 */
	@Override
	public void draw() {

		System.out.println("[長方形(矩形)を描写]点(" + this.p.getX() + "," + this.p.getY() + ")を基準として幅" + this.width + "、高さ"
				+ this.height + "の長方形");
	}

	/**
	 * 長方形の周長を計算して返す。
	 * @return double型の周長
	 */
	@Override
	public double getPerimeter() {

		return (this.width + this.height) * 2;
	}

}
