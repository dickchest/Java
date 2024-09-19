package book_designPatterns._3_Decorator.starbuzz;
 
public class Whip extends CondimentDecorator {
	private final Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}