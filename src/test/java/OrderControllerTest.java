import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {

    @Test
    public void testCreateOrder() {
        // Create mocks for OrderService and OrderDao
        OrderService orderService = mock(OrderService.class);
        OrderDao orderDao = mock(OrderDao.class);

        // Create an instance of OrderController with mocks injected
        OrderController orderController = new OrderController(orderService);

        // Create a sample Order object
        Order order = new Order(200006);

        // Call the method under test
        orderController.createOrder(order);

        // Verify that OrderService.createOrder is called with the correct argument
        verify(orderService).createOrder(order);

        // Verify that OrderDao.saveOrder is called with the correct argument
        verify(orderDao).saveOrder(order);
    }

    }