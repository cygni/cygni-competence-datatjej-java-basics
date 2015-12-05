package se.cygni.datatjej.music;

import java.util.ArrayList;
import java.util.List;

public class Band {
    private String name;
    private int startYear;
    private int endYear;
    private List<String> members = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(final int y) {
        startYear = y;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(final int y) {
        endYear = y;
    }

    public void addMember(String member) {
        members.add(member);
    }

    public String getInfo() {
        String end = isActive() ? "present" : String.valueOf(endYear);

        String info = name + " ";
        info += "(" + startYear + " - " + end + ")\n";

        info += "Members: \n";
        for (String member : members) {
            info += " -" + member + "\n";
        }

        return info;
    }

    public boolean isActive() {
        return endYear == 0;
    }
}
