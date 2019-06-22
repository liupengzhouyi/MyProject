package cn.liupeng.service.base;

import java.util.List;

/**
 * @author liupeng
 */
public interface IBaseService<T> {

    /**
     * add or insert
     * @param t
     */
    public void insert(T t);

    /**
     * delete
     * @param id
     */
    public void deleteByID(Integer id);

    /**
     * delete by uuid
     * @param uuid
     */
    public void deleteByUUID(String uuid);

    /**
     * update
     * @param t
     */
    public void update(T t);

    /**
     * select or list or find
     * @return
     */
    public List<T> select();

    /**
     * select or list or find by id
     * @param id
     * @return
     */
    public T selectByID(Integer id);

    /**
     * select or list or find by uuid
     * @param uuid
     * @return
     */
    public T selectByUUID(String uuid);

}
