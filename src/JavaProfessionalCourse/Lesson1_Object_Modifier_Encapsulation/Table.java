package JavaProfessionalCourse.Lesson1_Object_Modifier_Encapsulation;

public class Table {
    private String color;
    private String brand;
    private String model;
    private int producingYear;
    private boolean canColorWithAquarel;

    public Table(String color, String brand, String model, int producingYear) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.producingYear = producingYear;
        if (this.producingYear <=2015) {
            this.canColorWithAquarel = true;
        }
    }

    public Table(String brand, String model, int producingYear) {
        this.brand = brand;
        this.model = model;
        this.producingYear = producingYear;
        if (this.producingYear <=2015) {
            this.canColorWithAquarel = true;
        }
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProducingYear() {
        return producingYear;
    }

    public void setColor(String color) {
        if(!canColorWithAquarel && color.endsWith("aquarel")) {
            return;
          }
        this.color = color;
    }

    @Override
    public String toString() {
        return "Table{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", producingYear=" + producingYear +
                '}';
    }
}
