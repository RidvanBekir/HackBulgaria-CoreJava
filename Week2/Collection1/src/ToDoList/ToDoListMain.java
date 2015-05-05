package ToDoList;
public class ToDoListMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ToDoList todo = new ToDoList(13); // 11 hours remaining!
        Task studyForAlgebraTask = new Task(10);
        studyForAlgebraTask.setDescription("StudyForAlgebraTask");
        Task learnGeometryTask = new Task();
        learnGeometryTask.setDescription("LearnGeometryTask");
        Task goOutTask = new Task();
        goOutTask.setDescription("GoOutTask");
        Task sleepTask = new Task();
        sleepTask.setDescription("SleepTask");
        sleepTask.setTime(8);
        todo.add(studyForAlgebraTask); // maximum priority!
        todo.add(learnGeometryTask); // default priority, smaller than 10
        todo.add(goOutTask); // default priority, smaller than 10
        todo.add(sleepTask); // straight 8 hours, of course!

        if (todo.canFinish()) {
            System.out.println("Woohoo!");
        } else {
            System.out.println("I am ...screwed :(");
        }

        System.out.println(todo.toString());
        System.out.println(todo.getTop().getClass()); // StudyForAlgebraTask
        System.out.println(todo.getTimeNeeded()); // sum of the time needed for
                                                  // every task added in todo
                                                  // list

    }

}
