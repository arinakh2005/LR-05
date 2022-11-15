package task17;

/**
 * The interface Notebook.
 */
public interface INotation {
    /**
     * The constant namePattern
     */
    String namePattern = "^[a-zA-Z]{2,50}$";
    /**
     * The constant nicknamePattern
     */
    String nicknamePattern = "^[a-zA-Z0-9_]{2,50}$";
    /**
     * The constant phonePattern
     */
    String phonePattern = "^[+0-9]{10,13}$";
    /**
     * The constant emailPattern
     */
    String emailPattern = "^[a-zA-Z0-9_.]+@[a-zA-Z.]+?\\.[a-zA-Z]{2,3}$";
}
