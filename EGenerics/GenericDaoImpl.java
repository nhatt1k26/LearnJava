package EGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericDaoImpl<T> implements GenericDao<T>{
    List<T> myDaos= new ArrayList<>();
    @Override
    public void insert(T obj){
        //dosomething
    }
    @Override
    public void update(T obj){
        //doSomething()
    }
    public void display(){
        for(T myDao: myDaos ){
            System.out.println(myDao);
        }
    }
}
