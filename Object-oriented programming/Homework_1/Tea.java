package geekbrains_course.Homework_1;

public class Tea extends HotDrink{
    private Integer temperature;

    public Tea(String name, double volume, Integer temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

}
