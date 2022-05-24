package fdm.controller;

import fdm.model.Validator;
import fdm.view.View;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LoginControllerTest3 {

    LoginController loginController;
    View mockView;
    Validator mockValidator;

    @BeforeEach
    void setUp() {
        mockValidator = mock(Validator.class);
        mockView = mock(View.class);
        loginController = new LoginController(mockView, mockValidator);
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void test1_handleCallsgetUserInput() {
        //act
        loginController.handle();
        //assert
        verify(mockView, times(1)).getUserInput();
    }

    @Test
    void test2_handleCallsValidate() {
        loginController.handle();

        verify(mockValidator, times(1)).validate(null);

    }

    @Test
    void test3_handleCallsValidateWithStringReturnedFromGetuserInput() {
        String dummy_str = "str";
        when(mockView.getUserInput()).thenReturn(dummy_str);

        loginController.handle();

        verify(mockView,times(1)).getUserInput();
        verify(mockValidator, times(1)).validate(dummy_str);
    }

    @Test
    void test4_handleMethodReturnsTrueWhenValidateReturnsTrue() {
        when(mockValidator.validate(null)).thenReturn(true);//stub

        boolean res = loginController.handle();//act

        //verify
        assertEquals(true, res);
    }

    @Test
    void test5_handleMethodReturnsTrueWhenValidateReturnsFalse() {
        //stub
        when(mockValidator.validate(null)).thenReturn(false);

        //act
        boolean returning_res = loginController.handle();

        //verity
        assertEquals(false, returning_res);
    }
}