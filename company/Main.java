package com.company;


public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        Request request1 = new Request('P', 10, 1);
        Request request2 = new Request('M', 15, 2);
        Request request3 = new Request('K', 12, 3);
        Request request4 = new Request('P', 11, 4);
        Request request5 = new Request('M', 9, 5);
        Request request6 = new Request('P', 14, 6);
        Request request7 = new Request('M', 10, 7);
        Request request8 = new Request('K', 12, 8);
        Request request9 = new Request('K', 13, 9);
        Request request10 = new Request('P', 11, 10);
        queue.insert(request1);
        queue.insert(request2);
        queue.insert(request3);
        queue.insert(request4);
        queue.insert(request5);
        queue.insert(request6);
        queue.insert(request7);
        queue.insert(request8);
        queue.insert(request9);
        queue.insert(request10);
        queue.showRequests();
        queue.countTime();
    }
}
