package org.javapractice.sep26_abstractclass.practice.controlwork.taskmanager;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String DATE_REGEX =
            "^(?:(?:19|20)[0-9]{2})-(?:0[1-9]|1[012])-(?:0[1-9]|[12][0-9]|3[01])$";

    public static boolean isValidDate(String date) {
        Pattern pattern = Pattern.compile(DATE_REGEX);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }
    public static void main(String[] args) {
        var manager = new TaskManager();
        var in = new Scanner(System.in);
        String answer = null;
        System.out.println("Добавить задачу? да/нет");
        answer = in.nextLine();
        do{

            if (!answer.equalsIgnoreCase("да")){
                return;
            }
            String typeOftask = null;
            do {
                System.out.println("reccuring or deadline task? 1/2");
                typeOftask = in.nextLine();
                System.out.println(typeOftask);
            } while (!typeOftask.equals("1") && !typeOftask.equals("2") );
            System.out.println("Введите название");
            String taskName = in.nextLine();
            System.out.println("Введите описание");
            String taskDescription = in.nextLine();
            if (typeOftask.equalsIgnoreCase("1")){ //если регулярная
                String typeOfRegularity = null;
                do{
                    System.out.println("Выберите повторяемость: ежедневно - 1, еженедельно - 2, ежемесячно - 3, ежегодно - 4;");
                    typeOfRegularity = in.nextLine();
                }while(!typeOfRegularity.equals("1")&&  !typeOfRegularity.equals("2") &&  !typeOfRegularity.equals("3") && typeOfRegularity.equals("4"));
                typeOfRegularity = switch (typeOfRegularity) {
                    case "1" -> Regularity.PERDAY;
                    case "2" -> Regularity.PERWEEK;
                    case "3" -> Regularity.PERMONTH;
                    case "4" -> Regularity.PERYEAR;
                    default -> typeOfRegularity;
                };
                String dateOfStart = null;
                do{
                    System.out.println("Введите дату начала в формате: yyyy-mm-yy");
                    dateOfStart = in.nextLine();
                }while (!isValidDate(dateOfStart));
                var rectask = new ReccuringTask(taskName, taskDescription, LocalDate.now(), typeOfRegularity, LocalDate.parse(dateOfStart));
                manager.addTasks(rectask);
            }else{ //если с дедлайном
                String deadline = null;
                do{
                    System.out.println("Введите дату дедлайна в формате: yyyy-mm-yy");
                    deadline = in.nextLine();
                }while(!isValidDate(deadline));
                var deadlineTask = new DeadlineTask(taskName, taskDescription, LocalDate.now(), LocalDate.parse(deadline));
                manager.addTasks(deadlineTask);
            }

            System.out.println("Добавить еще задачу? да/нет");
            answer = in.nextLine();
        } while(answer.equalsIgnoreCase("да"));
        String editTask = null;

        do {
            do {
                System.out.println("Изменить существующую задачу? да/нет");
                editTask = in.nextLine();
            }while (!editTask.equalsIgnoreCase("да") && !editTask.equalsIgnoreCase("нет"));


            if (editTask.equals("да")){
                System.out.println(manager);

                int id = -1;
                do {
                    System.out.println("Введите id задачи для изменения");
                    String idstr =  in.nextLine();
                    id = Integer.parseInt(idstr);
                } while(id < 0 && id >= manager.getCount());

                String param = null;

                if (manager.searchById(id).equals("reoccurring")){
                    ReccuringTask taskForChange = (ReccuringTask) manager.getTaskById(id);
                    do{
                        System.out.println("Введите поле для изменения: ");
                        param = in.nextLine();
                    }while(!param.equalsIgnoreCase("taskName") && !param.equalsIgnoreCase("taskDescription") && !param.equalsIgnoreCase("intervalOfTask") && !param.equalsIgnoreCase("dateOfStart"));
                    if (param.equals("taskName")){
                        System.out.println("Введите новое название:");
                        String newTaskName = in.nextLine();
                        taskForChange.setTaskName(newTaskName);
                    }
                    else if (param.equals("taskDescription")){
                        System.out.println("Введите новое описание:");
                        String newTaskDescription = in.nextLine();
                        taskForChange.setTaskDescription(newTaskDescription);
                    }
                    else if (param.equals("intervalOfTask")){
                        System.out.println("Выберите новый интервал:");
                        String newTypeOfRegularity = null;
                        do{
                            System.out.println("Выберите повторяемость: ежедневно - 1, еженедельно - 2, ежемесячно - 3, ежегодно - 4;");
                            newTypeOfRegularity = in.nextLine();
                        }while(!newTypeOfRegularity.equals("1")&&  !newTypeOfRegularity.equals("2") &&  !newTypeOfRegularity.equals("3") && !newTypeOfRegularity.equals("4"));
                        newTypeOfRegularity = switch (newTypeOfRegularity) {
                            case "1" -> Regularity.PERDAY;
                            case "2" -> Regularity.PERWEEK;
                            case "3" -> Regularity.PERMONTH;
                            case "4" -> Regularity.PERYEAR;
                            default -> newTypeOfRegularity;
                        };
                        taskForChange.setIntervalOfTask(newTypeOfRegularity);
                    }
                    else {
                        String newDateOfStart = null;
                        do{
                            System.out.println("Введите дату начала в формате: yyyy-mm-yy");
                            newDateOfStart = in.nextLine();
                        }while (!isValidDate(newDateOfStart));
                        taskForChange.setDateOfStart(LocalDate.parse(newDateOfStart));
                    }
                }
                else {
                    do{
                        System.out.println("Введите поле для изменения: ");
                        param = in.nextLine();
                    }while(!param.equalsIgnoreCase("taskName") && !param.equalsIgnoreCase("taskDescription") && !param.equalsIgnoreCase("dateOFCreate") && !param.equalsIgnoreCase("deadlineDate") );
                    DeadlineTask taskForChange = (DeadlineTask) manager.getTaskById(id);
                    do{
                        System.out.println("Введите поле для изменения: ");
                        param = in.nextLine();
                    }while(!param.equalsIgnoreCase("taskName") && !param.equalsIgnoreCase("taskDescription") && !param.equalsIgnoreCase("intervalOfTask") && !param.equalsIgnoreCase("dateOfStart") && !param.equalsIgnoreCase("deadlineDate") );
                    if (param.equals("taskName")){
                        System.out.println("Введите новое название:");
                        String newTaskName = in.nextLine();
                        taskForChange.setTaskName(newTaskName);
                    }
                    else if (param.equals("taskDescription")){
                        System.out.println("Введите новое описание:");
                        String newTaskDescription = in.nextLine();
                        taskForChange.setTaskDescription(newTaskDescription);
                    }
                    else if (param.equalsIgnoreCase("deadlineDate")){
                        String newDeadlineDate = null;
                        do{
                            System.out.println("Введите дату начала в формате: yyyy-mm-yy");
                            newDeadlineDate = in.nextLine();
                        }while (!isValidDate(newDeadlineDate));
                        taskForChange.setDeadlineDate(LocalDate.parse(newDeadlineDate));
                    }
                }
            }
            else {
                return;
            }
        }while (editTask.equalsIgnoreCase("да"));
        System.out.println(manager);
    }
}
