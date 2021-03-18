/**
 *
 *  @author Wolniarski Mateusz S21096
 *
 */

package zad1;


import java.util.ArrayList;
import java.util.List;

public class ListCreator<T> { // Uwaga: klasa musi być sparametrtyzowana

    private List<T> list;

    private ListCreator(List<T> list){
        this.list = list;
    }

    public static <T> ListCreator<T> collectFrom(List<T> list){
        return new ListCreator<>(list);
    }

    public ListCreator<T> when(Selector<T> selector){
        List<T> tmp = new ArrayList<>();
        for(T t : this.list){
            if(selector.select(t)){
                tmp.add(t);
            }
        }
        this.list = tmp;
        return this;
    }

    public <F> List<F> mapEvery(Mapper<T, F> mapper){
        List<F> mappedList = new ArrayList<>();
        for(T t : this.list){
            mappedList.add(mapper.map(t));
        }
        return mappedList;
    }
}  
