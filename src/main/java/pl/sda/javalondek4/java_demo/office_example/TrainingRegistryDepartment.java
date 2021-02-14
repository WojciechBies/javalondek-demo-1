package pl.sda.javalondek4.java_demo.office_example;

import java.util.List;

public class TrainingRegistryDepartment {

    public void registerEmployeeForTraining(Employee trainingCandidate, List<? super Employee> trainingList) {
        trainingList.add(trainingCandidate);
    }

    public void registerEmployeesForTraining(List<Employee> trainingCandidates, List<? super Employee> trainingList) {
        trainingList.addAll(trainingCandidates);
    }
}
