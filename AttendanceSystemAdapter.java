public class AttendanceSystemAdapter implements SchoolManagementApp {
    AttendanceSystem attendanceSystem;
    AttendanceSystemAdapter(AttendanceSystem attendanceSystem){
        this.attendanceSystem = attendanceSystem;
    }
    @Override
    public void integrateSystem() {
        attendanceSystem.markAttendance();
    }
    
}
