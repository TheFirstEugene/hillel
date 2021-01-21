package POJO;

import java.util.Date;
//неизменяемый заказ

public class Order {
    private long id;
    private Date date;
    private long customerId;
    private String adress;

    public Order() {
    }                                                  // создал пустой для удобства

    public Order(long id, long customerId, String adress, Date date) {
        this.id = id;
        this.date = new Date(date.getTime());
        this.customerId = customerId;
        this.adress = adress;
    }

    public long getId() {
        return id;
    }

    public Date getDate() {
        return new Date(this.date.getTime());
    }

    public long getCustomerId() {
        return customerId;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return "Order{" +
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

        Order order = (Order) o;

        if (id != order.id) return false;
        if (customerId != order.customerId) return false;
        if (!date.equals(order.date)) return false;
        return adress.equals(order.adress);
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