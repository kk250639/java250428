package ch11.exercise.p07;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {}
    public WrongPasswordException(String message) {
        System.out.println("패스워드가 틀립니다.");
    }
}
