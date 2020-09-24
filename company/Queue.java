package com.company;

import java.util.TreeSet;

class Request implements Comparable<Request>{
    private int time, number, importance;

    public Request(char category, int time, int number) {
        this.time = time;
        this.number = number;
        switch (category){
            case 'M': {
                this.importance = 1;
                break;
            }
            case 'K': {
                this.importance = 2;
                break;
            }
            case 'P': {
                this.importance = 3;
                break;
            }
        }
    }

    @Override
    public int compareTo(Request check) {
        if (importance == check.importance) return 1;
        return importance - check.importance;
    }

    @Override
    public String toString() {
        char category = ' ';
        switch (importance){
            case 1: category = 'M'; break;
            case 2: category = 'K'; break;
            case 3: category = 'P'; break;
        }
        return "Запрос {" +
                "Время выполнения - " + time +
                ", номер - " + number +
                ", категория - " + category + "}";
    }

    public int getImportance() {
        return importance;
    }

    public int getTime() {
        return time;
    }
}

public class Queue {

    private TreeSet<Request> list;

    public Queue() {
        list = new TreeSet<>();
    }

    public void insert(Request request){
        list.add(request);
    }

    public void showRequests(){
        for (Request request: list) System.out.println(request);
    }

    public void countTime(){
        int timeM = 0, timeK = 0, timeP = 0;
        for (Request request: list){
            switch(request.getImportance()){
                case 1: {
                    timeM += request.getTime();
                    break;}
                case 2: {
                    timeK += request.getTime();
                    break;
                }
                case 3: {
                    timeP += request.getTime();
                    break;
                }
                }
            }
        System.out.println("Менеджер - " + timeM + "\nКонтролер - " + timeK + "\nРабочий - " + timeP);
    }

}