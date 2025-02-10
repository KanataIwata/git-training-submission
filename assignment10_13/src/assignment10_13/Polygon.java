	package assignment10_13;

/**
 * 多角形クラスの共通機能３つを定義する
 * 図形描画機能
 * 長さ測定機能
 * 内角の和測定機能
 */
public abstract class Polygon extends Shape {

	/**
	 * 内角(辺)の数を表すprotectedフィールド
	 */
	protected int angle;

	/**
	 * 図形描画機能の定義する抽象メソッド
	 */
	@Override
	public abstract void draw();

	/**
	 * 長さ測定機能の定義する抽象メソッド
	 */
	@Override
	public abstract double getPerimeter();

	/**
	 * angleフィールドを使い、内角の和を算出する具象メソッド
	 * @return int型の算出された内角の和
	 * @throws IllegalStateException angleが3未満の場合(多角形として成立しない為）
	 */
	public int getInternalAngle() {

		if (this.angle < 3) {
			throw new IllegalStateException("Polygon.getInternalAngle():角の数が3未満の場合、多角形として成立しません:" + this.angle);
		}

		return (this.angle - 2) * 180;
	}
}
