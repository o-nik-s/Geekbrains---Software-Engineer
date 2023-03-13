//указывается наименование товара, страна, экспортирующая товар, и объем поставляемой партии в штуках

package geekbrains_course.Seminar_3.Task_1.model;
public class Items_Full {
    String itemName;
    String countryName;
    Integer value;
    public Items_Full() {
        this.itemName = "";
        this.countryName = "";
        this.value = 0;
    }
    public Items_Full(String itemName, String countryName, Integer value) {
        this.itemName = itemName;
        this.countryName = countryName;
        this.value = value;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public Integer getValue() {
        return value;
    }
    public void setValue(Integer value) {
        this.value = value;
    }
}