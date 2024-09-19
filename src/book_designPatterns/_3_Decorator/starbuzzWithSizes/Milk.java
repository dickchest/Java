package book_designPatterns._3_Decorator.starbuzzWithSizes;

public class Milk extends CondimentDecorator {
	private final Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
