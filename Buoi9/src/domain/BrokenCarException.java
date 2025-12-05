package domain;

public class BrokenCarException extends RuntimeException{
    public BrokenCarException(String message)
    {
        super(message);
    }
}
