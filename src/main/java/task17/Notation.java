package task17;
import java.util.Objects;

/**
 * The class <strong>Notation</strong> serves for store the following data:
 * <b>name</b>, <b>nickname</b>, <b>phone</b>, <b>email</b>, <b>ISQ</b>,
 * @author Arina Kholodnytska
 * @version 1.0
 */

public class Notation implements INotation {
    private String name;
    private String nickname;
    private String phone;
    private String email;
    private int ISQ;

    /**
     * Class constructor. Creates a Notation record with the specified values
     * @param name     the name
     * @param nickname the nickname
     * @param phone    the mobile phone
     * @param email    the email address
     * @param ISQ      the ISQ (Information Security Quotient)
     */
    public Notation(String name, String nickname, String phone, String email, int ISQ) {
        this.name = isCorrectName(name) ? name : "";
        this.nickname = isCorrectNickname(nickname) ? nickname : "";
        this.phone = isCorrectPhone(phone) ? phone : "";
        this.email = isCorrectEmail(email) ? email: "";
        this.ISQ = isCorrectISQ(ISQ) ? ISQ : 0;
    }

    /**
     * Get the {@link Notation name}
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set {@link Notation name}
     * @param name the name
     */
    public void setName(String name) {
        if (isCorrectName(name)) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
            this.name = "";
        }
    }

    /**
     * Get the {@link Notation nickname}
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Set the {@link Notation nickname}
     * @param nickname the nickname
     */
    public void setNickname(String nickname) {
        if (isCorrectNickname(nickname)) {
            this.nickname = nickname;
        } else {
            System.out.println("Invalid nickname");
            this.nickname = "";
        }
    }

    /**
     * Get the mobile {@link Notation phone}.
     * @return the mobile phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set the mobile phone
     * @param phone the mobile phone
     */
    public void setPhone(String phone) {
        if (isCorrectPhone(phone)) {
            this.phone = phone;
        } else {
            System.out.println("Invalid phone");
            this.phone = "";
        }
    }

    /**
     * Get the {@link Notation email} address
     * @return the email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the {@link Notation email} address
     * @param email the email address
     */
    public void setEmail(String email) {
        if (isCorrectEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email");
            this.email = "";
        }
    }

    /**
     * Get the {@link Notation ISQ} (Information Security Quotient)
     * @return the ISQ
     */
    public int getISQ() {
        return ISQ;
    }

    /**
     * Set the {@link Notation ISQ} (Information Security Quotient)
     * @param ISQ the Information Security Quotient
     */
    public void setISQ(int ISQ) {
        if (isCorrectISQ(ISQ)) {
            this.ISQ = ISQ;
        } else {
            System.out.println("Invalid ISQ");
            this.ISQ = 0;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nickname, phone, email, ISQ);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Notation that = (Notation) obj;

        return name.equals(that.name)
                && nickname.equals(that.nickname)
                && email.equals(that.email)
                && phone.equals(that.phone)
                && ISQ == that.ISQ;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Nickname: %s, Mobile phone: %s, E-mail: %s, ISQ: %d",
                this.name, this.nickname, this.phone, this.email, this.ISQ);
    }

    /**
     * Return true if name is correct
     * @param name the name
     * @return the boolean
     */
    private boolean isCorrectName(String name) {
        return name.matches(namePattern);
    }

    /**
     * Return true if nickname is correct
     * @param nickname the nickname
     * @return the boolean
     */
    private boolean isCorrectNickname(String nickname) {
        return nickname.matches(nicknamePattern);
    }

    /**
     * Return true if mobile phone is correct
     * @param phone the mobile phone
     * @return the boolean
     */
    private boolean isCorrectPhone(String phone) {
        return phone.matches(phonePattern);
    }

    /**
     * Return true if email address is correct
     * @param email the email address
     * @return the boolean
     */
    private boolean isCorrectEmail(String email) {
        return email.matches(emailPattern);
    }

    /**
     * Return true if ISQ (Information Security Quotient) is correct
     * @param ISQ the Information Security Quotient
     * @return the boolean
     */
    private boolean isCorrectISQ(int ISQ) {
        int ISQLength = Integer.toString(ISQ).length();
        final int minISQNumbers = 5;
        final int maxISQNumbers = 9;

        return (ISQLength >= minISQNumbers && ISQLength <= maxISQNumbers);
    }
}
