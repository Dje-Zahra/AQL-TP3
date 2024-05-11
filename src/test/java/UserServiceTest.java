import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @Test
    public void testGetUserById() {
        // Création d'un mock pour UserRepository
        UserRepository mockRepository = mock(UserRepository.class);

        // Création d'un utilisateur factice pour simuler le retour du UserRepository
        User fakeUser = new User(27,"Zahra");

        // Définition du comportement du mock lors de l'appel de la méthode findUserById avec un certain ID
        when(mockRepository.findUserById(27)).thenReturn(fakeUser);

        // Création de l'instance de UserService avec le mockRepository
        UserService userService = new UserService(mockRepository);

        // Appel de la méthode à tester
        User retrievedUser = userService.getUserById(27);

        // Vérification que la méthode findUserById du mockRepository est appelée avec le bon argument
        verify(mockRepository).findUserById(27);

        // Ajoutez ici d'autres assertions selon vos besoins
    }

}