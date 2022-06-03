package OODSoloProject.service;

import OODSoloProject.Data.OrderRepository;
import OODSoloProject.Model.Book;
import OODSoloProject.Model.Order;
import OODSoloProject.Model.User;
import OODSoloProject.customexception.ItemNotFoundException;
import OODSoloProject.customexception.UserNotFoundException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class OrderingService {
    private OrderRepository orderRepository;
//    private BookService bookService;
//    private AuthenticationService authenticationService;



    public OrderingService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    //3.a
    public Order placeOrder(Book book, User customer) throws ItemNotFoundException, UserNotFoundException {
//        bookService.findById(book.getItemId());
//        authenticationService.findById(customer.getUserId());

        Order order = new Order(book, customer, LocalDateTime.now());
        return orderRepository.save(order);
    }

    //3.b
    public List<Order> placeOrders(List<Book> books, User customer) throws ItemNotFoundException, UserNotFoundException  {
        //books.forEach(book -> bookService.findById(book.getItemId()));
//        for (Book book : books) {
//            bookService.findById(book.getItemId());
//        }
//        authenticationService.findById(customer.getUserId());
        List<Order> orders = new ArrayList<>();
        for (Book book : books) {
            Order newOrder = new Order(book, customer, LocalDateTime.now());
            orders.add(orderRepository.save(newOrder));
        }
//        books.forEach(book -> orders.add(new Order(1, book, customer, LocalDateTime.now())));
//        Order order = new Order(1, books, customer, LocalDateTime.now());
//        orderRepository.save(order);
        return orders;
    }

    //3.c
    List<Order> getOrdersForUser(User user) {
        List<Order> allOrder = orderRepository.findAll();
        return allOrder.stream().filter(order -> Objects.equals(order.getUser(), user)).collect(Collectors.toList());
    }
    //3.d
    List<Order> getOrdersForBook(Book book) {
        List<Order> allOrder = orderRepository.findAll();
        return allOrder.stream().filter(order -> Objects.equals(book, order.getBookOrdered())).collect(Collectors.toList());
    }
}
