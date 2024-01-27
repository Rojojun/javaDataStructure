package org.example.structureStudy.jdkEight;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.logging.Logger;

import static java.lang.System.Logger.Level.INFO;

public class ConcurrencyStudy implements Publisher<Integer>, Subscriber<Integer> {
    private Logger logger = Logger.getGlobal();
    private int value = 0;
    private String name;
    private List<Subscriber> subscriberList = new ArrayList<>();

    public ConcurrencyStudy(String name) {
        this.name = name; }

    @Override
    public void subscribe(Subscriber<? super Integer> subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }

    @Override
    public void onNext(Integer item) {
        this.value = item;
        logger.info(this.name + " : " + this.value);
        notifyAllSubscribers();
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }

    private void notifyAllSubscribers() {
        subscriberList.forEach(subscriber -> subscriber.onNext(this.value));
    }
}
