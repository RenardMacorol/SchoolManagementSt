public class Main{
    public static void main(String[] args){
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem libnLibrarySystem = new LibrarySystem();
        AttendanceSystemAdapter attendanceSystemAdapter = new AttendanceSystemAdapter(attendanceSystem);
        GradingSystemAdapter gradingSystemAdapter = new GradingSystemAdapter(gradingSystem);
        LibrarySystemAdapter librarySystemAdapter = new LibrarySystemAdapter(libnLibrarySystem);

        attendanceSystemAdapter.integrateSystem();
        gradingSystemAdapter.integrateSystem();
        librarySystemAdapter.integrateSystem();
    }
}