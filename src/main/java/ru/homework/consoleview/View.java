package ru.homework.consoleview;

import ru.homework.exceptions.NotUniqueIdException;
import ru.homework.exceptions.NotUniqueNameException;
import ru.homework.service.Service;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

/**
 * Интерфейс для определения методов осуществляющих
 * экранное представление запросов к источнику данных
 */
public interface View {

    /**
     * Метод для задания конкретной сущности
     * по которой мы будем выводить на экран
     * результаты запросов работы с ней
     *
     * @param service
     */
    void setService(Service service);

    /**
     * Представление добавления сотрудника
     *
     * @throws NotUniqueNameException
     * @throws NotUniqueIdException
     */
    void fireEventCreate() throws IOException, NotUniqueNameException, NotUniqueIdException;

    /**
     * Представление поиска сотрудника по id
     */
    void fireEventGetByRoomNumber();

    /**
     * Представление вывода списка всех сотрудников
     */
    void fireEventGetAll() throws NoSuchFileException;

    /**
     * Представление удаления сотрудника из базы
     */
    void fireEventDelete();

    /**
     * Представление поиска сотрудника по имени
     */
    void fireEventGetByName();

    /**
     * Представление вывода числа сотрудников в комнате
     */
    void fireEventGetCount();


    /**
     * Представление для вывода списка комнат с числом сотрудников в них
     */
    void listOfCount();
}
