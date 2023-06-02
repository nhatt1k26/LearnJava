package ZExercises.Exs3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Admissions {
    List<Contestant> contestantList ;

    public Admissions(List<Contestant> contestantList) {
        this.contestantList = contestantList;
    }

    public void addContestant(Contestant newContestant){
        contestantList.add(newContestant);
    }

     public void displayContestants(){
        System.out.println("Hien thi thong tin thi sinh:");
        Stream.of(contestantList).forEach(s -> System.out.println(s));
    }

    public void displayContestants(List<Contestant> myList){
        Stream.of(myList).forEach(s -> System.out.println(s));
    }

    public void searchByID(int id){
        List<Contestant> resultList = contestantList.stream().filter(s -> s.getIdNumber()==id).collect(Collectors.toList());
        if (resultList.isEmpty())
            System.out.println("Khong tim thay ket qua hop le");
        else
            displayContestants(resultList);
    }
}
