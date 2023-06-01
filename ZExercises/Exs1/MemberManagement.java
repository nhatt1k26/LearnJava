package ZExercises.Exs1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MemberManagement {
    public MemberManagement(List<Member> members) {
        this.members = members;
    }

    List<Member> members;

    //Add new members

    public void addMember(Member newMember) {
        members.add(newMember);
    }

    public void displayMemberList(){
        Stream.of(members).forEach(s -> System.out.println(s));
    }
    public void displayMemberList(List<Member> members){
        Stream.of(members).forEach(s -> System.out.println(s));
    }

    public void searchByName(String name) {
        List<Member> resultMembers = members.stream().filter(element -> element.getName().contains(name)).collect(Collectors.toList());
        // List<Member> resultMembers = members.stream().filter(element -> element.getName().equals(name)).collect(Collectors.toList());
        displayMemberList(resultMembers);
    }
}
