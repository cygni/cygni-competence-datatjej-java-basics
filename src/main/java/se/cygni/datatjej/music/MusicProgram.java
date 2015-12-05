package se.cygni.datatjej.music;


public class MusicProgram {
    public static void main(String[] args) {
        // Nirvana
        Band nirvana = new Band();
        nirvana.setName("Nirvana");
        nirvana.setStartYear(1988);
        nirvana.setEndYear(1994);

        nirvana.addMember("Kurt Cobain");
        nirvana.addMember("Dave Grohl");

        // Print the info
        String info = nirvana.getInfo();
        System.out.println(info);
    }
}
