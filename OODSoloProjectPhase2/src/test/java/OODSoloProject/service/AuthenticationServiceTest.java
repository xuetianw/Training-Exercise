package OODSoloProject.service;

import OODSoloProject.Data.UserRepository;
import OODSoloProject.Model.User;
import OODSoloProject.customexception.UserNotFoundException;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
    public void authenticateTest() throws UserNotFoundException {
        User user = new User();
        user.setUserName("Fred");
        user.setPassword("abc");

        when(mockUserRepository.validate(user.getUserName(), user.getPassword())).thenReturn(true);
        when(mockUserRepository.findByUsername(user.getUserName())).thenReturn(user);

        User returnedUser = authenticationService.authenticate(user.getUserName(), user.getPassword());

        verify(mockUserRepository, times(1)).validate(user.getUserName(), user.getPassword());
        assertEquals(user, returnedUser);

        assertThrows(UserNotFoundException.class, () -> authenticationService.authenticate("Wrong name", user.getPassword()));
    }


    @Test
    public void findByIdTest() throws UserNotFoundException {
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
}