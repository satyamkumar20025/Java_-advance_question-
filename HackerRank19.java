class Sports {
    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class Solution {
    public static void main(String[] args) {
        Sports generic = new Sports();
        System.out.println(generic.getName());
        generic.getNumberOfTeamMembers();

        Soccer soccer = new Soccer();
        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();
    }
}
