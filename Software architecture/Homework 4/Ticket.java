import java.util.Date;

/**
 * Модель билета
 */

public class Ticket {

    private long id;
    private int place;
    private Date date;
    private int routeNumber;
    private int zoneStart;
    private int zoneStop;
    private int price;
    private boolean isValid;

    public Ticket(int id, int place, Date date, int routeNumber, int zoneStart, int zoneStop, int price,
            boolean isValid) {
        this.id = id;
        this.place = place;
        this.date = date;
        this.routeNumber = routeNumber;
        this.price = price;
        this.date = date;
        this.isValid = isValid;
    }

    public int getPlace() {
        return place;
    }

    public Date getDate() {
        return date;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setZoneStart(int zoneStart) {
        this.zoneStart = zoneStart;
    }

    public void setZoneStop(int zoneStop) {
        this.zoneStop = zoneStop;
    }

    public int getPrice() {
        return price;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

}
