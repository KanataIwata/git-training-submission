package assignment10_13;

/**
 * 形抽象クラス
 */

public abstract class Shape implements Figure {

	/**
	 * 図形描画機能抽象メソッド
	 */
	public abstract void draw();

	/**
	 * 長さ測定機能抽象メソッド
	 */
	public abstract double getPerimeter();

}
