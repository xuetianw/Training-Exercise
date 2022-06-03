package OODSoloProject.service;


import OODSoloProject.Data.UserRepository;
import OODSoloProject.Model.User;
import OODSoloProject.customexception.UserNotFoundException;

public class AuthenticationService {
    private UserRepository userRepository;

    public AuthenticationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //1.a
    public User authenticate(String username, String password) throws UserNotFoundException {
        if (userRepository.validate(username, password)) {
            return userRepository.findByUsername(username);
        }
        throw new UserNotFoundException("user :" + username + ": not found");
    }


    /*
    1.b
    b.findById(..): method finds a User by ID using the UserRepository findById method. It should throw a
    UserNotFoundException if the ID does not belong to a user in the DB.
     */
    public User findById(int id) throws UserNotFoundException {
        User returnedUser = userRepository.findById(id);
        if (returnedUser == null) {
            throw new UserNotFoundException("user :" + id + ": not found");
        }
        return returnedUser;
    }

}
