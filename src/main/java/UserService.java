public class UserService {
    private UserRepository userRepository;

    // Injection de dépendance du UserRepository via le constructeur
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(long id) {
        return userRepository.findUserById(id);
    }
}