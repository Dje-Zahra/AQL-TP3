public class OrderService {
    private OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public boolean createOrder(Order order) {
        return (orderDao.saveOrder(order));
    }
}
