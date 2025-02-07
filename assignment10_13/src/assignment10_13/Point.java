package assignment10_13;

/**
 * 座標位置情報を表すクラス
 */
public class Point {

	private int x;
	private int y;

	/**
	 * 引数なしコンストラクタの定義
	 * x座標とy座標を0で初期化する。
	 */
	public Point() {

		this(0, 0);
	}

	/**
	 * x座標とy座標を受け取りその値で初期化するコンストラクタの定義
	 * @param x 初期化するint型のx座標の値
	 * @param y 初期化するint型のy座標の値
	 */
	public Point(int x, int y) {

		this.x = x;
		this.y = y;
	}

	/**
	 * xフィールドの値を返すメソッド
	 * @return int型のxフィールドの値
	 */
	public int getX() {

		return this.x;
	}

	/**
	 * 	引数で渡された値を、xフィールドにセットするメソッド
	 * @param x セットするint型のx座標の値
	 */
	public void setX(int x) {

		this.x = x;
	}

	/**
	 * yフィールドの値を返すメソッド
	 * @return int型のyフィールドの値
	 */
	public int getY() {

		return this.y;
	}

	/**
	 * 引数で渡された値を、yフィールドにセットするメソッド
	 * @param y セットするint型のy座標の値
	 */
	public void setY(int y) {

		this.y = y;
	}
}
