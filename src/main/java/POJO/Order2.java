package POJO;
import java.util.Date;
//изменяемый  заказ

public class Order2 {
     long id;                // номер заказа
     Date date;
     long customerId;      // номер телефона клиента(или любой другой идентификатор)
     String adress;

     public Order2(){ }     // тоже для удобства
     public Order2(long id, String adress, long customerId, Date date) {
        this.id = id;
        this.date = date;
        this.customerId = customerId;
        this.adress = adress; }

    public long getId() {
        return id; }

    public void setId(long id) {
        this.id = id; }

    public Date getDate() {
        return date; }

    public void setDate(Date date) {
        this.date = date; }

    public long getCustomerId() {
        return customerId; }

    public void setCustomerId(long customerId) {
        this.customerId = customerId; }

    public String getAdress() {
        return adress; }

    public void setAdress(String adress) {
        this.adress = adress; }

    @Override
    public String toString() {
        return "Order2{" +
                "id=" + id +
                ", date=" + date +
                ", customerId=" + customerId +
                ", adress='" + adress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order2 order2 = (Order2) o;

        if (id != order2.id) return false;
        if (customerId != order2.customerId) return false;
        if (!date.equals(order2.date)) return false;
        return adress.equals(order2.adress);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + date.hashCode();
        result = 31 * result + (int) (customerId ^ (customerId >>> 32));
        result = 31 * result + adress.hashCode();
        return result;
    }
}
