public class LibrarySystemAdapter implements SchoolManagementApp{
LibrarySystem librarySystem;
LibrarySystemAdapter(LibrarySystem librarySystem){
    this.librarySystem = librarySystem;
}
    @Override
    public void integrateSystem() {
        librarySystem.manageBooks();
    }
    
}
