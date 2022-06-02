package OODSoloProject.Model.Data;

import OODSoloProject.Model.Model.User;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class UserArrayListRepositoryTest {


    UserArrayListRepository userArrayListRepository;
    User user1;
    User user2;
    User user3;
    List<User> users;

    @BeforeEach
    void setUp() {
        user1 = new User();
        user1.setUserName("Fred");
        user1.setPassword("abc");
        user1.setUserId(UserArrayListRepository.generateId());

        user2 = new User();
        user2.setUserName("Jason");
        user2.setPassword("bcd");
        user2.setUserId(UserArrayListRepository.generateId());
        users = new ArrayList<>(Arrays.asList(user1, user2));


        user3 = new User();
        user3.setUserName("Alex");
        user3.setPassword("edf");
        user3.setUserId(UserArrayListRepository.generateId());

    }



    @Test
    void validateTest() {
        userArrayListRepository = new UserArrayListRepository(users);

        assertTrue(userArrayListRepository.validate("Fred", "abc"));
        assertFalse(userArrayListRepository.validate("Fred", "abd"));

    }


    @Test
    void findByUsernameTest() {
        userArrayListRepository = new UserArrayListRepository(users);
        assertEquals(user1, userArrayListRepository.findByUsername("Fred"));
        assertEquals(null, userArrayListRepository.findByUsername("Fred2"));
    }

    @Test
    void saveTest() {
        userArrayListRepository = new UserArrayListRepository(users);
        assertFalse(userArrayListRepository.validate("FredNew", "abc"));
        user1.setUserName("FredNew");
        user1.setUserId(UserArrayListRepository.generateId());
        User saveReturnedUser1 = userArrayListRepository.save(user1);
        assertEquals(saveReturnedUser1, user1);
        assertTrue(userArrayListRepository.validate("FredNew", "abc"));
        assertEquals(2, userArrayListRepository.getUsers().size());

        int newID = UserArrayListRepository.generateId();
        user3.setUserId(newID);
        User saveReturnedUser2 = userArrayListRepository.save(user3);
        assertEquals(user3, saveReturnedUser2);
        userArrayListRepository.validate("Alex", "edf");
        assertEquals(3, userArrayListRepository.getUsers().size());
    }

    @Test
    void removeTest() {
        userArrayListRepository = new UserArrayListRepository(users);
        userArrayListRepository.delete(user1);

        assertFalse(userArrayListRepository.validate(user1.getUserName(), user1.getPassword()));
        assertEquals(1, userArrayListRepository.getUsers().size());
    }

    @Test
    void generateIDTest() {
        int id = UserArrayListRepository.generateId();
        assertEquals(id + 1, UserArrayListRepository.generateId());
        assertEquals(id + 2, UserArrayListRepository.generateId());
        assertEquals(id + 3, UserArrayListRepository.generateId());
    }

    @Test
    void findByIdTest() {
        userArrayListRepository = new UserArrayListRepository(users);

        assertEquals(user1, userArrayListRepository.findBytId(user1.getUserId()));
        assertNotEquals(user2, userArrayListRepository.findBytId(user1.getUserId()));
        assertEquals(user2, userArrayListRepository.findBytId(user2.getUserId()));
        assertEquals(null, userArrayListRepository.findBytId(user3.getUserId()));
    }

    @Test
    void findAllTest() {
        userArrayListRepository = new UserArrayListRepository();
        assertEquals(null, userArrayListRepository.findAll());
        userArrayListRepository = new UserArrayListRepository(users);
        assertEquals(users, userArrayListRepository.findAll());
    }

}