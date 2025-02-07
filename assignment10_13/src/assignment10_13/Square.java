package assignment10_13;

/**
 * 1つの位置座標と幅を指定することで、正方形を描画するクラス
 */
public class Square extends Rectangle {

	/**
	 * 位置座標と一辺の長さを指定して正方形を作成するコンストラクタ
	 * @param x pフィールドに代入するPoint型変数のint型x座標
	 * @param y pフィールドに代入するPoint型変数のint型y座標
	 * @oaram width int型の正方形の一辺の長さ
	 */
	public Square(int x, int y, int width) {

		super(x, y, width, width);
	}

	/**
	 * 正方形の基準点の座標と幅を標準出力する。
	 */
	@Override
	public void draw() {

		System.out.println("[正方形を描画]点(" + this.p.getX() + "," + this.p.getY() + ")を基準として幅・高さ" + this.width + "の正方形");
	}
}
