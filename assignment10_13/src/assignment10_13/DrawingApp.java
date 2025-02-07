package assignment10_13;

/**
 * テスト用の実行クラス
 */

public class DrawingApp {

	/**
	 * アプリケーションのエントリポイント
	 * 各図形クラスのインスタンスを生成し、描画と周長計算をテストする。
	 * @param args String[]型
	 */
	public static void main(String[] args) {

		//各図形のインスタンスを生成
		Line line = new Line(0, 0, 100, 100);
		Circle circle = new Circle(50, 50, 30);
		Triangle triangle = new Triangle(0, 0, 100, 100, 0, 200);
		Rectangle rectangle = new Rectangle(0, 0, 100, 50);
		Square square = new Square(0, 0, 200);

		//描画メソッドのテスト
		System.out.println("=====図形の描画テスト=====");
		line.draw();
		circle.draw();
		triangle.draw();
		rectangle.draw();
		square.draw();

		//周長計算のテスト
		System.out.println("\n=====周長計算テスト=====");
		System.out.println("線の長さ;" + line.getPerimeter());
		System.out.println("円の円周;" + circle.getPerimeter());
		System.out.println("三角形の周長;" + triangle.getPerimeter());
		System.out.println("長方形の周長;" + rectangle.getPerimeter());
		System.out.println("正方形の周長:" + square.getPerimeter());

		//多角形の内角の和のテスト
		System.out.println("\n=====内角の和テスト=====");
		System.out.println("三角形の内角の和:" + triangle.getInternalAngle());
		System.out.println("長方形の内角の和:" + rectangle.getInternalAngle());
		System.out.println("正方形の内角の和:" + square.getInternalAngle());
	}

}
