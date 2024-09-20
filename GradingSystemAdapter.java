public class GradingSystemAdapter implements SchoolManagementApp{
    GradingSystem gradingSystem;
    GradingSystemAdapter(GradingSystem gradingSystem){
        this.gradingSystem = gradingSystem;
    }
    @Override
    public void integrateSystem() {
        gradingSystem.recordGrades();
    }
    
}
