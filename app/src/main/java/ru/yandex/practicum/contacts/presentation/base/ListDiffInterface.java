package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> { //для создания нормального пул реквеска
    boolean theSameAs(T item);

    boolean equals(Object o);
}
