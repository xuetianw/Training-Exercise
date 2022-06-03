package OODSoloProject.service;

import OODSoloProject.Data.UserRepository;
import OODSoloProject.Model.User;
import OODSoloProject.customexception.UserNotFoundException;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AuthenticationServiceTest {

    UserRepository mockUserRepository;
    AuthenticationService authenticationService;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        mockUserRepository = mock(UserRepository.class);
        authenticationService = new AuthenticationService(mockUserRepository);
    }

    @Test
    public void authenticateWithCorrectInfo() throws UserNotFoundException {
        User user = new User();
        user.setUserName("Fred");
        user.setPassword("abc");

        when(mockUserRepository.validate(user.getUserName(), user.getPassword())).thenReturn(true);
        when(mockUserRepository.findByUsername(user.getUserName())).thenReturn(user);

        User returnedUser = authenticationService.authenticate(user.getUserName(), user.getPassword());

        verify(mockUserRepository, times(1)).validate(user.getUserName(), user.getPassword());
        assertEquals(user, returnedUser);
    }


    @Test
    public void authenticatePersonWrongInfoTest() throws UserNotFoundException {
        User user = new User();
        user.setUserName("Fred");
        user.setPassword("abc");

        when(mockUserRepository.validate("Wrong name", user.getPassword())).thenReturn(false);

        assertThrows(UserNotFoundException.class, () -> authenticationService.authenticate("Wrong name", user.getPassword()));

        verify(mockUserRepository, times(1)).validate("Wrong name", user.getPassword());
    }


    @Test
    public void findByIdWithCorrectIDTest() throws UserNotFoundException {
        User user = new User();
        user.setUserName("Fred");
        user.setPassword("abc");
        user.setUserId(1);


        when(mockUserRepository.findById(user.getUserId())).thenReturn(user);

        User returnedUser = authenticationService.findById(user.getUserId());

        verify(mockUserRepository, times(1)).findById(user.getUserId());

        assertEquals(returnedUser, user);

        assertThrows(UserNotFoundException.class, () -> authenticationService.findById(2));
    }


    @Test
    public void findByIdWithWrongIDTest() throws UserNotFoundException {

        when(mockUserRepository.findById(2)).thenReturn(null);

        assertThrows(UserNotFoundException.class, () -> authenticationService.findById(2));

        verify(mockUserRepository, times(1)).findById(2);
    }
}