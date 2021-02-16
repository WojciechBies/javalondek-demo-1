package pl.sda.javalondek4.java_demo.office_example;

import java.util.List;

public class TrainingRegistryDepartment {

    public void registerEmployeeForTraining(Employee trainingCandidate, List<? super Employee> trainingList) {
        trainingList.add(trainingCandidate);
//        List<Employee> employeeList = List.of(new ItEmployee(), new SalesEmployee());
    }

    public void registerEmployeesForTraining(List<? extends Employee> trainingCandidates,
                                             List<? super Employee> trainingList) {
        trainingList.addAll(trainingCandidates);
    }
}
