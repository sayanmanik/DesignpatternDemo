package com.company.subject;

import com.company.observer.Observers;

public interface Subjects
{
     void registerObserver(Observers o);
     void removeObserver(Observers o);
     void notifyObserver();
}
