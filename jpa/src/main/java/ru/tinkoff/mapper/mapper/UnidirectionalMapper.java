package ru.tinkoff.mapper.mapper;

import java.util.List;

/**
 * Базовый интерфейс для всех мапперов.
 *
 * @param <S> тип данных, из которого производится маппинг
 * @param <T> тип данных, в который производится маппинг
 */
public interface UnidirectionalMapper<S, T> {

    /**
     * Сконвертировать объект типа S в объект типа T.
     *
     * @param source исходный объект
     * @return результат конвертации
     */
    T toTarget(S source);

    /**
     * Сконвертировать список объектов типа S в список объектов типа T.
     *
     * @param source список исходных объектов
     * @return список сконвертированныъ объектов
     */
    List<T> toTarget(List<S> source);

}
