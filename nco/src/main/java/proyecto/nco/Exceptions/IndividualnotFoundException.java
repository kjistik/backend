package proyecto.nco.Exceptions;

public class IndividualnotFoundException extends RuntimeException {
    public IndividualnotFoundException(long id) {
        super("El soldado " + id +" no existe, debe ser John Doe");
    }
}