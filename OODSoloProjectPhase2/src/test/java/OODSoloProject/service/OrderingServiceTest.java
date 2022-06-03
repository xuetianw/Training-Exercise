package OODSoloProject.service;

import OODSoloProject.Data.BookRepository;
import OODSoloProject.Data.OrderRepository;
import OODSoloProject.Data.UserRepository;
import OODSoloProject.Model.Book;
import OODSoloProject.Model.Order;
import OODSoloProject.Model.User;
import OODSoloProject.customexception.ItemNotFoundException;
import OODSoloProject.customexception.UserNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderingServiceTest {
    OrderRepository mockOrderRepository;
    BookRepository mockBookRepository;
    UserRepository mockUserRepository;

    OrderingService orderingService;
    BookService bookService;
    AuthenticationService authenticationService;

    @BeforeEach
    void setUp() {
        mockOrderRepository = mock(OrderRepository.class);
        mockBookRepository = mock(BookRepository.class);
        mockUserRepository = mock(UserRepository.class);
        bookService = new BookService(mockBookRepository);
        authenticationService = new AuthenticationService(mockUserRepository);

        orderingService = new OrderingService(mockOrderRepository);
    }

    @Test
    void placeOrderTest() throws ItemNotFoundException, UserNotFoundException {
        Book book1 = new Book();
        book1.setItemId(1);

        User user1 = new User();
        user1.setUserId(1);

        Order expectedOrder = new Order(book1, user1, LocalDateTime.now());

        when(mockOrderRepository.save(any())).thenReturn(expectedOrder);

        Order returnedOrder = orderingService.placeOrder(book1, user1);

        verify(mockOrderRepository, times(1)).save(any());

        assertEquals(expectedOrder,returnedOrder);
    }

    @Test
    void placeOrdersTest() throws UserNotFoundException, ItemNotFoundException {
        Book book1 = new Book();
        Book book2 = new Book();

        List<Book> books = new ArrayList<>(Arrays.asList(book1, book2));

        User customer = new User();

        customer.setUserId(1);

        Order expectedOrder = new Order(book1, customer, LocalDateTime.now());
        List<Order> expectedOrders = new ArrayList<>(Arrays.asList(expectedOrder, expectedOrder));

        when(mockOrderRepository.save(any())).thenReturn(expectedOrder);

        List<Order> returnedOrders = orderingService.placeOrders(books, customer);

        verify(mockOrderRepository, times(2)).save(any());

        assertEquals(expectedOrders, returnedOrders);
    }

    @Test
    void getOrdersForSameUserTest() {
        Order order1 = new Order();
        Order order2 = new Order();

        User user = new User();
        user.setUserName("Fred");


        order1.setUser(user);
        order2.setUser(user);


        List<Order> orders = new ArrayList<>(Arrays.asList(order1, order2));

        when(mockOrderRepository.findAll()).thenReturn(orders);

        List<Order> returnedOrder = orderingService.getOrdersForUser(user);

        verify(mockOrderRepository, times(1)).findAll();

        assertEquals(orders, returnedOrder);
    }


    @Test
    void getOrdersForDifferentUserTest() {
        Order order1 = new Order();
        Order order2 = new Order();

        User user = new User();
        user.setUserName("Fred");
        User user2 = new User();
        user2.setUserName("Jason");


        order1.setUser(user);
        order2.setUser(user2);


        List<Order> orders = new ArrayList<>(Arrays.asList(order1, order2));

        List<Order> expectedOrders = new ArrayList<>(Arrays.asList(order1));


        when(mockOrderRepository.findAll()).thenReturn(orders);

        List<Order> returnedOrder = orderingService.getOrdersForUser(user);

        verify(mockOrderRepository, times(1)).findAll();

        assertEquals(expectedOrders, returnedOrder);
    }

    @Test
    void getOrdersForBookUsingSameBook() {
        Order order1 = new Order();
        Order order2 = new Order();


        Book book = new Book();
        order1.setBookOrdered(book);
        order2.setBookOrdered(book);

        List<Order> orders = new ArrayList<>(Arrays.asList(order1, order2));

        when(mockOrderRepository.findAll()).thenReturn(orders);

        List<Order> returnedOrders = orderingService.getOrdersForBook(book);

        verify(mockOrderRepository, times(1)).findAll();

        assertEquals(orders, returnedOrders);
    }



    @Test
    void getOrdersForBookwithUsingDifferentBooks() {
        Order order1 = new Order();
        Order order2 = new Order();


        Book book = new Book();
        Book book2 = new Book();
        book.setAuthor("Fred");
        book2.setTitle("Jason");

        order1.setBookOrdered(book);
        order2.setBookOrdered(book2);

        List<Order> orders = new ArrayList<>(Arrays.asList(order1, order2));

        List<Order> expectedOrders = new ArrayList<>(Arrays.asList(order1));


        when(mockOrderRepository.findAll()).thenReturn(orders);

        List<Order> returnedOrders = orderingService.getOrdersForBook(book);

        verify(mockOrderRepository, times(1)).findAll();

        assertEquals(expectedOrders, returnedOrders);
    }
}