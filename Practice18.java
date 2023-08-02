package EveryDayPractice;

import java.util.ArrayList;
import java.util.List;

//Given a list of tasks with deadlines and total profit earned on completing a task, find the maximum profit earned by executing the tasks within the specified deadlines. Assume that each task takes one unit of time to complete, and a task can’t execute beyond its deadline. Also, only a single task will be executed at a time.
//Tasks	Deadlines Profit
// 1	9	15
// 2	2	2
// 3	5	18
// 4	7	1
// 5	4	25
// 6	2	20
// 7	5	8
// 8	7	10
// 9	4	12
// 10	3	5
public class Practice18 {
    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(List.of(9,15));
        list.add(List.of(2,2));
        list.add(List.of(5,18));
        list.add(List.of(7,1));
        list.add(List.of(4,25));
        list.add(List.of(2,20));
        list.add(List.of(5,8));
        list.add(List.of(7,10));
        list.add(List.of(4,12));
        list.add(List.of(3,5));
      maxProfit(list);
    }
    private static void maxProfit(List<List<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {

        }
    }
}