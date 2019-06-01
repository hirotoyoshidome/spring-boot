package sample.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import sample.boot.model.Person;

/**
 * サンプルマッパークラス
 *
 */
@Mapper
public interface PersonMapper {
    /**
     * sqlで全てを取得してきます
     * @return
     */
    List<Person> findAll();
}
