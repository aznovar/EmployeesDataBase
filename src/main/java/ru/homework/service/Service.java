package ru.homework.service;

import ru.homework.exceptions.NoSuchIdException;
import ru.homework.exceptions.NoSuchNameException;
import ru.homework.exceptions.NotUniqueIdException;
import ru.homework.exceptions.NotUniqueNameException;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.HashMap;
import java.util.List;

/**
 * Интерфейс содержит методы для обработки CRUD событий
 *
 * @param <T>
 */
public interface Service<T>  {

    /**
     * Метод вызываемый для добавления сотрудника в БД
     *
     * @param obj
     * @throws NotUniqueNameException
     * @throws NotUniqueIdException
     */
    void createEmployee(T obj) throws IOException, NotUniqueNameException, NotUniqueIdException;

    /**
     * Метод используется для нахождения сотрудника в базе по ID
     *
     * @param id
     * @return
     * @throws NoSuchIdException
     */
    List<T> getEmployeeById(Integer id) throws NoSuchIdException;

    /**
     * Метод для получения списка всех сотрудников
     *
     * @return
     */
    List<T> getAll() throws NoSuchFileException;

    /**
     * Метод используемый для удаления сотрудника из базы
     *
     * @param id
     */
    void removeEmployee(Integer id);

    /**
     * Метод используется для поиска сотрудника в базе по имени
     *
     * @param name
     * @return
     * @throws NoSuchNameException
     */
    List<T> getEmployeeByName(String name) throws NoSuchNameException;


    /**
     * Метод для определения числа сотрудников в требуемой комнате
     *
     * @param roomNumber
     * @return
     */
    Long countOfEmployeeInRoom(Long roomNumber);


    /**
     * Метод позволяет получать список комнат с числом сотрудников в них
     *
     * @param roomNumber
     * @return
     */
    List<HashMap<String, Object>> listOfCountEmployeesInRoom(Long roomNumber);
}
