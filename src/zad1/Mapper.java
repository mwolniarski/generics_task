/**
 *
 *  @author Wolniarski Mateusz S21096
 *
 */

package zad1;

public interface Mapper<T, F> { // Uwaga: interfejs musi być sparametrtyzowany
    F map(T t);
}  
