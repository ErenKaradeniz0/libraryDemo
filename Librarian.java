class Librarian {
    public static void main(String[] args) {
        Student student;
        LibraryCard card1, card2;
        student = new Student( );
        student.setName("Nupi");
        student.setEmail("nupiy.edu");
        card1 = new LibraryCard( );
        card1.setOwner(student);
        card1.checkOut(3);

        card2 = new LibraryCard( );
        card2.setOwner(student);
        //the same student is the owner
        //of the second card, too
        System.out.println("Card1 Info:");
        System.out.println(card1+ "\n");
        //System.out.println("Card2 Info:");
        //System.out.println(card2.toString() + "\n");
    }
}
