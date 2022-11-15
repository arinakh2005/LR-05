import org.junit.jupiter.api.Test;
import task17.Notation;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task17Test {
    @Test
    void setEmptyNameFieldIfInvalid() {
        Notation notation = new Notation("Alice1", "Alison2022", "+3807311519872", "alison@gmail.com", 123456789);
        String expectedName = "";

        assertEquals(expectedName, notation.getName());
    }

    @Test
    void setCorrectName() {
        Notation notation = new Notation("Alice", "Alison2022", "0731151987", "alison@gmail.com", 123456789);
        String expectedName = "Alice";

        assertEquals(expectedName, notation.getName());
    }


    @Test
    void setEmptyNicknameFieldIfInvalid() {
        Notation notation = new Notation("Alice", "Alison2022*", "+3807311519872", "alison@gmail.com", 123456789);
        String expectedNickname = "";

        assertEquals(expectedNickname, notation.getNickname());
    }

    @Test
    void setCorrectNickname() {
        Notation notation = new Notation("Alice", "Alison2022", "0731151987", "alison@gmail.com", 123456789);
        String expectedNickname = "Alison2022";

        assertEquals(expectedNickname, notation.getNickname());
    }

    @Test
    void setEmptyEmailFieldIfInvalid() {
        Notation notation = new Notation("Alice", "Alison2022", "0731151987", "alison.gmail.com", 123456789);
        String expectedEmail = "";

        assertEquals(expectedEmail, notation.getEmail());
    }

    @Test
    void setCorrectEmail() {
        Notation notation = new Notation("Alice", "Alison2022", "0731151987", "alison@gmail.com", 123456789);
        String expectedEmail = "alison@gmail.com";

        assertEquals(expectedEmail, notation.getEmail());
    }

    @Test
    void setEmptyPhoneFieldIfInvalid() {
        Notation notation = new Notation("Alice", "Alison2022", "+3807311519872", "alison@gmail.com", 123456789);
        String expectedPhone = "";

        assertEquals(expectedPhone, notation.getPhone());
    }

    @Test
    void setCorrectPhone() {
        Notation notation = new Notation("Alice", "Alison2022", "0731151987", "alison@gmail.com", 123456789);
        String expectedPhone = "0731151987";

        assertEquals(expectedPhone, notation.getPhone());
    }

    @Test
    void setEmptyISQFieldIfInvalid() {
        Notation notation = new Notation("Alice1", "Alison2022", "+3807311519872", "alison@gmail.com", 1234567890);
        int expectedISQ = 0;

        assertEquals(expectedISQ, notation.getISQ());
    }

    @Test
    void setCorrectISQ() {
        Notation notation = new Notation("Alice", "Alison2022", "0731151987", "alison@gmail.com", 123456789);
        int expectedISQ = 123456789;

        assertEquals(expectedISQ, notation.getISQ());
    }
}
