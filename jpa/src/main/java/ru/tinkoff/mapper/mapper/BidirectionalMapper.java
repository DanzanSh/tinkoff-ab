package ru.tinkoff.mapper.mapper;

import java.util.List;

/**
 * Базовый интерфейс для всех мапперов.
 *
 * @param <S> тип данных, из которого производится маппинг
 * @param <T> тип данных, в который производится маппинг
 */
public interface BidirectionalMapper<S, T> extends UnidirectionalMapper<S, T> {

    /**
     * Сконвертировать объект типа T в объект типа S.
     *
     * @param target исходный объект
     * @return результат конвертации
     */
    S toSource(T target);

    /**
     * Сконвертировать список объектов типа T в список объектов типа S.
     *
     * @param target список исходных объектов
     * @return список сконвертированных объектов
     */
    List<S> toSource(List<T> target);
}
